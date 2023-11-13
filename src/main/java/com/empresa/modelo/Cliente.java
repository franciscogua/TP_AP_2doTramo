package com.empresa.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Cliente {
    private String razonSocial;
    private String CUIT;
}
