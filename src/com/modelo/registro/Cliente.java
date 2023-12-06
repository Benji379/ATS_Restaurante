package com.modelo.registro;

public class Cliente extends Persona {

    private int puntos;
    private final String idCliente;

    public Cliente(int puntos, int dni, String idCliente) {
        super(dni);
        this.puntos = puntos;
        this.idCliente = idCliente;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public String getIdCliente() {
        return idCliente;
    }

}
