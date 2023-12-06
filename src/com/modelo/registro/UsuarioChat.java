package com.modelo.registro;

public class UsuarioChat {

    String codigo;
    String nombreCompleto;
    
    
    public UsuarioChat(String codigo, String nombreCompleto) {
        this.codigo = codigo;
        this.nombreCompleto = nombreCompleto;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }
    
    
}
