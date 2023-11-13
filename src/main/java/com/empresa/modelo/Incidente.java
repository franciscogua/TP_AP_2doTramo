package com.empresa.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Incidente {
    private String descripcion;
    private String tipoProblema;
    private String estado;
    private String fechaIngreso;
    private String fechaPosibleResolucion;
    private int colchonHorasEstimadas;

    private Cliente cliente;
    private Tecnico tecnico;
    private Servicio servicio;
    private Problema problema;
}