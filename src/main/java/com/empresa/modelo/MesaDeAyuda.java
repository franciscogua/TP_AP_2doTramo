package com.empresa.modelo;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class MesaDeAyuda {
    private List<Incidente> incidentes = new ArrayList<>();

    public void registrarIncidente(Incidente incidente, Tecnico tecnico) {
        incidentes.add(incidente);
        asignarTecnico(incidente, tecnico);
    }

    private void asignarTecnico(Incidente incidente, Tecnico tecnico) {
        tecnico.asignarIncidente(incidente);
    }

    public Tecnico seleccionarTecnico(Especialidad especialidad) {
        // Lógica para seleccionar un técnico basado en la especialidad
        return null;
    }

    public void notificarCliente(Cliente cliente, String mensaje) {
        cliente.recibirNotificacion(mensaje);
    }
}