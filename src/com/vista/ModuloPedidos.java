package com.vista;

import com.controlador.ControladorPedidos;
import com.modelo.ui.UIController;
import static com.modelo.ui.UIController.*;

public class ModuloPedidos extends javax.swing.JPanel {

    ControladorPedidos controlador;

    public ModuloPedidos() {
        initComponents();
        controlador = new ControladorPedidos(this);
        controlador.initDiseño();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new BenjiBK.scroll.scrollWin11.ScrollPaneWin11();
        mesas = new com.modelo.UI.MultipleButton.MultipleButton();
        jScrollPane2 = new BenjiBK.scroll.scrollWin11.ScrollPaneWin11();
        panelRound1 = new com.modelo.ui.PanelRound();
        txtNMesa = new javax.swing.JLabel();
        panelRound2 = new com.modelo.ui.PanelRound();
        addas = new javax.swing.JLabel();
        asdadsdsa = new javax.swing.JLabel();
        txtMesero = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtCliente = new textfield_suggestion.TextFieldSuggestion();
        panelRound3 = new com.modelo.ui.PanelRound();
        btnCerrarMesa = new button.Button();
        btnAbrirMesa = new button.Button();
        panelRound4 = new com.modelo.ui.PanelRound();
        btnEliminar = new button.Button();
        btnAgregar = new button.Button();
        comboPlato = new combo_suggestion.ComboBoxSuggestion();
        jPanel1 = new javax.swing.JPanel();
        txtCantidad = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtPrecio = new javax.swing.JLabel();
        txtTotal = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableRoja1 = new com.modelo.ui.TableRoja();
        panelRound5 = new com.modelo.ui.PanelRound();
        btnMesasOcupado = new button.Button();
        btnMesasTodas = new button.Button();
        btnMesasLibre = new button.Button();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(0, 1, 4));

        jLabel4.setFont(new java.awt.Font("Restaurant", 1, 60)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Pedidos");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jScrollPane1.setBackground(new java.awt.Color(70, 21, 17));
        jScrollPane1.setViewportView(mesas);

        panelRound1.setBackground(new java.awt.Color(70, 21, 17));
        panelRound1.setRoundBottomLeft(15);
        panelRound1.setRoundBottomRight(15);
        panelRound1.setRoundTopLeft(15);
        panelRound1.setRoundTopRight(15);

        txtNMesa.setFont(new java.awt.Font("Century Gothic", 0, 26)); // NOI18N
        txtNMesa.setForeground(new java.awt.Color(255, 255, 255));
        txtNMesa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNMesa.setText("Mesa");

        panelRound2.setBackground(new java.awt.Color(70, 21, 17));
        panelRound2.setRoundBottomLeft(15);
        panelRound2.setRoundBottomRight(15);
        panelRound2.setRoundTopLeft(15);
        panelRound2.setRoundTopRight(15);
        panelRound2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addas.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        addas.setForeground(new java.awt.Color(255, 255, 255));
        addas.setText("Mesero:");
        panelRound2.add(addas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 102, -1));

        asdadsdsa.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        asdadsdsa.setForeground(new java.awt.Color(255, 255, 255));
        asdadsdsa.setText("Cliente:");
        panelRound2.add(asdadsdsa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 102, -1));

        txtMesero.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtMesero.setForeground(new java.awt.Color(255, 255, 255));
        panelRound2.add(txtMesero, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 224, 33));
        panelRound2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 72, 170, 10));

        txtCliente.setForeground(new java.awt.Color(255, 255, 255));
        txtCliente.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtCliente.setSelectionColor(new java.awt.Color(0, 0, 0));
        txtCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtClienteKeyTyped(evt);
            }
        });
        panelRound2.add(txtCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 160, 50));

        panelRound3.setBackground(new java.awt.Color(70, 21, 17));
        panelRound3.setRoundBottomLeft(15);
        panelRound3.setRoundBottomRight(15);
        panelRound3.setRoundTopLeft(15);
        panelRound3.setRoundTopRight(15);

        btnCerrarMesa.setBackground(new java.awt.Color(48, 21, 17));
        btnCerrarMesa.setForeground(new java.awt.Color(255, 255, 255));
        btnCerrarMesa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/icons/btnQuitar.png"))); // NOI18N
        btnCerrarMesa.setText("Cerrar");
        btnCerrarMesa.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrarMesa.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnCerrarMesa.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCerrarMesa.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnCerrarMesa.setShadowColor(new java.awt.Color(0, 0, 0));
        btnCerrarMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarMesaActionPerformed(evt);
            }
        });

        btnAbrirMesa.setBackground(new java.awt.Color(48, 21, 17));
        btnAbrirMesa.setForeground(new java.awt.Color(255, 255, 255));
        btnAbrirMesa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/icons/btnAgregar.png"))); // NOI18N
        btnAbrirMesa.setText("Abrir");
        btnAbrirMesa.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAbrirMesa.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnAbrirMesa.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAbrirMesa.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAbrirMesa.setShadowColor(new java.awt.Color(0, 0, 0));
        btnAbrirMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirMesaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound3Layout = new javax.swing.GroupLayout(panelRound3);
        panelRound3.setLayout(panelRound3Layout);
        panelRound3Layout.setHorizontalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAbrirMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCerrarMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        panelRound3Layout.setVerticalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAbrirMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCerrarMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelRound4.setBackground(new java.awt.Color(70, 21, 17));
        panelRound4.setRoundBottomLeft(15);
        panelRound4.setRoundBottomRight(15);
        panelRound4.setRoundTopLeft(15);
        panelRound4.setRoundTopRight(15);

        btnEliminar.setBackground(new java.awt.Color(48, 21, 17));
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/icons/btnQuitar.png"))); // NOI18N
        btnEliminar.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar.setShadowColor(new java.awt.Color(0, 0, 0));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnAgregar.setBackground(new java.awt.Color(48, 21, 17));
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/icons/btnAgregar.png"))); // NOI18N
        btnAgregar.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAgregar.setShadowColor(new java.awt.Color(0, 0, 0));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        comboPlato.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        comboPlato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPlatoActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(70, 21, 17));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCantidad.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        txtCantidad.setForeground(new java.awt.Color(255, 255, 255));
        txtCantidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });
        jPanel1.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 40));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 90, 10));

        txtPrecio.setFont(new java.awt.Font("Century Gothic", 0, 22)); // NOI18N
        txtPrecio.setForeground(new java.awt.Color(255, 255, 255));
        txtPrecio.setText("Precio: S/0.0");

        javax.swing.GroupLayout panelRound4Layout = new javax.swing.GroupLayout(panelRound4);
        panelRound4.setLayout(panelRound4Layout);
        panelRound4Layout.setHorizontalGroup(
            panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound4Layout.createSequentialGroup()
                        .addComponent(comboPlato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelRound4Layout.setVerticalGroup(
            panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboPlato, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        txtTotal.setFont(new java.awt.Font("Century Gothic", 0, 22)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(255, 255, 255));
        txtTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtTotal.setText("Total: S/ 0.0");

        tableRoja1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Plato", "Precio", "Cantidad", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableRoja1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableRoja1MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tableRoja1);

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtNMesa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelRound4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelRound3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelRound2, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(txtNMesa)
                .addGap(18, 18, 18)
                .addComponent(panelRound3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelRound4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTotal)
                .addContainerGap())
        );

        jScrollPane2.setViewportView(panelRound1);

        panelRound5.setBackground(new java.awt.Color(0, 1, 4));
        panelRound5.setRoundBottomLeft(20);
        panelRound5.setRoundBottomRight(20);
        panelRound5.setRoundTopLeft(20);
        panelRound5.setRoundTopRight(20);

        btnMesasOcupado.setBackground(new java.awt.Color(48, 21, 17));
        btnMesasOcupado.setForeground(new java.awt.Color(255, 255, 255));
        btnMesasOcupado.setText("Ocupado");
        btnMesasOcupado.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMesasOcupado.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnMesasOcupado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMesasOcupado.setShadowColor(new java.awt.Color(0, 0, 0));
        btnMesasOcupado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesasOcupadoActionPerformed(evt);
            }
        });

        btnMesasTodas.setBackground(new java.awt.Color(48, 21, 17));
        btnMesasTodas.setForeground(new java.awt.Color(255, 255, 255));
        btnMesasTodas.setText("TODOS");
        btnMesasTodas.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMesasTodas.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnMesasTodas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMesasTodas.setShadowColor(new java.awt.Color(0, 0, 0));
        btnMesasTodas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesasTodasActionPerformed(evt);
            }
        });

        btnMesasLibre.setBackground(new java.awt.Color(48, 21, 17));
        btnMesasLibre.setForeground(new java.awt.Color(255, 255, 255));
        btnMesasLibre.setText("Libre");
        btnMesasLibre.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMesasLibre.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnMesasLibre.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMesasLibre.setShadowColor(new java.awt.Color(0, 0, 0));
        btnMesasLibre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesasLibreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound5Layout = new javax.swing.GroupLayout(panelRound5);
        panelRound5.setLayout(panelRound5Layout);
        panelRound5Layout.setHorizontalGroup(
            panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnMesasTodas, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                .addGap(53, 53, 53)
                .addComponent(btnMesasLibre, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                .addGap(53, 53, 53)
                .addComponent(btnMesasOcupado, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );
        panelRound5Layout.setVerticalGroup(
            panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMesasOcupado, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMesasTodas, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMesasLibre, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
                            .addComponent(panelRound5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jScrollPane2))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelRound5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 739, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAbrirMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirMesaActionPerformed
        controlador.abrirMesa();
    }//GEN-LAST:event_btnAbrirMesaActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        controlador.eliminarPlato();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        controlador.agregar();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
        limitacionNumeros(txtCantidad, evt, 2);
    }//GEN-LAST:event_txtCantidadKeyTyped


    private void comboPlatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPlatoActionPerformed
        controlador.verPrecioXplato();
    }//GEN-LAST:event_comboPlatoActionPerformed

    private void tableRoja1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableRoja1MouseClicked
        controlador.clickTabla();
    }//GEN-LAST:event_tableRoja1MouseClicked

    private void btnMesasOcupadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesasOcupadoActionPerformed
        controlador.btnMostrarMesasOcupado();
    }//GEN-LAST:event_btnMesasOcupadoActionPerformed

    private void btnMesasTodasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesasTodasActionPerformed
        controlador.btnMostrarTodasMesas();
    }//GEN-LAST:event_btnMesasTodasActionPerformed

    private void btnMesasLibreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesasLibreActionPerformed
        controlador.btnMostrarMesasDisponibles();
    }//GEN-LAST:event_btnMesasLibreActionPerformed

    private void btnCerrarMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarMesaActionPerformed
        controlador.cerrarMesa();
    }//GEN-LAST:event_btnCerrarMesaActionPerformed

    private void txtClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClienteKeyTyped
        UIController.limitacionNumeros(txtCliente, evt, 9);
    }//GEN-LAST:event_txtClienteKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel addas;
    public javax.swing.JLabel asdadsdsa;
    public button.Button btnAbrirMesa;
    public button.Button btnAgregar;
    public button.Button btnCerrarMesa;
    public button.Button btnEliminar;
    public button.Button btnMesasLibre;
    public button.Button btnMesasOcupado;
    public button.Button btnMesasTodas;
    public combo_suggestion.ComboBoxSuggestion comboPlato;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JScrollPane jScrollPane4;
    public javax.swing.JSeparator jSeparator1;
    public javax.swing.JSeparator jSeparator2;
    public com.modelo.UI.MultipleButton.MultipleButton mesas;
    public com.modelo.ui.PanelRound panelRound1;
    public com.modelo.ui.PanelRound panelRound2;
    public com.modelo.ui.PanelRound panelRound3;
    public com.modelo.ui.PanelRound panelRound4;
    public com.modelo.ui.PanelRound panelRound5;
    public com.modelo.ui.TableRoja tableRoja1;
    public javax.swing.JTextField txtCantidad;
    public textfield_suggestion.TextFieldSuggestion txtCliente;
    public javax.swing.JLabel txtMesero;
    public javax.swing.JLabel txtNMesa;
    public javax.swing.JLabel txtPrecio;
    public javax.swing.JLabel txtTotal;
    // End of variables declaration//GEN-END:variables
}
