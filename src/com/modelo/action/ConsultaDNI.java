package com.modelo.action;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONException;
import org.json.JSONObject;

public class ConsultaDNI {

    private final Object dni;
    private String nombres;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private boolean valido;

    public ConsultaDNI(Object dni) {
        this.dni = dni;
        Consultar();
    }

    private void Consultar() {
        try {
            String token = "apis-token-5880.5fRO9Pc4H1NbL46c1q6iOZ9DGqxT8BfL";
            String url = "https://api.apis.net.pe/v2/reniec/dni?numero=" + dni;
            URL apiUrl = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) apiUrl.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Authorization", "Bearer " + token);

            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                StringBuilder response;
                try (BufferedReader apiReader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                    response = new StringBuilder();
                    String line;
                    while ((line = apiReader.readLine()) != null) {
                        response.append(line);
                    }
                }

                // Procesar la respuesta JSON
                JSONObject json = new JSONObject(response.toString());

                this.nombres = json.getString("nombres");
                this.apellidoPaterno = json.getString("apellidoPaterno");
                this.apellidoMaterno = json.getString("apellidoMaterno");
                this.valido = true;

            } else {
//                System.out.println("Error en la solicitud. Codigo de respuesta: " + responseCode);
                this.valido = false;
            }
            connection.disconnect();

        } catch (IOException | JSONException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    public Object getDni() {
        return dni;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidoPaterno + " " + apellidoMaterno;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public boolean getValido() {
        return valido;
    }

}
