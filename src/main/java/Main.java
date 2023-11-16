import com.empresa.comercial.AreaComercial;
import com.empresa.modelo.*;
import com.empresa.rrhh.AreaRRHH;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MesaDeAyuda mesaDeAyuda = new MesaDeAyuda();
        AreaComercial areaComercial = new AreaComercial();
        AreaRRHH areaRRHH = new AreaRRHH();

        Cliente cliente1 = new Cliente("Empresa1", "123456789");
        Cliente cliente2 = new Cliente("Empresa2", "987654321");

        areaComercial.agregarCliente(cliente1);
        areaComercial.agregarCliente(cliente2);

        Tecnico tecnico1 = new Tecnico("Raúl", new Especialidad("Apple"), new ArrayList<>(), new ArrayList<>(), 2, "Email");
        Tecnico tecnico2 = new Tecnico("Homero", new Especialidad("Windows"), new ArrayList<>(), new ArrayList<>(), 3, "WhatsApp");

        areaRRHH.contratarTecnico(tecnico1);
        areaRRHH.contratarTecnico(tecnico2);

        Servicio servicio1 = new Servicio("Soporte técnico", new ArrayList<>());
        Incidente incidenteCliente1 = new Incidente("Pantalla rota", "Hardware", "En progreso", "2023-11-16", 2, servicio1, cliente1, tecnico2);
        mesaDeAyuda.registrarIncidente(incidenteCliente1, tecnico1);

        Incidente incidenteCliente2 = new Incidente("Virus", "Software", "En progreso", "2023-11-16", 3, servicio1, cliente2, tecnico2);
        mesaDeAyuda.registrarIncidente(incidenteCliente2, tecnico2);

        // Muestra el estado actual de los incidentes
        System.out.println("Estado actual de los incidentes:");
        for (Incidente incidente : mesaDeAyuda.getIncidentes()) {
            System.out.println(incidente);
        }

        mesaDeAyuda.notificarCliente(cliente1, "Se ha registrado un incidente. Estamos trabajando en ello.");
    }
}