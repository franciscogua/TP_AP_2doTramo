package com.empresa.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class Tecnico {
    private String nombre;
    private Especialidad especialidad;
    private List<Incidente> incidentesResueltos = new ArrayList<>();
    private List<Incidente> incidentesAsignados = new ArrayList<>();
    private int horasEstimadasPorDefecto;
    private String medioDeNotificacionPreferido;

    public void resolverIncidente(Incidente incidente) {
        incidentesResueltos.add(incidente);
        incidente.setEstado("Resuelto");
        notificarCliente(incidente.getCliente(), "Su incidente ha sido resuelto.");
    }
    private void notificarCliente(Cliente cliente, String mensaje) {
        cliente.recibirNotificacion(mensaje);
    }

    public void asignarIncidente(Incidente incidente) {
        incidente.setTecnicoAsignado(this);
        incidentesAsignados.add(incidente);
    }
}