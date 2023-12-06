package com.modelo.registro;

import java.sql.*;

public class Consumo {

    private final String idReserva;
    private final String platillo;
    private final int cantidad;
    private final Date fecha ;
    private final Time hora;
    private final String estado;
    
    public Consumo(String idReserva, String platillo, int cantidad,String estado, Date fecha, Time hora) {
        this.idReserva = idReserva;
        this.platillo = platillo;
        this.cantidad = cantidad;
        this.estado = estado;
        this.fecha = fecha;
        this.hora = hora;
    }

    public String getEstado(){
        return estado;
    }
    
    public String getIdReserva() {
        return idReserva;
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
