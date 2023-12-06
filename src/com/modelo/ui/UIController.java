package com.modelo.ui;

import com.modelo.action.Action;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import textfield_suggestion.TextFieldSuggestion;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class UIController {

    public static void MostrarPanel(JPanel contenedor, JPanel panel) {
        contenedor.removeAll();
        contenedor.add(panel, BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
    }

    public static void scrollToTop(JScrollPane scrollPane) {
        JScrollBar verticalScrollBar = scrollPane.getVerticalScrollBar();
        verticalScrollBar.setValue(verticalScrollBar.getMinimum());
    }

    public static void setPanelBackgroundColors(JPanel panel, String pressedColor, String rolloverColor) {
        Color normalColor = panel.getBackground();

        panel.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel.setBackground(Color.decode(pressedColor));
            }

            @Override
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                panel.setBackground(normalColor);
            }

            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel.setBackground(Color.decode(rolloverColor));
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel.setBackground(normalColor);
            }
        });
    }

    public static void removerBordeBlanco(JScrollPane scrollPane) {
        scrollPane.setBorder(new EmptyBorder(0, 0, 0, 0));
    }

    public Icon icono(String path, int width, int heigth) {
        Icon img = new ImageIcon(new ImageIcon(getClass().getResource(path)).getImage().getScaledInstance(width, heigth, java.awt.Image.SCALE_SMOOTH));
        return img;
    }

    public Icon icono(String path) {
        Icon img = new ImageIcon(new ImageIcon(getClass().getResource(path)).getImage().getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH));
        return img;
    }

    public static void AccederEnlace(String enlace) {
        String url = "C:\\Windows\\System32\\cmd.exe /K start " + enlace;
        try {
            Runtime.getRuntime().exec(url);
        } catch (IOException e) {
        }
    }

    public static void transparentarTxtField(JTextField... txtField) {
        for (JTextField txt : txtField) {
            txt.setBackground(new java.awt.Color(0, 0, 0, 1));
            txt.setBorder(null);
        }
    }

    public static boolean ComprobarTxtVacio(JTextField... txt) {
        boolean vacio;
        for (JTextField text : txt) {
            vacio = text.getText().equals("");
            if (vacio) {
                return vacio;
            }
        }
        return false;
    }

    public static void limitacionCaracteres(JTextField txtField, KeyEvent evt, int cantNumeros, boolean conEspacio) {
        if (conEspacio) {
            if (txtField.getText().length() >= cantNumeros) {
                evt.consume();
            }
        } else {
            int key = evt.getKeyChar();
            boolean espacio = key == KeyEvent.VK_SPACE;
            if (espacio) {
                evt.consume();
            } else {
                if (txtField.getText().length() >= cantNumeros) {
                    evt.consume();
                }
            }
        }
    }

    public static void limitacionNumeros(JTextField txtField, KeyEvent evt, int CantNumeros) {
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        boolean espacio = key == KeyEvent.VK_SPACE;
        if (!numeros || espacio) {
            evt.consume();
        } else {
            if (txtField.getText().length() >= CantNumeros) {
                evt.consume();
            }
        }
    }

    public static void limitacionEspacio(JTextField txtField, KeyEvent evt) {
        int key = evt.getKeyChar();
        boolean espacio = key == KeyEvent.VK_SPACE;

        if (espacio) {
            evt.consume();
        }
    }

    public static void limitacionNumerosDecimales(JTextField txtField, KeyEvent evt, int CantNumeros) {
        char key = evt.getKeyChar();
        String text = txtField.getText();
        boolean tienePunto = text.contains(".");

        if (!Character.isDigit(key) && key != '.' || (tienePunto && key == '.') || (key == '.' && text.indexOf('.') != text.lastIndexOf('.'))) {
            evt.consume();
        } else {
            if (text.length() >= CantNumeros) {
                evt.consume();
            }
        }
    }

    public static void limitacionNumeros(JTextField txtField, KeyEvent evt, int CantNumeros, String caracterAdicionalPermitir) {
        int key = evt.getKeyChar();
        boolean numeros = (key >= 48 && key <= 57) || key == 46; // Permitir números y el punto (.)
        boolean espacio = key == KeyEvent.VK_SPACE;

        String text = txtField.getText();
        boolean tienePunto = text.contains(caracterAdicionalPermitir);

        if (!numeros || (tienePunto && key == 46) || espacio) {
            evt.consume();
        } else {
            if (text.length() >= CantNumeros) {
                evt.consume();
            }
        }
    }

    public static boolean validacionDeDecimal(JTextField txtField) {
        String text = txtField.getText();
        int countDots = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '.') {
                countDots++;
            }
            if (countDots > 1) {
                return false;
            }
        }
        return true;
    }

    public static void limpiarTxtField(JTextField... txt) {
        for (JTextField t : txt) {
            t.setText("");
        }
    }

    public static void scrollInvisible(JScrollPane scroll) {
        scroll.getViewport().setOpaque(false);
        scroll.setViewportBorder(null);
        scroll.setBorder(null);
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

    public static void textAreaInivisible(JTextArea textArea, JScrollPane scrollTextArea) {
        textArea.setBackground(new Color(255, 255, 255, 0)); // 128 es el nivel de opacidad
        UIController.scrollInvisible(scrollTextArea);
        textArea.setWrapStyleWord(true); // Activa el ajuste de líneas
        textArea.setLineWrap(true); // Activa el ajuste de líneas
    }

    public static void eliminarRepetidos(JComboBox<Object> comboBox) {
        int itemCount = comboBox.getItemCount();

        for (int i = 0; i < itemCount; i++) {
            Object currentItem = comboBox.getItemAt(i);

            for (int j = i + 1; j < itemCount; j++) {
                if (currentItem.equals(comboBox.getItemAt(j))) {
                    comboBox.removeItemAt(j);
                    itemCount--; // Ajustar el recuento después de la eliminación
                    j--; // Ajustar el índice para evitar omitir el próximo elemento
                }
            }
        }
    }

    public static void rellenarTextFieldSugestion(ArrayList<String> datos, TextFieldSuggestion text) {
        text.removeAllItems();
        for (int i = 0; i < datos.size(); i++) {
            text.addItemSuggestion(datos.get(i));
        }
    }

    // Método para llenar un JList con un ArrayList de objetos
    // Método para llenar un JList con un ArrayList de objetos
    public static <T> void llenarJList(JList<T> jList, ArrayList<T> datos) {
        // Convertir el ArrayList a un arreglo
        T[] dataArray = (T[]) datos.toArray(Object[]::new);

        // Establecer el arreglo como nuevo modelo para el JList
        jList.setListData(dataArray);
    }

    public static void capturePanel(JPanel panel, File outputDirectory, String fileName) {
        BufferedImage image = new BufferedImage(panel.getWidth(), panel.getHeight(), BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics = image.createGraphics();
        panel.printAll(graphics);
        graphics.dispose();

        // Agregar la extensión .png al nombre del archivo si no está presente
        if (!fileName.toLowerCase().endsWith(".png")) {
            fileName += ".png";
        }

        String filePath = outputDirectory.getAbsolutePath() + File.separator + fileName;

        try {
            // Verificar si el directorio de destino existe, si no, crearlo
            if (!outputDirectory.exists()) {
                outputDirectory.mkdirs();
            }

            ImageIO.write(image, "png", new File(filePath));
            Action.mensaje("Carnet descargado");
        } catch (IOException e) {
            Action.mensajeError("Error: " + e.getMessage());
        }
    }
    
    private Timer ttimmer;
    private int innndex;

    public void mostrarTextoAnimado(JLabel label, String texto, int milisegundos) {
        label.setText("");

        ActionListener actionListener = (ActionEvent e) -> {
            if (innndex < texto.length()) {
                label.setText(label.getText() + texto.charAt(innndex));
                innndex++;
            } else {
                ttimmer.stop();
            }
        };

        ttimmer = new Timer(milisegundos, actionListener);
        ttimmer.start();
    }
}
