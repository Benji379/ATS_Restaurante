package com.controlador;

import com.dao.DaoEmpleado;
import com.dao.DaoMesas;
import com.dao.DaoNotificacion;
import com.dao.DaoPersona;
import com.dao.DaoReserva;
import com.modelo.action.Action;
import com.modelo.action.ConsultaDNI;
import com.modelo.action.Tiempo;
import com.modelo.registro.Persona;
import com.modelo.registro.Reserva;
import com.modelo.ui.UIController;
import com.vista.ModuloReserva;
import java.util.ArrayList;
import java.sql.Date;

public class ControladorReserva {

    ModuloReserva r;

    public ControladorReserva(ModuloReserva r) {
        this.r = r;
    }

    public void initDiseño() {
        mostrarMesas(new DaoMesas().rellenarCombo());
        UIController.scrollInvisible(r.jScrollPane1);
        String empleado = DaoEmpleado.getConsultarDato("nombre") + " "
                + DaoEmpleado.getConsultarDato("apellido");
        r.txtMesero.setText(empleado);
        UIController.rellenarTextFieldSugestion(DaoPersona.rellenarTextFieldSugestion(), r.txtCliente);
    }

    private void mostrarMesas(ArrayList<Integer> indexMesas) {
        ArrayList<String> mostrarMesas = new ArrayList<>();
        for (Integer me : indexMesas) {
            mostrarMesas.add("Mesa " + me);
        }
        r.mesas.setItems(mostrarMesas);
        eventSeleccionarMesa(indexMesas);
    }

    String estadoMesa;
    int mesaSeleccionada = -1;

    private void eventSeleccionarMesa(ArrayList<Integer> indexMesas) {
        r.mesas.setEvent((int index) -> {
            r.txtNMesa.setText("" + indexMesas.get(index));
            mesaSeleccionada = indexMesas.get(index);
            estadoMesa = DaoMesas.estadoMesa(mesaSeleccionada);
            if (estadoMesa.equalsIgnoreCase("disponible")) {
                r.txtCliente.setEditable(true);
                r.txtCliente.setText("");
            } else {
                r.txtCliente.setEditable(false);
            }
        });
    }

    public void mostrarTodasMesas() {
        mostrarMesas(new DaoMesas().rellenarCombo());
    }

    public void mostrarDisponibles() {
        mostrarMesas(new DaoMesas().rellenarCombo("Disponible"));
    }

    public void mostrarOcupadas() {
        mostrarMesas(new DaoMesas().rellenarCombo("Ocupado"));
    }

    public void abrirMesa() {
        try {
            if (DaoMesas.estadoMesa(mesaSeleccionada).equalsIgnoreCase("ocupado")) {
                Action.mensajeError("Esta mesa ya esta en abierta");
            } else {
                String dni = r.txtCliente.getText();
                if (dni.length() == 8) {
                    ConsultaDNI conD = new ConsultaDNI(dni);
                    if (conD.getValido()) {
                        Action.msjC(() -> actionAbrirMesa(), "Confirmar reserva de mesa");
                    } else {
                        Action.mensajeError("Ingrese un dni válido");
                    }
                } else {
                    Action.mensajeError("El dni tiene 8 digitos");
                }
            }
        } catch (Exception e) {
        }
    }

    private void actionAbrirMesa() {
        registrarReserva();
        DaoMesas.cambiarEstadoMesa(mesaSeleccionada, "ocupado");
        mostrarMesas(new DaoMesas().rellenarCombo());
        estadoMesa = DaoMesas.estadoMesa(mesaSeleccionada);
        DaoNotificacion.registrarNotificacion("Abrió una mesa");

        Action.mensaje("Mesa reservada");
    }

    private void registrarReserva() {
        try {
            DaoReserva daoR = new DaoReserva();
            int mesa = mesaSeleccionada;
            int dniCliente = Integer.parseInt(r.txtCliente.getText());
            String idReserva = valorActualID_Reserva();
            String estado = "activo";
            Date fecha = Action.obtenerFechaActual();
            Persona per = new Persona(dniCliente);
            DaoPersona daoP = new DaoPersona();
            if (!DaoPersona.existePersona(dniCliente)) {
                daoP.insertPersona(per);
            }
            Reserva reserva = new Reserva(idReserva, dniCliente, mesa, estado, fecha, Tiempo.getHora());
            daoR.abrirReserva(reserva);
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private String valorActualID_Reserva() {
        int id = Integer.parseInt(new DaoReserva().valorActualID()) + 1;
        return String.format("%08d", id);
    }
}
