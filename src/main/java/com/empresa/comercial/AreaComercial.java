package com.empresa.comercial;

import com.empresa.modelo.Cliente;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class AreaComercial {
    private List<Cliente> clientes = new ArrayList<>();
}
