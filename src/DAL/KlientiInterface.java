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
public interface KlientiInterface {
    void create(Klienti k)   throws KlientiException;
    void edit(Klienti k)     throws KlientiException;
    void remove(Klienti k)   throws KlientiException;
    List<Klienti> findAll();
    Klienti findById(int id)       throws KlientiException;
}
