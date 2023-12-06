package com.modelo.registro;

import java.sql.*;

public class Pedido {

    private String idReserva;
    private int mesa;
    private String platillo;
    private int cantidad;
    private Date fecha;
    private Time hora;

    public Pedido(String idReserva, int mesa, String platillo, int cantidad, Date fecha, Time hora) {
        this.idReserva = idReserva;
        this.mesa = mesa;
        this.platillo = platillo;
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.hora = hora;
    }

    public String getIdReserva() {
        return idReserva;
    }

    public int getMesa() {
        return mesa;
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
