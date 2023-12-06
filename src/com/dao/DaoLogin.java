package com.dao;

import com.modelo.action.Action;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DaoLogin {

    public static String ID_EMPLEADO;
    private final String contraseña;

    public DaoLogin(String idEmpleado, String contraseña) {
        ID_EMPLEADO = idEmpleado;
        this.contraseña = contraseña;
    }

    public boolean ingresar() {
        boolean entrar = false;
        Connection conexion;
        ResultSet resultado;
        PreparedStatement consulta;
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("SELECT * FROM `us.empleado` WHERE idEmpleado=?");
            consulta.setString(1, ID_EMPLEADO);
            resultado = consulta.executeQuery();
            if (resultado.next()) {
                String contraseñaBD = resultado.getString("contraseña");
                if (contraseña.equalsIgnoreCase(contraseñaBD)) {
                    entrar = true;
                    conexion.close();
                    consulta.close();
                    resultado.close();
                } else {
                    Action.mensajeError("Contraseña incorrecta");
                }
            } else {
                Action.mensajeError("Usuario no existe");
            }
        } catch (SQLException e) {

        }
        return entrar;
    }

    public static String getDato(String columna) {
        Connection conexion;
        ResultSet resultado;
        PreparedStatement consulta;
        String dato = null;
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("SELECT * FROM `us.empleado` WHERE idEmpleado=?");
            consulta.setString(1, ID_EMPLEADO);
            resultado = consulta.executeQuery();
            if (resultado.next()) {
                dato = resultado.getString(columna);
                conexion.close();
                consulta.close();
                resultado.close();
            }
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return dato;
    }

}
