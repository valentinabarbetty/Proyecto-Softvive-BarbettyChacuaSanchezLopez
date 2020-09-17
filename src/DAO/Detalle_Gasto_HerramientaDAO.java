/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DAO.exceptions.NonexistentEntityException;
import Modelo.Detalle_Gasto_Herramienta;
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
public class Detalle_Gasto_HerramientaDAO implements Serializable {

    public Detalle_Gasto_HerramientaDAO(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Detalle_Gasto_Herramienta detalle_Gasto_Herramienta) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(detalle_Gasto_Herramienta);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Detalle_Gasto_Herramienta detalle_Gasto_Herramienta) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            detalle_Gasto_Herramienta = em.merge(detalle_Gasto_Herramienta);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                long id = detalle_Gasto_Herramienta.getPk();
                if (findDetalle_Gasto_Herramienta(id) == null) {
                    throw new NonexistentEntityException("The detalle_Gasto_Herramienta with id " + id + " no longer exists.");
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
            Detalle_Gasto_Herramienta detalle_Gasto_Herramienta;
            try {
                detalle_Gasto_Herramienta = em.getReference(Detalle_Gasto_Herramienta.class, id);
                detalle_Gasto_Herramienta.getPk();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The detalle_Gasto_Herramienta with id " + id + " no longer exists.", enfe);
            }
            em.remove(detalle_Gasto_Herramienta);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Detalle_Gasto_Herramienta> findDetalle_Gasto_HerramientaEntities() {
        return findDetalle_Gasto_HerramientaEntities(true, -1, -1);
    }

    public List<Detalle_Gasto_Herramienta> findDetalle_Gasto_HerramientaEntities(int maxResults, int firstResult) {
        return findDetalle_Gasto_HerramientaEntities(false, maxResults, firstResult);
    }

    private List<Detalle_Gasto_Herramienta> findDetalle_Gasto_HerramientaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Detalle_Gasto_Herramienta.class));
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

    public Detalle_Gasto_Herramienta findDetalle_Gasto_Herramienta(long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Detalle_Gasto_Herramienta.class, id);
        } finally {
            em.close();
        }
    }

    public int getDetalle_Gasto_HerramientaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Detalle_Gasto_Herramienta> rt = cq.from(Detalle_Gasto_Herramienta.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
