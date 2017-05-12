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
import BL.Klienti;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class KlientiTableModel extends AbstractTableModel{
    
  private final String[] columnNames = {"Emri","Mbiemri","Ditëlindja","Gjinija","Shteti","Qyteti","Rruga","Kodi Postar"};
  
  private List<Klienti> data;
  
  public KlientiTableModel(){}
  
  public KlientiTableModel(List<Klienti> data){
        this.data = data;
  }
  
  public void add(List<Klienti> data){
      this.data = data;
  }
  
  /**
   * Kthen numrin e rreshtave
   * @return 
   */
  @Override
  public int getRowCount(){
      return data.size();
  }
  
  /**
   * Kthen nurmin e kolonave
   * @return 
   */
  @Override
  public int getColumnCount(){
      return columnNames.length;
  }
 
  /**
   * Përmes ID  bën kthimin e emrit të kolones
   * @param i
   * @return 
   */
  @Override
  public String getColumnName(int i){
      return columnNames[i];
  }
  /**
   * Kjo bën fshrijet e reshtit
   * @param row
   */
  public void remove(int row){
     data.remove(row);
  }
  
  /**
   * Kjo bën kthimin e klientit përmes  qelsit të listës
   * @param i
   * @return 
   */
  public  Klienti getKlienti(int i){
      return data.get(i);
  }
  
  /**
   * Kjo bën formatimin e datës
   * @param d
   * @return 
   */
  public String getDitëlindja(Date d){
      DateFormat dateF = new SimpleDateFormat("dd/MM/yyyy");
      return dateF.format(d);
  }
  
  @Override
  public Object getValueAt(int rowIndex,int columnIndex){
      Klienti k = (Klienti)getKlienti(rowIndex);
      switch(columnIndex){
          case 0:
              return k.getEmri();
          case 1:
              return k.getMbiemri();
          case 2:
              return getDitëlindja(k.getDitelindja());
          case 3:
              return k.getGjinija();
          case 4:
              return k.getShteti();
          case 5:
              return k.getQyteti();
          case 6:
              return k.getRruga();
          case 7:
              return k.getKodiPostar();
          default :
              return null;
      }
  }
  
}
