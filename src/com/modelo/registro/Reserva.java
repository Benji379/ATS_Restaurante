package com.modelo.registro;

import java.sql.*;

public class Reserva {

    private final String idReserva;
    private final int dniCliente;
    private final int mesa;
    private final String estado;
    private final Date fecha;
    private final Time hora;
    
    public Reserva(String idReserva, int dniCliente, int mesa, String estado, Date fecha,Time hora) {
        this.idReserva = idReserva;
        this.dniCliente = dniCliente;
        this.mesa = mesa;
        this.estado = estado;
        this.fecha = fecha;
        this.hora = hora;
    }

    public String getIdReserva() {
        return idReserva;
    }

    public int getDniCliente() {
        return dniCliente;
    }

    public int getMesa() {
        return mesa;
    }

    public String getEstado() {
        return estado;
    }

    public Date getFecha() {
        return fecha;
    }

    public Time getHora() {
        return hora;
    }

    
    
     
    
}
