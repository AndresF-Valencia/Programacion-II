package co.edu.uniquindio.poo.sistemagestionempleados;

import java.util.ArrayList;
import java.util.List;

public class GestionEmpresa {
    private List<Empleado> listaEmpleados;
    private List<Proyecto> listaProyectos;
    private List<Departamento> listaDepartamentos;
    private List<Gerente> listaGerentes;
    private List<Tecnico> listaTecnicos;

    public GestionEmpresa() {
        this.listaEmpleados = new ArrayList<>();
        this.listaProyectos = new ArrayList<>();
        this.listaDepartamentos = new ArrayList<>();
        this.listaGerentes = new ArrayList<>();
        this.listaTecnicos = new ArrayList<>();
    }

    // Métodos para agregar entidades
    public void agregarEmpleado(Empleado empleado) {
        listaEmpleados.add(empleado);
    }

    public void agregarProyecto(Proyecto proyecto) {
        listaProyectos.add(proyecto);
    }

    public void agregarDepartamento(Departamento departamento) {
        listaDepartamentos.add(departamento);
    }

    public void asignarGerente(Gerente gerente, Departamento departamento) {
        departamento.getListaEmpleados().add(gerente);
    }
    public void asignarTecnico(Tecnico tecnico, Departamento departamento) {
        departamento.getListaEmpleados().add(tecnico);
    }
    public void asignarEmpleadoAProyecto(Empleado empleado, Proyecto proyecto) {
        if (empleado instanceof Gerente) {
            proyecto.getListaEmpleados().add(empleado);
        } else if (empleado instanceof Tecnico) {
            proyecto.getListaEmpleados().add(empleado);
        }
    }
    public void agregarGerente(Gerente gerente) {
        listaGerentes.add(gerente);
        listaEmpleados.add(gerente);
    }

    public void agregarTecnico(Tecnico tecnico) {
        listaTecnicos.add(tecnico);
        listaEmpleados.add(tecnico);
    }

    // Métodos para mostrar información
    public void mostrarEmpleados() {
        System.out.println("Lista de Empleados:");
        for (Empleado e : listaEmpleados) {
            System.out.println(e);
        }
    }

    public void mostrarProyectos() {
        System.out.println("Lista de Proyectos:");
        for (Proyecto p : listaProyectos) {
            System.out.println(p);
        }
    }

    public void mostrarDepartamentos() {
        System.out.println("Lista de Departamentos:");
        for (Departamento d : listaDepartamentos) {
            System.out.println(d);
        }
    }

    public void mostrarGerentes() {
        System.out.println("Lista de Gerentes:");
        for (Gerente g : listaGerentes) {
            System.out.println(g);
        }
    }

    public void mostrarTecnicos() {
        System.out.println("Lista de Técnicos:");
        for (Tecnico t : listaTecnicos) {
            System.out.println(t);
        }
    }

    public static void main(String[] args) {
        GestionEmpresa empresa = new GestionEmpresa();

        // Crear objetos de prueba
        Empleado gerente1 = new Gerente("Maria López", "G001");
        Empleado tecnico1 = new Tecnico("Carlos Ramirez", "T001");
        Proyecto proyecto1 = new Proyecto("Proyecto A");
        Departamento dep1 = new Departamento("Departamento TI");

        // Agregar a la empresa
        empresa.agregarGerente(gerente1);
        empresa.agregarTecnico(tecnico1);
        empresa.agregarProyecto(proyecto1);
        empresa.agregarDepartamento(dep1);

        // Mostrar datos
        empresa.mostrarEmpleados();
        empresa.mostrarProyectos();
        empresa.mostrarDepartamentos();
        empresa.mostrarGerentes();
        empresa.mostrarTecnicos();

        // Prueba de bonos
        System.out.println("--- PRUEBA DE BONOS ---");
        gerente1.agregarBono(new Bono(500, "Meta de ventas alcanzada"));
        gerente1.agregarBono(new Bono(300, "Buena gerencia"));
        gerente1.mostrarBonos();

        // Prueba de ventas
        System.out.println("\n--- PRUEBA DE VENTAS ---");
        gerente1.registrarVenta(new Venta(10000, "2025-02-28"));
        gerente1.registrarVenta(new Venta(5000, "2025-03-01"));
        gerente1.mostrarVentas();

        // Prueba de evaluaciones
        System.out.println("\n--- PRUEBA DE EVALUACIONES ---");
        tecnico1.agregarEvaluacion(new Evaluacion(9, "Buen desempeño"));
        tecnico1.agregarEvaluacion(new Evaluacion(8, "Puede mejorar en atención al cliente"));
        tecnico1.mostrarEvaluaciones();
    }
}

