/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;
import Controllers.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import Views.HomeView;
import Views.EspecieArbolView;
import java.awt.Color;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
/**
 *
 * @author martinmelo
 */
public class DetailModelView extends javax.swing.JFrame {
    private static Conexion conn;
    private static String table;
    private static Statement query;
    private static DefaultTableModel model;
    private static String PrimaryKey;
    private static String SelectedPK = "";
    private static int roww;
    /**
     * Creates new form DetailModelView
     */
    public DetailModelView() {
        initComponents();
    }
    public DetailModelView(String tabla) {
        initComponents();
        this.table = tabla;
        this.getContentPane().setBackground(Color.decode("#004d40"));
        String pepe = putNameinLabel(this.table);
        NameTable.setText(pepe);
        this.setTitle(pepe);
        getData();
        tableRecords.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
            
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if(tableRecords.getSelectedRow() != -1)
                {
                    roww = tableRecords.getSelectedRow();
                    SelectedPK = tableRecords.getValueAt(roww,0).toString();
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableRecords = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        NameTable = new javax.swing.JLabel();
        BtnEdit = new javax.swing.JButton();
        BtnDelete = new javax.swing.JButton();
        BtnAdd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableRecords.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tableRecords);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back-arrow.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        NameTable.setFont(new java.awt.Font("Open Sans", 1, 36)); // NOI18N
        NameTable.setForeground(new java.awt.Color(255, 255, 255));
        NameTable.setText("jLabel1");

        BtnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pencil.png"))); // NOI18N
        BtnEdit.setText("Editar");
        BtnEdit.setIconTextGap(6);
        BtnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditActionPerformed(evt);
            }
        });

        BtnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        BtnDelete.setText("Eliminar");
        BtnDelete.setIconTextGap(6);
        BtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDeleteActionPerformed(evt);
            }
        });

        BtnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add-button-inside-black-circle.png"))); // NOI18N
        BtnAdd.setText("Añadir");
        BtnAdd.setFocusable(false);
        BtnAdd.setIconTextGap(6);
        BtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(NameTable)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(BtnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(BtnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(BtnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameTable))
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(BtnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(BtnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        HomeView home = new HomeView();
        home.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddActionPerformed
        switch(table){
                case "Especie_Arbol":
                    EspecieArbolView arbol = new EspecieArbolView(table, "Insertar");
                    arbol.setVisible(true);
                    this.setVisible(false);
                break;
                case "Lugar":
                    
                    LugarView lugar = new LugarView(table, "Insertar");
                    lugar.setVisible(true);
                    this.setVisible(false);
                break;
                case "Ejemplar":
                    EjemplarView ejemplar = new EjemplarView(table, "Insertar");
                    ejemplar.setVisible(true);
                    this.setVisible(false);
                break;
        }
    }//GEN-LAST:event_BtnAddActionPerformed

    private void BtnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditActionPerformed
        if(SelectedPK != "")
        {
            switch(table)
            {
                case "Especie_Arbol":
                    EspecieArbolView arbol = new EspecieArbolView(table, SelectedPK);
                    arbol.setVisible(true);
                    this.setVisible(false);
                break;
                case "Lugar":
                    
                    LugarView lugar = new LugarView(table, SelectedPK);
                    lugar.setVisible(true);
                    this.setVisible(false);
                break;
                case "Ejemplar":
                    EjemplarView ejemplar = new EjemplarView(table, SelectedPK);
                    ejemplar.setVisible(true);
                    this.setVisible(false);
                break;
            }
        }
        else
        {
            System.out.println("No se puede, no has seleccionado nada");
        }
        
    }//GEN-LAST:event_BtnEditActionPerformed

    private void BtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDeleteActionPerformed
        if(SelectedPK != "")
        {
            conn = new Conexion();
        Connection conec = conn.getConexion();
        try {
            query = conec.createStatement();
            query.executeUpdate("DELETE FROM "+table+" WHERE "+PrimaryKey+" = '"+SelectedPK+"'");
            ((DefaultTableModel)tableRecords.getModel()).removeRow(roww);
            System.out.println("Adios popo");
        }
        catch(SQLException e)
        {
            System.out.println("Me quedo popo");
        }
        }
        else
        {
            System.out.println("No se puede, no has seleccionado nada");
        }
    }//GEN-LAST:event_BtnDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(DetailModelView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DetailModelView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DetailModelView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DetailModelView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DetailModelView().setVisible(true);
                
            }
        });
    }
    
    public static void getData()
    {
        conn = new Conexion();
        Connection conec = conn.getConexion();
        try {
            query = conec.createStatement();
            ResultSet data = query.executeQuery("SELECT * FROM "+table);
            ResultSetMetaData columns = data.getMetaData();
            int columnsLength = columns.getColumnCount();
            String columnstoTable[] = new String[columnsLength];
            for(int i = 0; i < columnsLength; i++)
            {
                columnstoTable[i] = columns.getColumnLabel(i+1);
                System.out.println(columnstoTable[i]);
            }
            PrimaryKey = columnstoTable[0];
            
            model = new DefaultTableModel(null, columnstoTable);
            
            
            String[] row =  new String[columnsLength];
            while(data.next())
            {
                for(int i = 0; i < columnsLength;i++)
                {
                    row[i] = data.getString(columnstoTable[i]);
                }
                model.addRow(row);
            }
            
            tableRecords.setModel(model);
            
        }
        catch(SQLException e)
        {
            
        }
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAdd;
    private javax.swing.JButton BtnDelete;
    private javax.swing.JButton BtnEdit;
    private static javax.swing.JLabel NameTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable tableRecords;
    // End of variables declaration//GEN-END:variables
}
