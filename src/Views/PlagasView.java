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
public class PlagasView extends javax.swing.JFrame {

    private static String title;
    private static JOptionPane panel;
    private static String tabla;
    private static Conexion conn;
    private static Statement query;
    private static String actionOrID;
    /**
     * Creates new form PlagasView
     */
    public PlagasView() {
        initComponents();
    }
    
    public PlagasView(String tabla, String actionOrId)
    {
        initComponents();
        this.getContentPane().setBackground(Color.decode("#ff9100"));
        this.tabla = tabla;
        this.actionOrID = actionOrId;
        String pedro = putNameinLabel(tabla);
        if(actionOrId =="Insertar")
        {
            this.title = actionOrId + " " + pedro;
            LabelActualEjemplar.setVisible(false);
            LabelActualOperario1.setVisible(false);
            LabelActualOperario2.setVisible(false);
        }
        else
        {
            this.title = "Modificar" + " " + pedro+"("+actionOrId+")";
            TxtCodPlaga.setEditable(false);
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

        SelectOperario1 = new javax.swing.JComboBox<>();
        LabelActualOperario1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Fecha_Fin = new javax.swing.JFormattedTextField();
        Fecha_Inicio = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TxtTratamiento = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        LabelActualEjemplar = new javax.swing.JLabel();
        BtnClean = new javax.swing.JButton();
        LabelActualOperario2 = new javax.swing.JLabel();
        BtnSave = new javax.swing.JButton();
        BtnBack = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtDescripcion = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        TxtCodPlaga = new javax.swing.JTextField();
        SelectEjemplar = new javax.swing.JComboBox<>();
        SelectOperario2 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        TxtAtaque = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LabelActualOperario1.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        LabelActualOperario1.setText("jLabel8");

        jLabel9.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        jLabel9.setText("Fecha de inicio");

        jLabel10.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        jLabel10.setText("Fecha de inicio");

        try {
            Fecha_Fin.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-## ##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Fecha_Fin.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        try {
            Fecha_Inicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-## ##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Fecha_Inicio.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel11.setText("YYYY-MM-DD HH:MM:SS");

        jLabel3.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        jLabel3.setText("Codigo Plaga");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel6.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        jLabel6.setText("Ejemplar");

        TxtTratamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtTratamientoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        jLabel7.setText("Operario #2");

        jLabel4.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        jLabel4.setText("Tratamiento");

        LabelActualEjemplar.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        LabelActualEjemplar.setText("jLabel8");

        BtnClean.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/wiping-swipe-for-floors.png"))); // NOI18N
        BtnClean.setText("Limpiar");
        BtnClean.setIconTextGap(6);
        BtnClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCleanActionPerformed(evt);
            }
        });

        LabelActualOperario2.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        LabelActualOperario2.setText("jLabel8");

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
        jLabel5.setText("Descripcion_daños");

        jLabel1.setFont(new java.awt.Font("Open Sans", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("jLabel1");

        TxtDescripcion.setColumns(20);
        TxtDescripcion.setRows(5);
        jScrollPane1.setViewportView(TxtDescripcion);

        jLabel2.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        jLabel2.setText("Especies Atacantes");

        TxtCodPlaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCodPlagaActionPerformed(evt);
            }
        });

        SelectOperario2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectOperario2ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        jLabel8.setText("Operario #1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(LabelActualOperario1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(LabelActualEjemplar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SelectOperario1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(Fecha_Inicio)))
                        .addGap(180, 180, 180)
                        .addComponent(LabelActualOperario2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel11)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel6))
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtTratamiento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SelectEjemplar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtCodPlaga, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SelectOperario2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtAtaque, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(Fecha_Fin, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(BtnClean, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(BtnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TxtCodPlaga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(TxtAtaque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(TxtTratamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(SelectEjemplar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelActualEjemplar)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(SelectOperario2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(LabelActualOperario2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnClean, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(SelectOperario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelActualOperario1)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(Fecha_Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(Fecha_Fin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 32, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtTratamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtTratamientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtTratamientoActionPerformed

    private void BtnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCleanActionPerformed
        TxtAtaque.setText("");
        TxtCodPlaga.setText("");
        TxtTratamiento.setText("");
        TxtDescripcion.setText("");
        Fecha_Fin.setValue("");
        Fecha_Inicio.setValue("");
        SelectEjemplar.setSelectedIndex(0);
        SelectOperario1.setSelectedIndex(0);
        SelectOperario2.setSelectedIndex(0);
    }//GEN-LAST:event_BtnCleanActionPerformed

    private void BtnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSaveActionPerformed
        String codPlaga, tratamiento, descripcion, ataque, FechaInicio, FechaFin, idEjemplar, operario1, operario2;
        codPlaga= TxtCodPlaga.getText();
        tratamiento = TxtTratamiento.getText();
        descripcion = TxtDescripcion.getText();
        ataque = TxtAtaque.getText();
        FechaInicio = Fecha_Inicio.getText();
        FechaFin = Fecha_Fin.getText();
        idEjemplar = SelectEjemplar.getSelectedItem().toString();
        operario1 = SelectOperario1.getSelectedItem().toString().split(":")[0];;
        operario2 = SelectOperario2.getSelectedItem().toString().split(":")[0];;

        if(codPlaga.isEmpty() || tratamiento.isEmpty() || descripcion.isEmpty() || ataque.isEmpty() || FechaInicio.isEmpty() || FechaFin.isEmpty() || idEjemplar.isEmpty() || operario1.isEmpty() || operario2.isEmpty())
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
                    query.executeUpdate("INSERT INTO "+tabla+"(Cod_Plaga, Especies_atacantes, Descripcion_danos, "
                            + "Tratamiento, Fecha_inicio, Fecha_Fin, Id_Ejemplar, Operario_Uno, Operario_Dos)values "
                            + "('"+codPlaga+"', '"+ataque+"','"+descripcion+"', '"+tratamiento+"', '"+FechaInicio+"',"
                            + "'"+FechaFin+"','"+idEjemplar+"','"+operario1+"','"+operario2+"')");
                    System.out.println("Se añadio correctamente");
                }
                else
                {
                    query.executeUpdate("UPDATE "+tabla+" set Especies_atacantes='"+ataque+"',Tratamiento='"+tratamiento+"'"
                        + ",Descripcion_danos='"+descripcion+"',Fecha_inicio='"+FechaInicio+"',Fecha_Fin='"+FechaFin+"',"
                        + "Id_Ejemplar='"+idEjemplar+"',Operario_Uno='"+operario1+"',Operario_Dos='"+operario2+"' "
                        + "WHERE Cod_Plaga = '"+actionOrID+"'");
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

    private void TxtCodPlagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCodPlagaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCodPlagaActionPerformed

    private void SelectOperario2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectOperario2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SelectOperario2ActionPerformed

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
            java.util.logging.Logger.getLogger(PlagasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlagasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlagasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlagasView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlagasView().setVisible(true);
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
            ResultSet rs = query.executeQuery("SELECT * FROM "+tabla+" WHERE Cod_Plaga = '"+ID+"'");
            while(rs.next())
            {
                TxtCodPlaga.setText(rs.getString("Cod_Plaga"));
                TxtTratamiento.setText(rs.getString("Tratamiento"));
                TxtAtaque.setText(rs.getString("Especies_atacantes"));
                TxtDescripcion.setText(rs.getString("Descripcion_danos"));
                LabelActualEjemplar.setText("Actual: "+rs.getString("Id_Ejemplar"));
                LabelActualOperario1.setText("Actual: "+rs.getString("Operario_Uno"));
                LabelActualOperario2.setText("Actual: "+rs.getString("Operario_Dos"));
                Fecha_Inicio.setValue(rs.getString("Fecha_inicio"));
                Fecha_Fin.setValue(rs.getString("Fecha_Fin"));
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
            ResultSet rs1 = query.executeQuery("SELECT Cod_Ejemplar FROM Ejemplar");
            
            while(rs1.next())
            {
                SelectEjemplar.addItem(rs1.getString(1));
            }
            
            
            ResultSet rs2 = query.executeQuery("SELECT Cod_Empleado, Nombre FROM Operarios");
            
            
            
            while(rs2.next())
            {
                SelectOperario1.addItem(rs2.getString(1)+ ": "+ rs2.getString(2));
                SelectOperario2.addItem(rs2.getString(1)+ ": "+ rs2.getString(2));
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
    private static javax.swing.JFormattedTextField Fecha_Fin;
    private static javax.swing.JFormattedTextField Fecha_Inicio;
    private static javax.swing.JLabel LabelActualEjemplar;
    private static javax.swing.JLabel LabelActualOperario1;
    private static javax.swing.JLabel LabelActualOperario2;
    private static javax.swing.JComboBox<String> SelectEjemplar;
    private static javax.swing.JComboBox<String> SelectOperario1;
    private static javax.swing.JComboBox<String> SelectOperario2;
    private static javax.swing.JTextField TxtAtaque;
    private static javax.swing.JTextField TxtCodPlaga;
    private static javax.swing.JTextArea TxtDescripcion;
    private static javax.swing.JTextField TxtTratamiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
