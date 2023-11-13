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
}
