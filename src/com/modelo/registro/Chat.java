package com.modelo.registro;

import java.sql.*;

public class Chat {

    private final String idEmisor;
    private final String idReceptor;
    private final String mensaje;
    private final Date fecha;
    private final Time hora;

    public Chat(String idEmisor, String idReceptor, String mensaje, Date fecha, Time hora) {
        this.idEmisor = idEmisor;
        this.idReceptor = idReceptor;
        this.mensaje = mensaje;
        this.fecha = fecha;
        this.hora = hora;
    }

    public String getIdEmisor() {
        return idEmisor;
    }

    public String getIdReceptor() {
        return idReceptor;
    }

    public String getMensaje() {
        return mensaje;
    }

    public Date getFecha() {
        return fecha;
    }

    public Time getHora() {
        return hora;
    }

    
    
}
