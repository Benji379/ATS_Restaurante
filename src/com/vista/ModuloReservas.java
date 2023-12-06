package com.vista;

import com.modelo.ui.UIController;

public class ModuloReservas extends javax.swing.JPanel {

    public ModuloReservas() {
        initComponents();
        UIController.MostrarPanel(ContenedorReservas, new ModuloReserva());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        ContenedorReservas = new javax.swing.JPanel();
        btnCambiarModuloReservas = new javax.swing.JPanel();
        btnListaReservas = new button.Button();
        btnNuevaReserva = new button.Button();
        tituloVentana = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 1, 4));

        jLabel4.setFont(new java.awt.Font("Restaurant", 1, 60)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Reservas");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        ContenedorReservas.setBackground(new java.awt.Color(0, 1, 4));
        ContenedorReservas.setLayout(new java.awt.CardLayout());

        btnCambiarModuloReservas.setBackground(new java.awt.Color(0, 1, 4));

        btnListaReservas.setBackground(new java.awt.Color(70, 21, 17));
        btnListaReservas.setForeground(new java.awt.Color(255, 255, 255));
        btnListaReservas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/icons/lapiz.png"))); // NOI18N
        btnListaReservas.setText("Lista de Reservas");
        btnListaReservas.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnListaReservas.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        btnListaReservas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnListaReservas.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnListaReservas.setShadowColor(new java.awt.Color(0, 0, 0));
        btnListaReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaReservasActionPerformed(evt);
            }
        });

        btnNuevaReserva.setBackground(new java.awt.Color(70, 21, 17));
        btnNuevaReserva.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevaReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/icons/lapiz.png"))); // NOI18N
        btnNuevaReserva.setText("Nueva reserva");
        btnNuevaReserva.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevaReserva.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        btnNuevaReserva.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNuevaReserva.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnNuevaReserva.setShadowColor(new java.awt.Color(0, 0, 0));
        btnNuevaReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaReservaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout btnCambiarModuloReservasLayout = new javax.swing.GroupLayout(btnCambiarModuloReservas);
        btnCambiarModuloReservas.setLayout(btnCambiarModuloReservasLayout);
        btnCambiarModuloReservasLayout.setHorizontalGroup(
            btnCambiarModuloReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCambiarModuloReservasLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(btnNuevaReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnListaReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        btnCambiarModuloReservasLayout.setVerticalGroup(
            btnCambiarModuloReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCambiarModuloReservasLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(btnCambiarModuloReservasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnListaReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevaReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        tituloVentana.setFont(new java.awt.Font("Restaurant", 1, 55)); // NOI18N
        tituloVentana.setForeground(new java.awt.Color(255, 255, 255));
        tituloVentana.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloVentana.setText("Nueva Reserva");
        tituloVentana.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tituloVentana.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ContenedorReservas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tituloVentana, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btnCambiarModuloReservas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCambiarModuloReservas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloVentana, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ContenedorReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnListaReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaReservasActionPerformed
        UIController.MostrarPanel(ContenedorReservas, new ModuloListaReservas());
        tituloVentana.setText("<html>Lista<br>Reservas</html>");
    }//GEN-LAST:event_btnListaReservasActionPerformed

    private void btnNuevaReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaReservaActionPerformed
        UIController.MostrarPanel(ContenedorReservas, new ModuloReserva());
        tituloVentana.setText("<html>Nueva<br>Reserva</html>");
    }//GEN-LAST:event_btnNuevaReservaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ContenedorReservas;
    private javax.swing.JPanel btnCambiarModuloReservas;
    private button.Button btnListaReservas;
    private button.Button btnNuevaReserva;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel tituloVentana;
    // End of variables declaration//GEN-END:variables
}
