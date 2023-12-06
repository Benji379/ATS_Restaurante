package com.controlador;

import com.dao.DaoCocina;
import com.modelo.action.Action;
import com.modelo.action.PanelesDinamicos;
import com.modelo.ui.UIController;
import com.vista.ModuloCocina;
import com.vista.NuevoPedido;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;

public class ControladorCocina {

    ModuloCocina c;

    public ControladorCocina(ModuloCocina c) {
        this.c = c;
    }

    public ControladorCocina() {
    }

    public void initDiseño() {
        rellenarComboFiltros();
        initEventosCombox();
        c.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                filtrarXCondicion();
            }
        });
        DaoCocina.actualizarPedidos(() -> filtrarXCondicion());
    }

    public void mostrarTodosLosPedidos(ArrayList<Integer> idDatos) {
        try {
            c.Contenedor_Platos.removeAll();
            c.Contenedor_Platos.repaint();
            c.Contenedor_Platos.revalidate();
            PanelesDinamicos panelesDinamicos = new PanelesDinamicos();
            for (int N : idDatos) {
                DaoCocina daoCocima = new DaoCocina(N);
                int ID_Consumo = daoCocima.getIdConsumo();
                int mesa = daoCocima.getMesa();
                String platillo = daoCocima.getPlatillo();
                int cantidad = daoCocima.getCantidad();
                Date fecha = daoCocima.getFecha();
                Time hora = daoCocima.getHora();
                NuevoPedido p = new NuevoPedido(ID_Consumo, mesa, platillo, cantidad, fecha, hora);
                panelesDinamicos.AgregarPanel(c.Contenedor_Platos, 10, p);
                panelesDinamicos.reorganizePanels(c, c.Contenedor_Platos, p, 10);
            }
        } catch (java.lang.NullPointerException | java.lang.ArrayIndexOutOfBoundsException | java.lang.ClassCastException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private void rellenarComboFiltros() {
        //remuevo los items anteriores para que no se esten duplicando
        c.comboFiltrarMesa.removeAllItems();
        c.comboFiltrarPlatillo.removeAllItems();
        //pongo la opcion de filtrar todo
        c.comboFiltrarMesa.addItem("todo");
        c.comboFiltrarPlatillo.addItem("todo");
        //relleno el JComboBox con los valores encontrados
        Action.rellenarCombo(DaoCocina.getIdConsumos("mesa"), c.comboFiltrarMesa);
        Action.rellenarCombo(DaoCocina.getIdConsumos("platillo"), c.comboFiltrarPlatillo);
        //elimino valores repetidos
        UIController.eliminarRepetidos(c.comboFiltrarMesa);
        UIController.eliminarRepetidos(c.comboFiltrarPlatillo);
    }

    public void initEventosCombox() {
        c.comboFiltrarPlatillo.addActionListener((java.awt.event.ActionEvent evt) -> {
            condicionPlatillo = c.comboFiltrarPlatillo.getSelectedItem().toString();
            filtrarXCondicion();
        });
        c.comboFiltrarMesa.addActionListener((java.awt.event.ActionEvent evt) -> {
            condicionMesa = c.comboFiltrarMesa.getSelectedItem().toString();
            filtrarXCondicion();
        });
    }
    String condicionPlatillo = "todo";
    String condicionMesa = "todo";

    public void filtrarXCondicion() {
        try {

            if (condicionPlatillo.equalsIgnoreCase("todo") && condicionMesa.equalsIgnoreCase("todo")) {
                mostrarTodosLosPedidos(Action.ArrayListConvertirInteger(DaoCocina.getIdConsumos("N")));
            } else {
                if (condicionPlatillo.equalsIgnoreCase("todo") && !condicionMesa.equalsIgnoreCase("todo")) {
                    int mesa = Integer.parseInt(condicionMesa);
                    mostrarTodosLosPedidos(Action.ArrayListConvertirInteger(DaoCocina.getIdConsumosXMesa(mesa)));
                } else {
                    if (condicionMesa.equalsIgnoreCase("todo") && !condicionPlatillo.equalsIgnoreCase("todo")) {
                        String platillo = condicionPlatillo;
                        mostrarTodosLosPedidos(Action.ArrayListConvertirInteger(DaoCocina.getIdConsumosXPlatillo(platillo)));
                    } else {
                        if (!condicionPlatillo.equalsIgnoreCase("todo") && !condicionMesa.equalsIgnoreCase("todo")) {
                            int mesa = Integer.parseInt(condicionMesa);
                            String platillo = condicionPlatillo;
                            mostrarTodosLosPedidos(Action.ArrayListConvertirInteger(DaoCocina.getIdConsumosXMesa_Platillo(mesa, platillo)));
                        }
                    }
                }
            }
        } catch (NumberFormatException | NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}
//        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(c);
//        c.addComponentListener(new ComponentAdapter() {
//            @Override
//            public void componentResized(ComponentEvent e) {
//                mostrarTodosLosPedidos();
//            }
//        });
