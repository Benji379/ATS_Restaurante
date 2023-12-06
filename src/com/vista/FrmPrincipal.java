package com.vista;

import com.controlador.ControladorFrmPrincipal;

public class FrmPrincipal extends javax.swing.JFrame {

    ControladorFrmPrincipal controlador;

    public FrmPrincipal() {
        initComponents();
        controlador = new ControladorFrmPrincipal(this);
        controlador.initDiseño();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        panelRound1 = new com.modelo.ui.PanelRound();
        perfil = new com.modelo.ui.ImageAvatar();
        txtRango = new javax.swing.JLabel();
        btnHome = new com.modelo.ui.PanelRound();
        btnInicio = new slideshow.swing.PictureBox();
        btnFinanzas = new com.modelo.ui.PanelRound();
        pictureBox9 = new slideshow.swing.PictureBox();
        btnMenu = new com.modelo.ui.PanelRound();
        pictureBox5 = new slideshow.swing.PictureBox();
        btnCambiarCuenta = new com.modelo.ui.PanelRound();
        pictureBox12 = new slideshow.swing.PictureBox();
        barraSuperior = new javax.swing.JPanel();
        panelRound7 = new com.modelo.ui.PanelRound();
        btnMsg = new com.modelo.ui.PanelRound();
        pictureBox8 = new slideshow.swing.PictureBox();
        btnConfig = new com.modelo.ui.PanelRound();
        btnNotificacion = new com.modelo.ui.BotonNotificacion();
        btnCaja = new com.modelo.ui.PanelRound();
        pictureBox3 = new slideshow.swing.PictureBox();
        jLabel4 = new javax.swing.JLabel();
        btnReservas = new com.modelo.ui.PanelRound();
        jLabel5 = new javax.swing.JLabel();
        pictureBox7 = new slideshow.swing.PictureBox();
        btnEmpleados = new com.modelo.ui.PanelRound();
        pictureBox2 = new slideshow.swing.PictureBox();
        jLabel3 = new javax.swing.JLabel();
        btnPedidos = new com.modelo.ui.PanelRound();
        pictureBox4 = new slideshow.swing.PictureBox();
        jLabel6 = new javax.swing.JLabel();
        btnCocina = new com.modelo.ui.PanelRound();
        pictureBox1 = new slideshow.swing.PictureBox();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new BenjiBK.scroll.scrollWin11.ScrollPaneWin11();
        CONTENEDOR = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("ATS Restaurant | Inicio");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 1, 4));

        jPanel3.setBackground(new java.awt.Color(0, 1, 4));

        panelRound1.setBackground(new java.awt.Color(70, 21, 17));
        panelRound1.setRoundBottomLeft(15);
        panelRound1.setRoundBottomRight(15);
        panelRound1.setRoundTopLeft(15);
        panelRound1.setRoundTopRight(15);

        perfil.setBorderSize(5);
        perfil.setBorderSpace(2);
        perfil.setGradientColor1(new java.awt.Color(0, 1, 4));
        perfil.setGradientColor2(new java.awt.Color(70, 21, 17));
        perfil.setImage(new javax.swing.ImageIcon(getClass().getResource("/com/img/icons/m.png"))); // NOI18N
        perfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                perfilMouseClicked(evt);
            }
        });

        txtRango.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        txtRango.setForeground(new java.awt.Color(255, 255, 255));
        txtRango.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtRango.setText("Rango");

        btnHome.setBackground(new java.awt.Color(70, 21, 17));
        btnHome.setCustomCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHome.setRoundBottomLeft(15);
        btnHome.setRoundBottomRight(15);
        btnHome.setRoundTopLeft(15);
        btnHome.setRoundTopRight(15);
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHomeMouseClicked(evt);
            }
        });
        btnHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnInicio.setImage(new javax.swing.ImageIcon(getClass().getResource("/com/img/icons/hogar.png"))); // NOI18N
        btnHome.add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        btnFinanzas.setBackground(new java.awt.Color(70, 21, 17));
        btnFinanzas.setCustomCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFinanzas.setRoundBottomLeft(15);
        btnFinanzas.setRoundBottomRight(15);
        btnFinanzas.setRoundTopLeft(15);
        btnFinanzas.setRoundTopRight(15);
        btnFinanzas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFinanzasMouseClicked(evt);
            }
        });
        btnFinanzas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pictureBox9.setImage(new javax.swing.ImageIcon(getClass().getResource("/com/img/icons/dinero.png"))); // NOI18N
        btnFinanzas.add(pictureBox9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        btnMenu.setBackground(new java.awt.Color(70, 21, 17));
        btnMenu.setCustomCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenu.setRoundBottomLeft(15);
        btnMenu.setRoundBottomRight(15);
        btnMenu.setRoundTopLeft(15);
        btnMenu.setRoundTopRight(15);
        btnMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMenuMouseClicked(evt);
            }
        });
        btnMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pictureBox5.setImage(new javax.swing.ImageIcon(getClass().getResource("/com/img/icons/comida.png"))); // NOI18N
        btnMenu.add(pictureBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        btnCambiarCuenta.setBackground(new java.awt.Color(98, 21, 17));
        btnCambiarCuenta.setCustomCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCambiarCuenta.setRoundBottomLeft(15);
        btnCambiarCuenta.setRoundBottomRight(15);
        btnCambiarCuenta.setRoundTopLeft(15);
        btnCambiarCuenta.setRoundTopRight(15);
        btnCambiarCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCambiarCuentaMouseClicked(evt);
            }
        });
        btnCambiarCuenta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pictureBox12.setImage(new javax.swing.ImageIcon(getClass().getResource("/com/img/icons/reemplazar.png"))); // NOI18N
        btnCambiarCuenta.add(pictureBox12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(perfil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtRango, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnFinanzas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(btnCambiarCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtRango)
                .addGap(32, 32, 32)
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnFinanzas, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCambiarCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(32, 32, 32))
        );

        barraSuperior.setBackground(new java.awt.Color(0, 1, 4));

        panelRound7.setBackground(new java.awt.Color(70, 21, 17));
        panelRound7.setRoundBottomLeft(15);
        panelRound7.setRoundBottomRight(15);
        panelRound7.setRoundTopLeft(15);
        panelRound7.setRoundTopRight(15);

        btnMsg.setBackground(new java.awt.Color(70, 21, 17));
        btnMsg.setCustomCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMsg.setRoundBottomLeft(10);
        btnMsg.setRoundBottomRight(10);
        btnMsg.setRoundTopLeft(10);
        btnMsg.setRoundTopRight(10);
        btnMsg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMsgMouseClicked(evt);
            }
        });
        btnMsg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pictureBox8.setImage(new javax.swing.ImageIcon(getClass().getResource("/com/img/icons/mensaje.png"))); // NOI18N
        btnMsg.add(pictureBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        btnConfig.setBackground(new java.awt.Color(70, 21, 17));
        btnConfig.setCustomCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfig.setRoundBottomLeft(10);
        btnConfig.setRoundBottomRight(10);
        btnConfig.setRoundTopLeft(10);
        btnConfig.setRoundTopRight(10);
        btnConfig.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConfigMouseClicked(evt);
            }
        });
        btnConfig.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnNotificacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/img/icons/notificacionOff.png"))); // NOI18N
        btnNotificacion.setText("0");
        btnNotificacion.setBadgeColor(new java.awt.Color(102, 0, 0));
        btnNotificacion.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        btnNotificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNotificacionActionPerformed(evt);
            }
        });
        btnConfig.add(btnNotificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 50, 40));

        btnCaja.setBackground(new java.awt.Color(70, 21, 17));
        btnCaja.setCustomCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCaja.setRoundBottomLeft(10);
        btnCaja.setRoundBottomRight(10);
        btnCaja.setRoundTopLeft(10);
        btnCaja.setRoundTopRight(10);
        btnCaja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCajaMouseClicked(evt);
            }
        });
        btnCaja.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pictureBox3.setImage(new javax.swing.ImageIcon(getClass().getResource("/com/img/icons/hucha.png"))); // NOI18N
        btnCaja.add(pictureBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Caja");
        btnCaja.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 90, 50));

        btnReservas.setBackground(new java.awt.Color(70, 21, 17));
        btnReservas.setCustomCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReservas.setRoundBottomLeft(10);
        btnReservas.setRoundBottomRight(10);
        btnReservas.setRoundTopLeft(10);
        btnReservas.setRoundTopRight(10);
        btnReservas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReservasMouseClicked(evt);
            }
        });
        btnReservas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Reservas");
        btnReservas.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 90, 50));

        pictureBox7.setImage(new javax.swing.ImageIcon(getClass().getResource("/com/img/icons/nota.png"))); // NOI18N
        btnReservas.add(pictureBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        btnEmpleados.setBackground(new java.awt.Color(70, 21, 17));
        btnEmpleados.setCustomCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEmpleados.setRoundBottomLeft(10);
        btnEmpleados.setRoundBottomRight(10);
        btnEmpleados.setRoundTopLeft(10);
        btnEmpleados.setRoundTopRight(10);
        btnEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEmpleadosMouseClicked(evt);
            }
        });
        btnEmpleados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pictureBox2.setImage(new javax.swing.ImageIcon(getClass().getResource("/com/img/icons/Users.png"))); // NOI18N
        btnEmpleados.add(pictureBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Empleados");
        btnEmpleados.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 90, 50));

        btnPedidos.setBackground(new java.awt.Color(70, 21, 17));
        btnPedidos.setCustomCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPedidos.setRoundBottomLeft(10);
        btnPedidos.setRoundBottomRight(10);
        btnPedidos.setRoundTopLeft(10);
        btnPedidos.setRoundTopRight(10);
        btnPedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPedidosMouseClicked(evt);
            }
        });
        btnPedidos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pictureBox4.setImage(new javax.swing.ImageIcon(getClass().getResource("/com/img/icons/apuntarNota.png"))); // NOI18N
        btnPedidos.add(pictureBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Pedidos");
        btnPedidos.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 90, 50));

        btnCocina.setBackground(new java.awt.Color(70, 21, 17));
        btnCocina.setCustomCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCocina.setRoundBottomLeft(10);
        btnCocina.setRoundBottomRight(10);
        btnCocina.setRoundTopLeft(10);
        btnCocina.setRoundTopRight(10);
        btnCocina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCocinaMouseClicked(evt);
            }
        });
        btnCocina.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pictureBox1.setImage(new javax.swing.ImageIcon(getClass().getResource("/com/img/icons/mesa.png"))); // NOI18N
        btnCocina.add(pictureBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 40));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cocina");
        btnCocina.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 90, 50));

        javax.swing.GroupLayout panelRound7Layout = new javax.swing.GroupLayout(panelRound7);
        panelRound7.setLayout(panelRound7Layout);
        panelRound7Layout.setHorizontalGroup(
            panelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btnCocina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btnEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(btnReservas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(btnCaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(btnMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnConfig, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        panelRound7Layout.setVerticalGroup(
            panelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound7Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCocina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReservas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfig, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout barraSuperiorLayout = new javax.swing.GroupLayout(barraSuperior);
        barraSuperior.setLayout(barraSuperiorLayout);
        barraSuperiorLayout.setHorizontalGroup(
            barraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraSuperiorLayout.createSequentialGroup()
                .addComponent(panelRound7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(32, 32, 32))
        );
        barraSuperiorLayout.setVerticalGroup(
            barraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraSuperiorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelRound7, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jScrollPane1.setPreferredSize(new java.awt.Dimension(1037, 561));

        CONTENEDOR.setBackground(new java.awt.Color(0, 1, 4));
        CONTENEDOR.setLayout(new java.awt.CardLayout());
        jScrollPane1.setViewportView(CONTENEDOR);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(barraSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(barraSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseClicked
        controlador.MostrarPanel(new ModuloHome());
    }//GEN-LAST:event_btnHomeMouseClicked

    private void perfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_perfilMouseClicked
        controlador.MostrarPanel(new ModuloPerfilUsuario());
    }//GEN-LAST:event_perfilMouseClicked

    private void btnConfigMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfigMouseClicked

    }//GEN-LAST:event_btnConfigMouseClicked

    private void btnPedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPedidosMouseClicked
        controlador.MostrarPanel(new ModuloPedidos());
    }//GEN-LAST:event_btnPedidosMouseClicked

    private void btnMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuMouseClicked
        controlador.MostrarPanel(new ModuloMenu());
    }//GEN-LAST:event_btnMenuMouseClicked

    private void btnCajaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCajaMouseClicked
        controlador.MostrarPanel(new ModuloCaja());
    }//GEN-LAST:event_btnCajaMouseClicked

    private void btnEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmpleadosMouseClicked
        controlador.MostrarPanel(new ModuloEmpleados());
    }//GEN-LAST:event_btnEmpleadosMouseClicked

    private void btnCocinaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCocinaMouseClicked
        controlador.MostrarPanel(new ModuloCocina());
    }//GEN-LAST:event_btnCocinaMouseClicked

    private void btnCambiarCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCambiarCuentaMouseClicked
        controlador.cambiarCuenta();
    }//GEN-LAST:event_btnCambiarCuentaMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        controlador.confirmarCierre();
    }//GEN-LAST:event_formWindowClosing

    private void btnNotificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNotificacionActionPerformed
        controlador.cmdActionPerformed(evt);
    }//GEN-LAST:event_btnNotificacionActionPerformed

    private void btnMsgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMsgMouseClicked
        controlador.MostrarPanel(new ModuloChat());
    }//GEN-LAST:event_btnMsgMouseClicked

    private void btnReservasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReservasMouseClicked
        controlador.MostrarPanel(new ModuloReservas());
    }//GEN-LAST:event_btnReservasMouseClicked

    private void btnFinanzasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFinanzasMouseClicked
        controlador.MostrarPanel(new ModuloFacturas());
    }//GEN-LAST:event_btnFinanzasMouseClicked

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> {
            new FrmPrincipal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel CONTENEDOR;
    public javax.swing.JPanel barraSuperior;
    public com.modelo.ui.PanelRound btnCaja;
    public com.modelo.ui.PanelRound btnCambiarCuenta;
    public com.modelo.ui.PanelRound btnCocina;
    public com.modelo.ui.PanelRound btnConfig;
    public com.modelo.ui.PanelRound btnEmpleados;
    public com.modelo.ui.PanelRound btnFinanzas;
    public com.modelo.ui.PanelRound btnHome;
    public slideshow.swing.PictureBox btnInicio;
    public com.modelo.ui.PanelRound btnMenu;
    public com.modelo.ui.PanelRound btnMsg;
    public com.modelo.ui.BotonNotificacion btnNotificacion;
    public com.modelo.ui.PanelRound btnPedidos;
    public com.modelo.ui.PanelRound btnReservas;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel3;
    public javax.swing.JScrollPane jScrollPane1;
    public com.modelo.ui.PanelRound panelRound1;
    public com.modelo.ui.PanelRound panelRound7;
    public com.modelo.ui.ImageAvatar perfil;
    public slideshow.swing.PictureBox pictureBox1;
    public slideshow.swing.PictureBox pictureBox12;
    public slideshow.swing.PictureBox pictureBox2;
    public slideshow.swing.PictureBox pictureBox3;
    public slideshow.swing.PictureBox pictureBox4;
    public slideshow.swing.PictureBox pictureBox5;
    public slideshow.swing.PictureBox pictureBox7;
    public slideshow.swing.PictureBox pictureBox8;
    public slideshow.swing.PictureBox pictureBox9;
    public javax.swing.JLabel txtRango;
    // End of variables declaration//GEN-END:variables
}
