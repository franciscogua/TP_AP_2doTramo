package com.empresa.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Cliente {
    private String razonSocial;
    private String CUIT;
    private List<Incidente> incidentesReportados = new ArrayList<>();

    public Cliente(String razonSocial, String CUIT) {
        this.razonSocial = razonSocial;
        this.CUIT = CUIT;
    }

    public void reportarIncidente(Incidente incidente) {
        incidentesReportados.add(incidente);
    }

    public void recibirNotificacion(String mensaje) {
        // Lógica para notificar al cliente, por ejemplo, enviar un correo o mensaje.
        System.out.println("Notificación al cliente (" + razonSocial + "): " + mensaje);
    }
}