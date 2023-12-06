package com.controlador;

import com.dao.DaoCocina;
import com.dao.DaoPreparacion;
import com.modelo.action.Action;
import com.vista.NuevoPedido;
import java.awt.Color;
import java.sql.Date;
import java.sql.Time;

public class ControladorNuevoPedido {

    NuevoPedido p;
    private int idConsumo;
    private int mesa;
    private String platillo;
    private int cantidad;
    private Date fecha;
    private Time hora;

    public ControladorNuevoPedido(NuevoPedido p) {
        this.p = p;
    }

    public void initDiseño(int idConsumo, int mesa, String platillo, int cantidad, Date fecha, Time hora) {
        this.idConsumo = idConsumo;
        this.mesa = mesa;
        this.platillo = platillo;
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.hora = hora;
        p.txtNumeroMesa.setText("Mesa #" + mesa);
        p.txtPlatillo.setText(platillo);
        p.txtCantidad.setText("Cantidad: " + cantidad);
        p.txtHora.setText(hora.toString());
        cambiarEstadoPedido();
        p.checkListo.setText(DaoPreparacion.estadoPreparacion(idConsumo));
        if (p.checkListo.getText().equalsIgnoreCase("esperando")) {
            p.checkListo.setText("Esperando");
            p.checkListo.setBackground(Color.GREEN);
            p.checkListo.setFont(new java.awt.Font("Comic Sans MS", 0, 20));
        } else {
            if (p.checkListo.getText().equalsIgnoreCase("preparando")) {
                p.checkListo.setText("Preparando");
                p.checkListo.setBackground(Color.RED);
                p.checkListo.setFont(new java.awt.Font("Comic Sans MS", 1, 20));
            }
        }
    }

    public void mostrarEstadoPedido() {
        if (DaoPreparacion.estadoPreparacion(idConsumo).equalsIgnoreCase("esperando")) {
            p.checkListo.setText("Esperando");
            p.checkListo.setFont(new java.awt.Font("Comic Sans MS", 0, 20));
            p.checkListo.setBackground(Color.GREEN);
        } else {
            if (DaoPreparacion.estadoPreparacion(idConsumo).equalsIgnoreCase("preparando")) {
                p.checkListo.setBackground(Color.RED);
                p.checkListo.setText("Preparando");
                p.checkListo.setFont(new java.awt.Font("Comic Sans MS", 1, 20));
            }
        }

    }

    public void cambiarEstadoPedido() {
        p.checkListo.addActionListener((java.awt.event.ActionEvent evt) -> {
            if (p.checkListo.getText().equalsIgnoreCase("esperando")) {
                DaoPreparacion.cambiarEstadoPreparacion(idConsumo, "preparando");
                p.checkListo.setBackground(Color.GREEN);
                p.checkListo.setFont(new java.awt.Font("Comic Sans MS", 0, 20));
            } else {
                if (p.checkListo.getText().equalsIgnoreCase("preparando")) {
                    DaoPreparacion.cambiarEstadoPreparacion(idConsumo, "esperando");
                    p.checkListo.setBackground(Color.RED);
                    p.checkListo.setFont(new java.awt.Font("Comic Sans MS", 1, 20));
                }
            }
            p.checkListo.setSelected(true);
        });
    }

    public void btnFinalizarActionPerformed() {
        if (p.checkListo.getText().equalsIgnoreCase("preparando")) {
            Action.msjC(() -> actionFinalizarAction(), "Finalizar pedido");
        } else {
            Action.mensajeError("Este pedido aun no a sido preparado");
        }
    }

    private void actionFinalizarAction() {
        DaoCocina.finalizarPedido(idConsumo);
        DaoPreparacion.cambiarEstadoPreparacion(idConsumo, "finalizado");
        p.checkListo.setBackground(Color.GREEN);
        p.checkListo.setFont(new java.awt.Font("Comic Sans MS", 0, 20));
        Action.mensaje("Pedido entregado");
    }

    public int getMesa() {
        return mesa;
    }

    public int getIdConsumo() {
        return idConsumo;
    }

    public String getPlatillo() {
        return platillo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public Time getHora() {
        return hora;
    }
}
