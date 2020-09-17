package DAO;

import DAO.exceptions.NonexistentEntityException;
import Modelo.Herramienta;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Juanes
 */
public class HerramientaDAO implements Serializable {

    public HerramientaDAO(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Herramienta herramienta) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(herramienta);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Herramienta herramienta) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            herramienta = em.merge(herramienta);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                long id = herramienta.getPk();
                if (findHerramienta(id) == null) {
                    throw new NonexistentEntityException("The herramienta with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(long id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Herramienta herramienta;
            try {
                herramienta = em.getReference(Herramienta.class, id);
                herramienta.getPk();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The herramienta with id " + id + " no longer exists.", enfe);
            }
            em.remove(herramienta);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Herramienta> findHerramientaEntities() {
        return findHerramientaEntities(true, -1, -1);
    }

    public List<Herramienta> findHerramientaEntities(int maxResults, int firstResult) {
        return findHerramientaEntities(false, maxResults, firstResult);
    }

    private List<Herramienta> findHerramientaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Herramienta.class));
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

    public Herramienta findHerramienta(long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Herramienta.class, id);
        } finally {
            em.close();
        }
    }

    public int getHerramientaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Herramienta> rt = cq.from(Herramienta.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
      public Herramienta BuscarHerramientaConsulta(String nombre) throws Exception {
        EntityManager em = getEntityManager();

        List<Herramienta> herramientas = em.createNamedQuery("Herramienta.BuscarHerramientaConsulta").setParameter("nombre", nombre).getResultList();

        if (herramientas.isEmpty()) {
            return null;
        } else {
            return herramientas.get(0);
        }

    }
    
}
