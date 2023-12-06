package com.controlador;

import com.dao.DaoConsumo;
import com.dao.DaoEmpleado;
import com.dao.DaoFactura;
import com.dao.DaoLogin;
import com.dao.DaoMesas;
import com.dao.DaoReserva;
import com.glasspanepopup.GlassPanePopup;
import com.modelo.action.Action;
import com.modelo.action.CorreoUtils;
import com.modelo.action.GeneradorFacturaPDF;
import com.modelo.action.Tiempo;
import com.modelo.registro.Factura;
import com.modelo.ui.MenssageInput;
import com.modelo.ui.UIController;
import com.vista.ModuloCaja;
import java.awt.event.ActionEvent;
import java.awt.print.PrinterException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class ControladorCaja {

    ModuloCaja c;

    public ControladorCaja(ModuloCaja c) {
        this.c = c;
    }

    String empleado;

    public void initDiseño() {
        UIController.removerBordeBlanco(c.jScrollPaneTextArea);
        UIController.scrollInvisible(c.jScrollPane1);
        UIController.scrollInvisible(c.jScrollPane2);
        UIController.transparentarTxtField(c.txtEfectivo, c.txtVuelto, c.txtSubTotal, c.txtIGV, c.txtTotal);
        clickComboTipoPago();
        empleado = DaoEmpleado.getConsultarDato("nombre") + " "
                + DaoEmpleado.getConsultarDato("apellido");
        c.txtCajero.setText(empleado);
        limpiar();
    }

    public void enviarCorreoFactura() {
        MenssageInput obj = new MenssageInput("Ingrese un correo");
        obj.eventOK((ActionEvent ae) -> {
            enviar(obj.getInput());
            GlassPanePopup.closePopupLast();
        });
        GlassPanePopup.showPopup(obj);
    }

    public void enviar(String emailCliente) {
        String idFactura = valorActualID_Factura();
        String idReserva = new DaoReserva().indentificarIDReserva(mesaSeleccionada, "finalizado");
        String empleadoo = DaoLogin.ID_EMPLEADO;
        String dniClientee = String.valueOf(dniCliente);
        String fecha = Tiempo.getFecha().toString();
        GeneradorFacturaPDF.EnviarCorreoPdf(idFactura, empleadoo, dniClientee, emailCliente, DaoConsumo.getProductosLista(idReserva), fecha);
        Action.mensaje("Correo enviado al "+emailCliente);
    }

    private void clickComboTipoPago() {
        c.comboTipoPago.addActionListener((java.awt.event.ActionEvent evt) -> {
            if (c.comboTipoPago.getSelectedItem().toString().equalsIgnoreCase("tarjeta")) {
                Efectivo = Action.redondearDouble(total);
                vuelto = Action.redondearDouble(Efectivo - total);
                c.txtEfectivo.setEditable(false);
            } else {
                try {
                    Efectivo = Action.redondearDouble(Double.parseDouble(c.txtEfectivo.getText()));
                    vuelto = Action.redondearDouble(Efectivo - total);
                    c.txtEfectivo.setEditable(true);
                } catch (NumberFormatException e) {
//                    System.out.println("ERROR: " + e.getMessage());
                }
            }
            c.txtEfectivo.setText("" + Efectivo);
            c.txtVuelto.setText("" + vuelto);
            bill_print();
        });
    }

    public void limpiar() {
        subTotal = 0;
        Efectivo = 0;
        total = 0;
        vuelto = 0;
        montoIGV = 0;
        dniCliente = 0000000;
        c.txtEfectivo.setEditable(true);
        c.tablaConsumo.clearSelection();
        DefaultTableModel modelo = (DefaultTableModel) c.tablaConsumo.getModel();
        modelo.setRowCount(0);
        c.tablaConsumo.setModel(modelo);
        mostrarMesas(DaoFactura.mesasFinalizadas());
        bill_print();
        c.txtSubTotal.setText("");
        c.txtTotal.setText("");
        c.txtEfectivo.setText("");
        c.txtVuelto.setText("");
        c.txtIGV.setText("");
    }

    public void btnFinalizarActionPerformed() {
        try {
            if (Efectivo >= total) {
                Action.msjC(() -> actionFinalizar(), "Confirmar registro de factura");
            } else {
                Action.mensajeError("Errror de Efectivo: Ingrese una cantidad válida");
            }
        } catch (Exception e) {
        }
    }

    private void actionFinalizar() {
        String idFactura = valorActualID_Factura();
        String idReserva = new DaoReserva().indentificarIDReserva(mesaSeleccionada, "finalizado");
        String cajero = DaoLogin.ID_EMPLEADO;
        String tipoPago = c.comboTipoPago.getSelectedItem().toString();
        double totall = subTotal;
        Date fecha = Action.obtenerFechaActual();
        Factura factura = new Factura(idFactura, idReserva, cajero, tipoPago, totall, fecha, Tiempo.getHora());
        DaoFactura.registrarFactura(factura);
        DaoMesas.cambiarEstadoMesa(mesaSeleccionada, "disponible");
        cerrarRegistroVenta();
        Action.mensaje("Compra finalizada con exito");
        limpiar();
    }

    private String valorActualID_Factura() {
        int id = Integer.parseInt(DaoFactura.valorActualID()) + 1;
        return String.format("%08d", id);
    }

    private void cerrarRegistroVenta() {
        DaoReserva daoR = new DaoReserva();
        int mesa = mesaSeleccionada;
        daoR.cerrarReserva(mesa, "pagado", "finalizado");
    }

    private void mostrarMesas(ArrayList<Integer> indexMesas) {
        ArrayList<String> mostrarMesas = new ArrayList<>();
        for (Integer me : indexMesas) {
            mostrarMesas.add("Mesa " + me);
        }
        c.mesas.setItems(mostrarMesas);
        eventSeleccionarMesa(indexMesas);
    }

    public void btnImprimirActionPerformed() {
        try {
            c.bill.print();
        } catch (PrinterException e) {

        }
    }

    int mesaSeleccionada = -1;

    private void eventSeleccionarMesa(ArrayList<Integer> indexMesas) {
        c.mesas.setEvent((int index) -> {
            mesaSeleccionada = indexMesas.get(index);
            DefaultTableModel modelo = (DefaultTableModel) c.tablaConsumo.getModel();
            modelo.setRowCount(0);
            c.tablaConsumo.setModel(modelo);
            vuelto = 0;
            Efectivo = 0;
            rellenarDatos(mesaSeleccionada);
            bill_print();
        });
    }

    double montoIGV;

    private void rellenarDatos(int mesa) {
        DaoFactura daoF = new DaoFactura(mesa);
        daoF.consultar(c.tablaConsumo);
        subTotal = daoF.getSubTotal();
        montoIGV = Action.redondearDouble(subTotal * IGV);
        total = Action.redondearDouble(subTotal + montoIGV);
        dniCliente = daoF.getDniCliente();
        c.txtSubTotal.setText("" + subTotal);
        c.txtIGV.setText("" + montoIGV);
        c.txtTotal.setText("" + total);
        c.txtEfectivo.setText("" + Efectivo);
        c.txtVuelto.setText("" + vuelto);
        c.txtCliente.setText("" + daoF.getDniCliente());
    }

    public void generarVuelto() {
        try {
            Efectivo = Double.parseDouble(c.txtEfectivo.getText());
            vuelto = Action.redondearDouble(Efectivo - total);
            c.txtVuelto.setText("" + vuelto);
        } catch (NumberFormatException e) {
            vuelto = 0.0;
        }
        bill_print();
    }

    public void bill_print() {
        try {
            c.bill.setText("\t\t      RESTAURANTE ATS  \n");
            c.bill.setText(c.bill.getText() + "\t\t Av.Bolivia, Mz w.lt 10, \n");
            c.bill.setText(c.bill.getText() + "\t\t    +51 984 421 382 \n");
            c.bill.setText(c.bill.getText() + "------------------------------------------------\n");
            c.bill.setText(c.bill.getText() + String.format("%-16s%-15s%-10s%-10s", "Producto.", "Precio", "Cant", "Total") + "\n");
            c.bill.setText(c.bill.getText() + "------------------------------------------------\n");

            DefaultTableModel df = (DefaultTableModel) c.tablaConsumo.getModel();
            for (int i = 0; i < c.tablaConsumo.getRowCount(); i++) {

                String producto = df.getValueAt(i, 0).toString();
                String precio = df.getValueAt(i, 1).toString();
                String cantidad = df.getValueAt(i, 2).toString();
                String monto = df.getValueAt(i, 3).toString();

                // Format the text with specified width for each field
                String formattedLine = String.format("%-25s%-8s%-10s%-10s", truncateLongText(producto, 30), cantidad, precio, monto);
                c.bill.setText(c.bill.getText() + formattedLine + "\n");
            }
            c.bill.setText(c.bill.getText() + "------------------------------------------------\n");
            c.bill.setText(c.bill.getText() + String.format("%-32s%s", "SubTotal  :", subTotal) + "\n");
            c.bill.setText(c.bill.getText() + String.format("%-32s%s", "IGV       :", montoIGV) + "\n");
            c.bill.setText(c.bill.getText() + String.format("%-32s%s", "Total     :", total) + "\n");
            c.bill.setText(c.bill.getText() + String.format("%-32s%s", "Efectivo  :", Efectivo) + "\n");
            c.bill.setText(c.bill.getText() + String.format("%-32s%s", "Vuelto    :", vuelto) + "\n");
            c.bill.setText(c.bill.getText() + "------------------------------------------------\n");
            c.bill.setText(c.bill.getText() + "------------------------------------------------\n");
            c.bill.setText(c.bill.getText() + String.format("%-20s%s", "Trabajador:", empleado) + "\n");
            c.bill.setText(c.bill.getText() + "------------------------------------------------\n");
            c.bill.setText(c.bill.getText() + String.format("%-20s%s", "Cliente       :", dniCliente) + "\n");
            c.bill.setText(c.bill.getText() + "================================================\n");
            c.bill.setText(c.bill.getText() + "                Gracias por su compra...!" + "\n");
            c.bill.setText(c.bill.getText() + "------------------------------------------------\n");
        } catch (Exception e) {
        }
    }

    final double IGV = 0.18;
    double subTotal;
    double total;
    double Efectivo;
    double vuelto;
    int dniCliente;

    private String truncateLongText(String text, int maxLength) {
        if (text.length() > maxLength) {
            return text.substring(0, maxLength - 3) + "...";
        } else {
            return text;
        }
    }

}
