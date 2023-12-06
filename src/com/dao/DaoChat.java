package com.dao;

import com.modelo.action.MiInterfaz;
import com.modelo.registro.Chat;
import com.modelo.registro.UsuarioChat;
import java.sql.*;
import java.util.ArrayList;

public class DaoChat {

    public static ArrayList<UsuarioChat> getUsuarios() {
        Connection conexion;
        PreparedStatement consulta;
        ResultSet resultado;
        ArrayList<UsuarioChat> usuarios = null;
        try {
            usuarios = new ArrayList<>();
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("SELECT * FROM `us.empleado` empleado INNER JOIN `us.persona` persona ON empleado.idPersona = persona.idPersona");
            resultado = consulta.executeQuery();
            while (resultado.next()) {
                String codigo = resultado.getString("idEmpleado");
                String nombre = resultado.getString("nombre") + " " + resultado.getString("apellido");
                UsuarioChat usC = new UsuarioChat(codigo, nombre);
                usuarios.add(usC);
            }
            conexion.close();
            consulta.close();
            resultado.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return usuarios;
    }

    public static ArrayList<Chat> conversaciones() {
        Connection conexion;
        PreparedStatement consulta;
        ResultSet resultado;
        ArrayList<Chat> conversaciones = null;
        try {
            conversaciones = new ArrayList<>();
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("SELECT * FROM `us.chat`");
            resultado = consulta.executeQuery();
            while (resultado.next()) {
                String idEmisor = resultado.getString("idEmisor");
                String idReceptor = resultado.getString("idReceptor");
                String mensaje = resultado.getString("mensaje");
                Date fecha = resultado.getDate("fecha");
                Time hora = resultado.getTime("hora");
                Chat c = new Chat(idEmisor, idReceptor, mensaje, fecha, hora);
                conversaciones.add(c);
            }
            conexion.close();
            consulta.close();
            resultado.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }

        return conversaciones;
    }

    public static void ingresarConversacion(Chat c) {
        Connection conexion;
        PreparedStatement consulta;
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("INSERT INTO `us.chat` (idEmisor,idReceptor,mensaje,fecha,hora) VALUES (?,?,?,?,?)");
            consulta.setString(1, c.getIdEmisor());
            consulta.setString(2, c.getIdReceptor());
            consulta.setString(3, c.getMensaje());
            consulta.setDate(4, c.getFecha());
            consulta.setTime(5, c.getHora());;
            consulta.executeUpdate();
            conexion.close();
            consulta.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    public static void actualizarChat(MiInterfaz miMetodo) {

        // Inicia el hilo para verificar cambios
        Thread thread = new Thread(() -> {
            Connection conexion;
            Statement consulta;
            try {
                conexion = new ConexionSQL().conexion(); // Utiliza tu clase de conexión
                consulta = conexion.createStatement();

                ResultSet resultado = consulta.executeQuery("SELECT * FROM `us.chat`");

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
                    resultado = consulta.executeQuery("SELECT * FROM `us.chat`");
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
