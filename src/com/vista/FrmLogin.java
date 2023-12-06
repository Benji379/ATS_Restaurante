package com.vista;

import com.controlador.ControladorLogin;
import com.modelo.ui.UIController;

public class FrmLogin extends javax.swing.JFrame {

    ControladorLogin controlador;

    public FrmLogin() {
        initComponents();
        controlador = new ControladorLogin(this);
        controlador.initDiseño();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound1 = new com.modelo.ui.PanelRound();
        jLabel5 = new javax.swing.JLabel();
        BarraTitulo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jlbLogin = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtUsuario = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txtContraseña = new javax.swing.JPasswordField();
        btnIngresar = new button.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound1.setBackground(new java.awt.Color(0, 1, 4));
        panelRound1.setRoundBottomLeft(20);
        panelRound1.setRoundBottomRight(20);
        panelRound1.setRoundTopLeft(20);
        panelRound1.setRoundTopRight(20);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("X");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        panelRound1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 30, -1));

        BarraTitulo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BarraTitulo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BarraTituloMouseDragged(evt);
            }
        });
        BarraTitulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BarraTituloMousePressed(evt);
            }
        });
        panelRound1.add(BarraTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 40));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Contraseña");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        panelRound1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, -1, -1));

        jlbLogin.setFont(new java.awt.Font("Restaurant", 1, 48)); // NOI18N
        jlbLogin.setForeground(new java.awt.Color(255, 255, 255));
        jlbLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbLogin.setText("Login");
        jlbLogin.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jlbLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jlbLogin.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        panelRound1.add(jlbLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Usuario");
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        panelRound1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, -1, -1));
        panelRound1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, 180, 10));

        txtUsuario.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsuario.setSelectionColor(new java.awt.Color(50, 21, 17));
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyTyped(evt);
            }
        });
        panelRound1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 180, 30));
        panelRound1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 180, 10));

        txtContraseña.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtContraseña.setForeground(new java.awt.Color(255, 255, 255));
        txtContraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtContraseña.setSelectionColor(new java.awt.Color(50, 21, 17));
        txtContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContraseñaKeyTyped(evt);
            }
        });
        panelRound1.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 180, 30));

        btnIngresar.setBackground(new java.awt.Color(50, 21, 17));
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/icons/llave-inglesa.png"))); // NOI18N
        btnIngresar.setText("INGRESAR");
        btnIngresar.setCurrentCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        btnIngresar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnIngresar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnIngresar.setShadowColor(new java.awt.Color(0, 0, 0));
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        panelRound1.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 160, 50));

        getContentPane().add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BarraTituloMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraTituloMouseDragged
        controlador.BarraTituloMouseDragged(evt);
    }//GEN-LAST:event_BarraTituloMouseDragged

    private void BarraTituloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarraTituloMousePressed
        controlador.BarraTituloMousePressed(evt);
    }//GEN-LAST:event_BarraTituloMousePressed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        controlador.btnIngresar();
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void txtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyTyped
        UIController.limitacionCaracteres(txtUsuario, evt, 8, false);
    }//GEN-LAST:event_txtUsuarioKeyTyped

    private void txtContraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraseñaKeyTyped
        UIController.limitacionCaracteres(txtContraseña, evt, 18, false);
    }//GEN-LAST:event_txtContraseñaKeyTyped

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FrmLogin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel BarraTitulo;
    public button.Button btnIngresar;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JSeparator jSeparator1;
    public javax.swing.JSeparator jSeparator2;
    public javax.swing.JLabel jlbLogin;
    public com.modelo.ui.PanelRound panelRound1;
    public javax.swing.JPasswordField txtContraseña;
    public javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
