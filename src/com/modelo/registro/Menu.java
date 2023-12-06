package com.modelo.registro;

import java.sql.*;

public class Menu {

    private final String nombre;
    private final double precio;
    private final String disponiblidad;
    private final String descripcion;
    private final Date fecha;
    private final Time hora;

    public Menu(String nombre, double precio, String disponiblidad, String descripcion, Date fecha, Time hora) {
        this.nombre = nombre;
        this.precio = precio;
        this.disponiblidad = disponiblidad;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.hora = hora;
    }
    
    public String getDescripcion() {
        return descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getDisponiblidad() {
        return disponiblidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public Time getHora() {
        return hora;
    }

}
