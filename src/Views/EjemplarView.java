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
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author martinmelo
 */
public class EjemplarView extends javax.swing.JFrame {
    
    private static String title;
    private static JOptionPane panel;
    private static String tabla;
    private static Conexion conn;
    private static Statement query;
    private static String actionOrID;
    /**
     * Creates new form EjemplarView
     */
    public EjemplarView() {
        initComponents();
    }
    
    public EjemplarView(String tabla, String actionOrId)
    {
        initComponents();
        this.getContentPane().setBackground(Color.decode("#ff9100"));
        this.tabla = tabla;
        this.actionOrID = actionOrId;
        String pedro = putNameinLabel(tabla);
        if(actionOrId =="Insertar")
        {
            this.title = actionOrId + " " + pedro;
            LabelActualEspecie.setVisible(false);
            LabelActualLugar.setVisible(false);
            
        }
        else
        {
            this.title = "Modificar" + " " + pedro+"("+actionOrId+")";
            TxtCodEjemplar.setEditable(false);
            BtnClean.setEnabled(false);
            getOne(actionOrID);
        }
        jLabel1.setText(this.title);
        this.setTitle(this.title);
        fillSelects();
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        TxtFotografia = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TxtCodEjemplar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TxtNumEjemplar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        BtnClean = new javax.swing.JButton();
        BtnSave = new javax.swing.JButton();
        BtnBack = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtDescripcion = new javax.swing.JTextArea();
        SelectLugar = new javax.swing.JComboBox<>();
        SelectEspecie = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        LabelActualEspecie = new javax.swing.JLabel();
        LabelActualLugar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Open Sans", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("jLabel1");

        TxtFotografia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtFotografiaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        jLabel2.setText("Fotografia");

        TxtCodEjemplar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCodEjemplarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        jLabel3.setText("Codigo Ejemplar");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        TxtNumEjemplar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNumEjemplarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        jLabel4.setText("Numero Ejemplar");

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

        BtnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back-arrow.png"))); // NOI18N
        BtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBackActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        jLabel5.setText("Descripcion");

        TxtDescripcion.setColumns(20);
        TxtDescripcion.setRows(5);
        jScrollPane1.setViewportView(TxtDescripcion);

        jLabel6.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        jLabel6.setText("Especie");

        jLabel7.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        jLabel7.setText("Lugar");

        LabelActualEspecie.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        LabelActualEspecie.setText("jLabel8");

        LabelActualLugar.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        LabelActualLugar.setText("jLabel8");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BtnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(BtnClean, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LabelActualEspecie)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtNumEjemplar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SelectEspecie, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtCodEjemplar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxtFotografia, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SelectLugar, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(LabelActualLugar)
                                .addGap(223, 223, 223)))
                        .addGap(57, 57, 57))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(BtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(TxtCodEjemplar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TxtNumEjemplar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(78, 78, 78))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(SelectEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addComponent(LabelActualEspecie)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtFotografia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SelectLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(LabelActualLugar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnClean, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtFotografiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtFotografiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtFotografiaActionPerformed

    private void TxtCodEjemplarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCodEjemplarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCodEjemplarActionPerformed

    private void BtnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCleanActionPerformed
        TxtFotografia.setText("");
        TxtCodEjemplar.setText("");
        TxtNumEjemplar.setText("");
        TxtDescripcion.setText("");
        SelectEspecie.setSelectedIndex(0);
        SelectLugar.setSelectedIndex(0);

    }//GEN-LAST:event_BtnCleanActionPerformed

    private void BtnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSaveActionPerformed
        String codEjemplar, fotografia, descripcion, idLugar, idEspecie;
        int numEjemplar = 0;
        codEjemplar= TxtCodEjemplar.getText();
        fotografia = TxtFotografia.getText();
        descripcion = TxtDescripcion.getText();
        numEjemplar = Integer.parseInt(TxtNumEjemplar.getText());
        idLugar = SelectLugar.getSelectedItem().toString();
        idEspecie = SelectEspecie.getSelectedItem().toString().split(":")[0];
        System.out.println("Especie"+idEspecie);
        if(codEjemplar.isEmpty() || fotografia.isEmpty() || descripcion.isEmpty() || numEjemplar==0 || idLugar.isEmpty() || idEspecie.isEmpty())
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
                    query.executeUpdate("INSERT INTO "+tabla+"(Cod_Ejemplar, Fotografia_Inicial, Descripcion_entorno, Num_Ejemplar, Id_Especie, Id_Lugar)"
                        + "values ('"+codEjemplar+"', '"+fotografia+"', '"+descripcion+"', "+numEjemplar+",'"+idEspecie+"','"+idLugar+"')");
                    System.out.println("Se añadio correctamente");
                }
                else
                {
                    query.executeUpdate("UPDATE "+tabla+" set Num_Ejemplar="+numEjemplar+",Fotografia_Inicial='"+fotografia+"',Descripcion_entorno='"+descripcion+"',Id_Especie='"+idEspecie+"',Id_Lugar='"+idLugar+"' WHERE Cod_Ejemplar = '"+actionOrID+"'");
                    System.out.println("Se actualizo correctamente");
                }
            }
            catch(SQLException e)
            {
                System.out.println("Fallo"+e);
            }

        }
    }//GEN-LAST:event_BtnSaveActionPerformed

    private void BtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBackActionPerformed
        DetailModelView detail = new DetailModelView(tabla);
        detail.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnBackActionPerformed

    private void TxtNumEjemplarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNumEjemplarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNumEjemplarActionPerformed

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
            java.util.logging.Logger.getLogger(EjemplarView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EjemplarView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EjemplarView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EjemplarView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EjemplarView().setVisible(true);
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
            ResultSet rs = query.executeQuery("SELECT * FROM "+tabla+" WHERE Cod_Ejemplar = '"+ID+"'");
            while(rs.next())
            {
                TxtCodEjemplar.setText(rs.getString("Cod_Ejemplar"));
                TxtNumEjemplar.setText(rs.getString("Num_Ejemplar"));
                TxtFotografia.setText(rs.getString("Fotografia_Inicial"));
                TxtDescripcion.setText(rs.getString("Descripcion_entorno"));
                LabelActualEspecie.setText("Actual: "+rs.getString("Id_Especie"));
                LabelActualLugar.setText("Actual: "+rs.getString("Id_Lugar"));
            }
            
        }
        catch(SQLException e)
        {
            System.out.println("Fallo"+e);
        }
    }
    
    public static void fillSelects()
    {
        conn = new Conexion();
        Connection conec = conn.getConexion();
        try
        {
            query = conec.createStatement();
            ResultSet rs1 = query.executeQuery("SELECT Cod_Especie, Nombre FROM Especie_Arbol");
            
            while(rs1.next())
            {
                SelectEspecie.addItem(rs1.getString(1)+": "+rs1.getString(2));
            }
            
            
            ResultSet rs2 = query.executeQuery("SELECT Nombre FROM Lugar");
            
            
            
            while(rs2.next())
            {
                SelectLugar.addItem(rs2.getString(1));
            }
        }
        catch(SQLException e)
        {
            System.out.println("No funciono alv"+e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBack;
    private javax.swing.JButton BtnClean;
    private javax.swing.JButton BtnSave;
    private static javax.swing.JLabel LabelActualEspecie;
    private static javax.swing.JLabel LabelActualLugar;
    private static javax.swing.JComboBox<String> SelectEspecie;
    private static javax.swing.JComboBox<String> SelectLugar;
    private static javax.swing.JTextField TxtCodEjemplar;
    private static javax.swing.JTextArea TxtDescripcion;
    private static javax.swing.JTextField TxtFotografia;
    private static javax.swing.JTextField TxtNumEjemplar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
