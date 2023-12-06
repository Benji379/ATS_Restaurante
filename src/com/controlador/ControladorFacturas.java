package com.controlador;

import com.dao.DaoConsumo;
import com.dao.DaoFactura;
import com.dao.DaoReserva;
import com.glasspanepopup.GlassPanePopup;
import com.modelo.action.Action;
import com.modelo.action.GeneradorFacturaPDF;
import com.modelo.ui.MenssageInput;
import com.modelo.ui.UIController;
import com.raven.datechooser.SelectedAction;
import com.raven.datechooser.SelectedDate;
import com.vista.ModuloFacturas;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.util.HashMap;
import javax.swing.JTextField;

public class ControladorFacturas {

    ModuloFacturas f;

    public ControladorFacturas(ModuloFacturas f) {
        this.f = f;
    }

    public void initDiseño() {
        inicializarText();
        limpiar();
        InitDateChosser();
    }

    private void InitDateChosser() {
        f.dateChooser.setBackground(new Color(70, 21, 17));
        f.dateChooser.addEventDateChooser((SelectedAction action, SelectedDate date) -> {
            if (action.getAction() == SelectedAction.DAY_SELECTED) {
                f.dateChooser.hidePopup();
                filtrarTablas();
            }
        });
    }

    public void descargarFactura() {
        if (filaSeleccionada >= 0) {
            MenssageInput obj = new MenssageInput("Ingrese un correo");
            obj.eventOK((ActionEvent ae) -> {
                generarFacturaPDF(obj.getInput());
                GlassPanePopup.closePopupLast();
            });
            GlassPanePopup.showPopup(obj);
        }else{
            Action.mensajeError("Seleccione una factura");
        }
    }

    private void filtrarTablas() {
        HashMap<String, String> filtros = new HashMap<>();
        filtros.put("idFactura", f.txtId.getText());
        filtros.put("idReserva", f.txtReserva.getText());
        filtros.put("cajero", f.txtCaja.getText());
        filtros.put("tipoPago", f.txtPago.getText());
        filtros.put("fecha", f.txtFecha.getText());
        filtros.put("hora", f.txtHora.getText());
        DaoFactura.rellenarTablaConFiltros(f.tablaFactura, filtros);
    }

    public void limpiar() {
        f.txtId.setText("");
        f.txtReserva.setText("");
        f.txtCaja.setText("");
        f.txtPago.setText("");
        f.txtFecha.setText("");
        f.txtHora.setText("");
        filtrarTablas();
        filaSeleccionada = -1;
    }

    private void inicializarText() {
        detectarEscritura(
                f.txtId,
                f.txtReserva,
                f.txtCaja,
                f.txtPago,
                f.txtFecha,
                f.txtHora
        );

    }

    private void detectarEscritura(JTextField... text) {
        for (JTextField te : text) {
            te.addKeyListener(new java.awt.event.KeyAdapter() {
                @Override
                public void keyReleased(java.awt.event.KeyEvent evt) {
                    filtrarTablas();
                }
            });
        }
    }

    int filaSeleccionada = -1;

    public void clickTabla() {
        filaSeleccionada = f.tablaFactura.getSelectedRow();
    }

    private String datoFilaColumna(String columna) {
        return UIController.datoFilaColumna(f.tablaFactura, filaSeleccionada, columna).toString();
    }

    public void generarFacturaPDF(String emailCliente) {
        if (filaSeleccionada >= 0) {
            String idFactura = datoFilaColumna("ID");
            String idReserva = datoFilaColumna("reserva");
            String empleado = datoFilaColumna("caja");
            String dniCliente = String.valueOf(DaoFactura.dniCliente(idReserva));
            String fecha = datoFilaColumna("fecha");
            GeneradorFacturaPDF.generarPDF(idFactura, empleado, dniCliente, emailCliente, DaoConsumo.getProductosLista(idReserva), fecha);
        } else {
            Action.mensajeError("Seleccione una fila");
        }
    }

}
