package com.modelo.registro;

import java.sql.*;

public class Notificacion {
    
    private final int IDNotificacion;
    private final String idEmpleado;
    private final String descripcion;
    private final Date fecha;
    private final Time hora;
    private final String estado;

    public Notificacion(int IDNotificacion,String idEmpleado, String descripcion, Date fecha, Time hora, String estado) {
        this.idEmpleado = idEmpleado;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.hora = hora;
        this.estado = estado;
        this.IDNotificacion = IDNotificacion;
    }

    public int getIDNotificacion() {
        return IDNotificacion;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Time getHora() {
        return hora;
    }

    public String getEstado() {
        return estado;
    }
    
    
    
    
}
