package DAO;

import Control.ControlInsumos;
import DAO.exceptions.NonexistentEntityException;
import Modelo.Detalle_GastoHerramienta;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class Detalle_GastoHerramientaDAO implements Serializable {


    public Detalle_GastoHerramientaDAO(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Detalle_GastoHerramienta detalle_GastoHerramienta) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(detalle_GastoHerramienta);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Detalle_GastoHerramienta detalle_GastoHerramienta) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            detalle_GastoHerramienta = em.merge(detalle_GastoHerramienta);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                long id = detalle_GastoHerramienta.getPk();
                if (findDetalle_GastoHerramienta(id) == null) {
                    throw new NonexistentEntityException("The detalle_GastoHerramienta with id " + id + " no longer exists.");
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
            Detalle_GastoHerramienta detalle_GastoHerramienta;
            try {
                detalle_GastoHerramienta = em.getReference(Detalle_GastoHerramienta.class, id);
                detalle_GastoHerramienta.getPk();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The detalle_GastoHerramienta with id " + id + " no longer exists.", enfe);
            }
            em.remove(detalle_GastoHerramienta);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Detalle_GastoHerramienta> findDetalle_GastoHerramientaEntities() {
        return findDetalle_GastoHerramientaEntities(true, -1, -1);
    }

    public List<Detalle_GastoHerramienta> findDetalle_GastoHerramientaEntities(int maxResults, int firstResult) {
        return findDetalle_GastoHerramientaEntities(false, maxResults, firstResult);
    }

    private List<Detalle_GastoHerramienta> findDetalle_GastoHerramientaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Detalle_GastoHerramienta.class));
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

    public Detalle_GastoHerramienta findDetalle_GastoHerramienta(long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Detalle_GastoHerramienta.class, id);
        } finally {
            em.close();
        }
    }

    public int getDetalle_GastoHerramientaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Detalle_GastoHerramienta> rt = cq.from(Detalle_GastoHerramienta.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

}
