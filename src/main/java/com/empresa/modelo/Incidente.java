package com.empresa.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Incidente {
    private String descripcion;
    private String tipo;
    private String estado;
    private String fechaIngreso;
    private int horasEstimadas;
    private Servicio servicio;
    private Cliente cliente;
    private Tecnico tecnicoAsignado;

    public void asignarServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public String toString() {
        String servicioAsignado = (servicio != null) ? servicio.toString() : "Sin servicio asignado";
        return String.format(
                "Incidente:%n" +
                        "  . Descripción: '%s'%n" +
                        "  . Tipo: '%s'%n" +
                        "  . Estado: '%s'%n" +
                        "  . Fecha de ingreso: '%s'%n" +
                        "  . Horas estimadas: %d%n" +
                        "  . Servicio: %s%n" +
                        "  . Cliente: %s%n" +
                        "  . Técnico asignado: %s%n",
                descripcion, tipo, estado, fechaIngreso, horasEstimadas,
                servicioAsignado, (cliente != null) ? cliente.getRazonSocial() : "Sin cliente asignado",
                (tecnicoAsignado != null) ? tecnicoAsignado.getNombre() : "Sin técnico asignado"
        );
    }
}