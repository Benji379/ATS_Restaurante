package com.controlador;

import com.dao.DaoNotificacion;
import com.glasspanepopup.DefaultOption;
import com.glasspanepopup.GlassPanePopup;
import com.modelo.action.Action;
import com.vista.Notifications;
import com.modelo.ui.UIController;
import com.vista.FrmLogin;
import com.vista.FrmPrincipal;
import com.vista.ModuloHome;
import javax.swing.JPanel;

public class ControladorFrmPrincipal {

    FrmPrincipal principal;

    public ControladorFrmPrincipal(FrmPrincipal principal) {
        this.principal = principal;
    }

    public void initDiseño() {
        principal.setIconImage(java.awt.Toolkit.getDefaultToolkit().getImage(getClass().getResource("/com/img/icons/Logo_ATS.png")));
        principal.setLocationRelativeTo(null);
        UIController.removerBordeBlanco(principal.jScrollPane1);
        initConfig();
        MostrarPanel(new ModuloHome());
        principal.setTitle("ATS Restaurant - Inicio");
        GlassPanePopup.install(principal);
        DaoNotificacion.actualizarNotificacion(() -> mostrarCantidadNoti());
    }

    private void mostrarCantidadNoti() {
        principal.btnNotificacion.setText("" + DaoNotificacion.cantidadNotificacionNoVista());
    }

    private void initConfig() {
        configBotones(principal.btnCocina, principal.btnEmpleados, principal.btnCaja, principal.btnReservas,
                principal.btnPedidos, principal.btnConfig, principal.btnMsg
        );
        configBotones(
                principal.btnHome, principal.btnMenu, principal.btnFinanzas,
                principal.btnCambiarCuenta
        );
        principal.perfil.setCursor(new java.awt.Cursor(12));
    }

    private void configBotones(JPanel... panel) {
        for (JPanel p : panel) {
            UIController.setPanelBackgroundColors(p, "#7B1511", "#621511");
        }
    }

    public void MostrarPanel(JPanel panel) {
        UIController.MostrarPanel(principal.CONTENEDOR, panel);
        UIController.scrollToTop(principal.jScrollPane1);
    }

    public void cambiarCuenta() {
        Action.msjC(() -> cambC(), "Confirmar cambio de cuenta");
    }

    private void cambC() {
        principal.setVisible(false);
        FrmLogin f = new FrmLogin();
        f.setVisible(true);
    }

    public void confirmarCierre() {
        Action.msjC(() -> System.exit(0), "Confirmar cierre del programa");
    }

    public void cmdActionPerformed(java.awt.event.ActionEvent evt) {
        GlassPanePopup.showPopup(new Notifications(DaoNotificacion.notificaciones()), new DefaultOption());
        principal.btnNotificacion.setText("0");
    }

}
