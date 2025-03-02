package co.edu.uniquindio.poo.sistemagestionempleados;

import java.util.ArrayList;
import java.util.List;

public class Tecnico extends Empleado implements IRolTecnico, IContribuyentes {
    private List<Proyecto> proyectos;
    private List<String> contribuciones;

    /**
     * Metodo constructor
     * @param nombre
     * @param id
     */
    public Tecnico(String nombre, String id) {
        super(nombre, id);
        this.proyectos = new ArrayList<>();
        this.contribuciones = new ArrayList<>();
    }

    @Override
    public void contribuir() {
        String contribucion = "Técnico " + getNombre() + " ha contribuido al proyecto.";
        contribuciones.add(contribucion);
        System.out.println(contribucion);
    }

    @Override
    public void asignarProyecto(Proyecto proyecto) {
        if (!proyectos.contains(proyecto)) {
            proyectos.add(proyecto);
            System.out.println("Técnico " + getNombre() + " asignado al proyecto: " + proyecto.getNombre());
        }
    }

    @Override
    public List<Proyecto> obtenerProyecto() {
        return proyectos;
    }

    @Override
    public void realizarPruebas() {
        System.out.println("Técnico " + getNombre() + " está realizando pruebas en los proyectos asignados.");
    }

    @Override
    public void ejecutarProyectos() {
        System.out.println("Técnico " + getNombre() + " está ejecutando tareas en los proyectos asignados.");
    }

    @Override
    public void entregarDocumentos() {
        System.out.println("Técnico " + getNombre() + " está entregando documentos técnicos.");
    }
}
