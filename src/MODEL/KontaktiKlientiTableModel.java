/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

/**
 *
 * @author dorron
 */
import javax.swing.table.AbstractTableModel;
import java.util.List;
import BL.Klienti;
import DAL.KlientiRepository;
import BL.KontaktiKlienti;
public class KontaktiKlientiTableModel extends AbstractTableModel {
   
//Atributet
    private String[] columnNames = {"Emri","Mbiemri","Telefoni","Email"};
    private List<KontaktiKlienti> data;
    private KlientiRepository kR = new KlientiRepository();
    
    public KontaktiKlientiTableModel(){};
    
    /**
     * Kjo ben incializimin e listes;
     * @param kL 
     */
    public void add(List<KontaktiKlienti> kL){
        data = kL;
    }
    
    /**
     * Kjo kthen se sa row ika
     * @return 
     */
    @Override
    public int getRowCount(){
        return data.size();
    }
    
    /**
     * Kjo ben kthimin e se kolona i kena.
     * @return 
     */
    @Override
    public int getColumnCount(){
        return columnNames.length;
    }
    
    /**
     * Kjo ben kthimin emrit Kolones
     * @param i
     * @return 
     */
    @Override
    public String getColumnName(int i){
        return columnNames[i];
    }
    
    public KontaktiKlienti getKontaktiKlienti(int i){
        return data.get(i);
    }
    
    /**
     * E mbush tabelen me te dhena;
     * @param rowIndex
     * @param columnIndex
     * @return 
     */
    @Override
    public Object getValueAt(int rowIndex , int columnIndex){
        KontaktiKlienti k = getKontaktiKlienti(rowIndex);
        Klienti kL = k.getIDKlienti();
        switch(columnIndex){
            case 0:
                return kL.getEmri();
            case 1 :
                return kL.getMbiemri();
            case 2:
                return k.getTel();
            case 3:
               return k.getEmail();
            default:
                return null;
        }
    }
    
    
    
   
}
