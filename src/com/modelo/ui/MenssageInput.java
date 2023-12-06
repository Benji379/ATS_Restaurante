package com.modelo.ui;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;

public class MenssageInput extends javax.swing.JPanel {

    public MenssageInput(String titulo) {
        initComponents();
        txtTituloMensaje.setText(titulo);
        setOpaque(false);
        input.setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fill(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 15, 15));
        g2.dispose();
        super.paintComponent(grphcs);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        txtTituloMensaje = new javax.swing.JLabel();
        cmdOK = new com.modelo.ui.Button();
        input = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(25, 25, 25, 25));

        txtTituloMensaje.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        txtTituloMensaje.setForeground(new java.awt.Color(80, 80, 80));
        txtTituloMensaje.setText("Your Message Title Dialog Custom");

        cmdOK.setBackground(new java.awt.Color(153, 0, 0));
        cmdOK.setForeground(new java.awt.Color(255, 255, 255));
        cmdOK.setText("Confirmar");

        input.setBackground(new java.awt.Color(251, 251, 251));
        input.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        input.setForeground(new java.awt.Color(80, 80, 80));
        input.setBorder(null);
        input.setSelectionColor(new java.awt.Color(153, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtTituloMensaje)
                                                .addGap(0, 81, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(input)
                                                .addContainerGap())))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmdOK, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(txtTituloMensaje)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmdOK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>                        

    public void eventOK(ActionListener event) {
        cmdOK.addActionListener(event);
    }

    public String getInput() {
        return input.getText();
    }

    // Variables declaration - do not modify                     
    private com.modelo.ui.Button cmdOK;
    private javax.swing.JTextField input;
    private javax.swing.JLabel txtTituloMensaje;
    // End of variables declaration                   
}
