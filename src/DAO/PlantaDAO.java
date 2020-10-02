package DAO;

import DAO.exceptions.NonexistentEntityException;
import DAO.exceptions.PreexistingEntityException;
import Modelo.Planta;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class PlantaDAO implements Serializable {

    public PlantaDAO(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Planta planta) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(planta);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findPlanta(planta.getCodigo()) != null) {
                throw new PreexistingEntityException("Planta " + planta + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Planta planta) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            planta = em.merge(planta);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = planta.getCodigo();
                if (findPlanta(id) == null) {
                    throw new NonexistentEntityException("The planta with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(String id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Planta planta;
            try {
                planta = em.getReference(Planta.class, id);
                planta.getCodigo();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The planta with id " + id + " no longer exists.", enfe);
            }
            em.remove(planta);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Planta> findPlantaEntities() {
        return findPlantaEntities(true, -1, -1);
    }

    public List<Planta> findPlantaEntities(int maxResults, int firstResult) {
        return findPlantaEntities(false, maxResults, firstResult);
    }

    private List<Planta> findPlantaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Planta.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Planta findPlanta(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Planta.class, id);
        } finally {
            em.close();
        }
    }

    public int getPlantaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Planta> rt = cq.from(Planta.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

    public Planta buscarPlantaConsulta(String codigo) throws Exception {
        EntityManager em = getEntityManager();
        return (Planta) em.createNamedQuery("Planta.buscarPlantaConsulta").setParameter("codigo", codigo).getSingleResult();
    }

}
