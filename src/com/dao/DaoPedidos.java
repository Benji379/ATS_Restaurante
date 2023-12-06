package com.dao;

import java.sql.*;
import javax.swing.JComboBox;

public class DaoPedidos {

    public void rellenarComboBox(JComboBox combo) {

        Connection conexion;
        PreparedStatement consulta;
        ResultSet resultado;
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("SELECT * FROM `co.menu` WHERE estado='disponible'");
            resultado = consulta.executeQuery();
            while (resultado.next()) {
                combo.addItem(resultado.getString("platillo"));
            }
            conexion.close();
            consulta.close();
            resultado.close();
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

    }

    public Object consultaDatoXNombre(String nombrePlato, String nombreEncabezado) {
        Connection conexion;
        PreparedStatement consulta;
        ResultSet resultado;
        Object dato = null;
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("SELECT * FROM `co.menu` WHERE platillo=?");
            consulta.setString(1, nombrePlato);
            resultado = consulta.executeQuery();
            if (resultado.next()) {
                dato = resultado.getObject(nombreEncabezado);
            }
            conexion.close();
            consulta.close();
            resultado.close();
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return dato;
    }

    public static boolean verificarPedidosEntregados(String idReserva) {
        Connection conexion;
        PreparedStatement consulta;
        ResultSet resultado;
        boolean todosPedidosEntregados = true;
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("SELECT * FROM `ate.consumo` WHERE idReserva=?");
            consulta.setString(1, idReserva);
            resultado = consulta.executeQuery();
            while (resultado.next()) {
                if((resultado.getString("estado").equalsIgnoreCase("preparando")) || (resultado.getString("estado").equalsIgnoreCase("esperando"))){
                    todosPedidosEntregados = false;
                }
            }
            conexion.close();
            consulta.close();
            resultado.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return todosPedidosEntregados;
    }

}
