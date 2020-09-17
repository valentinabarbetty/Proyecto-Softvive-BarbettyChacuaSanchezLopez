package DAO;

import DAO.exceptions.NonexistentEntityException;
import Modelo.Distribuidor;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class DistribuidorDAO implements Serializable {

    public DistribuidorDAO(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Distribuidor distribuidor) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(distribuidor);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Distribuidor distribuidor) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            distribuidor = em.merge(distribuidor);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                long id = distribuidor.getPk();
                if (findDistribuidor(id) == null) {
                    throw new NonexistentEntityException("The distribuidor with id " + id + " no longer exists.");
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
            Distribuidor distribuidor;
            try {
                distribuidor = em.getReference(Distribuidor.class, id);
                distribuidor.getPk();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The distribuidor with id " + id + " no longer exists.", enfe);
            }
            em.remove(distribuidor);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Distribuidor> findDistribuidorEntities() {
        return findDistribuidorEntities(true, -1, -1);
    }

    public List<Distribuidor> findDistribuidorEntities(int maxResults, int firstResult) {
        return findDistribuidorEntities(false, maxResults, firstResult);
    }

    private List<Distribuidor> findDistribuidorEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Distribuidor.class));
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

    public Distribuidor findDistribuidor(long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Distribuidor.class, id);
        } finally {
            em.close();
        }
    }

    public int getDistribuidorCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Distribuidor> rt = cq.from(Distribuidor.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
///////////////////////// BUSCAR

    public Distribuidor buscarDistribuidorConsulta(String nombre) throws Exception {
        EntityManager em = getEntityManager();
        return (Distribuidor) em.createNamedQuery("Distribuidor.buscarDistribuidorConsulta").setParameter("nombre", nombre).getSingleResult();
    }
}
