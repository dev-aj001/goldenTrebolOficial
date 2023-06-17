/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package forms;

import java.awt.Font;
import bd.ConexionSQL;
import static bd.ConexionSQL.mResultSet;
import bd.EncriptadoMD5;
import bd.Usuario;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Empleados extends javax.swing.JPanel {
    
    private static Empleados instance;

    private EncriptadoMD5 mEncoder;
    private ConexionSQL mDB;
    private DefaultTableModel tbm;
    
    private Empleados() {
        initComponents();
        setOpaque(false);
        tbm = new DefaultTableModel();
        tbm.addColumn("Nombre");
        tbm.addColumn("Apellidos");
        tbm.addColumn("Edad");
        tbm.addColumn("RFC");
        tbm.addColumn("Rol");
        tbm.addColumn("Telefono");
        tbm.addColumn("Usuario");        
        
        esconderPass();
        mEncoder = new EncriptadoMD5();
        mDB = new ConexionSQL("treboldb", "root", "C19400437");
        CargarUsuarios();
    }

    public static Empleados getInstance(){
        if(instance == null){
            instance = new Empleados();
        }
        return instance;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelShadow1 = new swing.PanelShadow();
        roundPanel1 = new swing.RoundPanel();
        txtPass1 = new swing.PasswordField();
        txtPass2 = new swing.PasswordField();
        lblNombre = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        txtUser = new swing.TextField();
        jLabel8 = new javax.swing.JLabel();
        cmbRol = new javax.swing.JComboBox<>();
        lblPass1 = new javax.swing.JLabel();
        lblPass2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblApellidos = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        lblEdad = new javax.swing.JLabel();
        lblRFC = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        txtRFC = new javax.swing.JTextField();
        spnEdad = new javax.swing.JSpinner();
        txtTelefono = new javax.swing.JFormattedTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lblTelefono1 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        roundPanel2 = new swing.RoundPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnEliminar1 = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        panelShadow1.setBackground(new java.awt.Color(153, 153, 153));

        roundPanel1.setBackground(new java.awt.Color(255, 195, 0));
        roundPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPass1.setToolTipText("Confirmar la contraseña");
        txtPass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPass1ActionPerformed(evt);
            }
        });
        txtPass1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPass1KeyTyped(evt);
            }
        });
        roundPanel1.add(txtPass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, 140, -1));

        txtPass2.setToolTipText("Contraseña de la cuenta del usuario");
        txtPass2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPass2KeyTyped(evt);
            }
        });
        roundPanel1.add(txtPass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 140, -1));

        lblNombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNombre.setText("Nombre*");
        roundPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 80, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Rol");
        roundPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 89, 20));

        lblUsuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblUsuario.setText("Usuario*");
        roundPanel1.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 89, 25));

        txtUser.setToolTipText("Cuenta del usuario\nEl nombre de este campo será con el que\nel usuario entrará al sistema\n");
        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUserKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUserKeyTyped(evt);
            }
        });
        roundPanel1.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 140, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setText("Datos del usuario");
        roundPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 12, -1, -1));

        cmbRol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Empleado", "Administrador" }));
        roundPanel1.add(cmbRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 140, -1));

        lblPass1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPass1.setText("Contraseña*");
        roundPanel1.add(lblPass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 89, 25));

        lblPass2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPass2.setText("Confirmar*");
        roundPanel1.add(lblPass2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 89, 25));

        txtNombre.setToolTipText("Nombre(s) real del usuario");
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        roundPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 140, -1));

        lblApellidos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblApellidos.setText("Apellidos");
        roundPanel1.add(lblApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 80, -1));

        txtApellido.setToolTipText("Apellido paterno y materno del usuario");
        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });
        roundPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 140, -1));

        lblEdad.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEdad.setText("Edad");
        roundPanel1.add(lblEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 80, -1));

        lblRFC.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblRFC.setText("RFC");
        roundPanel1.add(lblRFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 80, -1));

        lblTelefono.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTelefono.setText("Cuenta del usuario:");
        roundPanel1.add(lblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 150, -1));

        txtRFC.setToolTipText("RFC del usuario (opcional)");
        txtRFC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRFCActionPerformed(evt);
            }
        });
        roundPanel1.add(txtRFC, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 140, -1));

        spnEdad.setModel(new javax.swing.SpinnerNumberModel(18, null, 150, 1));
        spnEdad.setToolTipText("Edad en años del usuario");
        roundPanel1.add(spnEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 140, -1));

        try {
            txtTelefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefono.setToolTipText("Numero telefonico del usuario");
        roundPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 140, -1));

        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));
        roundPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 240, 10));

        lblTelefono1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTelefono1.setText("Teléfono");
        roundPanel1.add(lblTelefono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 80, -1));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setText("Lista de usuarios");

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

        txtBuscar.setToolTipText("Buscar usuario por (nombre, edad, telefono, etc)");

        btnBuscar.setText("Buscar");

        javax.swing.GroupLayout roundPanel2Layout = new javax.swing.GroupLayout(roundPanel2);
        roundPanel2.setLayout(roundPanel2Layout);
        roundPanel2Layout.setHorizontalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE)
                    .addGroup(roundPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar)))
                .addContainerGap())
        );
        roundPanel2Layout.setVerticalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtBuscar)
                        .addComponent(btnBuscar)))
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

        btnEliminar1.setText("Modificar");
        btnEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar1ActionPerformed(evt);
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
                        .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(roundPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(panelShadow1Layout.createSequentialGroup()
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(btnEliminar1))
                .addGap(32, 32, 32))
        );

        add(panelShadow1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if(validarTxt()){
            Usuario mUsuario = new Usuario();
            //mUsuario.setIdUsuario(txt_nombre.getText());
            mUsuario.setNombre(txtNombre.getText());
            mUsuario.setApellidos(txtApellido.getText());
            mUsuario.setEdad((Integer)spnEdad.getValue());
            mUsuario.setRol(cmbRol.getSelectedItem().toString());
            mUsuario.setTelefono(txtTelefono.getText());
            mUsuario.setUser(txtUser.getText());
            mUsuario.setPass(mEncoder.encode(txtPass1.getText()));
            
            System.out.println(mUsuario.toString());
            if(mDB.Conectar()){
                if(mDB.AddUser(mUsuario)){
                    JOptionPane.showMessageDialog(null, "Usuario registrado exitosamente");
                    LimpiarTabla();
                    CargarUsuarios();
                    LimpiarTxt();
                }
            }else{
                JOptionPane.showMessageDialog(null, "Error al conectar");
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtPass1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPass1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPass1ActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String user="";
        if(tabla.getSelectedRow() != -1){
            user = tbm.getValueAt(tabla.getSelectedRow(), 6).toString();
            if(JOptionPane.showConfirmDialog(null, "Desea eliminar este usuario?: "+user,"Eliminar",JOptionPane.WARNING_MESSAGE,JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
                if(mDB.Conectar()){
                    mDB.EliminarUsuario(user);
                    LimpiarTabla();
                    CargarUsuarios();
                }
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar1ActionPerformed
        String user="";
        if(tabla.getSelectedRow() != -1){
            user = tbm.getValueAt(tabla.getSelectedRow(), 6).toString();
            if(JOptionPane.showConfirmDialog(null, "Desea modificar este usuario?: "+user,"Modificar",JOptionPane.WARNING_MESSAGE,JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
                if(mDB.Conectar()){
                    Usuario mUsuario= new Usuario();
                    mUsuario.setNombre(txtNombre.getText().trim());
                    mUsuario.setApellidos(txtApellido.getText().trim());
                    mUsuario.setEdad((Integer)spnEdad.getValue());
                    mUsuario.setRol(cmbRol.getSelectedItem().toString());
                    mUsuario.setTelefono(txtTelefono.getText());
                    mUsuario.setUser(txtUser.getText());
                    mUsuario.setPass(mEncoder.encode(txtPass1.getText()));
                    mDB.ModificarUsuario(mUsuario);
                    LimpiarTabla();
                    CargarUsuarios();
                }
            }
        }
    }//GEN-LAST:event_btnEliminar1ActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        txtNombre.setText(tbm.getValueAt(tabla.getSelectedRow(), 0).toString());
        txtApellido.setText(tbm.getValueAt(tabla.getSelectedRow(), 1).toString());
        spnEdad.setValue(Integer.valueOf(tbm.getValueAt(tabla.getSelectedRow(), 2).toString()));
        txtRFC.setText(tbm.getValueAt(tabla.getSelectedRow(), 3).toString());
        cmbRol.setSelectedIndex((tbm.getValueAt(tabla.getSelectedRow(), 4).toString().equals("Empleado"))?0:1);
        txtTelefono.setText(tbm.getValueAt(tabla.getSelectedRow(), 5).toString());
        txtUser.setText(tbm.getValueAt(tabla.getSelectedRow(), 6).toString());
        //txtPass1.setText(tbm.getValueAt(tabla.getSelectedRow(), 7).toString());
        //txtPass2.setText(tbm.getValueAt(tabla.getSelectedRow(), 7).toString());
    }//GEN-LAST:event_tablaMouseClicked

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void txtRFCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRFCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRFCActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        if(lblNombre.getForeground()==Color.red){
            lblNombre.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtUserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserKeyReleased

    private void txtUserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyTyped
        if(lblUsuario.getForeground()==Color.red){
            lblUsuario.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtUserKeyTyped

    private void txtPass2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPass2KeyTyped
        if(lblPass1.getForeground()==Color.red){
            lblPass1.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtPass2KeyTyped

    private void txtPass1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPass1KeyTyped
        if(lblPass2.getForeground()==Color.red){
            lblPass2.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtPass1KeyTyped

    private void esconderPass(){
        txtPass1.setEchoChar('\u25cf');
        txtPass1.setFont(new Font("Segoe UI", 0, 12));
        txtPass2.setEchoChar('\u25cf');
        txtPass2.setFont(new Font("Segoe UI", 0, 12));
    }
    
    private boolean validarTxt(){
        if(esVacio()){
            JOptionPane.showMessageDialog(this, "Llena todos los campos");
            return false;
        }else if(!coincidePass()){
                JOptionPane.showMessageDialog(this, "Las contraseñas no coinciden");
            return false;
        }
        return true;
    }
    
    private boolean esVacio(){
        boolean ret = false;
        if(txtNombre.getText().isBlank()){
            txtNombre.requestFocus();
            lblNombre.setForeground(Color.red);
            ret = true;
        }
        if(txtUser.getText().isBlank()){
            txtUser.requestFocus();
            lblUsuario.setForeground(Color.red);
            ret = true;
        }
        if(txtPass1.getText().isBlank()){
            txtPass1.requestFocus();
            lblPass1.setForeground(Color.red);
            ret = true;
        }if(txtPass2.getText().isBlank()){
            txtPass2.requestFocus();
            lblPass2.setForeground(Color.red);
            ret = true;
        }
        
        return ret;
    }
    
    private boolean coincidePass(){
        if(txtPass1.getText().equals(txtPass2.getText()))
            return true;
        else return false;
    }
    
    private void CargarUsuarios(){
        ArrayList Usuarios;
        Usuario mUsuario;
        if(mDB.Conectar()){
            String [] Datos = new String[7];
            Usuarios =mDB.GetUsuarios();
            if(Usuarios != null){
                for (int i = 0; i < Usuarios.size(); i++) {
                    mUsuario = (Usuario) Usuarios.get(i);
                    Datos[0]=String.valueOf(mUsuario.getNombre());
                    Datos[1]=String.valueOf(mUsuario.getApellidos());
                    Datos[2]=String.valueOf(mUsuario.getEdad());
                    Datos[3]=String.valueOf(mUsuario.getRFC());
                    Datos[4]=String.valueOf(mUsuario.getRol());
                    Datos[5]=String.valueOf(mUsuario.getTelefono());
                    Datos[6]=String.valueOf(mUsuario.getUser());
                    tbm.addRow(Datos);
                }
                
                this.tabla.setModel(tbm);
                this.tabla.getColumnModel().getColumn(0).setPreferredWidth(42);
                this.tabla.getColumnModel().getColumn(1).setPreferredWidth(42);
                this.tabla.getColumnModel().getColumn(2).setPreferredWidth(42);
                this.tabla.getColumnModel().getColumn(3).setPreferredWidth(42);
                this.tabla.getColumnModel().getColumn(4).setPreferredWidth(42);
                this.tabla.getColumnModel().getColumn(5).setPreferredWidth(42);
                this.tabla.getColumnModel().getColumn(6).setPreferredWidth(42);
                
                if(this.tabla.getRowCount()>0){
                    this.tabla.setRowSelectionInterval(0, 0);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Error al cargar usuarios");
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
        txtApellido.setText("");
        spnEdad.setValue(18);
        txtRFC.setText("");
        txtUser.setText("");
        txtPass1.setText("");
        txtPass2.setText("");
        txtTelefono.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminar1;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cmbRol;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPass1;
    private javax.swing.JLabel lblPass2;
    private javax.swing.JLabel lblRFC;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTelefono1;
    private javax.swing.JLabel lblUsuario;
    private swing.PanelShadow panelShadow1;
    private swing.RoundPanel roundPanel1;
    private swing.RoundPanel roundPanel2;
    private javax.swing.JSpinner spnEdad;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtNombre;
    private swing.PasswordField txtPass1;
    private swing.PasswordField txtPass2;
    private javax.swing.JTextField txtRFC;
    private javax.swing.JFormattedTextField txtTelefono;
    private swing.TextField txtUser;
    // End of variables declaration//GEN-END:variables
}
