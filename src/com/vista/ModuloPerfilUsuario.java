package com.vista;

import com.controlador.ControladorPerfilUsuario;

public class ModuloPerfilUsuario extends javax.swing.JPanel {

    ControladorPerfilUsuario controlador;

    public ModuloPerfilUsuario() {
        initComponents();
        controlador = new ControladorPerfilUsuario(this);
        controlador.initDiseño();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondoPanelCarnet = new com.modelo.ui.PanelRound();
        background1 = new com.modelo.ui.Background();
        panelRound3 = new com.modelo.ui.PanelRound();
        txtCodigo2 = new javax.swing.JLabel();
        txtCodigo3 = new javax.swing.JLabel();
        txtCodigo4 = new javax.swing.JLabel();
        txtCodigo5 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JLabel();
        txtCodigo7 = new javax.swing.JLabel();
        txtRango = new javax.swing.JLabel();
        txtCodigo9 = new javax.swing.JLabel();
        txtCodigo10 = new javax.swing.JLabel();
        txtDni = new javax.swing.JLabel();
        txtApellidoP = new javax.swing.JLabel();
        txtApellidoM = new javax.swing.JLabel();
        txtFechaIngreso = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JLabel();
        panelRound2 = new com.modelo.ui.PanelRound();
        imageAvatar1 = new com.modelo.ui.ImageAvatar();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        background2 = new com.modelo.ui.Background();
        panelRound4 = new com.modelo.ui.PanelRound();
        codigoBarras = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 1, 4));

        fondoPanelCarnet.setBackground(new java.awt.Color(0, 1, 4));
        fondoPanelCarnet.setRoundBottomLeft(50);
        fondoPanelCarnet.setRoundBottomRight(50);
        fondoPanelCarnet.setRoundTopLeft(50);
        fondoPanelCarnet.setRoundTopRight(50);

        background1.setRoundBottomLeft(25);
        background1.setRoundBottomRight(25);
        background1.setRoundTopLeft(25);
        background1.setRoundTopRight(25);

        panelRound3.setBackground(new java.awt.Color(0, 1, 4));
        panelRound3.setRoundBottomLeft(25);
        panelRound3.setRoundBottomRight(25);
        panelRound3.setRoundTopLeft(25);
        panelRound3.setRoundTopRight(25);
        panelRound3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCodigo2.setFont(new java.awt.Font("Comic Sans MS", 0, 48)); // NOI18N
        txtCodigo2.setForeground(new java.awt.Color(255, 255, 255));
        txtCodigo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCodigo2.setText("Datos");
        panelRound3.add(txtCodigo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 200, 50));

        txtCodigo3.setFont(new java.awt.Font("Century Schoolbook", 0, 22)); // NOI18N
        txtCodigo3.setForeground(new java.awt.Color(255, 255, 255));
        txtCodigo3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtCodigo3.setText("Apellido M:");
        panelRound3.add(txtCodigo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 130, 50));

        txtCodigo4.setFont(new java.awt.Font("Century Schoolbook", 0, 22)); // NOI18N
        txtCodigo4.setForeground(new java.awt.Color(255, 255, 255));
        txtCodigo4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtCodigo4.setText("Ingreso:");
        panelRound3.add(txtCodigo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, 90, 50));

        txtCodigo5.setFont(new java.awt.Font("Century Schoolbook", 0, 22)); // NOI18N
        txtCodigo5.setForeground(new java.awt.Color(255, 255, 255));
        txtCodigo5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtCodigo5.setText("Nombres:");
        panelRound3.add(txtCodigo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 130, 50));

        txtNombres.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtNombres.setForeground(new java.awt.Color(255, 255, 255));
        txtNombres.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        panelRound3.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 210, 50));

        txtCodigo7.setFont(new java.awt.Font("Century Schoolbook", 0, 22)); // NOI18N
        txtCodigo7.setForeground(new java.awt.Color(255, 255, 255));
        txtCodigo7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtCodigo7.setText("Apellido P:");
        panelRound3.add(txtCodigo7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 130, 50));

        txtRango.setFont(new java.awt.Font("Constantia", 1, 30)); // NOI18N
        txtRango.setForeground(new java.awt.Color(255, 255, 255));
        txtRango.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtRango.setText("Administrador");
        panelRound3.add(txtRango, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 240, 50));

        txtCodigo9.setFont(new java.awt.Font("Century Schoolbook", 0, 22)); // NOI18N
        txtCodigo9.setForeground(new java.awt.Color(255, 255, 255));
        txtCodigo9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtCodigo9.setText("Correo:");
        panelRound3.add(txtCodigo9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 90, 50));

        txtCodigo10.setFont(new java.awt.Font("Century Schoolbook", 0, 22)); // NOI18N
        txtCodigo10.setForeground(new java.awt.Color(255, 255, 255));
        txtCodigo10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtCodigo10.setText("DNI:");
        panelRound3.add(txtCodigo10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 130, 50));

        txtDni.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtDni.setForeground(new java.awt.Color(255, 255, 255));
        txtDni.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        panelRound3.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 210, 50));

        txtApellidoP.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtApellidoP.setForeground(new java.awt.Color(255, 255, 255));
        txtApellidoP.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        panelRound3.add(txtApellidoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 210, 40));

        txtApellidoM.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtApellidoM.setForeground(new java.awt.Color(255, 255, 255));
        txtApellidoM.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        panelRound3.add(txtApellidoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 210, 40));

        txtFechaIngreso.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtFechaIngreso.setForeground(new java.awt.Color(255, 255, 255));
        txtFechaIngreso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelRound3.add(txtFechaIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, 190, 40));

        txtCorreo.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(255, 255, 255));
        txtCorreo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        panelRound3.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, 200, 40));

        javax.swing.GroupLayout background1Layout = new javax.swing.GroupLayout(background1);
        background1.setLayout(background1Layout);
        background1Layout.setHorizontalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelRound3, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
                .addContainerGap())
        );
        background1Layout.setVerticalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelRound3, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelRound2.setBackground(new java.awt.Color(0, 1, 4));
        panelRound2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imageAvatar1.setGradientColor1(new java.awt.Color(70, 21, 17));
        imageAvatar1.setGradientColor2(new java.awt.Color(15, 0, 0));
        imageAvatar1.setImage(new javax.swing.ImageIcon(getClass().getResource("/com/img/icons/Logo_ATS.png"))); // NOI18N
        imageAvatar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageAvatar1MouseClicked(evt);
            }
        });
        panelRound2.add(imageAvatar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 93, 90));

        jLabel3.setFont(new java.awt.Font("Restaurant", 1, 70)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Restaurant Ats");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelRound2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 480, 80));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        panelRound2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 13, 80));

        background2.setRoundBottomLeft(25);
        background2.setRoundBottomRight(25);
        background2.setRoundTopLeft(25);
        background2.setRoundTopRight(25);

        panelRound4.setBackground(new java.awt.Color(0, 1, 4));
        panelRound4.setRoundBottomLeft(25);
        panelRound4.setRoundBottomRight(25);
        panelRound4.setRoundTopLeft(25);
        panelRound4.setRoundTopRight(25);
        panelRound4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelRound4.add(codigoBarras, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 180, 180));

        txtCodigo.setFont(new java.awt.Font("Comic Sans MS", 0, 30)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(255, 255, 255));
        txtCodigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtCodigo.setText("0000000");
        panelRound4.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 200, 50));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Codigo");
        panelRound4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 180, 50));

        javax.swing.GroupLayout background2Layout = new javax.swing.GroupLayout(background2);
        background2.setLayout(background2Layout);
        background2Layout.setHorizontalGroup(
            background2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelRound4, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                .addContainerGap())
        );
        background2Layout.setVerticalGroup(
            background2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelRound4, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout fondoPanelCarnetLayout = new javax.swing.GroupLayout(fondoPanelCarnet);
        fondoPanelCarnet.setLayout(fondoPanelCarnetLayout);
        fondoPanelCarnetLayout.setHorizontalGroup(
            fondoPanelCarnetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoPanelCarnetLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(background1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(background2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoPanelCarnetLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(264, 264, 264))
        );
        fondoPanelCarnetLayout.setVerticalGroup(
            fondoPanelCarnetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoPanelCarnetLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(panelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(fondoPanelCarnetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(background1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(background2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoPanelCarnet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoPanelCarnet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void imageAvatar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageAvatar1MouseClicked
        controlador.imageAvatar1MouseClicked(evt);
    }//GEN-LAST:event_imageAvatar1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public com.modelo.ui.Background background1;
    public com.modelo.ui.Background background2;
    public javax.swing.JLabel codigoBarras;
    public com.modelo.ui.PanelRound fondoPanelCarnet;
    public com.modelo.ui.ImageAvatar imageAvatar1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JSeparator jSeparator2;
    public com.modelo.ui.PanelRound panelRound2;
    public com.modelo.ui.PanelRound panelRound3;
    public com.modelo.ui.PanelRound panelRound4;
    public javax.swing.JLabel txtApellidoM;
    public javax.swing.JLabel txtApellidoP;
    public javax.swing.JLabel txtCodigo;
    public javax.swing.JLabel txtCodigo10;
    public javax.swing.JLabel txtCodigo2;
    public javax.swing.JLabel txtCodigo3;
    public javax.swing.JLabel txtCodigo4;
    public javax.swing.JLabel txtCodigo5;
    public javax.swing.JLabel txtCodigo7;
    public javax.swing.JLabel txtCodigo9;
    public javax.swing.JLabel txtCorreo;
    public javax.swing.JLabel txtDni;
    public javax.swing.JLabel txtFechaIngreso;
    public javax.swing.JLabel txtNombres;
    public javax.swing.JLabel txtRango;
    // End of variables declaration//GEN-END:variables
}
