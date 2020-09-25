package DAO;

import Control.ControlInsumos;
import DAO.exceptions.NonexistentEntityException;
import Modelo.Detalle_GastoInsumo;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class Detalle_GastoInsumoDAO implements Serializable {

    private InsumoDAO InsumoDAO;

    public Detalle_GastoInsumoDAO(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Detalle_GastoInsumo detalle_GastoInsumo) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(detalle_GastoInsumo);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Detalle_GastoInsumo detalle_GastoInsumo) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            detalle_GastoInsumo = em.merge(detalle_GastoInsumo);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                long id = detalle_GastoInsumo.getPk();
                if (findDetalle_GastoInsumo(id) == null) {
                    throw new NonexistentEntityException("The detalle_GastoInsumo with id " + id + " no longer exists.");
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
            Detalle_GastoInsumo detalle_GastoInsumo;
            try {
                detalle_GastoInsumo = em.getReference(Detalle_GastoInsumo.class, id);
                detalle_GastoInsumo.getPk();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The detalle_GastoInsumo with id " + id + " no longer exists.", enfe);
            }
            em.remove(detalle_GastoInsumo);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Detalle_GastoInsumo> findDetalle_GastoInsumoEntities() {
        return findDetalle_GastoInsumoEntities(true, -1, -1);
    }

    public List<Detalle_GastoInsumo> findDetalle_GastoInsumoEntities(int maxResults, int firstResult) {
        return findDetalle_GastoInsumoEntities(false, maxResults, firstResult);
    }

    private List<Detalle_GastoInsumo> findDetalle_GastoInsumoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Detalle_GastoInsumo.class));
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

    public Detalle_GastoInsumo findDetalle_GastoInsumo(long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Detalle_GastoInsumo.class, id);
        } finally {
            em.close();
        }
    }

    public int getDetalle_GastoInsumoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Detalle_GastoInsumo> rt = cq.from(Detalle_GastoInsumo.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }


}
