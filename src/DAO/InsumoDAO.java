package DAO;

import DAO.exceptions.NonexistentEntityException;
import Modelo.Insumo;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class InsumoDAO implements Serializable {

    public InsumoDAO(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Insumo insumo) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(insumo);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Insumo insumo) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            insumo = em.merge(insumo);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                long id = insumo.getPk();
                if (findInsumo(id) == null) {
                    throw new NonexistentEntityException("The insumo with id " + id + " no longer exists.");
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
            Insumo insumo;
            try {
                insumo = em.getReference(Insumo.class, id);
                insumo.getPk();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The insumo with id " + id + " no longer exists.", enfe);
            }
            em.remove(insumo);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Insumo> findInsumoEntities() {
        return findInsumoEntities(true, -1, -1);
    }

    public List<Insumo> findInsumoEntities(int maxResults, int firstResult) {
        return findInsumoEntities(false, maxResults, firstResult);
    }

    private List<Insumo> findInsumoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Insumo.class));
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

    public Insumo findInsumo(long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Insumo.class, id);
        } finally {
            em.close();
        }
    }

    public int getInsumoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Insumo> rt = cq.from(Insumo.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

    //// BUSCAR EL NOMBRE DE UN INSUMO
//    public List<Insumo> BuscarInsumoConsulta(String nombre) {
//
//        EntityManager em = getEntityManager();
//        detalleGastoDAO.findDetalle_GastoEntities();
//        return em.createNamedQuery("Insumo.buscarInsumosConsulta").setParameter("nombre", nombre).getResultList();
//
//    }
//    public Insumo BuscarInsumoConsulta1 (String nombre) {
//
//        EntityManager em = getEntityManager();
//   
//        return (Insumo) em.createNamedQuery("Insumo.buscarInsumosConsulta1").setParameter("nombre", nombre).getSingleResult();
//
//    }
    public Insumo BuscarInsumoConsulta1(String nombre) throws Exception {
        EntityManager em = getEntityManager();

        List<Insumo> insumos = em.createNamedQuery("Insumo.buscarInsumosConsulta1").setParameter("nombre", nombre).getResultList();

        if (insumos.isEmpty()) {
            return null;
        } else {
            return insumos.get(0);
        }

    }
//
//    public Insumo BuscarInsumoCodigo(Long codigo) throws Exception {
//        EntityManager em = getEntityManager();
//
//        List<Insumo> insumos = em.createNamedQuery("Insumo.buscarInsumosCodigo").setParameter("codigo", codigo).getResultList();
//
//        if (insumos.isEmpty()) {
//            return null;
//        } else {
//            return insumos.get(0);
//        }
//
//    }

}
