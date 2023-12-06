package com.controlador;

import com.dao.DaoLogin;
import com.vista.ModuloHome;
import com.vista.FrmPrincipal;
import com.modelo.ui.Carrusel;
import com.modelo.ui.UIController;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class ControladorHome {

    ModuloHome h;

    public ControladorHome(ModuloHome h) {
        this.h = h;
    }


    public void initDiseño() {
        h.slideshow1.initSlideshow(new Carrusel("imgCarrusel1"),
                new Carrusel("imgCarrusel2"),
                new Carrusel("imgCarrusel3"));
        String rango = DaoLogin.getDato("cargo");
        if (!rango.equalsIgnoreCase("administrador")) {
            h.comboVista.setVisible(false);
        }
        UIController d = new UIController();
        d.mostrarTextoAnimado(h.jlbTittle, "ATS Restaurant", 120);
        ModuloHome.combobox1.addActionListener((java.awt.event.ActionEvent evt) -> {
            String cargo = ModuloHome.combobox1.getSelectedItem().toString();
            JFrame parentFrame = (JFrame) SwingUtilities.getWindowAncestor(h);
            ControladorLogin.cambiarVisibilidad((FrmPrincipal) parentFrame, cargo);
        });

    }

}
