/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.exceptions.NonexistentEntityException;
import Model.Visitante;
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
 * @author João Henrique 2
 */
public class VisitanteJpaController implements Serializable {

    public VisitanteJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Visitante visitante) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(visitante);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Visitante visitante) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            visitante = em.merge(visitante);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = visitante.getId();
                if (findVisitante(id) == null) {
                    throw new NonexistentEntityException("O visitante com id " + id + " não existe.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Long id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Visitante visitante;
            try {
                visitante = em.getReference(Visitante.class, id);
                visitante.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("O visitante com id " + id + " não existe.", enfe);
            }
            em.remove(visitante);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Visitante> findVisitanteEntities() {
        return findVisitanteEntities(true, -1, -1);
    }

    public List<Visitante> findVisitanteEntities(int maxResults, int firstResult) {
        return findVisitanteEntities(false, maxResults, firstResult);
    }

    private List<Visitante> findVisitanteEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Visitante.class));
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

    public Visitante findVisitante(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Visitante.class, id);
        } finally {
            em.close();
        }
    }

    public int getVisitanteCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Visitante> rt = cq.from(Visitante.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
