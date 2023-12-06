package com.modelo.action;

import com.glasspanepopup.GlassPanePopup;
import com.modelo.ui.Message;
import com.modelo.ui.MessageConf;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.sql.Date;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JComboBox;
import javax.swing.JPanel;

public class Action {

    public static void Pausar(int milisegundos) {
        try {
            Thread.sleep(milisegundos);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void AccederEnlace(String enlace) {
        String url = "C:\\Windows\\System32\\cmd.exe /K start " + enlace;
        try {
            Runtime.getRuntime().exec(url);
        } catch (IOException e) {
        }
    }

    public static double redondearDouble(double numero) {
        DecimalFormat df = new DecimalFormat("#.##");
        String numeroFormateado = df.format(numero);
        numeroFormateado = numeroFormateado.replace(",", ".");
        return Double.parseDouble(numeroFormateado);
    }

    public static String obtenerDesdeElComienzo(Object objeto, int cantidad) {
        if (cantidad <= 0 || !(objeto instanceof String)) {
            return "";
        }

        String palabra = (String) objeto;
        return palabra.substring(0, Math.min(cantidad, palabra.length()));
    }

    public static String obtenerDesdeElFinal(Object objeto, int cantidad) {
        if (cantidad <= 0 || !(objeto instanceof String)) {
            return "";
        }

        String palabra = (String) objeto;
        int startIndex = Math.max(0, palabra.length() - cantidad);
        return palabra.substring(startIndex);
    }

    public static boolean HayVacios(String... textos) {
        for (String k : textos) {
            if (k.equals("")) {
                return true;
            }
        }
        return false;
    }

    public static String separarApellido(String apellidos, int numeroApellido) {
        String[] partes = apellidos.split(" ");

        if (partes.length == 2) {
            if (numeroApellido == 1) {
                return partes[0];
            } else if (numeroApellido == 2) {
                return partes[1];
            }
        }

        return ""; // Retorna una cadena vacía si el índice no es 1 o 2.
    }

    public static void enviarCorreo(JTable tabla, String nombreArchivo) {
        XSSFWorkbook workbook = new XSSFWorkbook();
        Color color = Color.decode("#C4270B");
        ExportarExcel.exportToExcel(tabla, workbook, color);

        String correoRemitente = "improats@gmail.com";
        String contraseñaRemitente = "esilqzqruexyzpxy";
        String correoDestinatario = "benjij379@gmail.com";
        String asunto = nombreArchivo;
        String texto = "Reporte de " + nombreArchivo + " del restaurante";

        CorreoUtils.enviarCorreo(workbook, correoRemitente, contraseñaRemitente, correoDestinatario, asunto, texto, nombreArchivo);
    }

    public static void descargarTablaXlsx(JTable tabla, String nombreArchivo) {
        String defaultFileName = nombreArchivo;
        Color color = Color.decode("#C4270B");
        String fileExtension = "xlsx";
        String selectedFilePath = CustomFileChooser.FileChosserArchivo(defaultFileName, fileExtension, "Archivos excel");
        if (selectedFilePath == null) {
        } else {
            ExportarExcel.exportToExcel(tabla, selectedFilePath, color);
            Action.mensaje(defaultFileName + "." + fileExtension + " descargado");
        }
    }

    public static void mensajeError(String mesanje) {
        Message obj = new Message(mesanje, "Ha ocurrido un error");
        obj.eventOK((ActionEvent ae) -> {
            GlassPanePopup.closePopupLast();
        });
        GlassPanePopup.showPopup(obj);
    }

    public static Object datoFilaColumna(JTable tabla, int fila, String nombreColumna) {
        int columnaCodigo = 0;
        Object dato;
        for (int i = 0; i < tabla.getColumnCount(); i++) {
            if (tabla.getColumnName(i).equalsIgnoreCase(nombreColumna)) {
                columnaCodigo = i;
                break;
            }
        }
        dato = tabla.getValueAt(fila, columnaCodigo);
        return dato;
    }

    public static int confirmacion(String msj) {
        int confir = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, msj, "Confirmacion", confir, JOptionPane.WARNING_MESSAGE);
        return result;
    }

    public static void mensaje(String mensaje) {
//        JOptionPane.showMessageDialog(null, mensaje, "Mensaje", JOptionPane.PLAIN_MESSAGE, new UIController().icono("/com/img/icons/checkVerde.png"));
        Message obj = new Message(mensaje, "Accion realizada");
        obj.eventOK((ActionEvent ae) -> {
            GlassPanePopup.closePopupLast();
        });
        GlassPanePopup.showPopup(obj);
    }

    public static Date obtenerFechaActual() {
        // Obtén la fecha actual
        java.util.Date fechaActual = new java.util.Date();

        // Convierte la fecha actual a java.sql.Date
        Date fechaSQL = new Date(fechaActual.getTime());

        return fechaSQL;
    }

    public static ArrayList<JPanel> rellenarArrayList(JPanel... panel) {
        ArrayList<JPanel> paneles = new ArrayList<>();
        paneles.addAll(Arrays.asList(panel));
        return paneles;
    }

    public static ArrayList<Integer> ArrayListConvertirInteger(ArrayList<Object> arrayList) {
        ArrayList<Integer> arrayListInteger = new ArrayList<>();
        for (Object obj : arrayList) {
            try {
                // Intentar convertir cada elemento a Integer
                Integer intValue = Integer.valueOf(obj.toString());
                arrayListInteger.add(intValue);
            } catch (NumberFormatException e) {
                // Manejar el caso en el que no se pueda convertir a Integer
//                System.out.println("No se puede convertir: " + obj);
            }
        }
        return arrayListInteger;
    }

    public static ArrayList<String> ArrayListConvertirString(ArrayList<Object> arrayList) {

        ArrayList<String> arrayListString = new ArrayList<>();
        for (Object obj : arrayList) {
            try {
                // Convertir cada elemento a String
                String stringValue = obj.toString();
                arrayListString.add(stringValue);
            } catch (Exception e) {
//                System.out.println("Error: " + e.getMessage());
            }

        }
        return arrayListString;
    }

    public static void rellenarCombo(ArrayList<Object> datos, JComboBox combo) {
        for (Object obj : datos) {
            combo.addItem(obj);
        }
    }

    public static void msjC(MiInterfaz miInterfaz, String titulo) {
        MessageConf obj = new MessageConf(titulo);
        obj.eventOK((ActionEvent ae) -> {
            miInterfaz.Actualizar();
            GlassPanePopup.closePopupLast();
        });
        GlassPanePopup.showPopup(obj);
    }

    // Método para capitalizar un nombre
    public static String capitalizarNombre(String nombre) {
        String[] palabras = nombre.toLowerCase().split("\\s+");

        StringBuilder resultado = new StringBuilder();

        for (String palabra : palabras) {
            if (!palabra.isEmpty()) {
                resultado.append(Character.toUpperCase(palabra.charAt(0)))
                        .append(palabra.substring(1))
                        .append(" ");
            }
        }

        return resultado.toString().trim();
    }
}
