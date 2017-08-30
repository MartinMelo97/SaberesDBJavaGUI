/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controllers.Conexion;
import java.sql.Statement;
import javax.swing.JOptionPane;
import Controllers.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author martinmelo
 */
public class LugarView extends javax.swing.JFrame {
    
    private static String title;
    private static JOptionPane panel;
    private static String tabla;
    private static Conexion conn;
    private static Statement query;
    private static String actionOrID;

    /**
     * Creates new form LugarView
     */
    public LugarView() {
        initComponents();
    }
    
    public LugarView(String tabla, String actionOrId)
    {
        initComponents();
        this.tabla = tabla;
        this.actionOrID = actionOrId;
        String pedro = putNameinLabel(tabla);
        if(actionOrId =="Insertar")
        {
            this.title = actionOrId + " " + pedro;
            
        }
        else
        {
            this.title = "Modificar" + " " + pedro+"("+actionOrId+")";
            TxtName.setEditable(false);
            BtnClean.setEnabled(false);
            getOne(actionOrID);
        }
        
        jLabel1.setText(this.title);
        this.setTitle(this.title);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        TxtMapa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TxtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TxtCallePlaza = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        BtnClean = new javax.swing.JButton();
        BtnSave = new javax.swing.JButton();
        TxtCoordenadas = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back-arrow.png"))); // NOI18N
        BtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Open Sans", 1, 36)); // NOI18N
        jLabel1.setText("jLabel1");

        TxtMapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtMapaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        jLabel2.setText("Mapa");

        TxtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNameActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        jLabel3.setText("Nombre");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel4.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        jLabel4.setText("Calle/Plaza");

        BtnClean.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/wiping-swipe-for-floors.png"))); // NOI18N
        BtnClean.setText("Limpiar");
        BtnClean.setIconTextGap(6);
        BtnClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCleanActionPerformed(evt);
            }
        });

        BtnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        BtnSave.setText("Guardar");
        BtnSave.setIconTextGap(6);
        BtnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSaveActionPerformed(evt);
            }
        });

        TxtCoordenadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCoordenadasActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        jLabel5.setText("Coordenadas");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 181, Short.MAX_VALUE)
                        .addComponent(BtnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(BtnClean, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(194, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(TxtCallePlaza, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(92, 92, 92)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                                        .addComponent(TxtCoordenadas, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(TxtName, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(92, 92, 92)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                                        .addComponent(TxtMapa, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(BtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TxtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtMapa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtCallePlaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(114, 114, 114))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtCoordenadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnClean, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBackActionPerformed
        DetailModelView detail = new DetailModelView(tabla);
        detail.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnBackActionPerformed

    private void TxtMapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtMapaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtMapaActionPerformed

    private void TxtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNameActionPerformed

    private void BtnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCleanActionPerformed
        TxtMapa.setText("");
        TxtName.setText("");
        TxtCallePlaza.setText("");
        TxtCoordenadas.setText("");
        
    }//GEN-LAST:event_BtnCleanActionPerformed

    private void BtnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSaveActionPerformed
        String mapa, nombre, calleplaza, coordenadas;
        mapa= TxtMapa.getText();
        nombre = TxtName.getText();
        calleplaza = TxtCallePlaza.getText();
        coordenadas = TxtCoordenadas.getText();
        if(mapa.isEmpty() || nombre.isEmpty() || calleplaza.isEmpty() || coordenadas.isEmpty())
        {
            System.out.println("No se puede");
        }
        else
        {
            conn = new Conexion();
            Connection conec = conn.getConexion();
            try{
                query = conec.createStatement();
                if(actionOrID == "Insertar")
                {
                    query.executeUpdate("INSERT INTO "+tabla+"(Nombre, CallePlaza, mapa, coordenadas) "
                        + "values ('"+nombre+"', '"+calleplaza+"', '"+mapa+"', '"+coordenadas+"')");
                    System.out.println("Se añadio correctamente");
                }
                else
                {
                    query.executeUpdate("UPDATE "+tabla+" set CallePlaza='"+calleplaza+"',mapa='"+mapa+"',coordenadas='"+coordenadas+"' WHERE Nombre = '"+actionOrID+"'");
                    System.out.println("Se actualizo correctamente");
                }
            }
            catch(SQLException e)
            {
                System.out.println("Fallo"+e);
            }

        }

    }//GEN-LAST:event_BtnSaveActionPerformed

    private void TxtCoordenadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCoordenadasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCoordenadasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LugarView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LugarView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LugarView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LugarView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LugarView().setVisible(true);
            }
        });
    }
    
    public static String putNameinLabel(String name)
    {
        String namee = name;
        if(name.contains("_"))
        {
            namee = name.replaceAll("_", " de ");
        }
        
        return namee;    
    }
    
    public static void getOne(String ID)
    {
        conn = new Conexion();
        Connection conec = conn.getConexion();
        try{
            query = conec.createStatement();
            ResultSet rs = query.executeQuery("SELECT * FROM "+tabla+" WHERE Nombre = '"+ID+"'");
            while(rs.next())
            {
                TxtName.setText(rs.getString("Nombre"));
                TxtCallePlaza.setText(rs.getString("CallePlaza"));
                TxtMapa.setText(rs.getString("mapa"));
                TxtCoordenadas.setText(rs.getString("coordenadas"));
            }
            
        }
        catch(SQLException e)
        {
            System.out.println("Fallo"+e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBack;
    private javax.swing.JButton BtnClean;
    private javax.swing.JButton BtnSave;
    private static javax.swing.JTextField TxtCallePlaza;
    private static javax.swing.JTextField TxtCoordenadas;
    private static javax.swing.JTextField TxtMapa;
    private static javax.swing.JTextField TxtName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
