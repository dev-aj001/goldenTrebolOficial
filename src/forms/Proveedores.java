/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package forms;

import Clases.Validar;
import bd.ConexionSQL;
import bd.Proveedor;
import bd.Usuario;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jairi
 */
public class Proveedores extends javax.swing.JPanel {

    private static Proveedores instance;
    
    private DefaultTableModel tbm;
    private ConexionSQL mDB;
    
    private Proveedores() {
        initComponents();
        setOpaque(false);
        tbm = new DefaultTableModel();
        tbm.addColumn("id");
        tbm.addColumn("Nombre");
        tbm.addColumn("Corre");
        tbm.addColumn("Telefono");
        tbm.addColumn("RFC");
        
        mDB = new ConexionSQL("treboldb", "root", "C19400437");
        CargarDatos();
    }

    public static Proveedores getInstance(){
        if (instance == null){
            instance = new Proveedores();
        }
        return instance;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelShadow1 = new swing.PanelShadow();
        roundPanel1 = new swing.RoundPanel();
        jLabel1 = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblRFC = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtId = new swing.TextField();
        txtNombre = new javax.swing.JTextField();
        txtRFC = new javax.swing.JTextField();
        txtCorreo1 = new javax.swing.JTextField();
        txtTelefono1 = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        roundPanel2 = new swing.RoundPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        panelShadow1.setBackground(new java.awt.Color(153, 153, 153));

        roundPanel1.setBackground(new java.awt.Color(255, 195, 0));
        roundPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Nombre");
        roundPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 89, 22));

        lblCorreo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCorreo.setText("Correo");
        roundPanel1.add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 89, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Telefono");
        roundPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 89, -1));

        lblRFC.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblRFC.setText("RFC");
        roundPanel1.add(lblRFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 219, 89, 25));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setText("Datos del proveedor");
        roundPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 12, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("ID");
        roundPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 56, 89, 34));

        txtId.setEditable(false);
        roundPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 56, 132, -1));
        roundPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 140, -1));
        roundPanel1.add(txtRFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 140, -1));
        roundPanel1.add(txtCorreo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 140, -1));
        roundPanel1.add(txtTelefono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 140, -1));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setText("Lista de proveedores");

        tabla.setModel(new javax.swing.table.DefaultTableModel(
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
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        jButton1.setText("Buscar");

        javax.swing.GroupLayout roundPanel2Layout = new javax.swing.GroupLayout(roundPanel2);
        roundPanel2.setLayout(roundPanel2Layout);
        roundPanel2Layout.setHorizontalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE)
                    .addGroup(roundPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        roundPanel2Layout.setVerticalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField1)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelShadow1Layout = new javax.swing.GroupLayout(panelShadow1);
        panelShadow1.setLayout(panelShadow1Layout);
        panelShadow1Layout.setHorizontalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelShadow1Layout.createSequentialGroup()
                        .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(roundPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(panelShadow1Layout.createSequentialGroup()
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelShadow1Layout.setVerticalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(roundPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnEliminar)
                    .addComponent(btnModificar))
                .addGap(32, 32, 32))
        );

        add(panelShadow1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if(validarTxt()){
            Proveedor mProv = new Proveedor();
            //mProv.setIdUsuario(txt.getText());
            mProv.setNombre(txtNombre.getText());
            mProv.setCorreo(txtRFC.getText());
            mProv.setTelefono(txtRFC.getText());
            mProv.setRFC(txtRFC.getText());
            
            System.out.println(mProv.toString());
            
            if(mDB.Conectar()){
                if(mDB.AddProveedor(mProv)){
                    JOptionPane.showMessageDialog(null, "Proveedor registrado exitosamente");
                    LimpiarTabla();
                    CargarDatos();
                    LimpiarTxt();
                }
            }else{
                JOptionPane.showMessageDialog(null, "Error al conectar");
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        txtId.setText(tbm.getValueAt(tabla.getSelectedRow(), 0).toString());
        txtNombre.setText(tbm.getValueAt(tabla.getSelectedRow(), 1).toString());
        txtRFC.setText(tbm.getValueAt(tabla.getSelectedRow(), 2).toString());
        txtRFC.setText(tbm.getValueAt(tabla.getSelectedRow(), 3).toString());
        txtRFC.setText(tbm.getValueAt(tabla.getSelectedRow(), 4).toString());
    }//GEN-LAST:event_tablaMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int id;
        if(tabla.getSelectedRow() != -1){
            id = Integer.parseInt(tbm.getValueAt(tabla.getSelectedRow(), 0).toString());
            if(JOptionPane.showConfirmDialog(null, "Seguro deseas eliminar el provedor con codigo?: "+id,"Eliminar",JOptionPane.WARNING_MESSAGE,JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
                if(mDB.Conectar()){
                    mDB.EliminarProveedor(id);
                    LimpiarTabla();
                    CargarDatos();
                }
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        String proveedor="";
        if(tabla.getSelectedRow() != -1){
            proveedor = tbm.getValueAt(tabla.getSelectedRow(), 1).toString();
            if(JOptionPane.showConfirmDialog(null, "Desea modificar este proveedor?: "+proveedor,"Modificar",JOptionPane.WARNING_MESSAGE,JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
                if(mDB.Conectar()){
                    Proveedor mProveedor= new Proveedor();
                    mProveedor.setNombre(txtNombre.getText().trim());
                    mProveedor.setCorreo(txtRFC.getText().trim());
                    mProveedor.setTelefono(txtRFC.getText());
                    mProveedor.setRFC(txtRFC.getText());
                    mProveedor.setIdProveedor(Integer.parseInt(txtId.getText()));
                    mDB.ModificarProveedor(mProveedor);
                    LimpiarTabla();
                    CargarDatos();
                }
            }
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void CargarDatos(){
        ArrayList Proveedores;
        Proveedor mProv;
        if(mDB.Conectar()){
            String [] Datos = new String[7];
            //System.out.println("admin0");
            Proveedores =mDB.GetProveedores();
            //System.out.println("admin");
            
            if(Proveedores != null){
                System.out.println("admin2");
                for (int i = 0; i < Proveedores.size(); i++) {
                    mProv = (Proveedor) Proveedores.get(i);
                    Datos[0]=String.valueOf(mProv.getIdProveedor());
                    Datos[1]=String.valueOf(mProv.getNombre());
                    Datos[2]=String.valueOf(mProv.getCorreo());
                    Datos[3]=String.valueOf(mProv.getTelefono());
                    Datos[4]=String.valueOf(mProv.getRFC());
                    tbm.addRow(Datos);
                }
                
                System.out.println("admin2");
                
                this.tabla.setModel(tbm);
                this.tabla.getColumnModel().getColumn(0).setPreferredWidth(42);
                this.tabla.getColumnModel().getColumn(1).setPreferredWidth(50);
                this.tabla.getColumnModel().getColumn(2).setPreferredWidth(50);
                this.tabla.getColumnModel().getColumn(3).setPreferredWidth(50);
                this.tabla.getColumnModel().getColumn(4).setPreferredWidth(50);
                
                if(this.tabla.getRowCount()>0){
                    this.tabla.setRowSelectionInterval(0, 0);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Error al cargar proveedores");
            }
        }
    }
    
    private void LimpiarTabla(){
        for (int i = 0; i < tabla.getRowCount(); i++) {
            tbm.removeRow(i);
            i-=1;
        }
    }
    
    private void LimpiarTxt(){
        txtNombre.setText("");
        txtRFC.setText("");
        txtRFC.setText("");
        txtRFC.setText("");
    }
    
    private boolean validarTxt(){
        if(esVacio()){
            JOptionPane.showMessageDialog(this, "Llena todos los campos");
            return false;
        }else{
            Validar v = new Validar();
            if(v.RFC(txtRFC.getText()) && v.Email(txtCorreo1.getText())){
                return true;
            }else{
                if(!v.Email(txtCorreo1.getText())){
                    lblCorreo.setForeground(Color.red);
                    JOptionPane.showMessageDialog(null, "Correo no valido");
                    
                }
                if(!v.RFC(txtRFC.getText())){
                    lblRFC.setForeground(Color.red);
                    JOptionPane.showMessageDialog(null, "RFC no valido");
                    
                }
                return false;
            }
        }
    }
    
    private boolean esVacio(){
        return(txtNombre.getText().isBlank()||txtRFC.getText().isBlank()||txtRFC.getText().isBlank()||txtRFC.getText().isBlank());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblRFC;
    private swing.PanelShadow panelShadow1;
    private swing.RoundPanel roundPanel1;
    private swing.RoundPanel roundPanel2;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtCorreo1;
    private swing.TextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRFC;
    private javax.swing.JTextField txtTelefono1;
    // End of variables declaration//GEN-END:variables
}
