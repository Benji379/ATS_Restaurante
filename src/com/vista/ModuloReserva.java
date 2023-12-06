package com.vista;

import com.controlador.ControladorReserva;
import com.modelo.ui.UIController;

public class ModuloReserva extends javax.swing.JPanel {

    ControladorReserva controlador;

    public ModuloReserva() {
        initComponents();
        controlador = new ControladorReserva(this);
        controlador.initDiseño();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new BenjiBK.scroll.scrollWin11.ScrollPaneWin11();
        mesas = new com.modelo.UI.MultipleButton.MultipleButton();
        panelRound1 = new com.modelo.ui.PanelRound();
        panelRound5 = new com.modelo.ui.PanelRound();
        btnMesasOcupado = new button.Button();
        btnMesasTodas = new button.Button();
        btnMesasLibre = new button.Button();
        btnReservar = new button.Button();
        panelRound2 = new com.modelo.ui.PanelRound();
        addas = new javax.swing.JLabel();
        asdadsdsa = new javax.swing.JLabel();
        txtMesero = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtCliente = new textfield_suggestion.TextFieldSuggestion();
        panelRound3 = new com.modelo.ui.PanelRound();
        txtNMesa = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 1, 4));
        setForeground(new java.awt.Color(0, 1, 4));

        jScrollPane1.setBackground(new java.awt.Color(70, 21, 17));
        jScrollPane1.setViewportView(mesas);

        panelRound1.setBackground(new java.awt.Color(0, 1, 4));
        panelRound1.setRoundBottomLeft(20);
        panelRound1.setRoundBottomRight(20);
        panelRound1.setRoundTopLeft(20);
        panelRound1.setRoundTopRight(20);

        panelRound5.setBackground(new java.awt.Color(0, 1, 4));
        panelRound5.setRoundBottomLeft(20);
        panelRound5.setRoundBottomRight(20);
        panelRound5.setRoundTopLeft(20);
        panelRound5.setRoundTopRight(20);

        btnMesasOcupado.setBackground(new java.awt.Color(70, 21, 17));
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

        btnMesasTodas.setBackground(new java.awt.Color(70, 21, 17));
        btnMesasTodas.setForeground(new java.awt.Color(255, 255, 255));
        btnMesasTodas.setText("Todos");
        btnMesasTodas.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMesasTodas.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnMesasTodas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMesasTodas.setShadowColor(new java.awt.Color(0, 0, 0));
        btnMesasTodas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesasTodasActionPerformed(evt);
            }
        });

        btnMesasLibre.setBackground(new java.awt.Color(70, 21, 17));
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

        btnReservar.setBackground(new java.awt.Color(70, 21, 17));
        btnReservar.setForeground(new java.awt.Color(255, 255, 255));
        btnReservar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/icons/btnAgregar.png"))); // NOI18N
        btnReservar.setText("Reservar");
        btnReservar.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReservar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnReservar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnReservar.setShadowColor(new java.awt.Color(0, 0, 0));
        btnReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRound5Layout = new javax.swing.GroupLayout(panelRound5);
        panelRound5.setLayout(panelRound5Layout);
        panelRound5Layout.setHorizontalGroup(
            panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMesasTodas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReservar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMesasOcupado, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMesasLibre, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );
        panelRound5Layout.setVerticalGroup(
            panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMesasLibre, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMesasTodas, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMesasOcupado, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReservar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        panelRound2.setBackground(new java.awt.Color(0, 1, 4));
        panelRound2.setRoundBottomLeft(15);
        panelRound2.setRoundBottomRight(15);
        panelRound2.setRoundTopLeft(15);
        panelRound2.setRoundTopRight(15);
        panelRound2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addas.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        addas.setForeground(new java.awt.Color(255, 255, 255));
        addas.setText("Mesero:");
        panelRound2.add(addas, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 102, -1));

        asdadsdsa.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        asdadsdsa.setForeground(new java.awt.Color(255, 255, 255));
        asdadsdsa.setText("Cliente:");
        panelRound2.add(asdadsdsa, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 102, -1));

        txtMesero.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        txtMesero.setForeground(new java.awt.Color(255, 255, 255));
        panelRound2.add(txtMesero, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 224, 33));
        panelRound2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 170, 10));

        txtCliente.setForeground(new java.awt.Color(255, 255, 255));
        txtCliente.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtCliente.setSelectionColor(new java.awt.Color(70, 21, 17));
        txtCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtClienteKeyTyped(evt);
            }
        });
        panelRound2.add(txtCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 160, 50));

        panelRound3.setBackground(new java.awt.Color(70, 21, 17));
        panelRound3.setRoundBottomLeft(100);
        panelRound3.setRoundBottomRight(100);
        panelRound3.setRoundTopLeft(100);
        panelRound3.setRoundTopRight(100);
        panelRound3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNMesa.setBackground(new java.awt.Color(70, 21, 17));
        txtNMesa.setFont(new java.awt.Font("Century Gothic", 0, 26)); // NOI18N
        txtNMesa.setForeground(new java.awt.Color(255, 255, 255));
        txtNMesa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNMesa.setText("0");
        panelRound3.add(txtNMesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        panelRound2.add(panelRound3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(panelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(panelRound5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelRound5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(panelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(60, 60, 60))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnMesasOcupadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesasOcupadoActionPerformed
        controlador.mostrarOcupadas();
    }//GEN-LAST:event_btnMesasOcupadoActionPerformed

    private void btnMesasTodasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesasTodasActionPerformed
        controlador.mostrarTodasMesas();
    }//GEN-LAST:event_btnMesasTodasActionPerformed

    private void btnMesasLibreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesasLibreActionPerformed
        controlador.mostrarDisponibles();
    }//GEN-LAST:event_btnMesasLibreActionPerformed

    private void btnReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservarActionPerformed
        controlador.abrirMesa();
    }//GEN-LAST:event_btnReservarActionPerformed

    private void txtClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClienteKeyTyped
        UIController.limitacionNumeros(txtCliente, evt, 9);
    }//GEN-LAST:event_txtClienteKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel addas;
    public javax.swing.JLabel asdadsdsa;
    public button.Button btnMesasLibre;
    public button.Button btnMesasOcupado;
    public button.Button btnMesasTodas;
    public button.Button btnReservar;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JSeparator jSeparator2;
    public com.modelo.UI.MultipleButton.MultipleButton mesas;
    public com.modelo.ui.PanelRound panelRound1;
    public com.modelo.ui.PanelRound panelRound2;
    public com.modelo.ui.PanelRound panelRound3;
    public com.modelo.ui.PanelRound panelRound5;
    public textfield_suggestion.TextFieldSuggestion txtCliente;
    public javax.swing.JLabel txtMesero;
    public javax.swing.JLabel txtNMesa;
    // End of variables declaration//GEN-END:variables
}
