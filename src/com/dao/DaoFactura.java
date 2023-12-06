package com.dao;

import com.modelo.registro.Factura;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DaoFactura {

    int mesa;
    int dniCliente;
    double subTotal;

    public DaoFactura(int mesa) {
        this.mesa = mesa;
        subTotal = 0.0;
        dniCliente = 00000000;
    }

    public void consultar(JTable tabla) {
        Connection conexion;
        PreparedStatement consulta;
        ResultSet resultado;
        DefaultTableModel modelo;
        try {
            modelo = (DefaultTableModel) tabla.getModel();
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement(
                    ""
                    + "SELECT c.platillo, m.precio, SUM(c.cantidad) as cantidad_total, SUM(c.cantidad * m.precio) as total_por_platillo, r.dniCliente\n"
                    + "FROM `ate.reserva` r\n"
                    + "INNER JOIN `ate.consumo` c ON r.idReserva = c.idReserva\n"
                    + "INNER JOIN `co.menu` m ON m.platillo = c.platillo\n"
                    + "WHERE r.mesa = ? AND r.estado = 'finalizado'\n"
                    + "GROUP BY c.platillo, m.precio, r.dniCliente\n"
                    + "ORDER BY r.mesa;");
            consulta.setInt(1, mesa);
            resultado = consulta.executeQuery();
            Object datos[] = new Object[4];
            modelo.setRowCount(0);
            while (resultado.next()) {
                datos[0] = resultado.getString("platillo");
                datos[1] = resultado.getDouble("precio");
                datos[2] = resultado.getInt("cantidad_total");
                double totall = resultado.getDouble("total_por_platillo");
                datos[3] = totall;
                subTotal += totall;
                dniCliente = resultado.getInt("dniCliente");
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

    public int getDniCliente() {
        return dniCliente;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public static ArrayList<Integer> mesasFinalizadas() {
        Connection conexion;
        PreparedStatement consulta;
        ResultSet resultado;
        ArrayList<Integer> datos = null;
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("SELECT mesa FROM `ate.reserva` WHERE estado='finalizado' ORDER BY mesa");
            resultado = consulta.executeQuery();
            datos = new ArrayList<>();
            while (resultado.next()) {
                datos.add(resultado.getInt("mesa"));
            }
            conexion.close();
            consulta.close();
            resultado.close();
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return datos;
    }

    public static int dniCliente(String idReserva) {
        Connection conexion;
        PreparedStatement consulta;
        ResultSet resultado;
        int dniCliente = 0;
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("SELECT r.dniCliente FROM `fin.factura` f INNER JOIN `ate.reserva` r ON f.idReserva = r.idReserva  WHERE f.idReserva=?");
            consulta.setString(1, idReserva);
            resultado = consulta.executeQuery();
            if (resultado.next()) {
                dniCliente = resultado.getInt("dniCliente");
            }
            conexion.close();
            consulta.close();
            resultado.close();
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return dniCliente;
    }

    public static String getConsultarDato(String idFactura, String nameColumna) {
        String dato = null;
        Connection conexion;
        PreparedStatement consulta;
        ResultSet resultado;
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("SELECT * FROM `fin.factura` WHERE idFactura=?");
            consulta.setString(1, idFactura);
            resultado = consulta.executeQuery();
            if (resultado.next()) {
                dato = resultado.getString(nameColumna);
            }
            consulta.close();
            conexion.close();
            resultado.close();
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return dato;
    }

    public static void registrarFactura(Factura f) {
        Connection conexion;
        PreparedStatement consulta;
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("INSERT INTO `fin.factura` (idFactura,idReserva,cajero,tipoPago,subtotal,total,fecha,hora) VALUES (?,?,?,?,?,?,?,?)");
            consulta.setString(1, f.getIdFactura());
            consulta.setString(2, f.getIdReserva());
            consulta.setString(3, f.getCajero());
            consulta.setString(4, f.getTipoPago());
            consulta.setDouble(5, f.getSubTotal());
            consulta.setDouble(6, f.getTotal());
            consulta.setDate(7, f.getFecha());
            consulta.setTime(8, f.getHora());
            consulta.executeUpdate();
            conexion.close();
            consulta.close();
        } catch (SQLException e) {
            System.out.println("ERROR; " + e.getMessage());
        }
    }

    public static String valorActualID() {
        Connection conexion;
        PreparedStatement consulta;
        ResultSet resultado;
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("SELECT * FROM `fin.factura` ORDER BY idFactura DESC LIMIT 1;");
            resultado = consulta.executeQuery();
            if (resultado.next()) {
                return resultado.getString("idFactura");
            }
            conexion.close();
            consulta.close();
            resultado.close();
        } catch (SQLException | NumberFormatException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return "00000000";
    }

    public static void rellenarTablaConFiltros(JTable tabla, HashMap<String, String> filtros) {
        Connection conexion;
        PreparedStatement consulta;
        ResultSet resultado;

        try {
            conexion = new ConexionSQL().conexion();

            List<String> parametros = new ArrayList<>();
            String query = construirConsultaConFiltros(filtros, parametros);
            consulta = conexion.prepareStatement(query);

            for (int i = 0; i < parametros.size(); i++) {
                String key = parametros.get(i);
                String valor = filtros.get(key);
                if (key.equals("fecha")) {
                    valor = convertirFecha(valor);
                }
                consulta.setString(i + 1, valor + "%");
            }

            resultado = consulta.executeQuery();
            Object[] datos = new Object[8];
            DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
            modelo.setRowCount(0);

            while (resultado.next()) {
                datos[0] = resultado.getString("idFactura");
                datos[1] = resultado.getString("idReserva");
                datos[2] = resultado.getString("cajero");
                datos[3] = resultado.getString("tipoPago");
                datos[4] = resultado.getDouble("subtotal");
                datos[5] = resultado.getDouble("total");
                datos[6] = resultado.getDate("fecha");
                datos[7] = resultado.getTime("hora");
                modelo.addRow(datos);
            }
            tabla.setModel(modelo);
            conexion.close();
            consulta.close();
            resultado.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static String construirConsultaConFiltros(HashMap<String, String> filtros, List<String> parametros) {
        String query = "SELECT * FROM `fin.factura` WHERE ";
        boolean primerFiltro = true;

        for (String key : filtros.keySet()) {
            if (!filtros.get(key).isEmpty()) {
                if (!primerFiltro) {
                    query += " AND ";
                }
                query += "CAST(" + key + " AS CHAR) LIKE ?";
                parametros.add(key);
                primerFiltro = false;
            }
        }

        if (primerFiltro) {
            return "SELECT * FROM `fin.factura`";
        }

        return query;
    }

    private static String convertirFecha(String fechaUsuario) {
        try {
            SimpleDateFormat formatoUsuario = new SimpleDateFormat("dd-MM-yyyy");
            SimpleDateFormat formatoBD = new SimpleDateFormat("yyyy-MM-dd");
            return formatoBD.format(formatoUsuario.parse(fechaUsuario));
        } catch (ParseException e) {
            System.out.println("Error al convertir la fecha: " + e.getMessage());
            return "";
        }
    }

}
