package com.empresa.modelo;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class MesaDeAyuda {
    private List<Incidente> incidentesAsignados = new ArrayList<>();

    public void solicitarDatosCliente() {

    }

    public void ingresarIncidente() {

    }

    public void seleccionarTecnico() {

    }

    public void enviarNotificacionTecnico() {

    }

    public void enviarNotificacionCliente() {

    }
}
