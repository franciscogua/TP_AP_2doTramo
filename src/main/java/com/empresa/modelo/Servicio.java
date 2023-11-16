package com.empresa.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class Servicio {
    private String tipoServicio;
    private List<Incidente> incidentesAsociados = new ArrayList<>();

    public void agregarIncidente(Incidente incidente) {
        incidentesAsociados.add(incidente);
        incidente.asignarServicio(this);
    }

    @Override
    public String toString() {
        return tipoServicio;
    }
}