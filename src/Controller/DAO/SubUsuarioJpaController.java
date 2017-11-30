/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.DAO;

import Controller.DAO.exceptions.NonexistentEntityException;
import Model.Entity.SubUsuario;
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
 * @author Matheus
 */
public class SubUsuarioJpaController implements Serializable {

    public SubUsuarioJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(SubUsuario subUsuario) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(subUsuario);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(SubUsuario subUsuario) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            subUsuario = em.merge(subUsuario);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = subUsuario.getId();
                if (findSubUsuario(id) == null) {
                    throw new NonexistentEntityException("The subUsuario with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            SubUsuario subUsuario;
            try {
                subUsuario = em.getReference(SubUsuario.class, id);
                subUsuario.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The subUsuario with id " + id + " no longer exists.", enfe);
            }
            em.remove(subUsuario);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<SubUsuario> findSubUsuarioEntities() {
        return findSubUsuarioEntities(true, -1, -1);
    }

    public List<SubUsuario> findSubUsuarioEntities(int maxResults, int firstResult) {
        return findSubUsuarioEntities(false, maxResults, firstResult);
    }

    private List<SubUsuario> findSubUsuarioEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(SubUsuario.class));
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

    public SubUsuario findSubUsuario(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(SubUsuario.class, id);
        } finally {
            em.close();
        }
    }

    public int getSubUsuarioCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<SubUsuario> rt = cq.from(SubUsuario.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
