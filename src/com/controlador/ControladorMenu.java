package com.controlador;

import com.dao.DaoMenu;
import com.modelo.action.Action;
import static com.modelo.action.Action.*;
import com.modelo.action.Tiempo;
import com.modelo.ui.UIController;
import com.modelo.registro.Menu;
import com.vista.ModuloMenu;
import java.awt.HeadlessException;
import javax.swing.table.DefaultTableModel;

public class ControladorMenu {

    ModuloMenu menu;
    DaoMenu dao;
    DefaultTableModel modelo;
    int filaSeleccionada = -1;

    public ControladorMenu(ModuloMenu me) {
        this.menu = me;
        dao = new DaoMenu();
    }

    public void initDiseño() {
        UIController.removerBordeBlanco(menu.jScrollPane1);
//        UIController.scrollInvisible(menu.jScrollPane1);
        UIController.textAreaInivisible(menu.jTextArea1, menu.jScrollPane2);
        UIController.transparentarTxtField(menu.txtId, menu.txtNombre, menu.txtPrecio);
        limpiar();
    }

    public void consultar() {
        dao.consulta(modelo, menu.tableCafe1);
    }

    public void modificar() {
        if (filaSeleccionada < 0) {
            mensajeError("Seleccione una fila");
        } else {
            try {
                Action.msjC(() -> actionModificar(), "Confirmar modificacion");
            } catch (NumberFormatException e) {
                mensajeError("Error Formato de datos");
            }
        }
    }

    private void actionModificar() {
        String nombre = menu.txtNombre.getText();
        double precio = Double.parseDouble(menu.txtPrecio.getText());
        String disponible = menu.txtEstado.getText();
        String descripcion = menu.jTextArea1.getText();
        dao.modificarMenu(nombre, precio, disponible, descripcion);
        limpiar();
        Action.mensaje("Datos modificados exitosamente");
    }

    public void borrar() {
        if (filaSeleccionada < 0) {
            mensajeError("Seleccione una fila");
        } else {
            try {
                Action.msjC(() -> actionBorrar(), "Confirmar eliminacion");
            } catch (HeadlessException e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }
    }

    private void actionBorrar() {
        String nombrePlato = menu.txtNombre.getText();
        dao.eliminarMenu(nombrePlato);
        limpiar();
        Action.mensaje("Eliminacion completada");
    }

    public void registrar() {
        try {
            String nombre = menu.txtNombre.getText();
            if (!dao.existePlato(nombre)) {
                Action.msjC(() -> actionRegistrar(nombre), "Confirmar registro");
            } else {
                mensajeError("Platillo existente");
            }

        } catch (NumberFormatException e) {
            mensajeError("Ingreso erroneo");
        }
    }

    private void actionRegistrar(String nombre) {
        double precio = Double.parseDouble(menu.txtPrecio.getText());
        String diponibilidad = menu.txtEstado.getText();
        String descripcion = menu.jTextArea1.getText();
        Menu plato = new Menu(nombre, precio, diponibilidad, descripcion, Tiempo.getFecha(), Tiempo.getHora());
        dao.registrarMenu(plato);
        limpiar();
        Action.mensaje("Solicitud de nuevo platillo enviada");
    }

    public void clickTabla() {
        filaSeleccionada = menu.tableCafe1.getSelectedRow();
        menu.txtId.setText(datoColumna("N"));
        menu.txtNombre.setText(datoColumna("nombre"));
        menu.txtPrecio.setText(datoColumna("precio"));
        menu.txtEstado.setText(datoColumna("estado"));

        if (datoColumna("estado").equalsIgnoreCase("disponible")) {
            menu.btnSeleccionarDisponiblidad.setSelected(true);
        } else {
            menu.btnSeleccionarDisponiblidad.setSelected(false);
        }
        menu.jTextArea1.setText(datoColumna("Descripcion"));
    }

    private String datoColumna(String nameColumnaTabla) {
        String dato = datoFilaColumna(menu.tableCafe1, filaSeleccionada, nameColumnaTabla).toString();
        return dato;
    }

    public void limpiar() {
        menu.txtNombre.setText("");
        menu.txtPrecio.setText("0.0");
        menu.btnSeleccionarDisponiblidad.setSelected(true);
        menu.txtEstado.setText("disponible");
        menu.jTextArea1.setText("");
        menu.tableCafe1.clearSelection();
        filaSeleccionada = -1;
        consultar();
        menu.txtId.setText(String.valueOf(menu.tableCafe1.getRowCount() + 1));
    }

    public void btnSeleccionarDisponiblidadMouseClicked() {
        if (menu.btnSeleccionarDisponiblidad.isSelected()) {
            menu.txtEstado.setText("disponible");
        } else {
            menu.txtEstado.setText("no disponible");
        }
    }

}
