package com.dao;

import java.sql.*;

public class DaoPreparacion {

    public static String estadoPreparacion(int idConsumo) {
        Connection conexion;
        PreparedStatement consulta;
        ResultSet resultado;
        String estado = null;
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("SELECT * FROM `ate.consumo` WHERE N=?");
            consulta.setInt(1, idConsumo);
            resultado = consulta.executeQuery();
            if (resultado.next()) {
                estado = resultado.getString("estado");
            }
            conexion.close();
            consulta.close();
            resultado.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return estado;
    }

    public static void cambiarEstadoPreparacion(int idConsumo, String estado) {
        Connection conexion;
        PreparedStatement consulta;
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("UPDATE `ate.consumo` set estado=? WHERE N=?");
            consulta.setString(1, estado);
            consulta.setInt(2, idConsumo);
            consulta.executeUpdate();
            conexion.close();
            consulta.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}
