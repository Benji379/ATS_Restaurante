package com.modelo.registro;

import java.sql.*;

public class Factura {

    private final String idFactura;
    private final String idReserva;
    private final String cajero;
    private final String tipoPago;
    private final double subTotal;
    private final Date fecha;
    private final Time hora;
    private static final double IGV = 0.18;
    
    public Factura(String idFactura, String idReserva, String cajero, String tipoPago, double subtTotal, Date fecha, Time hora) {
        this.idFactura = idFactura;
        this.idReserva = idReserva;
        this.cajero = cajero;
        this.tipoPago = tipoPago;
        this.subTotal = subtTotal;
        this.fecha = fecha;
        this.hora = hora;
    }

    public String getIdFactura() {
        return idFactura;
    }

    public String getIdReserva() {
        return idReserva;
    }

    public String getCajero() {
        return cajero;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public Date getFecha() {
        return fecha;
    }

    public Time getHora() {
        return hora;
    }
    
    public double getIGV(){
        return IGV * subTotal;
    }
    
    public double getTotal(){
        return subTotal + getIGV();
    }
    
}
