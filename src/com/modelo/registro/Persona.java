package com.modelo.registro;

import com.modelo.action.ConsultaDNI;
import com.modelo.action.Tiempo;
import java.sql.*;

public class Persona {

    protected int dni;
    protected String nombre;
    protected String apellido;
    private Date fecha;
    private final ConsultaDNI consulta;
    private final Time hora;

    /**
     * *
     *
     * @param dni dni de la persona, y en base a eso voy a sacar los nombres y
     * apellidos
     */
    public Persona(int dni) {
        consulta = new ConsultaDNI(dni);

        this.dni = dni;
        this.nombre = consulta.getNombres();
        this.apellido = consulta.getApellidos();
        this.fecha = Tiempo.getFecha();
        this.hora = Tiempo.getHora();
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHora() {
        return hora;
    }

}
