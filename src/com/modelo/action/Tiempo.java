package com.modelo.action;

import java.util.Calendar;
import java.util.Date;
import java.sql.Time;
import java.text.SimpleDateFormat;

public class Tiempo {

    public static java.sql.Date getFecha() {
        // Obtener la fecha actual
        Date date = new Date(System.currentTimeMillis());

        // Convertir java.util.Date a java.sql.Date
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());

        return sqlDate;
    }

    public static Time getHora() {
        // Obtener la hora actual del sistema
        long currentTimeMillis = System.currentTimeMillis();
        Time horaActual = new Time(currentTimeMillis);

        return horaActual;
    }

    public static int getYear() {
        Calendar calendar = Calendar.getInstance();
        return calendar.get(Calendar.YEAR);
    }

    public static String formatearFechaHora(java.sql.Date fecha, java.sql.Time hora) {
        // Combina la fecha y la hora en un objeto Timestamp
        java.util.Date utilDate = new java.util.Date(fecha.getTime());
        utilDate.setHours(hora.getHours());
        utilDate.setMinutes(hora.getMinutes());
        utilDate.setSeconds(hora.getSeconds());

        // Define el formato de salida
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy, hh:mmaa");

        // Formatea la fecha y hora y devuelve la cadena resultante
        return formato.format(utilDate);
    }

//    public static void main(String[] args) {
//        System.out.println(Tiempo.formatearFechaHora(getFecha(), getHora()));
//        System.out.println(getFecha());
//        System.out.println(getHora());
//    }
}
