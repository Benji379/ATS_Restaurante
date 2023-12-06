package com.modelo.action;

import java.awt.HeadlessException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CorreoUtils {

    public static void enviarCorreo(String correoRemitente, String contraseñaRemitente, String correoDestinatario, String asunto, String texto, String archivoAdjunto) {
        // Configura las propiedades del correo
        Properties propiedades = new Properties();
        propiedades.put("mail.smtp.host", "smtp.gmail.com");
        propiedades.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        propiedades.setProperty("mail.smtp.starttls.enable", "true");
        propiedades.setProperty("mail.smtp.port", "587");
        propiedades.setProperty("mail.smtp.user", correoRemitente);
        propiedades.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");
        propiedades.setProperty("mail.smtp.auth", "true");

        Session session = Session.getDefaultInstance(propiedades);

        try {
            // Crea un mensaje de correo
            MimeMessage correo = new MimeMessage(session);
            correo.setFrom(new InternetAddress(correoRemitente));
            correo.setRecipient(Message.RecipientType.TO, new InternetAddress(correoDestinatario));
            correo.setSubject(asunto);

            // Contenido del correo
            MimeBodyPart contenido = new MimeBodyPart();
            contenido.setContent(texto, "text/html; charset=utf-8");

            // Agrega archivo adjunto
            MimeBodyPart adjunto = new MimeBodyPart();
            adjunto.setDataHandler(new DataHandler(new FileDataSource(archivoAdjunto)));
            adjunto.setFileName(new File(archivoAdjunto).getName());

            // Crea una parte multipart para combinar el contenido y el archivo adjunto
            MimeMultipart elementosCorreo = new MimeMultipart();
            elementosCorreo.addBodyPart(contenido);
            elementosCorreo.addBodyPart(adjunto);

            // Agrega los elementos al mensaje de correo
            correo.setContent(elementosCorreo);

            // Conecta y envía el correo
            Transport transport = session.getTransport("smtp");
            transport.connect(correoRemitente, contraseñaRemitente);
            transport.sendMessage(correo, correo.getRecipients(Message.RecipientType.TO));
            transport.close();
            Action.mensaje("Correo enviado");

        } catch (HeadlessException | MessagingException ex) {
            System.out.println("ERROR: " + ex.getMessage());
            Action.mensajeError("Correo inexistente");
        }
    }

    public static void enviarCorreo(XSSFWorkbook workbook, String correoRemitente, String contraseñaRemitente, String correoDestinatario, String asunto, String texto, String nombreArchivo) {
        Properties propiedades = new Properties();
        propiedades.put("mail.smtp.host", "smtp.gmail.com");
        propiedades.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        propiedades.setProperty("mail.smtp.starttls.enable", "true");
        propiedades.setProperty("mail.smtp.port", "587");
        propiedades.setProperty("mail.smtp.user", correoRemitente);
        propiedades.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");
        propiedades.setProperty("mail.smtp.auth", "true");

        Session session = Session.getDefaultInstance(propiedades);

        try {
            MimeMessage correo = new MimeMessage(session);
            correo.setFrom(new InternetAddress(correoRemitente));
            correo.setRecipient(Message.RecipientType.TO, new InternetAddress(correoDestinatario));
            correo.setSubject(asunto);

            // Contenido del correo
            MimeBodyPart contenido = new MimeBodyPart();
            contenido.setContent(texto, "text/html; charset=utf-8");

            // Adjunta el archivo Excel al correo
            MimeBodyPart adjunto = new MimeBodyPart();

            // Crear el archivo con el nombre deseado
            File tempFile = new File("data/excel/" + nombreArchivo + ".xlsx");
            try (FileOutputStream fos = new FileOutputStream(tempFile)) {
                workbook.write(fos);
            }
            adjunto.setDataHandler(new DataHandler(new FileDataSource(tempFile)));
            adjunto.setFileName(tempFile.getName());

            // Combina el contenido y el archivo adjunto
            MimeMultipart elementosCorreo = new MimeMultipart();
            elementosCorreo.addBodyPart(contenido);
            elementosCorreo.addBodyPart(adjunto);

            correo.setContent(elementosCorreo);

            // Conecta y envía el correo
            Transport transport = session.getTransport("smtp");
            transport.connect(correoRemitente, contraseñaRemitente);
            transport.sendMessage(correo, correo.getRecipients(Message.RecipientType.TO));
            transport.close();

            Action.mensaje("Correo enviado");
        } catch (HeadlessException | MessagingException | IOException ex) {
            Action.mensajeError("Correo inexistente");
        }
    }

}
