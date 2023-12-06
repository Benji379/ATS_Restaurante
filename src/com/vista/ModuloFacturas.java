package com.vista;

import com.controlador.ControladorFacturas;
import static com.modelo.action.Action.*;

public class ModuloFacturas extends javax.swing.JPanel {
    
    ControladorFacturas controlador;
    public ModuloFacturas() {
        initComponents();
        controlador = new ControladorFacturas(this);
        controlador.initDiseño();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooser = new com.raven.datechooser.DateChooser();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaFactura = new com.modelo.ui.TableDark();
        panelRound1 = new com.modelo.ui.PanelRound();
        pID = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtId = new textfield_suggestion.TextFieldSuggestion();
        pID1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        txtReserva = new textfield_suggestion.TextFieldSuggestion();
        pID2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        txtCaja = new textfield_suggestion.TextFieldSuggestion();
        pID3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        txtFecha = new textfield_suggestion.TextFieldSuggestion();
        pID4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        txtPago = new textfield_suggestion.TextFieldSuggestion();
        pID6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        txtHora = new textfield_suggestion.TextFieldSuggestion();
        pnlBotones = new javax.swing.JPanel();
        btnLimpiar = new button.Button();
        btnExportar = new button.Button();
        btnEnviar = new button.Button();
        btnFactura = new button.Button();

        dateChooser.setTextRefernce(txtFecha);

        setBackground(new java.awt.Color(0, 1, 4));

        jLabel4.setFont(new java.awt.Font("Restaurant", 1, 60)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Facturas");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        tablaFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Reserva", "Caja", "TipoPago", "SubTotal", "Total", "Fecha", "Hora"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaFactura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaFacturaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaFactura);

        panelRound1.setBackground(new java.awt.Color(0, 1, 4));

        pID.setBackground(new java.awt.Color(0, 1, 4));
        pID.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID");
        pID.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 70, -1));
        pID.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 170, 10));

        txtId.setForeground(new java.awt.Color(255, 255, 255));
        txtId.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtId.setSelectionColor(new java.awt.Color(0, 0, 0));
        txtId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtIdMouseClicked(evt);
            }
        });
        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdKeyTyped(evt);
            }
        });
        pID.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 160, 50));

        pID1.setBackground(new java.awt.Color(0, 1, 4));
        pID1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century", 1, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Reserva");
        pID1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 90, -1));
        pID1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 170, 10));

        txtReserva.setForeground(new java.awt.Color(255, 255, 255));
        txtReserva.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtReserva.setSelectionColor(new java.awt.Color(0, 0, 0));
        txtReserva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtReservaMouseClicked(evt);
            }
        });
        txtReserva.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtReservaKeyTyped(evt);
            }
        });
        pID1.add(txtReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 160, 50));

        pID2.setBackground(new java.awt.Color(0, 1, 4));
        pID2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Century", 1, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Caja");
        pID2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 70, -1));
        pID2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 170, 10));

        txtCaja.setForeground(new java.awt.Color(255, 255, 255));
        txtCaja.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtCaja.setSelectionColor(new java.awt.Color(0, 0, 0));
        txtCaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCajaMouseClicked(evt);
            }
        });
        txtCaja.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCajaKeyTyped(evt);
            }
        });
        pID2.add(txtCaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 160, 50));

        pID3.setBackground(new java.awt.Color(0, 1, 4));
        pID3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Century", 1, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Fecha");
        pID3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 90, -1));
        pID3.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 170, 10));

        txtFecha.setEditable(false);
        txtFecha.setForeground(new java.awt.Color(255, 255, 255));
        txtFecha.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtFecha.setSelectionColor(new java.awt.Color(0, 0, 0));
        txtFecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFechaMouseClicked(evt);
            }
        });
        txtFecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFechaKeyTyped(evt);
            }
        });
        pID3.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 160, 50));

        pID4.setBackground(new java.awt.Color(0, 1, 4));
        pID4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Century", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("TipoPago");
        pID4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));
        pID4.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 170, 10));

        txtPago.setForeground(new java.awt.Color(255, 255, 255));
        txtPago.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtPago.setSelectionColor(new java.awt.Color(0, 0, 0));
        txtPago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPagoMouseClicked(evt);
            }
        });
        txtPago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPagoKeyTyped(evt);
            }
        });
        pID4.add(txtPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 160, 50));

        pID6.setBackground(new java.awt.Color(0, 1, 4));
        pID6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Century", 1, 22)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Hora");
        pID6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 90, -1));
        pID6.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 170, 10));

        txtHora.setForeground(new java.awt.Color(255, 255, 255));
        txtHora.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtHora.setSelectionColor(new java.awt.Color(0, 0, 0));
        txtHora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtHoraMouseClicked(evt);
            }
        });
        txtHora.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtHoraKeyTyped(evt);
            }
        });
        pID6.add(txtHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 160, 50));

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pID, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pID1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pID2, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pID4, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pID3, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pID6, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pID4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addComponent(pID1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(pID2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addComponent(pID3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(pID6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pnlBotones.setBackground(new java.awt.Color(0, 1, 4));

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

        btnFactura.setBackground(new java.awt.Color(70, 21, 17));
        btnFactura.setForeground(new java.awt.Color(255, 255, 255));
        btnFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/icons/pdf.png"))); // NOI18N
        btnFactura.setText("Factura");
        btnFactura.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFactura.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnFactura.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnFactura.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnFactura.setShadowColor(new java.awt.Color(0, 0, 0));
        btnFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacturaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBotonesLayout = new javax.swing.GroupLayout(pnlBotones);
        pnlBotones.setLayout(pnlBotonesLayout);
        pnlBotonesLayout.setHorizontalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEnviar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExportar, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );
        pnlBotonesLayout.setVerticalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBotonesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExportar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 956, Short.MAX_VALUE)
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIdMouseClicked
        
    }//GEN-LAST:event_txtIdMouseClicked

    private void txtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyTyped
        
    }//GEN-LAST:event_txtIdKeyTyped

    private void txtReservaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtReservaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReservaMouseClicked

    private void txtReservaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtReservaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReservaKeyTyped

    private void txtCajaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCajaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCajaMouseClicked

    private void txtCajaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCajaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCajaKeyTyped

    private void txtFechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFechaMouseClicked
        dateChooser.showPopup();
    }//GEN-LAST:event_txtFechaMouseClicked

    private void txtFechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaKeyTyped

    private void txtPagoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPagoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPagoMouseClicked

    private void txtPagoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPagoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPagoKeyTyped

    private void txtHoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtHoraMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoraMouseClicked

    private void txtHoraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHoraKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoraKeyTyped

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        controlador.limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarActionPerformed
        descargarTablaXlsx(tablaFactura, "Lista de Factura");
    }//GEN-LAST:event_btnExportarActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        enviarCorreo(tablaFactura, "Lista de Factura");
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void btnFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacturaActionPerformed
        controlador.descargarFactura();
    }//GEN-LAST:event_btnFacturaActionPerformed

    private void tablaFacturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaFacturaMouseClicked
        controlador.clickTabla();
    }//GEN-LAST:event_tablaFacturaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public button.Button btnEnviar;
    public button.Button btnExportar;
    public button.Button btnFactura;
    public button.Button btnLimpiar;
    public com.raven.datechooser.DateChooser dateChooser;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JSeparator jSeparator2;
    public javax.swing.JSeparator jSeparator3;
    public javax.swing.JSeparator jSeparator4;
    public javax.swing.JSeparator jSeparator5;
    public javax.swing.JSeparator jSeparator6;
    public javax.swing.JSeparator jSeparator8;
    public javax.swing.JPanel pID;
    public javax.swing.JPanel pID1;
    public javax.swing.JPanel pID2;
    public javax.swing.JPanel pID3;
    public javax.swing.JPanel pID4;
    public javax.swing.JPanel pID6;
    public com.modelo.ui.PanelRound panelRound1;
    public javax.swing.JPanel pnlBotones;
    public com.modelo.ui.TableDark tablaFactura;
    public textfield_suggestion.TextFieldSuggestion txtCaja;
    public textfield_suggestion.TextFieldSuggestion txtFecha;
    public textfield_suggestion.TextFieldSuggestion txtHora;
    public textfield_suggestion.TextFieldSuggestion txtId;
    public textfield_suggestion.TextFieldSuggestion txtPago;
    public textfield_suggestion.TextFieldSuggestion txtReserva;
    // End of variables declaration//GEN-END:variables
}
