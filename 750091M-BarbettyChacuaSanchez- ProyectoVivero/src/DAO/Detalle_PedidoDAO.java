package DAO;

import DAO.exceptions.NonexistentEntityException;
import Modelo.Detalle_Pedido;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class Detalle_PedidoDAO implements Serializable {

    public Detalle_PedidoDAO(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Detalle_Pedido detalle_Pedido) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(detalle_Pedido);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Detalle_Pedido detalle_Pedido) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            detalle_Pedido = em.merge(detalle_Pedido);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                long id = detalle_Pedido.getPk();
                if (findDetalle_Pedido(id) == null) {
                    throw new NonexistentEntityException("The detalle_Pedido with id " + id + " no longer exists.");
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
            Detalle_Pedido detalle_Pedido;
            try {
                detalle_Pedido = em.getReference(Detalle_Pedido.class, id);
                detalle_Pedido.getPk();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The detalle_Pedido with id " + id + " no longer exists.", enfe);
            }
            em.remove(detalle_Pedido);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Detalle_Pedido> findDetalle_PedidoEntities() {
        return findDetalle_PedidoEntities(true, -1, -1);
    }

    public List<Detalle_Pedido> findDetalle_PedidoEntities(int maxResults, int firstResult) {
        return findDetalle_PedidoEntities(false, maxResults, firstResult);
    }

    private List<Detalle_Pedido> findDetalle_PedidoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Detalle_Pedido.class));
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

    public Detalle_Pedido findDetalle_Pedido(long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Detalle_Pedido.class, id);
        } finally {
            em.close();
        }
    }

    public int getDetalle_PedidoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Detalle_Pedido> rt = cq.from(Detalle_Pedido.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

}
