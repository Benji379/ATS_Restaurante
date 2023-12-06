package com.dao;

import java.sql.*;
import static com.modelo.action.Action.*;

public class DaoUsuario {

    private int dni;
    private String nombre;
    private String apellidoP;
    private String apellidoM;
    private String correo;
    private String rango;
    private Date fechaIngreso;

    public DaoUsuario(String codigo) {
        Connection conexion;
        PreparedStatement consulta;
        ResultSet resultado;
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("SELECT * FROM `us.empleado` empleado INNER JOIN `us.persona` persona ON  empleado.idPersona = persona.idPersona WHERE empleado.idEmpleado=?");
            consulta.setString(1, codigo);
            resultado = consulta.executeQuery();
            if (resultado.next()) {
                dni = resultado.getInt("idPersona");
                nombre = resultado.getString("nombre");
                apellidoP = separarApellido(resultado.getString("apellido"), 1);
                apellidoM = separarApellido(resultado.getString("apellido"), 2);
                correo = resultado.getString("correo");
                rango = resultado.getString("cargo");
                fechaIngreso = resultado.getDate("fecha");
            }
            conexion.close();
            consulta.close();
            resultado.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public String getCorreo() {
        return correo;
    }

    public String getRango() {
        return rango;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

}
