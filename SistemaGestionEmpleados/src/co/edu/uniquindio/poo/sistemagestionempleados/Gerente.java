package co.edu.uniquindio.poo.sistemagestionempleados;

import java.util.ArrayList;
import java.util.List;

public class Gerente extends Empleado implements IRolGerente, IContribuyentes {
    private List<Departamento> departamentos;
    private List<Proyecto> proyectos;
    private List<String> contribuciones;

    /**
     * Metodo Cosntructor
     * @param nombre
     * @param id
     */
    public Gerente(String nombre, String id) {
        super(nombre, id);
        this.departamentos = new ArrayList<>();
        this.proyectos = new ArrayList<>();
        this.contribuciones = new ArrayList<>();
    }

    @Override
    public void contribuir() {
        String contribucion = "Gerente " + getNombre() + " ha contribuido al proyecto.";
        contribuciones.add(contribucion);
        System.out.println(contribucion);
    }

    @Override
    public void asignarDepartamento(Departamento departamento) {
        if (!departamentos.contains(departamento)) {
            departamentos.add(departamento);
            departamento.getListaEmpleado().add(this);
            System.out.println("Gerente " + getNombre() + " asignado al departamento: " + departamento.getNombre());
        }
    }

    @Override
    public void asignarProyecto(Proyecto proyecto) {
        if (!proyectos.contains(proyecto)) {
            proyectos.add(proyecto);
            proyecto.getListaEmpleadosAsignados().add(this);
            System.out.println("Gerente " + getNombre() + " asignado al proyecto: " + proyecto.getNombre());
        }
    }

    @Override
    public List<Departamento> obtenerDepartamento() {
        return departamentos;
    }

    @Override
    public List<Proyecto> obtenerProyecto() {
        return proyectos;
    }

    @Override
    public void planificar() {
        System.out.println("Gerente " + getNombre() + " está planificando estrategias para la empresa.");
    }

    @Override
    public void coordinar() {
        System.out.println("Gerente " + getNombre() + " está coordinando actividades entre los equipos.");
    }

    @Override
    public void consultarContribuciones() {
        System.out.println("Contribuciones de " + getNombre() + ":");
        for (String contribucion : contribuciones) {
            System.out.println("- " + contribucion);
        }
    }

    @Override
    public void seguimientoProyectos() {
        System.out.println("Gerente " + getNombre() + " está revisando el progreso de los proyectos asignados.");
        for (Proyecto proyecto : proyectos) {
            System.out.println("- Proyecto: " + proyecto.getNombre() + " - Estado: " + proyecto.getEstadoProyecto());
        }
    }
}
