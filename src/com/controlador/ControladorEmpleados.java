package com.controlador;

import com.dao.DaoEmpleado;
import com.dao.DaoNotificacion;
import com.dao.DaoPersona;
import com.modelo.action.Action;
import com.modelo.action.ConsultaDNI;
import com.modelo.action.Tiempo;
import com.modelo.ui.UIController;
import com.modelo.registro.Empleado;
import com.modelo.registro.Persona;
import com.vista.ModuloEmpleados;
import java.awt.Cursor;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import static com.modelo.action.Action.mensajeError;

public class ControladorEmpleados {

    private final ModuloEmpleados em;
    private final DaoEmpleado daoEmpleado;
    private final DaoPersona daoPersona;
    private int filaSeleccionada;

    public ControladorEmpleados(ModuloEmpleados em) {
        this.em = em;
        filaSeleccionada = -1;
        daoEmpleado = new DaoEmpleado();
        daoPersona = new DaoPersona();
    }

    public void initDiseño() {
        initTextFields();
        em.btnSeleccionado.setCursor(new Cursor(12));
        em.txtFecha.setText(Tiempo.getFecha().toString());
//        UIController.scrollInvisible(em.jScrollPane2);
        limpiar();
    }

    private void initTextFields() {
        UIController.transparentarTxtField(em.txtContraseña,
                em.txtDni, em.txtNombre, em.txtApellido,
                em.txtCorreo, em.txtFecha, em.txtEstado);
    }

    public void consultar() {
        daoEmpleado.consultar(em.tablaEmpleados);
    }

    public void registrar() {
        try {
            int dni = Integer.parseInt(em.txtDni.getText());
            String correo = em.txtCorreo.getText();
            String cargo = (String) em.comboBox.getSelectedItem();
            String estado = em.txtEstado.getText();
            String contraseña = em.txtContraseña.getText();
            Persona empleado = new Empleado(cargo, correo, dni, estado, contraseña);
            Action.msjC(() -> actionRegistrar(dni, correo, empleado), "Confirmar registro");
        } catch (HeadlessException | NumberFormatException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    private void actionRegistrar(int dni, String correo, Persona empleado) {
        if (ingresosValidos(dni, correo)) {
            DaoEmpleado a = new DaoEmpleado();
            a.insertEmpleado((Empleado) empleado);
            limpiar();
        }
    }

    public void modificar() {
        if (filaSeleccionada < 0) {
            mensajeError("Seleccione una fila");
        } else {
            String codigo = datoFilaColumna("codigo");
            String correo = em.txtCorreo.getText();
            String contraseña = em.txtContraseña.getText();
            String estado = em.txtEstado.getText();
            String rango = (String) em.comboBox.getSelectedItem();
            if (!Action.HayVacios(codigo, correo, contraseña, estado, rango)) {
                Action.msjC(() -> actionModificar(codigo, correo, contraseña, rango, estado), "Confirmar modificacion");
            } else {
                mensajeError("Campos vacios");
            }
        }
    }

    private void actionModificar(String codigo, String correo, String contraseña, String rango, String estado) {
        daoEmpleado.modificar(codigo, correo, contraseña, rango, estado);
        limpiar();
    }

    public void eliminar() {
        if (filaSeleccionada < 0) {
            mensajeError("Seleccione una fila");
        } else {
            String codigo = datoFilaColumna("codigo");
            int dni = Integer.parseInt(datoFilaColumna("dni"));
            Action.msjC(() -> actionEliminar(codigo, dni), "Confirmacion de Eliminacion");
        }
    }

    private void actionEliminar(String codigo, int dni) {
        daoEmpleado.eliminarEmpleado(codigo);
        daoPersona.eliminarPersona(dni);
        limpiar();
        Action.mensaje("Eliminacion exitosa");
    }

    private boolean ingresosValidos(int dni, String correo) {

        String dniText = String.valueOf(dni);
        ConsultaDNI consultaDni = new ConsultaDNI(dni);
        if (!dniText.equals("")) {
            if (!correo.equals("")) {
                if (dniText.length() == 8) {
                    if (consultaDni.getValido()) {
                        if (!daoEmpleado.usuarioExiste(dni)) {
                            return true;
                        } else {
                            mensajeError("Usuario existente");
                        }
                    } else {
                        mensajeError("El dni no existe o no pertenece a un mayor de edad");
                    }
                } else {
                    mensajeError("Ingrese un dni Válido");
                }
            } else {
                mensajeError("Complete el campo del Correo");
            }
        } else {
            mensajeError("Complete el campo del DNI");
        }
        return false;
    }

    public void clickTabla() {
        filaSeleccionada = em.tablaEmpleados.getSelectedRow();
        String codigo = datoFilaColumna("codigo");
        String cargo = datoFilaColumna("cargo");
        String estado = datoFilaColumna("estado");
        em.jlbCodigo.setText("Codigo: " + codigo);
        em.txtDni.setText(datoFilaColumna("dni"));
        em.txtNombre.setText(datoFilaColumna("nombre"));
        em.txtApellido.setText(datoFilaColumna("apellido"));
        em.txtCorreo.setText(datoFilaColumna("correo"));
        em.txtFecha.setText(datoFilaColumna("fecha"));
        em.txtContraseña.setText(datoFilaColumna("contraseña"));
        em.comboBox.setSelectedItem(cargo);
        if (estado.equalsIgnoreCase("activo")) {
            em.btnSeleccionado.setSelected(true);
        } else {
            em.btnSeleccionado.setSelected(false);
        }
        em.txtDni.setEditable(false);
    }

    private String datoFilaColumna(String nameColumna) {
        return Action.datoFilaColumna(em.tablaEmpleados, filaSeleccionada, nameColumna).toString();
    }

    public void consultarDniTxt() {
        try {
            int dni = Integer.parseInt(em.txtDni.getText());
            if (em.txtDni.getText().length() == 8) {
                ConsultaDNI c = new ConsultaDNI(dni);
                if (c.getValido()) {
                    em.txtNombre.setText(c.getNombres());
                    em.txtApellido.setText(c.getApellidos());
                } else {
                    Action.mensajeError("Dni no existe");
                }
            }
        } catch (NumberFormatException e) {
        }
    }

    public void limpiar() {
        UIController.limpiarTxtField(em.txtContraseña, em.txtDni, em.txtNombre,
                em.txtApellido, em.txtCorreo);
        em.comboBox.setSelectedIndex(0);
        em.btnSeleccionado.setSelected(true);
        em.txtEstado.setText("activo");
        filaSeleccionada = -1;
        em.tablaEmpleados.clearSelection();
        em.jlbCodigo.setText("");
        consultar();
        em.txtDni.setEditable(true);
        em.txtFecha.setText(Tiempo.getFecha().toString());
        em.jlbCodigo.setText("Codigo:");
    }

    public void imprimirCodigo() {
        try {
            String cargo = (String) em.comboBox.getSelectedItem();
            String dni = em.txtDni.getText();
            String apellidos = em.txtApellido.getText();
            String cod = Empleado.generarCodigo(cargo, Integer.parseInt(dni), apellidos);
            em.jlbCodigo.setText("Codigo: " + cod);
        } catch (NumberFormatException e) {
//            System.out.println("ERROR: " + e.getMessage());
        }
    }

    public void txtDniTypet(KeyEvent evt) {
        UIController.limitacionNumeros(em.txtDni, evt, 8);
        if (em.txtDni.getText().length() < 8) {
            em.txtNombre.setText("");
            em.txtApellido.setText("");
        }
    }

    public void txtDniKeyReleased(KeyEvent evt) {
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            consultarDniTxt();
        }
    }

    public void btnSeleccionadoMouseClicked(MouseEvent evt) {
        if (em.btnSeleccionado.isSelected()) {
            em.txtEstado.setText("activo");
        } else {
            em.txtEstado.setText("suspendido");
        }
    }
}
