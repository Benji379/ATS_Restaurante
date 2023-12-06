package com.dao;

import com.modelo.registro.Reserva;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DaoReserva {

    public void abrirReserva(Reserva r) {
        Connection conexion;
        PreparedStatement consulta;
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("INSERT INTO `ate.reserva`(idReserva,dniCliente,mesa,estado,fecha,hora) VALUES (?,?,?,?,?,?)");
            consulta.setString(1, r.getIdReserva());
            consulta.setInt(2, r.getDniCliente());
            consulta.setInt(3, r.getMesa());
            consulta.setString(4, r.getEstado());
            consulta.setDate(5, r.getFecha());
            consulta.setTime(6, r.getHora());
            consulta.executeUpdate();
            conexion.close();
            consulta.close();
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    public void cerrarReserva(int mesa, String estado, String buscarEstado) {
        Connection conexion;
        PreparedStatement consulta;
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("UPDATE `ate.reserva` set estado=? WHERE estado=? AND mesa=?");
            consulta.setString(1, estado);
            consulta.setString(2, buscarEstado);
            consulta.setInt(3, mesa);
            consulta.executeUpdate();
            DaoNotificacion.registrarNotificacion("Cerro una mesa");
            conexion.close();
            consulta.close();
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
            consulta = conexion.prepareStatement("SELECT * FROM `ate.reserva` ORDER BY idReserva DESC LIMIT 1;");
            resultado = consulta.executeQuery();
            if (resultado.next()) {
                return resultado.getString("idReserva");
            }
            conexion.close();
            consulta.close();
            resultado.close();
        } catch (SQLException | NumberFormatException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return "00000000";
    }

    public String indentificarIDReserva(int mesa, String estadoBuscar) {
        Connection conexion;
        PreparedStatement consulta;
        ResultSet resultado;
        String idReserva = null;
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareCall("SELECT * FROM `ate.reserva` WHERE mesa=? AND estado=?");
            consulta.setInt(1, mesa);
            consulta.setString(2, estadoBuscar);
            resultado = consulta.executeQuery();
            if (resultado.next()) {
                idReserva = resultado.getString("idReserva");
            }
            conexion.close();
            consulta.close();
            resultado.close();
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return idReserva;
    }

    public static String indentificarCliente(int mesa) {
        Connection conexion;
        PreparedStatement consulta;
        ResultSet resultado;
        String cliente = null;
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareCall("SELECT * FROM `ate.reserva` WHERE mesa=? AND estado='activo'");
            consulta.setInt(1, mesa);
            resultado = consulta.executeQuery();
            if (resultado.next()) {
                cliente = resultado.getString("dniCliente");
            }
            conexion.close();
            consulta.close();
            resultado.close();
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return cliente;
    }

    public static void rellenarTabla(JTable tabla) {
        Connection conexion;
        PreparedStatement consulta;
        ResultSet resultado;

        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("SELECT * FROM `ate.reserva`");
            resultado = consulta.executeQuery();
            Object datos[] = new Object[6];
            DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
            modelo.setRowCount(0);
            while (resultado.next()) {
                datos[0] = resultado.getString("idReserva");
                datos[1] = resultado.getInt("dniCliente");
                datos[2] = resultado.getInt("mesa");
                datos[3] = resultado.getString("estado");
                datos[4] = resultado.getDate("fecha");
                datos[5] = resultado.getTime("hora");
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
            Object[] datos = new Object[6];
            DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
            modelo.setRowCount(0);

            while (resultado.next()) {
                datos[0] = resultado.getString("idReserva");
                datos[1] = resultado.getInt("dniCliente");
                datos[2] = resultado.getInt("mesa");
                datos[3] = resultado.getString("estado");
                datos[4] = resultado.getDate("fecha");
                datos[5] = resultado.getTime("hora");
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
        String query = "SELECT * FROM `ate.reserva` WHERE ";
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
            return "SELECT * FROM `ate.reserva`";
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
