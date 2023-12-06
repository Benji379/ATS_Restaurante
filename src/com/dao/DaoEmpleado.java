package com.dao;

import com.modelo.action.Action;
import com.modelo.registro.Empleado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DaoEmpleado extends DaoPersona {

    public DaoEmpleado() {

    }

    public void insertEmpleado(Empleado empleado) {
        try {
            Connection conexion;
            PreparedStatement consulta;
            conexion = new ConexionSQL().conexion();
            insertPersona(empleado);
            consulta = conexion.prepareStatement("INSERT INTO `us.empleado`(idEmpleado,idPersona,correo,contraseña,cargo,estado) VALUES (?,?,?,?,?,?)");
            consulta.setString(1, empleado.getCodigo());
            consulta.setInt(2, empleado.getDni());
            consulta.setString(3, empleado.getCorreo());
            consulta.setString(4, empleado.getContraseña());
            consulta.setString(5, empleado.getCargo());
            consulta.setString(6, empleado.getEstado());
            consulta.executeUpdate();
            Action.mensaje("Registro exitoso");
            DaoNotificacion.registrarNotificacion("Nuevo empleado registrado");
            consulta.close();
            conexion.close();
        } catch (SQLException e) {
            System.out.println("ERROR de Registro de Empleado (" + e.getMessage() + ")");
        }
    }

    public static String getConsultarDato(String nameColumna) {
        String dato = null;
        Connection conexion;
        PreparedStatement consulta;
        ResultSet resultado;
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("SELECT * FROM `us.empleado` a inner join `us.persona` b on a.idPersona = b.idPersona WHERE a.idEmpleado = ?");
            consulta.setString(1, DaoLogin.ID_EMPLEADO);
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
    public static String getConsultarDato(String idEmpleado,String nameColumna) {
        String dato = null;
        Connection conexion;
        PreparedStatement consulta;
        ResultSet resultado;
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("SELECT * FROM `us.empleado` a inner join `us.persona` b on a.idPersona = b.idPersona WHERE a.idEmpleado = ?");
            consulta.setString(1, idEmpleado);
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

    @Override
    public ArrayList<Integer> getIdPersonas() {
        ArrayList<Integer> dnis = new ArrayList<>();
        Connection conexion;
        PreparedStatement consulta;
        ResultSet resultado;
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("SELECT * FROM `us.empleado`");
            resultado = consulta.executeQuery();
            while (resultado.next()) {
                dnis.add(resultado.getInt("idPersona"));
            }
            consulta.close();
            conexion.close();
            resultado.close();
        } catch (SQLException e) {
            System.out.println("ERROR : " + e.getMessage());
        }
        return dnis;
    }

    public void consultar(JTable tabla) {
        DefaultTableModel modelo;
        try {
            Connection conexion;
            PreparedStatement consulta;
            ResultSet resultado;
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("SELECT * FROM `us.empleado` a inner join `us.persona` b on a.idPersona = b.idPersona;");
            resultado = consulta.executeQuery();
            modelo = (DefaultTableModel) tabla.getModel();
            Object datos[] = new Object[9];
            modelo.setRowCount(0);
            while (resultado.next()) {
                datos[0] = resultado.getString("idEmpleado");
                datos[1] = resultado.getInt("idPersona");
                datos[2] = resultado.getString("nombre");
                datos[3] = resultado.getString("apellido");
                datos[4] = resultado.getString("correo");
                datos[5] = resultado.getString("cargo");
                datos[6] = resultado.getString("estado");
                datos[7] = resultado.getString("contraseña");
                datos[8] = resultado.getDate("fecha");
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

    public void eliminarEmpleado(String codigo) {
        try {
            Connection conexion;
            PreparedStatement consulta;
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("DELETE FROM `us.empleado` WHERE idEmpleado=?");
            consulta.setString(1, codigo);
            consulta.executeUpdate();
            DaoNotificacion.registrarNotificacion("Elimino a un empleado");
            conexion.close();
            consulta.close();
        } catch (SQLException e) {
            System.out.println("ERROR de eliminacion");
        }
    }

    public void modificar(String codigo, String correo, String contraseña, String cargo, String estado) {
        try {
            Connection conexion;
            PreparedStatement consulta;
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("UPDATE `us.empleado` set correo=?, contraseña=?, cargo=?, estado=? WHERE idEmpleado=?");
            consulta.setString(1, correo);
            consulta.setString(2, contraseña);
            consulta.setString(3, cargo);
            consulta.setString(4, estado);
            consulta.setString(5, codigo);
            consulta.executeUpdate();
            Action.mensaje("Modificacion Exitosa");
            DaoNotificacion.registrarNotificacion("Modifico un empleado");
            conexion.close();
            consulta.close();
        } catch (SQLException e) {
            System.out.println("ERROR de modificacion");
        }

    }

    public boolean usuarioExiste(int dni) {
        Connection conexion;
        PreparedStatement consulta;
        ResultSet resultado;
        boolean existe = false;
        try {
            conexion = new ConexionSQL().conexion();
            consulta = conexion.prepareStatement("SELECT * FROM `us.empleado` WHERE idPersona=?");
            consulta.setInt(1, dni);
            resultado = consulta.executeQuery();
            if (resultado.next()) {
                existe = true;
            }
            conexion.close();
            consulta.close();
            resultado.close();
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        return existe;
    }
}
