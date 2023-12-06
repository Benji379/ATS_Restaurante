package com.controlador;

import com.dao.DaoReserva;
import com.raven.datechooser.SelectedAction;
import com.raven.datechooser.SelectedDate;
import com.vista.ModuloListaReservas;
import java.awt.Color;
import java.awt.Cursor;
import java.util.HashMap;
import javax.swing.JTextField;

public class ControladorListaReservas {

    ModuloListaReservas r;

    public ControladorListaReservas(ModuloListaReservas r) {
        this.r = r;
    }

    public void initDiseño() {
//        DaoReserva.rellenarTabla(r.tablaReservas);
        r.txtFecha.setCursor(new Cursor(12));
        r.txtHora.setCursor(new Cursor(12));
        r.dateChooser.setTextRefernce(r.txtFecha);
        limpiar();
        InitDateChosser();
        inicializarText();
        r.btnLimpiar.doClick();
    }

    public void InitDateChosser() {
        r.dateChooser.setBackground(new Color(70, 21, 17));
        r.dateChooser.addEventDateChooser((SelectedAction action, SelectedDate date) -> {
            if (action.getAction() == SelectedAction.DAY_SELECTED) {
                r.dateChooser.hidePopup();
                filtrarTablas();
            }
        });
    }

    public void limpiar() {
        r.txtIdReserva.setText("");
        r.txtDni.setText("");
        r.txtMesa.setText("");
        r.txtEstado.setText("");
        r.txtFecha.setText("");
        r.txtHora.setText("");
        filtrarTablas();
        r.tablaReservas.clearSelection();
    }

    private void filtrarTablas() {
        HashMap<String, String> filtros = new HashMap<>();

        filtros.put("idReserva", r.txtIdReserva.getText());
        filtros.put("dniCliente", r.txtDni.getText());
        filtros.put("mesa", r.txtMesa.getText());
        filtros.put("estado", r.txtEstado.getText());
        filtros.put("fecha", r.txtFecha.getText());
        filtros.put("hora", r.txtHora.getText());
        DaoReserva.rellenarTablaConFiltros(r.tablaReservas, filtros);
    }

    private void inicializarText() {
        detectarEscritura(
                r.txtIdReserva,
                r.txtDni,
                r.txtEstado,
                r.txtHora,
                r.txtFecha,
                r.txtMesa
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

}
