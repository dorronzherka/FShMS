/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

/**
 *
 * @author dorron
 */

import BL.Klienti;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.NoResultException;
public class KlientiRepository extends EntMngClass implements KlientiInterface{
    
    
    /**
     * Kjo metodë bën insertimin e Klientit  në databazë në tabelen
     * Klienti, nëse Klienti ekzsiton  ose ka marrur njè vlerë null kthen 
     * KlientiException error.
     * @param k
     * @throws KlientiException 
     */
    @Override
    public void create(Klienti k)throws KlientiException{
        try {
            em.getTransaction().begin();
            em.persist(k);
            em.getTransaction().commit();
        } catch (Throwable thro) {
            if (thro.getMessage().contains("2627")) {
                throw new KlientiException("Create error: Klienti ekziston në databazë!");
            } else {
                throw new KlientiException("Create error:" + thro.getClass() + "-" + thro.getMessage());
            }
        }
    }
    /**
     * Kjo metodë bën editimi e Klientit në databazë në
     * tabelen Klienti ,nëse Klienti ekziston ose ka marrur vlerë
     * null kthen  KlientiException error.
     * @param k
     * @throws KlientiException 
     */
    @Override
    public void edit(Klienti k)throws KlientiException{
        try {
            em.getTransaction().begin();
            em.merge(k);
            em.getTransaction().commit();
        } catch (Throwable thro) {
            if (thro.getMessage().contains("2627")) {
                throw new KlientiException("Edit error: Klienti ekziston në databazë");
            } else {
                throw new KlientiException("Edit error:" + thro.getClass() + "-" + thro.getMessage());
            }
        }
    }
    /**
     * Kjo metodë bën fshirjen e klientit në databazë në tabelen 
     * klienti , nëse e dhënat e klientit janë përdorim ose klienti
     * është null kthen KlientiException error
     * @param k
     * @throws KlientiException 
     */
    @Override
    public void remove(Klienti k) throws KlientiException{
        try {
            em.getTransaction().begin();
            em.remove(k);
            em.getTransaction().commit();
        } catch (Throwable thro) {
            if (thro.getMessage().contains("547")) {
                throw new KlientiException("Remove error: Të dhënat e klientit janë në përdorim!");
            } else {
                throw new KlientiException("Remove error:" + thro.getClass() + "-" + thro.getMessage());
            }
        }
    }
    /**
     * Kjo metodë  kthen të gjithë klientet ne list.
     * @return 
     */
    @Override
    public List<Klienti> findAll(){
        return em.createNamedQuery("Klienti.findAll").getResultList();
    }
    /**
     * Kjo metodë bën kthimit e një klienti përmes parametrit id's
     * @param id
     * @return
     * @throws KlientiException 
     */
    @Override
    public Klienti findById(int id) throws KlientiException{
        Query query = em.createQuery("SELECT p FROM Klienti k WHERE k.iDKlienti = :id ");
        query.setParameter("id", id);
        try {
            return (Klienti) query.getSingleResult();
        } catch (NoResultException nre) {
            throw new KlientiException("FindById error:Nuk ekziton klienti");
        }
    }
}
