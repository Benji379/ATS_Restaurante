package com.dao;

import com.modelo.action.Action;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DaoLogin {

    public static String ID_EMPLEADO;
    private final String contrase�a;

    public DaoLogin(String idEmpleado, String contrase�a) {
        ID_EMPLEADO = idEmpleado;
        this.contrase�a = contrase�a;
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
                String contrase�aBD = resultado.getString("contrase�a");
                if (contrase�a.equalsIgnoreCase(contrase�aBD)) {
                    entrar = true;
                    conexion.close();
                    consulta.close();
                    resultado.close();
                } else {
                    Action.mensajeError("Contrase�a incorrecta");
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
