package com.empresa.rrhh;

import com.empresa.modelo.Incidente;
import com.empresa.modelo.Tecnico;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class AreaRRHH {
    private List<Tecnico> tecnicos = new ArrayList<>();

    public Tecnico contratarTecnico(Tecnico tecnico) {
        tecnicos.add(tecnico);
        return tecnico;
    }

    public void generarInformeDiario() {
        for (Tecnico tecnico : tecnicos) {
            System.out.println("Informe diario para el técnico " + tecnico.getNombre() + ":");
            List<Incidente> incidentesAsignados = tecnico.getIncidentesAsignados();
            for (Incidente incidente : incidentesAsignados) {
                System.out.println("  Incidente: " + incidente.getDescripcion() +
                        ", Estado: " + incidente.getEstado());
            }
            System.out.println();
        }
    }
}