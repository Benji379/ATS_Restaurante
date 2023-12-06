package com.modelo.registro;

import com.modelo.action.Action;
import com.modelo.action.Tiempo;

public final class Empleado extends Persona {

    private String cargo;
    private String correo;
    private String estado;
    private String codigo;
    private String contrase�a;

    /**
     * *
     *
     * @param cargo cargo del empleado
     * @param correo correo del empleado
     * @param dni dni del empleado
     * @param estado estado de trabajo (suspendido, habilitado)
     * @param contrase�a contrase�a del empleado
     */
    public Empleado(String cargo, String correo, int dni, String estado, String contrase�a) {
        super(dni);
        this.cargo = cargo;
        this.correo = correo;
        this.estado = estado;
        this.codigo = getCodigo();
        this.contrase�a = contrase�a;
    }
    
    public double getSueldo() {
        switch (cargo) {
            case "administrador":
                return 3000;
            case "cocina":
                return 2200;
            case "mesero":
                return 1500;
            case "caja":
                return 1100;
        }
        return 0;
    }

    /**
     * *
     *
     * @param dni
     * @param apellido
     * @param cargo
     * @return formato del codigo que se retorna
     *
     * iniciaCorrespondiente + ultimos 2 digitos del a�o + primeros 2 digitos
     * del dni + primeros 2 digitos del 1er apellido + ultimo digito del 1er
     * apellido
     */
    public static String generarCodigo(String cargo, int dni, String apellido) {
        //A,C,E
        String inicial = "";
        String a�o = Action.obtenerDesdeElFinal("" + Tiempo.getYear(), 2);
        String digitos2Dni = Action.obtenerDesdeElComienzo("" + dni, 2);
        String digitos3Apellido = Action.obtenerDesdeElComienzo(apellido, 2) + Action.obtenerDesdeElFinal(apellido, 1);

        switch (cargo) {
            case "administrador":
                inicial = "A";
                break;
            case "cocina":
                inicial = "O";
                break;
            case "mesero":
                inicial = "M";
                break;
            case "caja":
                inicial = "C";
                break;
        }
        return inicial + a�o + digitos2Dni + digitos3Apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getContrase�a() {
        return contrase�a;
    }

    public void setContrase�a(String contrase�a) {
        this.contrase�a = contrase�a;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCodigo() {
        return generarCodigo(cargo, dni, apellido);
    }

}
