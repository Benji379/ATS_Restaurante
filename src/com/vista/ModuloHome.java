package com.vista;

import com.controlador.ControladorHome;
import static com.modelo.action.Action.*;

public class ModuloHome extends javax.swing.JPanel {

    ControladorHome controlador;

    public ModuloHome() {
        initComponents();
        controlador = new ControladorHome(this);
        controlador.initDiseño();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        slideshow1 = new slideshow.slideshow.Slideshow();
        jlbTittle = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnExcel = new button.Button();
        btnNavegador = new button.Button();
        btnCalculadora = new button.Button();
        btnLimpiar3 = new button.Button();
        btnBlockNotas = new button.Button();
        btnCorreo = new button.Button();
        btnArchivos = new button.Button();
        btnWhastApp = new button.Button();
        jLabel5 = new javax.swing.JLabel();
        comboVista = new com.modelo.ui.PanelRound();
        jLabel2 = new javax.swing.JLabel();
        combobox1 = new combobox.Combobox();

        setBackground(new java.awt.Color(0, 1, 4));

        slideshow1.setBackground(new java.awt.Color(0, 1, 4));

        jlbTittle.setFont(new java.awt.Font("Restaurant", 1, 60)); // NOI18N
        jlbTittle.setForeground(new java.awt.Color(255, 255, 255));
        jlbTittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbTittle.setText("ATS Restaurant");
        jlbTittle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel1.setBackground(new java.awt.Color(0, 1, 4));

        btnExcel.setBackground(new java.awt.Color(70, 21, 17));
        btnExcel.setForeground(new java.awt.Color(255, 255, 255));
        btnExcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/icons/abrirExcel.png"))); // NOI18N
        btnExcel.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcel.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnExcel.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnExcel.setShadowColor(new java.awt.Color(0, 0, 0));
        btnExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcelActionPerformed(evt);
            }
        });

        btnNavegador.setBackground(new java.awt.Color(70, 21, 17));
        btnNavegador.setForeground(new java.awt.Color(255, 255, 255));
        btnNavegador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/icons/globo.png"))); // NOI18N
        btnNavegador.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNavegador.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnNavegador.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnNavegador.setShadowColor(new java.awt.Color(0, 0, 0));
        btnNavegador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNavegadorActionPerformed(evt);
            }
        });

        btnCalculadora.setBackground(new java.awt.Color(70, 21, 17));
        btnCalculadora.setForeground(new java.awt.Color(255, 255, 255));
        btnCalculadora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/icons/cacl.png"))); // NOI18N
        btnCalculadora.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCalculadora.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnCalculadora.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnCalculadora.setShadowColor(new java.awt.Color(0, 0, 0));
        btnCalculadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculadoraActionPerformed(evt);
            }
        });

        btnLimpiar3.setBackground(new java.awt.Color(70, 21, 17));
        btnLimpiar3.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/icons/abrirExcel.png"))); // NOI18N
        btnLimpiar3.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnLimpiar3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnLimpiar3.setShadowColor(new java.awt.Color(0, 0, 0));
        btnLimpiar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiar3ActionPerformed(evt);
            }
        });

        btnBlockNotas.setBackground(new java.awt.Color(70, 21, 17));
        btnBlockNotas.setForeground(new java.awt.Color(255, 255, 255));
        btnBlockNotas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/icons/blockNota.png"))); // NOI18N
        btnBlockNotas.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBlockNotas.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnBlockNotas.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnBlockNotas.setShadowColor(new java.awt.Color(0, 0, 0));
        btnBlockNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBlockNotasActionPerformed(evt);
            }
        });

        btnCorreo.setBackground(new java.awt.Color(70, 21, 17));
        btnCorreo.setForeground(new java.awt.Color(255, 255, 255));
        btnCorreo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/icons/mail.png"))); // NOI18N
        btnCorreo.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCorreo.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnCorreo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnCorreo.setShadowColor(new java.awt.Color(0, 0, 0));
        btnCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCorreoActionPerformed(evt);
            }
        });

        btnArchivos.setBackground(new java.awt.Color(70, 21, 17));
        btnArchivos.setForeground(new java.awt.Color(255, 255, 255));
        btnArchivos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/icons/carpeta.png"))); // NOI18N
        btnArchivos.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnArchivos.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnArchivos.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnArchivos.setShadowColor(new java.awt.Color(0, 0, 0));
        btnArchivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArchivosActionPerformed(evt);
            }
        });

        btnWhastApp.setBackground(new java.awt.Color(70, 21, 17));
        btnWhastApp.setForeground(new java.awt.Color(255, 255, 255));
        btnWhastApp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/icons/whatsapp.png"))); // NOI18N
        btnWhastApp.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnWhastApp.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnWhastApp.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnWhastApp.setShadowColor(new java.awt.Color(0, 0, 0));
        btnWhastApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWhastAppActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Domingo 12 de dic, 2023");

        comboVista.setBackground(new java.awt.Color(70, 21, 17));
        comboVista.setRoundBottomLeft(25);
        comboVista.setRoundBottomRight(25);
        comboVista.setRoundTopLeft(25);
        comboVista.setRoundTopRight(25);
        comboVista.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Schoolbook", 0, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Vista:");
        comboVista.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 15, -1, 36));

        combobox1.setBackground(new java.awt.Color(70, 21, 17));
        combobox1.setForeground(new java.awt.Color(255, 255, 255));
        combobox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "administrador", "caja", "cocina", "mesero" }));
        combobox1.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        combobox1.setLabeText("");
        combobox1.setLineColor(new java.awt.Color(255, 255, 255));
        combobox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combobox1ActionPerformed(evt);
            }
        });
        comboVista.add(combobox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 190, 50));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(btnExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNavegador, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCalculadora, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBlockNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnArchivos, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnWhastApp, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLimpiar3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(comboVista, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnWhastApp, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnArchivos, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBlockNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalculadora, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNavegador, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(comboVista, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(slideshow1, javax.swing.GroupLayout.DEFAULT_SIZE, 928, Short.MAX_VALUE)
                .addGap(45, 45, 45))
            .addComponent(jlbTittle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jlbTittle)
                .addGap(42, 42, 42)
                .addComponent(slideshow1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void combobox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combobox1ActionPerformed

    }//GEN-LAST:event_combobox1ActionPerformed

    private void btnExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcelActionPerformed
        AccederEnlace("excel");
    }//GEN-LAST:event_btnExcelActionPerformed

    private void btnNavegadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNavegadorActionPerformed
        AccederEnlace("chrome");
    }//GEN-LAST:event_btnNavegadorActionPerformed

    private void btnCalculadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculadoraActionPerformed
        AccederEnlace("calc");
    }//GEN-LAST:event_btnCalculadoraActionPerformed

    private void btnLimpiar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiar3ActionPerformed

    }//GEN-LAST:event_btnLimpiar3ActionPerformed

    private void btnBlockNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBlockNotasActionPerformed
        AccederEnlace("notepad");
    }//GEN-LAST:event_btnBlockNotasActionPerformed

    private void btnCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCorreoActionPerformed
        AccederEnlace("chrome https://mail.google.com/mail/u/#inbox?compose=new");
    }//GEN-LAST:event_btnCorreoActionPerformed

    private void btnArchivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArchivosActionPerformed
        AccederEnlace("explorer");
    }//GEN-LAST:event_btnArchivosActionPerformed

    private void btnWhastAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWhastAppActionPerformed
        AccederEnlace("chrome https://web.whatsapp.com/");
    }//GEN-LAST:event_btnWhastAppActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public button.Button btnArchivos;
    public button.Button btnBlockNotas;
    public button.Button btnCalculadora;
    public button.Button btnCorreo;
    public button.Button btnExcel;
    public button.Button btnLimpiar3;
    public button.Button btnNavegador;
    public button.Button btnWhastApp;
    public com.modelo.ui.PanelRound comboVista;
    public static combobox.Combobox combobox1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JLabel jlbTittle;
    public slideshow.slideshow.Slideshow slideshow1;
    // End of variables declaration//GEN-END:variables
}
