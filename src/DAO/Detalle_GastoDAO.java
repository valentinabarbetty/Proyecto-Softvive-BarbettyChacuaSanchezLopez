package DAO;

import Control.ControlInsumos;
import DAO.exceptions.NonexistentEntityException;
import Modelo.Detalle_Gasto;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class Detalle_GastoDAO implements Serializable {

    private InsumoDAO InsumoDAO;

    public Detalle_GastoDAO(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Detalle_Gasto detalle_Gasto) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(detalle_Gasto);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Detalle_Gasto detalle_Gasto) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            detalle_Gasto = em.merge(detalle_Gasto);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                long id = detalle_Gasto.getPk();
                if (findDetalle_Gasto(id) == null) {
                    throw new NonexistentEntityException("The detalle_Gasto with id " + id + " no longer exists.");
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
            Detalle_Gasto detalle_Gasto;
            try {
                detalle_Gasto = em.getReference(Detalle_Gasto.class, id);
                detalle_Gasto.getPk();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The detalle_Gasto with id " + id + " no longer exists.", enfe);
            }
            em.remove(detalle_Gasto);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Detalle_Gasto> findDetalle_GastoEntities() {
        return findDetalle_GastoEntities(true, -1, -1);
    }

    public List<Detalle_Gasto> findDetalle_GastoEntities(int maxResults, int firstResult) {
        return findDetalle_GastoEntities(false, maxResults, firstResult);
    }

    private List<Detalle_Gasto> findDetalle_GastoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Detalle_Gasto.class));
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

    public Detalle_Gasto findDetalle_Gasto(long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Detalle_Gasto.class, id);
        } finally {
            em.close();
        }
    }

    public int getDetalle_GastoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Detalle_Gasto> rt = cq.from(Detalle_Gasto.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

       

}
