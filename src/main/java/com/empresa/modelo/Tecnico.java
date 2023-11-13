package com.empresa.modelo;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Tecnico {
    private List<Especialidad> especialidades = new ArrayList<>();
    private int incidentesResueltos;
    private int tiempoEstimadoPorDefecto;
    private String medioDeNotificacionPreferido;

    public void marcarComoResuelto(Incidente incidente) {

    }
}
