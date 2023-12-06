package com.modelo.ui;

import javax.swing.ImageIcon;

public class Carrusel extends javax.swing.JPanel {

    public Carrusel(String img) {
        initComponents();
        pictureBox1.setImage(new ImageIcon(getClass().getResource("/com/img/icons/" + img + ".jpg")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        pictureBox1 = new slideshow.swing.PictureBox();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pictureBox1, javax.swing.GroupLayout.DEFAULT_SIZE, 910, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pictureBox1, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
        );
    }// </editor-fold>                        


    // Variables declaration - do not modify                     
    private slideshow.swing.PictureBox pictureBox1;
    // End of variables declaration                   
}
