package com.controlador;

import com.dao.DaoLogin;
import com.glasspanepopup.GlassPanePopup;
import com.modelo.action.Action;
import com.modelo.ui.UIController;
import com.vista.FrmPrincipal;
import com.vista.FrmLogin;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JPanel;

public class ControladorLogin {

    FrmLogin lo;

    public ControladorLogin(FrmLogin lo) {
        this.lo = lo;
    }

    public void initDiseño() {
        lo.setLocationRelativeTo(null);
        lo.setBackground(new Color(0, 0, 0, 0));
        UIController.transparentarTxtField(lo.txtUsuario, lo.txtContraseña);
        lo.setIconImage(java.awt.Toolkit.getDefaultToolkit().getImage(getClass().getResource("/com/img/icons/Logo_ATS.png")));
        lo.setTitle("ATS Restaurant - Login");
        GlassPanePopup.install(lo);
        UIController d = new UIController();
        d.mostrarTextoAnimado(lo.jlbLogin, "Login", 120);
    }

    int LayoutX;
    int LayoutY;

    public void BarraTituloMouseDragged(MouseEvent evt) {
        lo.setLocation(evt.getXOnScreen() - LayoutX, evt.getYOnScreen() - LayoutY);
    }

    public void BarraTituloMousePressed(MouseEvent evt) {
        if (evt.getButton() == java.awt.event.MouseEvent.BUTTON1) {
            LayoutX = evt.getX();
            LayoutY = evt.getY();
        }
    }

    FrmPrincipal p;

    public void btnIngresar() {
        String idEmpleado = lo.txtUsuario.getText();
        String contraseña = lo.txtContraseña.getText();
        DaoLogin dao = new DaoLogin(idEmpleado, contraseña);
        if (DaoLogin.getDato("estado").equalsIgnoreCase("activo")) {
            if (dao.ingresar()) {
                p = new FrmPrincipal();
                p.setVisible(true);
                lo.hide();
                String rango = DaoLogin.getDato("cargo");
                cambiarVisibilidad(p, rango);
            }
        }else{
            Action.mensajeError("Usuario inactivo");
        }
    }

    public static void cambiarVisibilidad(FrmPrincipal p, String rango) {
        ArrayList<JPanel> todosPaneles = new ArrayList<>();
        todosPaneles.add(p.btnCaja);
        todosPaneles.add(p.btnCambiarCuenta);
        todosPaneles.add(p.btnCocina);
        todosPaneles.add(p.btnConfig);
        todosPaneles.add(p.btnEmpleados);
        todosPaneles.add(p.btnFinanzas);
        todosPaneles.add(p.btnHome);
        todosPaneles.add(p.btnMenu);
        todosPaneles.add(p.btnMsg);
        todosPaneles.add(p.btnPedidos);
        todosPaneles.add(p.btnReservas);
        mostrarPaneles(todosPaneles);
        switch (rango) {
            case "administrador":
                p.txtRango.setText("Admin");
                break;
            case "mesero":
                quitarModulos(p.btnCocina, p.btnCaja, p.btnConfig, p.btnFinanzas, p.btnMenu, p.btnEmpleados);
                p.txtRango.setText("Mesero");
                break;
            case "cocina":
                quitarModulos(p.btnPedidos, p.btnEmpleados, p.btnReservas, p.btnCaja, p.btnConfig, p.btnFinanzas, p.btnHome);
                p.txtRango.setText("Cocina");
                break;
            case "caja":
                quitarModulos(p.btnPedidos, p.btnCocina, p.btnEmpleados, p.btnReservas, p.btnConfig, p.btnMenu);
                p.txtRango.setText("Caja");
                break;
        }
    }

    private static void mostrarPaneles(ArrayList<JPanel> todosPaneles) {

        for (JPanel pan : todosPaneles) {
            pan.setVisible(true);
        }

    }

    private static void quitarModulos(JPanel... paneles) {
        for (JPanel pa : paneles) {
            pa.setVisible(false);
        }
    }

}
