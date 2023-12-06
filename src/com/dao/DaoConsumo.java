package com.dao;

import com.boleta.model.Product;
import com.modelo.registro.Consumo;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DaoConsumo {

    public void ingresarConsumo(Consumo c) {
        Connection conexion;
        PreparedStatement consulta;

        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("INSERT INTO `ate.consumo` (idReserva,platillo,cantidad,estado,fecha,hora) VALUES (?,?,?,?,?,?)");
            consulta.setString(1, c.getIdReserva());
            consulta.setString(2, c.getPlatillo());
            consulta.setInt(3, c.getCantidad());
            consulta.setString(4, c.getEstado());
            consulta.setDate(5, c.getFecha());
            consulta.setTime(6, c.getHora());
            consulta.executeUpdate();
            conexion.close();
            consulta.close();
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    public static int getValorActualConsumo() {
        Connection conexion;
        PreparedStatement consulta;
        ResultSet resultado;
        int id = 0;
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("SELECT MAX(N) AS valorActualID FROM `ate.consumo`");
            resultado = consulta.executeQuery();
            if (resultado.next()) {
                id = resultado.getInt("valorActualID");
            }
            conexion.close();
            consulta.close();
            resultado.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return id;
    }

    public static void consultarConsumo(JTable tabla, String idReserva) {
        Connection conexion;
        PreparedStatement consulta;
        ResultSet resultado;
        DefaultTableModel modelo;
        try {
            modelo = (DefaultTableModel) tabla.getModel();
            modelo.setRowCount(0);
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("SELECT c.platillo,c.cantidad,m.precio,m.precio*c.cantidad as total FROM `ate.consumo` c inner join `co.menu` m on c.platillo=m.platillo WHERE c.idReserva=? ORDER BY CONCAT(c.fecha, ' ', c.hora) ASC;");
            consulta.setString(1, idReserva);
            resultado = consulta.executeQuery();
            Object datos[] = new Object[4];
            while (resultado.next()) {
                datos[0] = resultado.getString("platillo");
                datos[1] = resultado.getInt("precio");
                datos[2] = resultado.getDouble("cantidad");
                datos[3] = resultado.getDouble("total");
                modelo.addRow(datos);
            }
            tabla.setModel(modelo);
            conexion.close();
            consulta.close();
            resultado.close();
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    public static ArrayList<Integer> getIdConsumos(String idReserva) {
        Connection conexion;
        PreparedStatement consulta;
        ResultSet resultado;
        ArrayList<Integer> consumos = null;
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("SELECT N FROM `ate.consumo` WHERE estado='esperando' or estado='preparando' AND idReserva=?");
            consulta.setString(1, idReserva);
            consumos = new ArrayList<>();
            resultado = consulta.executeQuery();
            while (resultado.next()) {
                consumos.add(resultado.getInt("N"));
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return consumos;
    }

    public void agregarConsumoExistente(Consumo c) {
        Connection conexion;
        PreparedStatement consulta;

        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("UPDATE `ate.consumo` set cantidad=? WHERE idReserva=? AND platillo=?");
            int nuevaCantidad = c.getCantidad() + consultarCantidadActualProducto(c.getIdReserva(), c.getPlatillo());
            consulta.setInt(1, nuevaCantidad);
            consulta.setString(2, c.getIdReserva());
            consulta.setString(3, c.getPlatillo());
            consulta.executeUpdate();
            conexion.close();
            consulta.close();
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    private int consultarCantidadActualProducto(String idReserva, String platillo) {
        Connection conexion;
        PreparedStatement consulta;
        ResultSet resultado;
        int cantidad = 0;
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("SELECT * FROM `ate.consumo` WHERE idReserva=? AND platillo=?");
            consulta.setString(1, idReserva);
            consulta.setString(2, platillo);
            resultado = consulta.executeQuery();
            if (resultado.next()) {
                cantidad = resultado.getInt("cantidad");
            }
            conexion.close();
            consulta.close();
            resultado.close();
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return cantidad;
    }

    public static void eliminarConsumo(String idReserva, String platillo) {
        Connection conexion;
        PreparedStatement consulta;
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("DELETE FROM `ate.consumo` WHERE idReserva=? AND platillo=?");
            consulta.setString(1, idReserva);
            consulta.setString(2, platillo);
            consulta.executeUpdate();
            conexion.close();
            consulta.close();
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    public static void eliminarConsumo(int idConsumo) {
        Connection conexion;
        PreparedStatement consulta;
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("DELETE FROM `ate.consumo` WHERE N=?");
            consulta.setInt(1, idConsumo);
            consulta.executeUpdate();
            conexion.close();
            consulta.close();
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    public static List<Product> getProductosLista(String idReserva) {
        List<Product> productList = null;
        Connection conexion;
        PreparedStatement consulta;
        ResultSet resultado;
        try {
            productList = new ArrayList<>();
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("SELECT c.idReserva,c.platillo,c.cantidad,m.precio FROM `ate.consumo` c INNER JOIN `co.menu` m ON c.platillo=m.platillo WHERE c.idReserva=?");
            consulta.setString(1, idReserva);
            resultado = consulta.executeQuery();
            while (resultado.next()) {
                String platillo = resultado.getString("platillo");
                int cantidad = resultado.getInt("cantidad");
                float precio = (float) resultado.getDouble("precio");
                productList.add(new Product(platillo, cantidad, precio));
            }
            conexion.close();
            consulta.close();
            resultado.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }

        return productList;
    }

}
