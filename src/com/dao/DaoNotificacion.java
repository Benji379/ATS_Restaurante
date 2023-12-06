package com.dao;

import com.modelo.action.MiInterfaz;
import com.modelo.action.Tiempo;
import com.modelo.registro.Notificacion;
import java.sql.*;
import java.util.ArrayList;

public class DaoNotificacion {

    public static int cantidadNotificacionNoVista() {

        Connection conexion;
        PreparedStatement consulta;
        ResultSet resultado;

        int noVistoCant = 0;
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("SELECT * FROM `re.notificaciones` WHERE visto='no' ");
            resultado = consulta.executeQuery();
            while (resultado.next()) {
                noVistoCant++;
            }
            conexion.close();
            consulta.close();
            resultado.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return noVistoCant;
    }

    public static ArrayList<Notificacion> notificaciones() {
        Connection conexion;
        PreparedStatement consulta;
        ResultSet resultado;
        ArrayList<Notificacion> notificaciones = null;
        try {
            notificaciones = new ArrayList<>();
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("SELECT * FROM `re.notificaciones` ORDER BY CONCAT(fecha, ' ', hora) DESC;");
            resultado = consulta.executeQuery();
            while (resultado.next()) {
                String idEmpleado = resultado.getString("idEmpleado");
                String descripcion = resultado.getString("descripcion");
                String visto = resultado.getString("visto");
                int ID_Noti = resultado.getInt("N");
                Notificacion noti = new Notificacion(ID_Noti, idEmpleado, descripcion, resultado.getDate("fecha"), resultado.getTime("hora"), visto);
                notificaciones.add(noti);
            }
            conexion.close();
            consulta.close();
            resultado.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return notificaciones;
    }

    public static void registrarNotificacion(String descripcion) {
        Connection conexion;
        PreparedStatement consulta;
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("INSERT INTO `re.notificaciones` (idEmpleado,descripcion,fecha,hora,visto) VALUES (?,?,?,?,?)");
            consulta.setString(1, DaoLogin.ID_EMPLEADO);
            consulta.setString(2, descripcion);
            consulta.setDate(3, Tiempo.getFecha());
            consulta.setTime(4, Tiempo.getHora());
            consulta.setString(5, "no");
            consulta.executeUpdate();
            conexion.close();
            consulta.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void verNotificacion(int ID_Notificacion) {
        Connection conexion;
        PreparedStatement consulta;
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("UPDATE `re.notificaciones` set visto=? WHERE N=?");
            consulta.setString(1, "si");
            consulta.setInt(2, ID_Notificacion);
            consulta.executeUpdate();
            conexion.close();
            consulta.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void actualizarNotificacion(MiInterfaz miMetodo) {

        // Inicia el hilo para verificar cambios
        Thread thread = new Thread(() -> {
            Connection conexion;
            Statement consulta;
            try {
                conexion = new ConexionSQL().conexion(); // Utiliza tu clase de conexión
                consulta = conexion.createStatement();

                ResultSet resultado = consulta.executeQuery("SELECT * FROM `re.notificaciones`");

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
                    resultado = consulta.executeQuery("SELECT * FROM `re.notificaciones`");
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

}
