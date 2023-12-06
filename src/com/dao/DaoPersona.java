package com.dao;

import com.modelo.registro.Cliente;
import com.modelo.registro.Empleado;
import com.modelo.registro.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DaoPersona {

    private Connection conexion;
    private PreparedStatement consulta;
    private ResultSet resultado;
    private Empleado empleado;
    private Cliente cliente;

    public DaoPersona() {
    }

    public void insertPersona(Persona persona) {
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("INSERT INTO `us.persona`(idPersona, nombre, apellido, fecha,hora) VALUES (?,?,?,?,?)");
            consulta.setInt(1, persona.getDni());
            consulta.setString(2, persona.getNombre());
            consulta.setString(3, persona.getApellido());
            consulta.setDate(4, persona.getFecha());
            consulta.setTime(5, persona.getHora());
            consulta.executeUpdate();
            consulta.close();
            conexion.close();
        } catch (SQLException e) {
            System.out.println("ERROR de Registro de persona (" + e.getMessage() + ")");
        }
    }

    public void modificarTipoPersona(int idPersona, String tipoPersona) {
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("UPDATE `us.persona` set tipo=? WHERE idPersona=?");
            consulta.setString(1, tipoPersona);
            consulta.setInt(2, idPersona);
            consulta.executeUpdate();
            conexion.close();
            consulta.close();
        } catch (SQLException e) {
            System.out.println("ERROR modificar persona");
        }
    }

    public void eliminarPersona(int idPersona) {
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("DELETE FROM `us.persona` WHERE idPersona=?");
            consulta.setInt(1, idPersona);
            consulta.executeUpdate();
            conexion.close();
            consulta.close();
        } catch (SQLException e) {
            System.out.println("ERROR de eliminacion");
        }
    }

    public ArrayList<Integer> getIdPersonas() {
        ArrayList<Integer> dnis = new ArrayList<>();

        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("SELECT * FROM `us.persona`");
            resultado = consulta.executeQuery();
            while (resultado.next()) {
                dnis.add(resultado.getInt("idPersona"));
            }
            consulta.close();
            conexion.close();
            resultado.close();
        } catch (SQLException e) {
            System.out.println("ERROR : " + e.getMessage());
        }
        return dnis;
    }

    public Object getConsultarDato(int idPersona, String nameColumna) {
        Object dato = null;
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("SELECT * FROM `us.persona` WHERE idPersona = ?");
            consulta.setInt(1, idPersona);
            resultado = consulta.executeQuery();
            if (resultado.next()) {
                dato = resultado.getObject(nameColumna);
            }
            consulta.close();
            conexion.close();
            resultado.close();
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return dato;
    }

    public static ArrayList<String> rellenarTextFieldSugestion() {
        Connection conexion;
        PreparedStatement consulta;
        ResultSet resultado;
        ArrayList<String> datos = null;
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("SELECT * FROM `us.persona`");
            resultado = consulta.executeQuery();
            datos = new ArrayList<>();
            while (resultado.next()) {
                datos.add(resultado.getString("idPersona"));
            }
            conexion.close();
            consulta.close();
            resultado.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return datos;
    }

    public static boolean existePersona(int dni) {
        Connection conexion;
        PreparedStatement consulta;
        ResultSet resultado;
        boolean existe = false;
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("SELECT * FROM `us.persona` WHERE idPersona=?");
            consulta.setInt(1, dni);
            resultado = consulta.executeQuery();
            if(resultado.next()){
                existe = true;
            }
            conexion.close();
            consulta.close();
            resultado.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return existe;
    }

}
