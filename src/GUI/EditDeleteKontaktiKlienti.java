/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author dorron
 */
import BL.KontaktiKlienti;
import DAL.KontaktiKlientiRepository;
import DAL.KontaktiKlientiException;
import MODEL.KontaktiKlientiTableModel;
import java.util.List;
import javax.swing.JOptionPane;
        
public class EditDeleteKontaktiKlienti extends javax.swing.JInternalFrame {

    /**
     * Creates new form EditDeleteKontaktiKlienti
     */
    public EditDeleteKontaktiKlienti() {
        initComponents();
        tableLoad();
    }
    //
    KontaktiKlientiTableModel ktm = new KontaktiKlientiTableModel();
    KontaktiKlientiRepository kr = new KontaktiKlientiRepository();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Fshi");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(129, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            int row = jTable1.getSelectedRow();
            if(row < 0){
                 JOptionPane.showMessageDialog(this, "Nuk keni zgjedhur asnjë klient për ta fshirë!", "Gabim!", JOptionPane.ERROR_MESSAGE);
            }
            KontaktiKlienti kk = ktm.getKontaktiKlienti(row);
            kr.remove(kk);
            JOptionPane.showMessageDialog(this, "U fshi me suksese!");
            tableLoad();
        }catch(KontaktiKlientiException kEE){
            JOptionPane.showMessageDialog(this, kEE.getMessage(), "Gabim!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    
    public void tableLoad(){
        List<KontaktiKlienti> list = kr.findAll();
        ktm.add(list);
        jTable1.setModel(ktm);
        ktm.fireTableDataChanged();
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}