/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package forms;

import bd.ConexionSQL;
import bd.Producto;
import java.awt.Color;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jairi
 */
public class Productos extends javax.swing.JPanel {

    private Double costo = 0d;
    private Double venta = 0d;
    private Double ganancia = 0d;
    
    private ConexionSQL mDB;
    private DefaultTableModel tbm;
    
    private LocalDate fechaActual;
    
    
    public Productos() {
        initComponents();
        mDB = new ConexionSQL("treboldb", "root", "C19400437");
        init();
        initTabla();
        setFechaActual();
        
    }
    
    private void initTabla(){
        tbm = new DefaultTableModel();
        tbm.addColumn("codigo");
        tbm.addColumn("descripción");
        tbm.addColumn("marca");
        tbm.addColumn("precio de compra");
        tbm.addColumn("precio de venta");
        tbm.addColumn("departamento");
        tbm.addColumn("se vende por");
        tbm.addColumn("Fecha Cad.");
        CargarProductos();
    }
    
    private void init(){
        setOpaque(false);
        btnGroup1.add(btnPieza);
        btnGroup1.add(btnGranel);
        btnPieza.setSelected(true);
        costo = (Double)spnCosto.getValue();
        venta = (Double)spnVenta.getValue();
        ganancia = (Double)spnGanancia.getValue();
        fechaActual = LocalDate.now();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroup1 = new javax.swing.ButtonGroup();
        panelShadow1 = new swing.PanelShadow();
        roundPanel1 = new swing.RoundPanel();
        lblCodigo = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        lblCosto = new javax.swing.JLabel();
        btnGranel = new javax.swing.JRadioButton();
        btnPieza = new javax.swing.JRadioButton();
        lblDescripcion = new javax.swing.JLabel();
        lblVenta = new javax.swing.JLabel();
        spnCosto = new javax.swing.JSpinner();
        spnVenta = new javax.swing.JSpinner();
        spnGanancia = new javax.swing.JSpinner();
        lblDepartamento = new javax.swing.JLabel();
        lblGanancia = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cmbDepartamento = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        spnAnio = new javax.swing.JSpinner();
        spnDia = new javax.swing.JSpinner();
        spnMes = new javax.swing.JSpinner();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        cbFecha = new javax.swing.JCheckBox();
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

        lblCodigo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCodigo.setText("Codigo*");
        roundPanel1.add(lblCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 60, 20));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setText("Datos del producto");
        roundPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        txtCodigo.setToolTipText("Codigo:\nCodigo de barras o Codigo de identificacion del producto");
        roundPanel1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 210, -1));

        txtDescripcion.setToolTipText("Descripcion del producto.\nDescribe aqui el nombre, tamaño, y otros aspectos que decriban el producto");
        roundPanel1.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 210, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("Se vende por:");
        roundPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 80, 20));

        lblCosto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCosto.setText("Precio costo    $");
        roundPanel1.add(lblCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 90, 20));

        btnGranel.setText("Por granel ");
        btnGranel.setToolTipText("Por granel:\nSi habilita, este producto se vendera por granel (Kilo, Gramo, Litros, Metros)");
        btnGranel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGranelActionPerformed(evt);
            }
        });
        roundPanel1.add(btnGranel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, -1));

        btnPieza.setText("Por pieza (Pz.)");
        btnPieza.setToolTipText("Por pieza:\nSi selecciona, el producto se vendera por pieza (unidades enteras).");
        roundPanel1.add(btnPieza, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        lblDescripcion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDescripcion.setText("Descripción*");
        roundPanel1.add(lblDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 80, 20));

        lblVenta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblVenta.setText("Precio venta    $");
        roundPanel1.add(lblVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 90, 20));

        spnCosto.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 1.0d));
        spnCosto.setToolTipText("Precio que cuesta el producto a la empresa");
        spnCosto.setAutoscrolls(true);
        spnCosto.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnCostoStateChanged(evt);
            }
        });
        roundPanel1.add(spnCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 80, -1));

        spnVenta.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 1.0d));
        spnVenta.setToolTipText("Precio de venta al publico\n");
        spnVenta.setAutoscrolls(true);
        spnVenta.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnVentaStateChanged(evt);
            }
        });
        spnVenta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                spnVentaFocusLost(evt);
            }
        });
        roundPanel1.add(spnVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 80, -1));

        spnGanancia.setModel(new javax.swing.SpinnerNumberModel(10.0d, null, null, 5.0d));
        spnGanancia.setAutoscrolls(true);
        spnGanancia.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnGananciaStateChanged(evt);
            }
        });
        roundPanel1.add(spnGanancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 80, -1));

        lblDepartamento.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDepartamento.setText("Departamento");
        roundPanel1.add(lblDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 90, 20));

        lblGanancia.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblGanancia.setText("Ganancia         %");
        roundPanel1.add(lblGanancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 90, 20));

        jLabel15.setText("Año");
        roundPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 60, 20));

        cmbDepartamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dulceria", "Jugeteria", "Decorativos" }));
        roundPanel1.add(cmbDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 150, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setText("Marca");
        roundPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 80, 20));

        txtMarca.setToolTipText("Descripcion del producto.\nDescribe aqui el nombre, tamaño, y otros aspectos que decriban el producto");
        roundPanel1.add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 210, -1));

        spnAnio.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnAnioStateChanged(evt);
            }
        });
        roundPanel1.add(spnAnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 80, -1));

        spnDia.setModel(new javax.swing.SpinnerNumberModel(1, null, null, 1));
        roundPanel1.add(spnDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 80, -1));

        spnMes.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        spnMes.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnMesStateChanged(evt);
            }
        });
        roundPanel1.add(spnMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 90, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setText("Fecha de Caducidad");
        roundPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 130, 20));

        jLabel18.setText("Dia");
        roundPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 60, 20));

        jLabel19.setText("Mes");
        roundPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, 60, 20));

        cbFecha.setText("Si");
        cbFecha.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                cbFechaStateChanged(evt);
            }
        });
        roundPanel1.add(cbFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, -1, -1));

        btnGuardar.setText("Agregar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setText("Lista de productos");

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
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout roundPanel2Layout = new javax.swing.GroupLayout(roundPanel2);
        roundPanel2.setLayout(roundPanel2Layout);
        roundPanel2Layout.setHorizontalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 763, Short.MAX_VALUE)
                    .addGroup(roundPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGap(18, 18, 18))
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
                        .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
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
            Producto mProducto = new Producto();
            mProducto.setCodigo(txtCodigo.getText());
            mProducto.setDescripcion(txtDescripcion.getText());
//            mProducto.setMarca(txtCaducidad.getText());
            mProducto.setPrecioCom((Double)spnCosto.getValue());
            mProducto.setPrecioVen((Double)spnVenta.getValue());
            mProducto.setDepartameto(cmbDepartamento.getSelectedItem().toString());
            mProducto.setVentaPor((btnPieza.isSelected())?1:0); //1 por pieza, 0 por granel      
            
            if(mDB.Conectar()){
                if(mDB.AddProducto(mProducto)){
                    JOptionPane.showMessageDialog(null, "Producto registrado exitosamente");
                    LimpiarTabla();
                    CargarProductos();
                    LimpiarTxt();
                }
            }else{
                JOptionPane.showMessageDialog(null, "Error al conectar");
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        String fecha = "";
        
        txtCodigo.setText(tbm.getValueAt(tabla.getSelectedRow(), 0).toString());
        txtDescripcion.setText(tbm.getValueAt(tabla.getSelectedRow(), 1).toString());
//        txtCaducidad.setText(tbm.getValueAt(tabla.getSelectedRow(), 2).toString());
        spnCosto.setValue(Double.valueOf(tbm.getValueAt(tabla.getSelectedRow(), 3).toString()));
        spnVenta.setValue(Double.valueOf(tbm.getValueAt(tabla.getSelectedRow(), 4).toString()));
        
        switch (tbm.getValueAt(tabla.getSelectedRow(), 5).toString()) {
            case "Dulceria" -> cmbDepartamento.setSelectedIndex(0);
            case "Jugeteria" -> cmbDepartamento.setSelectedIndex(1);
            default -> cmbDepartamento.setSelectedIndex(2);
        }
        //cmbDepartamento.setSelectedIndex((tbm.getValueAt(tabla.getSelectedRow(), 5).toString().equals("Dulceria"))?1:0);//falta corregir
        if(tbm.getValueAt(tabla.getSelectedRow(), 6).toString().equals("Pz.")){
            btnPieza.setSelected(true);
        }else{
            btnPieza.setSelected(false);
        }
            
        //txtPass1.setText(tbm.getValueAt(tabla.getSelectedRow(), 7).toString());
        //txtPass2.setText(tbm.getValueAt(tabla.getSelectedRow(), 7).toString());
    }//GEN-LAST:event_tablaMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String codigo="";
        if(tabla.getSelectedRow() != -1){
            codigo = tbm.getValueAt(tabla.getSelectedRow(), 0).toString();
            if(JOptionPane.showConfirmDialog(null, "Esta seguro que desea eliminar este producto?: "+codigo+"\nTodos los datos de almacen seran eliminados","Eliminar",JOptionPane.WARNING_MESSAGE,JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
                if(mDB.Conectar()){
                    mDB.EliminarProducto(codigo);
                    LimpiarTabla();
                    CargarProductos();
                    LimpiarTxt();
                }
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        String codigo="";
        if(tabla.getSelectedRow() != -1){
            codigo = tbm.getValueAt(tabla.getSelectedRow(), 0).toString();
            if(JOptionPane.showConfirmDialog(null, "Desea modificar este producto?: "+codigo,"Modificar",JOptionPane.WARNING_MESSAGE,JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
                if(mDB.Conectar()){
                    Producto mProduc= new Producto();
                    mProduc.setCodigo(txtCodigo.getText());
                    mProduc.setDescripcion(txtDescripcion.getText());
                    mProduc.setMarca(txtMarca.getText());
                    mProduc.setPrecioCom((Double)spnCosto.getValue());
                    mProduc.setPrecioVen((Double)spnVenta.getValue());
                    mProduc.setDepartameto(cmbDepartamento.getSelectedItem().toString());
                    mProduc.setVentaPor((btnPieza.isSelected())?1:0); //1 por pieza, 0 por granel
                    mDB.ModificarProducto(mProduc);
                    LimpiarTabla();
                    CargarProductos();
                    LimpiarTxt();
                }
            }
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnGranelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGranelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGranelActionPerformed

    private void spnCostoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnCostoStateChanged
        costo = (Double)spnCosto.getValue();
        
        venta = costo + costo*(ganancia/100);
        spnVenta.setValue(venta);
    }//GEN-LAST:event_spnCostoStateChanged

    private void spnVentaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_spnVentaFocusLost
        
    }//GEN-LAST:event_spnVentaFocusLost

    private void spnVentaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnVentaStateChanged
        venta = (Double)spnVenta.getValue();
        
        ganancia = (venta-costo)/costo*100;
        spnGanancia.setValue(ganancia);
        
        if(costo>venta){
            spnVenta.setForeground(Color.red);
            lblVenta.setForeground(Color.red);
        }else{
            spnVenta.setForeground(Color.black);
            lblVenta.setForeground(Color.black);
            spnGanancia.setForeground(Color.black);
            lblGanancia.setForeground(Color.black);
        }
    }//GEN-LAST:event_spnVentaStateChanged

    private void spnGananciaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnGananciaStateChanged
        ganancia = (Double)spnGanancia.getValue();
        
        venta = costo + costo*(ganancia/100);
        spnVenta.setValue(venta);
        
        if(ganancia<0){
            spnGanancia.setForeground(Color.red);
            lblGanancia.setForeground(Color.red);
        }
    }//GEN-LAST:event_spnGananciaStateChanged

    private void cbFechaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_cbFechaStateChanged
        if(cbFecha.isSelected()){
            spnAnio.setEnabled(true);
            spnDia.setEnabled(true);
            spnMes.setEnabled(true);
        }else{
            spnAnio.setEnabled(false);
            spnDia.setEnabled(false);
            spnMes.setEnabled(false);
        }
    }//GEN-LAST:event_cbFechaStateChanged

    private void spnMesStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnMesStateChanged
        int mes = (int)spnMes.getValue();
        int year = (int)spnAnio.getValue();
        validarDiaMes(year, mes);
    }//GEN-LAST:event_spnMesStateChanged

    private void spnAnioStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnAnioStateChanged
        int mes = (int)spnMes.getValue();
        int year = (int)spnAnio.getValue();
        validarDiaMes(year, mes);
    }//GEN-LAST:event_spnAnioStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.out.println("Fecha: "+ getFecha());
    }//GEN-LAST:event_jButton1ActionPerformed

    private boolean validarTxt(){
        if(esVacio()){
            JOptionPane.showMessageDialog(this, "Llena todos los campos");
            return false;
        }
        return true;
    }
    
    
    
    private boolean esVacio(){
        return((txtCodigo.getText().isBlank()||txtDescripcion.getText().isBlank()));
    }
    
    private void CargarProductos(){
        ArrayList Productos;
        Producto mProduc;
        if(mDB.Conectar()){
            String [] Datos = new String[8];
            Productos =mDB.GetProductos();
            if(Productos != null){
                for (int i = 0; i < Productos.size(); i++) {
                    mProduc = (Producto) Productos.get(i);
                    Datos[0]=String.valueOf(mProduc.getCodigo());
                    Datos[1]=String.valueOf(mProduc.getDescripcion());
                    Datos[2]=String.valueOf(mProduc.getMarca());
                    Datos[3]=String.valueOf(mProduc.getPrecioCom());
                    Datos[4]=String.valueOf(mProduc.getPrecioVen());
                    Datos[5]=String.valueOf(mProduc.getDepartameto());
                    Datos[6]=((mProduc.getVentaPor()==1)?"Pz.":"Granel");
                    Datos[7]=String.valueOf(mProduc.getFecha());
                    tbm.addRow(Datos);
                }
                
                this.tabla.setModel(tbm);
                this.tabla.getColumnModel().getColumn(0).setPreferredWidth(42);
                this.tabla.getColumnModel().getColumn(1).setPreferredWidth(42);
                this.tabla.getColumnModel().getColumn(2).setPreferredWidth(42);
                this.tabla.getColumnModel().getColumn(3).setPreferredWidth(15);
                this.tabla.getColumnModel().getColumn(4).setPreferredWidth(15);
                this.tabla.getColumnModel().getColumn(5).setPreferredWidth(42);
                this.tabla.getColumnModel().getColumn(6).setPreferredWidth(20);
                this.tabla.getColumnModel().getColumn(7).setPreferredWidth(42);
                
                if(this.tabla.getRowCount()>0){
                    this.tabla.setRowSelectionInterval(0, 0);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Error al cargar productos");
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
        txtCodigo.setText("");
        txtDescripcion.setText("");
        setFechaActual();
        spnCosto.setValue(0);
        spnVenta.setValue(0);
        spnGanancia.setValue(0);
        cmbDepartamento.setSelectedIndex(0);
        btnPieza.setSelected(true);
        
        setFechaActual();
    }
    
    private void setFechaActual() {
        // Separar la fecha en día, mes y año
        int dia = fechaActual.getDayOfMonth();
        int mes = fechaActual.getMonthValue();
        int year = fechaActual.getYear();
        
        //asignar los correspondientes valores en los spn
        spnDia.setValue(dia);
        spnMes.setValue(mes);
        spnAnio.setValue(year);
    }
    
    private void validarDiaMes(int year, int mes){
        //Obtiene los dias del mes seleccionado
        YearMonth yearMonth = YearMonth.of(year, mes);
        //Retorna los dias del mes seleccionado
        int dias = yearMonth.lengthOfMonth();
        
        int getDia = (int)spnDia.getValue();
        SpinnerNumberModel modelDia;
        
        if(getDia>dias){
            modelDia = new SpinnerNumberModel(1, 1, dias, 1);
        }else{
            modelDia = new SpinnerNumberModel(getDia, 1, dias, 1);
        }
        
        //asignar los correspondientes valores en los spn
        spnDia.setModel(modelDia);
    }
    
    private String getFecha(){
        String fecha="";
        
        fecha = fecha + spnAnio.getValue().toString() +"-";
        fecha = fecha + spnMes.getValue().toString() +"-";
        fecha = fecha + spnDia.getValue().toString();
        
        return fecha;
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JRadioButton btnGranel;
    private javax.swing.ButtonGroup btnGroup1;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JRadioButton btnPieza;
    private javax.swing.JCheckBox cbFecha;
    private javax.swing.JComboBox<String> cmbDepartamento;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCosto;
    private javax.swing.JLabel lblDepartamento;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblGanancia;
    private javax.swing.JLabel lblVenta;
    private swing.PanelShadow panelShadow1;
    private swing.RoundPanel roundPanel1;
    private swing.RoundPanel roundPanel2;
    private javax.swing.JSpinner spnAnio;
    private javax.swing.JSpinner spnCosto;
    private javax.swing.JSpinner spnDia;
    private javax.swing.JSpinner spnGanancia;
    private javax.swing.JSpinner spnMes;
    private javax.swing.JSpinner spnVenta;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtMarca;
    // End of variables declaration//GEN-END:variables

    
}
