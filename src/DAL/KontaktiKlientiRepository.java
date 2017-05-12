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
import BL.KontaktiKlienti;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.NoResultException;
public class KontaktiKlientiRepository extends EntMngClass implements KontaktiKlientiInterface {
    
    /**
     * Kjo metodë bën regjistrimin kontaktit klientit në databazë
     * në tabelën Kontaktu_Klienti, kthen KontaktiKlientiException nëse 
     * ekziston në tabel Kontakti ose i ke dhënë vlerë null KontaktiKlienti
     * @param kK
     * @throws KontaktiKlientiException 
     */
    @Override
    public void create(KontaktiKlienti kK) throws KontaktiKlientiException{
        try{
            em.getTransaction().begin();
            em.persist(kK);
            em.getTransaction().commit();
        }catch(Throwable thro){
            if(thro.getMessage().contains("2627"))
                throw new KontaktiKlientiException("Create Error:Kontakti i klientit ekziston!");
            else
                throw new KontaktiKlientiException("Create Error:"+thro.getClass()+"-"+thro.getMessage());
        }
    }
    
    /**
     * Kjo metodë bën editimin e kontaktit  në databazë në tabelën
     * Kontakti_Klienti, kjo kthen KontaktiKlientiException nëse ekziston 
     * kontakti klienti ose  i ke dhënë vlerë null KontaktiKlienti
     * @param kK
     * @throws KontaktiKlientiException 
     */
    @Override
    public void edit(KontaktiKlienti kK) throws KontaktiKlientiException{
        try{
            em.getTransaction().begin();
            em.persist(kK);
            em.getTransaction().commit();
        }catch(Throwable thro){
            if(thro.getMessage().contains("2627"))
                throw new KontaktiKlientiException("Edit Error:Kontakti i klientit ekziston!");
              else
                throw new KontaktiKlientiException("Edit Error:"+thro.getClass()+"-"+thro.getMessage());
        }
    }
    
    /**
     * Kjo metodë bën fshrijen e kontaktit nga databaza në
     * tabelën Kontakti_Klienti , kjo kthenë KontaktiKlientiException  
     * nëse Kontakti është përdorim  ose nëse je tu e fshi një vlerë
     * null
     * @param kK
     * @throws KontaktiKlientiException 
     */
    @Override
    public void remove(KontaktiKlienti kK) throws KontaktiKlientiException{
        try{
            em.getTransaction().begin();
            em.remove(kK);
            em.getTransaction().commit();
        }catch(Throwable thro){
            if(thro.getMessage().contains("547"))
                throw new KontaktiKlientiException("Remove Error:Kontakti është në përodim!");
            else
                throw new KontaktiKlientiException("Remove Error:"+thro.getClass()+"-"+thro.getMessage());
        }
    }
    
    /**
     * Kjo metodë bën kthimin e gjithë kontaktve si listë
     * @return 
     */
    @Override
    public List<KontaktiKlienti> findAll(){
        return  em.createNamedQuery("KontaktiKlienti.findAll").getResultList();
    }
    /**
     * Kjo metodë  bën e gjetjes kontaktit përmes id nga databaza
     * në tabelën Kontakti_Klienti kjo kthen KontaktiKlientiException 
     * nëse nuk e gjen kontaktin
     * @param id
     * @return
     * @throws KontaktiKlientiException 
     */
    @Override
    public KontaktiKlienti findById(int id ) throws KontaktiKlientiException{
         Query query = em.createQuery("SELECT p FROM KontaktiKlienti k WHERE k.iDKlienti = :id");
         query.setParameter("id", id);
        try{
            return (KontaktiKlienti)query.getSingleResult();
        }catch(NoResultException nre){
            throw new KontaktiKlientiException("Kontakti nuk ekziston!");
        }
    }
}
