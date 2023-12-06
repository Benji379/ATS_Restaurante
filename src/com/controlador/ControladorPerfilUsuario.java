package com.controlador;

import com.dao.DaoLogin;
import com.dao.DaoUsuario;
import static com.modelo.action.Action.*;
import com.modelo.action.GeneradorQR;
import com.modelo.ui.UIController;
import com.vista.ModuloPerfilUsuario;
import java.awt.Cursor;
import java.awt.event.MouseEvent;
import jnafilechooser.api.JnaFileChooser;

public class ControladorPerfilUsuario {

    ModuloPerfilUsuario p;

    public ControladorPerfilUsuario(ModuloPerfilUsuario p) {
        this.p = p;
    }

    public void initDiseño() {
        DaoUsuario dao = new DaoUsuario(DaoLogin.ID_EMPLEADO);
        p.txtDni.setText(capitalizarNombre(String.valueOf(dao.getDni())));
        p.txtNombres.setText(capitalizarNombre(dao.getNombre()));
        p.txtApellidoP.setText(capitalizarNombre(dao.getApellidoP()));
        p.txtApellidoM.setText(capitalizarNombre(dao.getApellidoM()));
        p.txtCodigo.setText(DaoLogin.ID_EMPLEADO);
        p.txtFechaIngreso.setText(dao.getFechaIngreso().toString());
        GeneradorQR.generateQRCode(DaoLogin.ID_EMPLEADO, p.codigoBarras, 6);
        p.txtRango.setText(capitalizarNombre(dao.getRango()));
        p.txtCorreo.setText(dao.getCorreo());
        p.imageAvatar1.setCursor(new Cursor(12));
    }

    private final String defaultFileName = "Carnet " + DaoLogin.ID_EMPLEADO;

    public void imageAvatar1MouseClicked(MouseEvent evt) {
        if (evt.getClickCount() == 2) {
            javax.swing.SwingUtilities.invokeLater(() -> {
                java.awt.Window parentWindow = javax.swing.SwingUtilities.windowForComponent(p.fondoPanelCarnet);
                if (parentWindow != null) {
                    JnaFileChooser jnaCh = new JnaFileChooser();
                    jnaCh.setDefaultFileName(defaultFileName); // Establecer el nombre por defecto en el campo de texto
                    boolean save = jnaCh.showOpenDialog(parentWindow);
                    if (save) {
                        String fileName = jnaCh.getSelectedFile().getName();
                        if (fileName.isEmpty() || fileName.equals(defaultFileName)) {
                            fileName = defaultFileName;
                        }
                        UIController.capturePanel(p.fondoPanelCarnet, jnaCh.getSelectedFile().getParentFile(), fileName);
                    }
                }
            });
        }
    }
}
