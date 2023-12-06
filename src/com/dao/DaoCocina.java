package com.dao;

import com.modelo.action.MiInterfaz;
import java.sql.*;
import java.util.ArrayList;

public class DaoCocina {

    private int idConsumo;
    private int mesa;
    private String platillo;
    private int cantidad;
    private Date fecha;
    private Time hora;

    public DaoCocina() {

    }

    public DaoCocina(int idConsumo) {
        this.idConsumo = idConsumo;
        Connection conexion;
        PreparedStatement consulta;
        ResultSet resultado;

        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("SELECT consumo.N, reserva.idReserva, reserva.mesa, consumo.platillo, consumo.cantidad,consumo.fecha,consumo.hora FROM `ate.reserva` reserva INNER JOIN `ate.consumo` consumo ON reserva.idReserva = consumo.idReserva WHERE consumo.N=? AND consumo.estado = 'esperando' or consumo.N=? AND consumo.estado='preparando' ORDER BY CONCAT(consumo.fecha, ' ', consumo.hora) ASC;");
            consulta.setInt(1, idConsumo);
            consulta.setInt(2, idConsumo);
            resultado = consulta.executeQuery();
            if (resultado.next()) {
                this.mesa = resultado.getInt("mesa");
                this.platillo = resultado.getString("platillo");
                this.cantidad = resultado.getInt("cantidad");
                this.fecha = resultado.getDate("fecha");
                this.hora = resultado.getTime("hora");
            }
            conexion.close();
            consulta.close();
            resultado.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static ArrayList<Object> getIdConsumos(String columna) {
        Connection conexion;
        PreparedStatement consulta;
        ResultSet resultado;
        ArrayList<Object> consumos = null;
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("SELECT c.N,r.mesa,c.platillo FROM `ate.consumo` c INNER JOIN `ate.reserva` r on c.idReserva = r.idReserva WHERE c.estado='esperando' or c.estado='preparando'");
            consumos = new ArrayList<>();
            resultado = consulta.executeQuery();
            while (resultado.next()) {
                consumos.add(resultado.getObject(columna));
            }
            conexion.close();
            consulta.close();
            resultado.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return consumos;
    }

    public static ArrayList<Object> getIdConsumosXMesa(int mesa) {
        Connection conexion;
        PreparedStatement consulta;
        ResultSet resultado;
        ArrayList<Object> consumos = null;
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("SELECT c.N,r.mesa,c.platillo FROM `ate.consumo` c INNER JOIN `ate.reserva` r on c.idReserva = r.idReserva WHERE c.estado='esperando' AND r.mesa=? or c.estado='preparando' AND r.mesa=?");
            consulta.setInt(1, mesa);
            consulta.setInt(2, mesa);
            consumos = new ArrayList<>();
            resultado = consulta.executeQuery();
            while (resultado.next()) {
                consumos.add(resultado.getObject("N"));
            }
            conexion.close();
            consulta.close();
            resultado.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return consumos;
    }

    public static ArrayList<Object> getIdConsumosXPlatillo(String nombrePlatillo) {
        Connection conexion;
        PreparedStatement consulta;
        ResultSet resultado;
        ArrayList<Object> consumos = null;
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("SELECT c.N,r.mesa,c.platillo FROM `ate.consumo` c INNER JOIN `ate.reserva` r on c.idReserva = r.idReserva WHERE c.estado='esperando' AND c.platillo=? or c.estado='preparando' AND c.platillo=?");
            consulta.setString(1, nombrePlatillo);
            consulta.setString(2, nombrePlatillo);
            consumos = new ArrayList<>();
            resultado = consulta.executeQuery();
            while (resultado.next()) {
                consumos.add(resultado.getObject("N"));
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return consumos;
    }

    public static ArrayList<Object> getIdConsumosXMesa_Platillo(int mesa, String nombrePlatillo) {
        Connection conexion;
        PreparedStatement consulta;
        ResultSet resultado;
        ArrayList<Object> consumos = null;
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("SELECT c.N,r.mesa,c.platillo FROM `ate.consumo` c INNER JOIN `ate.reserva` r on c.idReserva = r.idReserva WHERE c.estado='esperando' AND c.platillo=? AND r.mesa=? or c.estado='preparando' AND c.platillo=? AND r.mesa=?");
            consulta.setString(1, nombrePlatillo);
            consulta.setInt(2, mesa);
            consulta.setString(3, nombrePlatillo);
            consulta.setInt(4, mesa);
            consumos = new ArrayList<>();
            resultado = consulta.executeQuery();
            while (resultado.next()) {
                consumos.add(resultado.getObject("N"));
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return consumos;
    }

    public static void actualizarPedidos(MiInterfaz miMetodo) {

        // Inicia el hilo para verificar cambios
        Thread thread = new Thread(() -> {
            Connection conexion;
            Statement consulta;
            try {
                conexion = new ConexionSQL().conexion(); // Utiliza tu clase de conexión
                consulta = conexion.createStatement();

                ResultSet resultado = consulta.executeQuery("SELECT * FROM `ate.consumo` WHERE estado='esperando' or estado='preparando'");

                // Guarda el estado actual de la tabla
                ResultSetMetaData metaData = resultado.getMetaData();
                int columnCount = metaData.getColumnCount();
                StringBuilder currentState = new StringBuilder();

                while (resultado.next()) {
                    for (int i = 1; i <= columnCount; i++) {
                        currentState.append(resultado.getString(i)).append(" ");
                    }
                }

                // Bucle de polling para verificar cambios
                while (true) {
                    resultado = consulta.executeQuery("SELECT * FROM `ate.consumo` WHERE estado='esperando' or estado='preparando'");
                    StringBuilder newState = new StringBuilder();

                    while (resultado.next()) {
                        for (int i = 1; i <= columnCount; i++) {
                            newState.append(resultado.getString(i)).append(" ");
                        }
                    }

                    // Compara el estado actual con el estado anterior
                    if (!currentState.toString().equals(newState.toString())) {
                        miMetodo.Actualizar();
                        // Realiza las acciones necesarias aquí
                        currentState = newState;
                    }

                    // Espera un tiempo antes de volver a verificar
                    Thread.sleep(300); // ESPERAR EL TIEMPO (en este caso 100 milisegundos)
                }
            } catch (SQLException | InterruptedException | java.lang.ClassCastException e) {
                System.out.println("Error: " + e.getMessage());
            }
        });
        // Inicia el hilo
        thread.start();
    }

    public static Object consultarDatoPedido(int mesa, String columna) {
        Connection conexion;
        PreparedStatement consulta;
        ResultSet resultado;
        Object dato = null;

        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("SELECT consumo.N, reserva.idReserva, reserva.mesa, consumo.platillo, consumo.cantidad,consumo.fecha,consumo.hora FROM `ate.reserva` reserva INNER JOIN `ate.consumo` consumo ON reserva.idReserva = consumo.idReserva WHERE consumo.N=? AND consumo.estado = 'en espera'");
            consulta.setInt(1, mesa);
            resultado = consulta.executeQuery();
            if (resultado.next()) {
                dato = resultado.getObject(columna);
            }
            conexion.close();
            consulta.close();
            resultado.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return dato;
    }

    /**
     * *
     *
     * @param idCosumo cuando se le entrega el pedido al cliente
     */
    public static void finalizarPedido(int idCosumo) {

        Connection conexion;
        PreparedStatement consulta;
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("UPDATE `ate.consumo` set estado='finalizado' WHERE N=?");
            consulta.setInt(1, idCosumo);
            consulta.executeUpdate();
            conexion.close();
            consulta.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    public int getIdConsumo() {
        return idConsumo;
    }

    public int getMesa() {
        return mesa;
    }

    public String getPlatillo() {
        return platillo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public Time getHora() {
        return hora;
    }

}
