package com.dao;

import java.sql.*;
import java.util.ArrayList;

public class DaoMesas {

    public ArrayList<Integer> rellenarCombo() {
        Connection conexion;
        PreparedStatement consulta;
        ResultSet resultado;
        ArrayList<Integer> mesas = null;
        try {
            mesas = new ArrayList<>();
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("SELECT * FROM `ate.mesas`");
            resultado = consulta.executeQuery();
            while (resultado.next()) {
                mesas.add(resultado.getInt("mesa"));
            }
            conexion.close();
            consulta.close();
            resultado.close();
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return mesas;
    }

    public ArrayList<Integer> rellenarCombo(String estado) {
        Connection conexion;
        PreparedStatement consulta;
        ResultSet resultado;
        ArrayList<Integer> mesas = null;
        try {
            mesas = new ArrayList<>();
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("SELECT * FROM `ate.mesas` WHERE estado=?");
            consulta.setString(1, estado);
            resultado = consulta.executeQuery();
            while (resultado.next()) {
                mesas.add(resultado.getInt("mesa"));
            }
            conexion.close();
            consulta.close();
            resultado.close();
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return mesas;
    }

    public static void cambiarEstadoMesa(int mesa, String estado) {
        Connection conexion;
        PreparedStatement consulta;

        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("UPDATE `ate.mesas` set estado=? WHERE mesa=?");
            consulta.setString(1, estado);
            consulta.setInt(2, mesa);
            consulta.executeUpdate();
            conexion.close();
            consulta.close();
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    public static String estadoMesa(int mesa) {
        Connection conexion;
        PreparedStatement consulta;
        ResultSet resultado;
        String estado = null;
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("SELECT * FROM `ate.mesas` WHERE mesa=?");
            consulta.setInt(1, mesa);
            resultado = consulta.executeQuery();
            if (resultado.next()) {
                estado = resultado.getString("estado");
            }
            conexion.close();
            consulta.close();
            resultado.close();
        } catch (SQLException e) {
        }
        return estado;
    }

}
