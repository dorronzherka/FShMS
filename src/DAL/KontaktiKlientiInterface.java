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
public interface KontaktiKlientiInterface {
    
    void create(KontaktiKlienti kK)  throws KontaktiKlientiException;
    void edit(KontaktiKlienti kK)    throws KontaktiKlientiException;
    void remove(KontaktiKlienti kK)  throws KontaktiKlientiException;
    List<KontaktiKlienti> findAll();
    KontaktiKlienti findById(int id) throws KontaktiKlientiException;
    
}
