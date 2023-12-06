package com.vista;

import com.controlador.ControladorNuevoPedido;
import java.awt.Color;
import java.sql.*;

public class NuevoPedido extends javax.swing.JPanel {

    ControladorNuevoPedido controlador;

    public NuevoPedido(int idConsumo, int mesa, String platillo, int cantidad, Date fecha, Time hora) {
        initComponents();
        controlador = new ControladorNuevoPedido(this);
        controlador.initDiseño(idConsumo, mesa, platillo, cantidad, fecha, hora);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound1 = new com.modelo.ui.PanelRound();
        jLabel1 = new javax.swing.JLabel();
        txtHora = new javax.swing.JLabel();
        txtNumeroMesa = new javax.swing.JLabel();
        txtPlatillo = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JLabel();
        btnFinalizar = new button.Button();
        checkListo = new radio_button.RadioButtonCustom();
        sombra = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 1, 4));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound1.setBackground(new java.awt.Color(85, 21, 17));
        panelRound1.setRoundBottomLeft(15);
        panelRound1.setRoundBottomRight(15);
        panelRound1.setRoundTopLeft(15);
        panelRound1.setRoundTopRight(15);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/icons/lapiz.png"))); // NOI18N
        panelRound1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        txtHora.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        txtHora.setForeground(new java.awt.Color(255, 255, 255));
        txtHora.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtHora.setText("Hora");
        panelRound1.add(txtHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 100, 30));

        txtNumeroMesa.setFont(new java.awt.Font("Comic Sans MS", 1, 20)); // NOI18N
        txtNumeroMesa.setForeground(new java.awt.Color(255, 255, 255));
        txtNumeroMesa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNumeroMesa.setText("Mesa #00");
        panelRound1.add(txtNumeroMesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 180, 30));

        txtPlatillo.setFont(new java.awt.Font("Comic Sans MS", 0, 22)); // NOI18N
        txtPlatillo.setForeground(new java.awt.Color(255, 255, 255));
        txtPlatillo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtPlatillo.setText("Platillo");
        panelRound1.add(txtPlatillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 180, 30));

        txtCantidad.setFont(new java.awt.Font("Comic Sans MS", 0, 19)); // NOI18N
        txtCantidad.setForeground(new java.awt.Color(255, 255, 255));
        txtCantidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCantidad.setText("Cantidad: 00");
        panelRound1.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 180, 30));

        btnFinalizar.setBackground(new java.awt.Color(70, 21, 17));
        btnFinalizar.setForeground(new java.awt.Color(255, 255, 255));
        btnFinalizar.setText("Finalizar");
        btnFinalizar.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFinalizar.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        btnFinalizar.setShadowColor(new java.awt.Color(0, 0, 0));
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });
        panelRound1.add(btnFinalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 100, -1));

        checkListo.setBackground(new java.awt.Color(0, 204, 0));
        checkListo.setForeground(new java.awt.Color(255, 255, 255));
        checkListo.setSelected(true);
        checkListo.setText("Estado");
        checkListo.setFont(new java.awt.Font("Comic Sans MS", 0, 20)); // NOI18N
        checkListo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkListoActionPerformed(evt);
            }
        });
        panelRound1.add(checkListo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 190, -1));

        add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 4, 220, 305));

        sombra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sombra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/icons/fondoNuevoPedido.png"))); // NOI18N
        add(sombra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 330));
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        panelRound1.setBackground(Color.decode("#93231E"));
    }//GEN-LAST:event_formMouseEntered

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited
        panelRound1.setBackground(Color.decode("#551511"));
    }//GEN-LAST:event_formMouseExited

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        controlador.btnFinalizarActionPerformed();
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void checkListoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkListoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkListoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public button.Button btnFinalizar;
    public radio_button.RadioButtonCustom checkListo;
    public javax.swing.JLabel jLabel1;
    public com.modelo.ui.PanelRound panelRound1;
    public javax.swing.JLabel sombra;
    public javax.swing.JLabel txtCantidad;
    public javax.swing.JLabel txtHora;
    public javax.swing.JLabel txtNumeroMesa;
    public javax.swing.JLabel txtPlatillo;
    // End of variables declaration//GEN-END:variables

}
