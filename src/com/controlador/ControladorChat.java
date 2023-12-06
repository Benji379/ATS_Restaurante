package com.controlador;

import com.chat.component.ChatBox;
import com.chat.model.ModelMessage;
import com.chat.swing.ChatEvent;
import com.dao.DaoChat;
import com.dao.DaoLogin;
import com.modelo.action.Action;
import com.modelo.action.Tiempo;
import com.modelo.registro.Chat;
import com.modelo.registro.UsuarioChat;
import com.modelo.ui.JListCustom;
import com.modelo.ui.UIController;
import com.vista.ModuloChat;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class ControladorChat {

    ModuloChat c;

    public ControladorChat(ModuloChat c) {
        this.c = c;
    }

    public void initDiseño() {
        JListCustom.customizeJList(c.listaEmpleados, 35, 3, 9);
        UIController.removerBordeBlanco(c.jScrollPane1);
        rellenarLista();
        initEventoSeleccionArrayList();
        eventoEnviarMensaje();
        DaoChat.actualizarChat(() -> cargarMensajes());
    }

    ArrayList<String> nombres = new ArrayList<>();

    private void rellenarLista() {
        for (UsuarioChat nom : DaoChat.getUsuarios()) {
            nombres.add(Action.capitalizarNombre(nom.getNombreCompleto()));
        }
        UIController.llenarJList(c.listaEmpleados, nombres);
    }

    String idEmisor = DaoLogin.ID_EMPLEADO;
    String idReceptor;

    private void initEventoSeleccionArrayList() {
        c.listaEmpleados.addListSelectionListener((javax.swing.event.ListSelectionEvent evt) -> {
            int ID = c.listaEmpleados.getSelectedIndex();
            String nombre = DaoChat.getUsuarios().get(ID).getNombreCompleto();
            String codigo = DaoChat.getUsuarios().get(ID).getCodigo();
            idReceptor = codigo;
            c.chat.setTitle("(" + codigo + ") - " + nombre);
            cargarMensajes();
        });
    }

    private void eventoEnviarMensaje() {
        c.chat.addChatEvent(new ChatEvent() {
            @Override
            public void mousePressedSendButton(ActionEvent evt) {
                registrarMensaje();
            }

            @Override
            public void mousePressedFileButton(ActionEvent evt) {
            }

            @Override
            public void keyTyped(KeyEvent evt) {
            }
        });
    }

    private void cargarMensajes() {
        limpiarChat();
        ArrayList<Chat> conversaciones = DaoChat.conversaciones();
        Icon icon = new ImageIcon(getClass().getResource("/com/img/icons/user.png"));
        for (Chat con : conversaciones) {
            if (con.getIdEmisor().equalsIgnoreCase(idEmisor) && con.getIdReceptor().equalsIgnoreCase(idReceptor)) {
                String fecha = Tiempo.formatearFechaHora(con.getFecha(), con.getHora());
                String mensaje = con.getMensaje();
                c.chat.addChatBox(new ModelMessage(icon, con.getIdEmisor(), fecha, mensaje), ChatBox.BoxType.RIGHT);
            } else {
                if (con.getIdEmisor().equalsIgnoreCase(idReceptor) && con.getIdReceptor().equalsIgnoreCase(idEmisor)) {
                    String fecha = Tiempo.formatearFechaHora(con.getFecha(), con.getHora());
                    String mensaje = con.getMensaje();
                    c.chat.addChatBox(new ModelMessage(icon, con.getIdEmisor(), fecha, mensaje), ChatBox.BoxType.LEFT);
                }
            }

        }

    }

    private void limpiarChat(){
        c.chat.clearChatBox();
    }
    
    private void registrarMensaje() {
        if (idReceptor != null) {
            String mensaje = c.chat.getText().trim();
            Chat chat = new Chat(idEmisor, idReceptor, mensaje, Tiempo.getFecha(), Tiempo.getHora());
            DaoChat.ingresarConversacion(chat);
            c.chat.clearTextAndGrabFocus();
            
        }
    }

}
