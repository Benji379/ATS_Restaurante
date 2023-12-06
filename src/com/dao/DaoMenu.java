package com.dao;

import com.modelo.registro.Menu;
import java.sql.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DaoMenu {

    public void registrarMenu(Menu menu) {
        Connection conexion;
        PreparedStatement consulta;
        ResultSet resultado;
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("INSERT INTO `co.menu` (platillo,precio,estado,descripcion,fecha,hora) VALUES (?,?,?,?,?,?)");
            consulta.setString(1, menu.getNombre());
            consulta.setDouble(2, menu.getPrecio());
            consulta.setString(3, menu.getDisponiblidad());
            consulta.setString(4, menu.getDescripcion());
            consulta.setDate(5, menu.getFecha());
            consulta.setTime(6, menu.getHora());
            consulta.executeUpdate();
            conexion.close();
            consulta.close();
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    public void modificarMenu(String nombre, double precio, String disponible, String descripcion) {
        Connection conexion;
        PreparedStatement consulta;
        ResultSet resultado;
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("UPDATE `co.menu` set platillo=?, precio=?, estado=?,descripcion=? WHERE platillo=?");
            consulta.setString(1, nombre);
            consulta.setDouble(2, precio);
            consulta.setString(3, disponible);
            consulta.setString(4, descripcion);
            consulta.setString(5, nombre);
            consulta.executeUpdate();
            conexion.close();
            consulta.close();
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    public void eliminarMenu(String nombrePlato) {
        Connection conexion;
        PreparedStatement consulta;
        ResultSet resultado;
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("DELETE FROM `co.menu` WHERE platillo=?");
            consulta.setString(1, nombrePlato);
            consulta.executeUpdate();
            conexion.close();
            consulta.close();
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    public void consulta(DefaultTableModel modelo, JTable tabla) {
        Connection conexion;
        PreparedStatement consulta;
        ResultSet resultado;
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("SELECT * FROM `co.menu`");
            resultado = consulta.executeQuery();
            Object datos[] = new Object[5];
            modelo = (DefaultTableModel) tabla.getModel();
            modelo.setRowCount(0);
            int i = 0;
            while (resultado.next()) {
                i++;
                datos[0] = i;
                datos[1] = resultado.getString("platillo");
                datos[2] = resultado.getDouble("precio");
                datos[3] = resultado.getString("estado");
                datos[4] = resultado.getString("descripcion");
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

    public String valorActualID() {
        Connection conexion;
        PreparedStatement consulta;
        ResultSet resultado;
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("SELECT * FROM `co.menu` ORDER BY idPlato DESC LIMIT 1;");
            resultado = consulta.executeQuery();
            if (resultado.next()) {
                return resultado.getString("idPlato");
            }
            conexion.close();
            consulta.close();
            resultado.close();
        } catch (SQLException | NumberFormatException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return "00000000";
    }

    public boolean existePlato(String platillo) {
        Connection conexion;
        PreparedStatement consulta;
        ResultSet resultado;
        boolean existe = false;
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("SELECT * FROM `co.menu` WHERE platillo=?");
            consulta.setString(1, platillo);
            resultado = consulta.executeQuery();
            if (resultado.next()) {
                existe = true;
            }
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return existe;
    }

}
