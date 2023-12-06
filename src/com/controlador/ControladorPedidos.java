package com.controlador;

import com.dao.DaoConsumo;
import com.dao.DaoEmpleado;
import com.dao.DaoMesas;
import com.dao.DaoNotificacion;
import com.dao.DaoPedidos;
import com.dao.DaoPersona;
import com.dao.DaoReserva;
import com.modelo.action.Action;
import com.modelo.action.ConsultaDNI;
import com.modelo.action.Tiempo;
import com.modelo.registro.Consumo;
import com.modelo.registro.Persona;
import com.modelo.registro.Reserva;
import com.modelo.ui.UIController;
import com.vista.ModuloPedidos;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class ControladorPedidos {

    ModuloPedidos pedido;
    DaoPedidos dao;
    int mesaSeleccionada = -1;

    public ControladorPedidos(ModuloPedidos modulo) {
        this.pedido = modulo;
        dao = new DaoPedidos();
        modelo = (DefaultTableModel) modulo.tableRoja1.getModel();
//        System.out.println(DaoLogin.getDato("correo"));
    }

    public void initDiseño() {
        UIController.scrollInvisible(pedido.jScrollPane1);
        UIController.scrollInvisible(pedido.jScrollPane2);
        UIController.transparentarTxtField(pedido.txtCantidad);
        initRellenoDatos();
        UIController.rellenarTextFieldSugestion(DaoPersona.rellenarTextFieldSugestion(), pedido.txtCliente);
    }

    public void limpiar() {
        modelo.setRowCount(0);
        pedido.tableRoja1.setModel(modelo);
        pedido.tableRoja1.clearSelection();
        mesaSeleccionada = -1;
        pedido.txtNMesa.setText("Mesa");
        pedido.txtCantidad.setText("");
        pedido.txtCliente.setText("");
    }

    private void initRellenoDatos() {
        String empleado = DaoEmpleado.getConsultarDato("nombre") + " "
                + DaoEmpleado.getConsultarDato("apellido");
        pedido.txtMesero.setText(empleado);
        dao.rellenarComboBox(pedido.comboPlato);
        btnMostrarTodasMesas();
    }

    DefaultTableModel modelo;

    int cantPorduc;
    String nombreProduc;
    int numeroFilaEncontrada;
    boolean productoEntontrado;

    public void agregar() {
        try {
            if (estadoMesa.equalsIgnoreCase("ocupado")) {

                nombreProduc = (String) pedido.comboPlato.getSelectedItem();
                cantPorduc = Integer.parseInt(pedido.txtCantidad.getText());

//                identificarProductoDentroTabla();
                String idReserva = new DaoReserva().indentificarIDReserva(mesaSeleccionada, "activo");
                String platillo = pedido.comboPlato.getSelectedItem().toString();
                int cantidad = Integer.parseInt(pedido.txtCantidad.getText());
                Consumo consumo = new Consumo(idReserva, platillo, cantidad, "esperando", Tiempo.getFecha(), Tiempo.getHora());
                DaoConsumo daoC = new DaoConsumo();
                daoC.ingresarConsumo(consumo);
//                if (productoEntontrado) {
//                    daoC.agregarConsumoExistente(consumo);
//                } else {
//                    daoC.ingresarConsumo(consumo);
//                }
                consultarConsumoXMesa();
            }
        } catch (NumberFormatException | NullPointerException e) {
//            System.out.println("Error: " + e.getMessage());
        }
    }

    private void consultarConsumoXMesa() {
        DaoConsumo.consultarConsumo(pedido.tableRoja1, new DaoReserva().indentificarIDReserva(mesaSeleccionada, "activo"));
        pedido.txtTotal.setText("Total: S/" + totalPagar());
        pedido.txtCliente.setText(DaoReserva.indentificarCliente(mesaSeleccionada));
        pedido.txtCantidad.setText("");
    }

    private void identificarProductoDentroTabla() {
        productoEntontrado = false;
        numeroFilaEncontrada = 0;
        for (int i = 0; i < pedido.tableRoja1.getRowCount(); i++) {
            String nombreDatoTabla = pedido.tableRoja1.getValueAt(i, 0).toString();
            if (nombreProduc.equalsIgnoreCase(nombreDatoTabla)) {
                productoEntontrado = true;
                numeroFilaEncontrada = i;
            }
        }
    }

    public double totalPagar() {
        double totalPagar = 0;
        for (int i = 0; i < pedido.tableRoja1.getRowCount(); i++) {
//            totalPagar += Double.parseDouble(pedido.tableRoja1.getValueAt(i, 3).toString());
            totalPagar += Double.parseDouble(Action.datoFilaColumna(
                    pedido.tableRoja1, i, "total").toString());
        }
        return totalPagar;
    }

    int filaSeleccionada = -1;

    public void clickTabla() {
        filaSeleccionada = pedido.tableRoja1.getSelectedRow();
    }

    public void eliminarPlato() {
        if (filaSeleccionada >= 0) {
            String idReserva = new DaoReserva().indentificarIDReserva(mesaSeleccionada, "activo");
            String platillo = Action.datoFilaColumna(pedido.tableRoja1, filaSeleccionada, "plato").toString();
            int idConsumo = DaoConsumo.getIdConsumos(idReserva).get(filaSeleccionada);
            DaoConsumo.eliminarConsumo(idConsumo);
            consultarConsumoXMesa();
            filaSeleccionada = -1;
        } else {
            Action.mensajeError("Seleccione un producto a eliminar");
        }
    }

    double precio;

    public void verPrecioXplato() {
        String nombrePlato = (String) pedido.comboPlato.getSelectedItem();
        precio = Double.parseDouble(dao.consultaDatoXNombre(nombrePlato, "precio").toString());
        pedido.txtPrecio.setText("Precio: S/" + precio);
    }

    public void btnMostrarTodasMesas() {
        mostrarMesas(new DaoMesas().rellenarCombo());
        limpiar();
    }

    public void btnMostrarMesasDisponibles() {
        mostrarMesas(new DaoMesas().rellenarCombo("Disponible"));
        limpiar();
    }

    public void btnMostrarMesasOcupado() {
        mostrarMesas(new DaoMesas().rellenarCombo("Ocupado"));
        limpiar();
    }

    private void mostrarMesas(ArrayList<Integer> indexMesas) {
        ArrayList<String> mostrarMesas = new ArrayList<>();
        for (Integer me : indexMesas) {
            mostrarMesas.add("Mesa " + me);
        }
        pedido.mesas.setItems(mostrarMesas);
        eventSeleccionarMesa(indexMesas);
    }

    String estadoMesa;

    private void eventSeleccionarMesa(ArrayList<Integer> indexMesas) {
        pedido.mesas.setEvent((int index) -> {
            pedido.txtNMesa.setText(pedido.mesas.getItems().get(index).toString());
            mesaSeleccionada = indexMesas.get(index);
            modelo.setRowCount(0);
            pedido.tableRoja1.setModel(modelo);
            estadoMesa = DaoMesas.estadoMesa(mesaSeleccionada);
            if (estadoMesa.equalsIgnoreCase("disponible")) {
                pedido.txtCliente.setEditable(true);
                pedido.txtCliente.setText("");
                pedido.txtTotal.setText("Total: S/" + totalPagar());
            } else {
                pedido.txtCliente.setEditable(false);
                consultarConsumoXMesa();
            }
        });
    }

    public void abrirMesa() {
        try {
            if (DaoMesas.estadoMesa(mesaSeleccionada).equalsIgnoreCase("ocupado")) {
                Action.mensajeError("Esta mesa ya esta en abierta");
            } else {
                String dni = pedido.txtCliente.getText();
                if (dni.length() == 8) {
                    ConsultaDNI conD = new ConsultaDNI(dni);
                    if (conD.getValido()) {
                        Action.msjC(() -> actionAbrirMesa(), "Confirmar apertura de mesa");
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

        Action.mensaje("Apertura de mesa con exito");
    }

    public void cerrarMesa() {
        try {
            if (DaoMesas.estadoMesa(mesaSeleccionada).equalsIgnoreCase("disponible")) {
                Action.mensajeError("Esta mesa aún no a sido abierta");
            } else {
                String idReserva = new DaoReserva().indentificarIDReserva(mesaSeleccionada, "activo");
                if (DaoPedidos.verificarPedidosEntregados(idReserva)) {
                    Action.msjC(() -> actionCierreMesa(), "Confirmar cierre de mesa");
                } else {
                    Action.mensajeError("Hay pedidos sin entregar");
                }

            }
        } catch (Exception e) {
        }
    }

    private void actionCierreMesa() {
        DaoMesas.cambiarEstadoMesa(mesaSeleccionada, "disponible");
        cerrarRegistroVenta();
        mostrarMesas(new DaoMesas().rellenarCombo());
        limpiar();
    }

    private void registrarReserva() {
        try {
            DaoReserva daoR = new DaoReserva();
            int mesa = mesaSeleccionada;
            int dniCliente = Integer.parseInt(pedido.txtCliente.getText());
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

    private void cerrarRegistroVenta() {
        DaoReserva daoR = new DaoReserva();
        int mesa = mesaSeleccionada;
        daoR.cerrarReserva(mesa, "finalizado", "activo");
        DaoNotificacion.registrarNotificacion("Abrió una mesa");

    }

    private String valorActualID_Reserva() {
        int id = Integer.parseInt(new DaoReserva().valorActualID()) + 1;
        return String.format("%08d", id);
    }

}
