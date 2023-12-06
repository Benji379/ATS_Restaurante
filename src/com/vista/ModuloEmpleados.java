package com.vista;

import com.controlador.ControladorEmpleados;
import static com.modelo.action.Action.*;
import static com.modelo.ui.UIController.*;

public class ModuloEmpleados extends javax.swing.JPanel {

    ControladorEmpleados controlador;

    public ModuloEmpleados() {
        initComponents();
        controlador = new ControladorEmpleados(this);
        controlador.initDiseño();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jlbCodigo = new javax.swing.JLabel();
        pnlBotones = new javax.swing.JPanel();
        btnModificar = new button.Button();
        btnLimpiar = new button.Button();
        btnRegistrar = new button.Button();
        btnBorrar = new button.Button();
        btnExportar = new button.Button();
        btnEnviar = new button.Button();
        pnRellenar = new javax.swing.JPanel();
        Codigo = new javax.swing.JPanel();
        jlbCodigo2 = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JTextField();
        separador2 = new javax.swing.JSeparator();
        Dni = new javax.swing.JPanel();
        jlbCodigo4 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        separador4 = new javax.swing.JSeparator();
        Nombre = new javax.swing.JPanel();
        jlbCodigo1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        separador1 = new javax.swing.JSeparator();
        Apellido = new javax.swing.JPanel();
        jlbCodigo3 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        separador3 = new javax.swing.JSeparator();
        Correo = new javax.swing.JPanel();
        jlbCodigo8 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        separador8 = new javax.swing.JSeparator();
        Cargo = new javax.swing.JPanel();
        jlbCodigo6 = new javax.swing.JLabel();
        comboBox = new combo_suggestion.ComboBoxSuggestion();
        Estado = new javax.swing.JPanel();
        jlbCodigo7 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        separador7 = new javax.swing.JSeparator();
        btnSeleccionado = new toggleButton.ToggleButton();
        Fecha = new javax.swing.JPanel();
        jlbCodigo5 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        separador5 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new BenjiBK.scroll.scrollWin11.ScrollPaneWin11();
        tablaEmpleados = new com.modelo.ui.TableDark();

        setBackground(new java.awt.Color(0, 1, 4));

        jPanel2.setBackground(new java.awt.Color(0, 1, 4));

        jlbCodigo.setFont(new java.awt.Font("Gill Sans MT Condensed", 1, 36)); // NOI18N
        jlbCodigo.setForeground(new java.awt.Color(255, 255, 255));
        jlbCodigo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlbCodigo.setText("Codigo:");

        pnlBotones.setBackground(new java.awt.Color(0, 1, 4));

        btnModificar.setBackground(new java.awt.Color(70, 21, 17));
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/icons/actualizar.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnModificar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnModificar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnModificar.setShadowColor(new java.awt.Color(0, 0, 0));
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(70, 21, 17));
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/icons/limpiar.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnLimpiar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnLimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnLimpiar.setShadowColor(new java.awt.Color(0, 0, 0));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnRegistrar.setBackground(new java.awt.Color(70, 21, 17));
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/icons/agregar.png"))); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnRegistrar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnRegistrar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnRegistrar.setShadowColor(new java.awt.Color(0, 0, 0));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnBorrar.setBackground(new java.awt.Color(70, 21, 17));
        btnBorrar.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/icons/eliminar.png"))); // NOI18N
        btnBorrar.setText("Borrar");
        btnBorrar.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBorrar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnBorrar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnBorrar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnBorrar.setShadowColor(new java.awt.Color(0, 0, 0));
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnExportar.setBackground(new java.awt.Color(70, 21, 17));
        btnExportar.setForeground(new java.awt.Color(255, 255, 255));
        btnExportar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/icons/excel.png"))); // NOI18N
        btnExportar.setText("Exportar");
        btnExportar.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExportar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnExportar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnExportar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnExportar.setShadowColor(new java.awt.Color(0, 0, 0));
        btnExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarActionPerformed(evt);
            }
        });

        btnEnviar.setBackground(new java.awt.Color(70, 21, 17));
        btnEnviar.setForeground(new java.awt.Color(255, 255, 255));
        btnEnviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/icons/correo.png"))); // NOI18N
        btnEnviar.setText("Enviar");
        btnEnviar.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnviar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnEnviar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEnviar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnEnviar.setShadowColor(new java.awt.Color(0, 0, 0));
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBotonesLayout = new javax.swing.GroupLayout(pnlBotones);
        pnlBotones.setLayout(pnlBotonesLayout);
        pnlBotonesLayout.setHorizontalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonesLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(btnExportar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        pnlBotonesLayout.setVerticalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBotonesLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExportar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        pnRellenar.setBackground(new java.awt.Color(0, 1, 4));

        Codigo.setBackground(new java.awt.Color(0, 1, 4));

        jlbCodigo2.setFont(new java.awt.Font("Gill Sans MT Condensed", 1, 25)); // NOI18N
        jlbCodigo2.setForeground(new java.awt.Color(255, 255, 255));
        jlbCodigo2.setText("Password:");

        txtContraseña.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtContraseña.setForeground(new java.awt.Color(255, 255, 255));
        txtContraseña.setSelectionColor(new java.awt.Color(70, 21, 17));

        javax.swing.GroupLayout CodigoLayout = new javax.swing.GroupLayout(Codigo);
        Codigo.setLayout(CodigoLayout);
        CodigoLayout.setHorizontalGroup(
            CodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CodigoLayout.createSequentialGroup()
                .addComponent(jlbCodigo2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(separador2)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 15, Short.MAX_VALUE))
        );
        CodigoLayout.setVerticalGroup(
            CodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CodigoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlbCodigo2))
                    .addGroup(CodigoLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(separador2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Dni.setBackground(new java.awt.Color(0, 1, 4));

        jlbCodigo4.setFont(new java.awt.Font("Gill Sans MT Condensed", 1, 25)); // NOI18N
        jlbCodigo4.setForeground(new java.awt.Color(255, 255, 255));
        jlbCodigo4.setText("Dni:");

        txtDni.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtDni.setForeground(new java.awt.Color(255, 255, 255));
        txtDni.setSelectionColor(new java.awt.Color(70, 21, 17));
        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDniKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDniKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout DniLayout = new javax.swing.GroupLayout(Dni);
        Dni.setLayout(DniLayout);
        DniLayout.setHorizontalGroup(
            DniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DniLayout.createSequentialGroup()
                .addComponent(jlbCodigo4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(separador4)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 15, Short.MAX_VALUE))
        );
        DniLayout.setVerticalGroup(
            DniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DniLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlbCodigo4))
                    .addGroup(DniLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(separador4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Nombre.setBackground(new java.awt.Color(0, 1, 4));

        jlbCodigo1.setFont(new java.awt.Font("Gill Sans MT Condensed", 1, 25)); // NOI18N
        jlbCodigo1.setForeground(new java.awt.Color(255, 255, 255));
        jlbCodigo1.setText("Nombre:");

        txtNombre.setEditable(false);
        txtNombre.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setSelectionColor(new java.awt.Color(70, 21, 17));

        javax.swing.GroupLayout NombreLayout = new javax.swing.GroupLayout(Nombre);
        Nombre.setLayout(NombreLayout);
        NombreLayout.setHorizontalGroup(
            NombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NombreLayout.createSequentialGroup()
                .addComponent(jlbCodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(NombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(separador1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 15, Short.MAX_VALUE))
        );
        NombreLayout.setVerticalGroup(
            NombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NombreLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NombreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlbCodigo1))
                    .addGroup(NombreLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(separador1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Apellido.setBackground(new java.awt.Color(0, 1, 4));

        jlbCodigo3.setFont(new java.awt.Font("Gill Sans MT Condensed", 1, 25)); // NOI18N
        jlbCodigo3.setForeground(new java.awt.Color(255, 255, 255));
        jlbCodigo3.setText("Apellidos:");

        txtApellido.setEditable(false);
        txtApellido.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(255, 255, 255));
        txtApellido.setSelectionColor(new java.awt.Color(70, 21, 17));

        javax.swing.GroupLayout ApellidoLayout = new javax.swing.GroupLayout(Apellido);
        Apellido.setLayout(ApellidoLayout);
        ApellidoLayout.setHorizontalGroup(
            ApellidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ApellidoLayout.createSequentialGroup()
                .addComponent(jlbCodigo3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ApellidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(separador3)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 15, Short.MAX_VALUE))
        );
        ApellidoLayout.setVerticalGroup(
            ApellidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ApellidoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ApellidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ApellidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlbCodigo3))
                    .addGroup(ApellidoLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(separador3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Correo.setBackground(new java.awt.Color(0, 1, 4));

        jlbCodigo8.setFont(new java.awt.Font("Gill Sans MT Condensed", 1, 25)); // NOI18N
        jlbCodigo8.setForeground(new java.awt.Color(255, 255, 255));
        jlbCodigo8.setText("Correo:");

        txtCorreo.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(255, 255, 255));
        txtCorreo.setSelectionColor(new java.awt.Color(70, 21, 17));
        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorreoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout CorreoLayout = new javax.swing.GroupLayout(Correo);
        Correo.setLayout(CorreoLayout);
        CorreoLayout.setHorizontalGroup(
            CorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CorreoLayout.createSequentialGroup()
                .addComponent(jlbCodigo8, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(separador8)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 15, Short.MAX_VALUE))
        );
        CorreoLayout.setVerticalGroup(
            CorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CorreoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CorreoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlbCodigo8))
                    .addGroup(CorreoLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(separador8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Cargo.setBackground(new java.awt.Color(0, 1, 4));

        jlbCodigo6.setFont(new java.awt.Font("Gill Sans MT Condensed", 1, 25)); // NOI18N
        jlbCodigo6.setForeground(new java.awt.Color(255, 255, 255));
        jlbCodigo6.setText("Cargo:");

        comboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "administrador", "cocinero", "mesero", "caja" }));
        comboBox.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        comboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CargoLayout = new javax.swing.GroupLayout(Cargo);
        Cargo.setLayout(CargoLayout);
        CargoLayout.setHorizontalGroup(
            CargoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CargoLayout.createSequentialGroup()
                .addComponent(jlbCodigo6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        CargoLayout.setVerticalGroup(
            CargoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CargoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CargoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlbCodigo6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        Estado.setBackground(new java.awt.Color(0, 1, 4));

        jlbCodigo7.setFont(new java.awt.Font("Gill Sans MT Condensed", 1, 25)); // NOI18N
        jlbCodigo7.setForeground(new java.awt.Color(255, 255, 255));
        jlbCodigo7.setText("Estado:");

        txtEstado.setEditable(false);
        txtEstado.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtEstado.setForeground(new java.awt.Color(255, 255, 255));
        txtEstado.setText("activo");
        txtEstado.setSelectionColor(new java.awt.Color(70, 21, 17));

        btnSeleccionado.setForeground(new java.awt.Color(70, 21, 17));
        btnSeleccionado.setSelected(true);
        btnSeleccionado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSeleccionadoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout EstadoLayout = new javax.swing.GroupLayout(Estado);
        Estado.setLayout(EstadoLayout);
        EstadoLayout.setHorizontalGroup(
            EstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EstadoLayout.createSequentialGroup()
                .addComponent(jlbCodigo7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(EstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(separador7)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSeleccionado, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );
        EstadoLayout.setVerticalGroup(
            EstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EstadoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(EstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlbCodigo7)
                        .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSeleccionado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separador7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Fecha.setBackground(new java.awt.Color(0, 1, 4));

        jlbCodigo5.setFont(new java.awt.Font("Gill Sans MT Condensed", 1, 25)); // NOI18N
        jlbCodigo5.setForeground(new java.awt.Color(255, 255, 255));
        jlbCodigo5.setText("Fecha:");

        txtFecha.setEditable(false);
        txtFecha.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(255, 255, 255));
        txtFecha.setSelectionColor(new java.awt.Color(70, 21, 17));

        javax.swing.GroupLayout FechaLayout = new javax.swing.GroupLayout(Fecha);
        Fecha.setLayout(FechaLayout);
        FechaLayout.setHorizontalGroup(
            FechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FechaLayout.createSequentialGroup()
                .addComponent(jlbCodigo5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(separador5)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 15, Short.MAX_VALUE))
        );
        FechaLayout.setVerticalGroup(
            FechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FechaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlbCodigo5))
                    .addGroup(FechaLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(separador5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnRellenarLayout = new javax.swing.GroupLayout(pnRellenar);
        pnRellenar.setLayout(pnRellenarLayout);
        pnRellenarLayout.setHorizontalGroup(
            pnRellenarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnRellenarLayout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(pnRellenarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(pnRellenarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(pnRellenarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Cargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(pnRellenarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        pnRellenarLayout.setVerticalGroup(
            pnRellenarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnRellenarLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(pnRellenarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Estado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnRellenarLayout.createSequentialGroup()
                        .addGroup(pnRellenarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnRellenarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Cargo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(pnRellenarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnRellenarLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnRellenarLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(Correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnRellenarLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBotones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnRellenar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jlbCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jlbCodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnRellenar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );

        jLabel4.setFont(new java.awt.Font("Restaurant", 1, 60)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Empleados");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        tablaEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Dni", "Nombre", "Apellido", "Correo", "Cargo", "Estado", "Contraseña", "Fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaEmpleadosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaEmpleados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addGap(43, 43, 43))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                .addGap(56, 56, 56))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        controlador.eliminar();
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        enviarCorreo(tablaEmpleados, "Lista de Empleados");
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void btnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarActionPerformed
        descargarTablaXlsx(tablaEmpleados, "Lista de Empleados");
    }//GEN-LAST:event_btnExportarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        controlador.registrar();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        controlador.limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        controlador.modificar();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void tablaEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaEmpleadosMouseClicked
        controlador.clickTabla();
    }//GEN-LAST:event_tablaEmpleadosMouseClicked

    private void comboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxActionPerformed
        controlador.imprimirCodigo();
    }//GEN-LAST:event_comboBoxActionPerformed

    private void btnSeleccionadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSeleccionadoMouseClicked
        controlador.btnSeleccionadoMouseClicked(evt);
    }//GEN-LAST:event_btnSeleccionadoMouseClicked

    private void txtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyTyped
        controlador.txtDniTypet(evt);
    }//GEN-LAST:event_txtDniKeyTyped

    private void txtCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyTyped
        limitacionCaracteres(txtCorreo, evt, 100, false);
    }//GEN-LAST:event_txtCorreoKeyTyped

    private void txtDniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyReleased
        controlador.txtDniKeyReleased(evt);
    }//GEN-LAST:event_txtDniKeyReleased

    private void txtDniKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyPressed
        controlador.imprimirCodigo();
    }//GEN-LAST:event_txtDniKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel Apellido;
    public javax.swing.JPanel Cargo;
    public javax.swing.JPanel Codigo;
    public javax.swing.JPanel Correo;
    public javax.swing.JPanel Dni;
    public javax.swing.JPanel Estado;
    public javax.swing.JPanel Fecha;
    public javax.swing.JPanel Nombre;
    public button.Button btnBorrar;
    public button.Button btnEnviar;
    public button.Button btnExportar;
    public button.Button btnLimpiar;
    public button.Button btnModificar;
    public button.Button btnRegistrar;
    public toggleButton.ToggleButton btnSeleccionado;
    public combo_suggestion.ComboBoxSuggestion comboBox;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JPanel jPanel2;
    public javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JLabel jlbCodigo;
    public javax.swing.JLabel jlbCodigo1;
    public javax.swing.JLabel jlbCodigo2;
    public javax.swing.JLabel jlbCodigo3;
    public javax.swing.JLabel jlbCodigo4;
    public javax.swing.JLabel jlbCodigo5;
    public javax.swing.JLabel jlbCodigo6;
    public javax.swing.JLabel jlbCodigo7;
    public javax.swing.JLabel jlbCodigo8;
    public javax.swing.JPanel pnRellenar;
    public javax.swing.JPanel pnlBotones;
    public javax.swing.JSeparator separador1;
    public javax.swing.JSeparator separador2;
    public javax.swing.JSeparator separador3;
    public javax.swing.JSeparator separador4;
    public javax.swing.JSeparator separador5;
    public javax.swing.JSeparator separador7;
    public javax.swing.JSeparator separador8;
    public com.modelo.ui.TableDark tablaEmpleados;
    public javax.swing.JTextField txtApellido;
    public javax.swing.JTextField txtContraseña;
    public javax.swing.JTextField txtCorreo;
    public javax.swing.JTextField txtDni;
    public javax.swing.JTextField txtEstado;
    public javax.swing.JTextField txtFecha;
    public javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
