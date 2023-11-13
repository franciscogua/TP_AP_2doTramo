package com.empresa.rrhh;

import com.empresa.modelo.Tecnico;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class AreaRRHH {
    private List<Tecnico> tecnicos = new ArrayList<>();

    public void generarReportesDiarios() {

    }
}
