package com.vista;

import com.controlador.ControladorListaReservas;
import static com.modelo.action.Action.descargarTablaXlsx;
import static com.modelo.action.Action.enviarCorreo;
import com.modelo.ui.UIController;

public class ModuloListaReservas extends javax.swing.JPanel {

    ControladorListaReservas controlador;

    public ModuloListaReservas() {
        initComponents();
        controlador = new ControladorListaReservas(this);
        controlador.initDiseño();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooser = new com.raven.datechooser.DateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaReservas = new com.modelo.ui.TableDark();
        panelRound1 = new com.modelo.ui.PanelRound();
        pID = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtFecha = new textfield_suggestion.TextFieldSuggestion();
        pID1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        txtIdReserva = new textfield_suggestion.TextFieldSuggestion();
        pID2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        txtDni = new textfield_suggestion.TextFieldSuggestion();
        pID3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        txtMesa = new textfield_suggestion.TextFieldSuggestion();
        pID4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        txtEstado = new textfield_suggestion.TextFieldSuggestion();
        pID5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        txtHora = new textfield_suggestion.TextFieldSuggestion();
        jLabel7 = new javax.swing.JLabel();
        pnlBotones = new javax.swing.JPanel();
        btnLimpiar = new button.Button();
        btnExportar = new button.Button();
        btnEnviar = new button.Button();

        setBackground(new java.awt.Color(0, 1, 4));

        tablaReservas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "DniCliente", "Mesa", "Estado", "Fecha", "Hora"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaReservas);

        panelRound1.setBackground(new java.awt.Color(70, 21, 17));
        panelRound1.setRoundBottomLeft(20);
        panelRound1.setRoundBottomRight(20);
        panelRound1.setRoundTopLeft(20);
        panelRound1.setRoundTopRight(20);

        pID.setBackground(new java.awt.Color(70, 21, 17));
        pID.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Fecha");
        pID.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 70, -1));
        pID.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 170, 10));

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
        pID.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 160, 50));

        pID1.setBackground(new java.awt.Color(70, 21, 17));
        pID1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century", 1, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("N");
        pID1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 40, -1));
        pID1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 170, 10));

        txtIdReserva.setForeground(new java.awt.Color(255, 255, 255));
        txtIdReserva.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtIdReserva.setSelectionColor(new java.awt.Color(0, 0, 0));
        txtIdReserva.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIdReservaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdReservaKeyTyped(evt);
            }
        });
        pID1.add(txtIdReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 160, 50));

        pID2.setBackground(new java.awt.Color(70, 21, 17));
        pID2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Century", 1, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DNI");
        pID2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 60, -1));
        pID2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 170, 10));

        txtDni.setForeground(new java.awt.Color(255, 255, 255));
        txtDni.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtDni.setSelectionColor(new java.awt.Color(0, 0, 0));
        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniKeyTyped(evt);
            }
        });
        pID2.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 160, 50));

        pID3.setBackground(new java.awt.Color(70, 21, 17));
        pID3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Century", 1, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Mesa");
        pID3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 80, -1));
        pID3.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 170, 10));

        txtMesa.setForeground(new java.awt.Color(255, 255, 255));
        txtMesa.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtMesa.setSelectionColor(new java.awt.Color(0, 0, 0));
        txtMesa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMesaKeyTyped(evt);
            }
        });
        pID3.add(txtMesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 160, 50));

        pID4.setBackground(new java.awt.Color(70, 21, 17));
        pID4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Century", 1, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Estado");
        pID4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 80, -1));
        pID4.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 170, 10));

        txtEstado.setForeground(new java.awt.Color(255, 255, 255));
        txtEstado.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtEstado.setSelectionColor(new java.awt.Color(0, 0, 0));
        txtEstado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEstadoMouseClicked(evt);
            }
        });
        txtEstado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEstadoKeyTyped(evt);
            }
        });
        pID4.add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 160, 50));

        pID5.setBackground(new java.awt.Color(70, 21, 17));
        pID5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Century", 1, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Hora");
        pID5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 80, -1));
        pID5.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 170, 10));

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
        pID5.add(txtHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 160, 50));

        jLabel7.setFont(new java.awt.Font("Century Schoolbook", 0, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Datos");

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pID4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                    .addComponent(pID5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pID1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pID3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pID2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(pID1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(pID2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(pID3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(pID4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(pID5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
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

        javax.swing.GroupLayout pnlBotonesLayout = new javax.swing.GroupLayout(pnlBotones);
        pnlBotones.setLayout(pnlBotonesLayout);
        pnlBotonesLayout.setHorizontalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExportar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEnviar, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlBotonesLayout.setVerticalGroup(
            pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBotonesLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExportar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 862, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(pnlBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtFechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFechaKeyTyped
        UIController.limitacionNumeros(txtFecha, evt, 9);
    }//GEN-LAST:event_txtFechaKeyTyped

    private void txtIdReservaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdReservaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdReservaKeyTyped

    private void txtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniKeyTyped

    private void txtMesaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMesaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMesaKeyTyped

    private void txtEstadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEstadoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstadoKeyTyped

    private void txtHoraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHoraKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoraKeyTyped

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        controlador.limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarActionPerformed
        descargarTablaXlsx(tablaReservas, "Lista reservas");
    }//GEN-LAST:event_btnExportarActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        enviarCorreo(tablaReservas, "Lista reservas");
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void txtEstadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEstadoMouseClicked
        
    }//GEN-LAST:event_txtEstadoMouseClicked

    private void txtHoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtHoraMouseClicked
        
    }//GEN-LAST:event_txtHoraMouseClicked

    private void txtFechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFechaMouseClicked
        dateChooser.showPopup();
    }//GEN-LAST:event_txtFechaMouseClicked

    private void txtIdReservaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdReservaKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdReservaKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public button.Button btnEnviar;
    public button.Button btnExportar;
    public button.Button btnLimpiar;
    public com.raven.datechooser.DateChooser dateChooser;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JSeparator jSeparator2;
    public javax.swing.JSeparator jSeparator3;
    public javax.swing.JSeparator jSeparator4;
    public javax.swing.JSeparator jSeparator5;
    public javax.swing.JSeparator jSeparator6;
    public javax.swing.JSeparator jSeparator7;
    public javax.swing.JPanel pID;
    public javax.swing.JPanel pID1;
    public javax.swing.JPanel pID2;
    public javax.swing.JPanel pID3;
    public javax.swing.JPanel pID4;
    public javax.swing.JPanel pID5;
    public com.modelo.ui.PanelRound panelRound1;
    public javax.swing.JPanel pnlBotones;
    public com.modelo.ui.TableDark tablaReservas;
    public textfield_suggestion.TextFieldSuggestion txtDni;
    public textfield_suggestion.TextFieldSuggestion txtEstado;
    public textfield_suggestion.TextFieldSuggestion txtFecha;
    public textfield_suggestion.TextFieldSuggestion txtHora;
    public textfield_suggestion.TextFieldSuggestion txtIdReserva;
    public textfield_suggestion.TextFieldSuggestion txtMesa;
    // End of variables declaration//GEN-END:variables
}
