package DAL;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dorron
 */
import javax.persistence.Persistence;
import javax.persistence.EntityManager;
public class EntMngClass {
    EntityManager em = Persistence.createEntityManagerFactory("FShMSPU").createEntityManager();
}
