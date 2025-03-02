package co.edu.uniquindio.poo.sistemagestionempleados;

import  java.util.List;
import java.util.ArrayList;

public abstract class Empleado {
    String nombre;
    String id;
    Departamento departamento;
    Proyecto proyecto;
    private ArrayList<Bono> bonos;
    private ArrayList<Venta> ventas;
    private ArrayList<Evaluacion> evaluaciones;


    public Empleado(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
        this.bonos = new ArrayList<>();
        this.ventas = new ArrayList<>();
        this.evaluaciones = new ArrayList<>();
    }

    public abstract void asignarDepartamento(Departamento departamento);
    public abstract void asignarProyecto(Proyecto proyecto);
    public abstract List<Departamento> obtenerDepartamento();
    public abstract List<Proyecto> obtenerProyecto();

    public void agregarBono(Bono bono){
        bonos.add(bono);
    }
    public double calcularTotalBonos(){
        double total = 0;
        for(Bono b: bonos){
            total+=b.getMonto();
        }
        return total;
    }

    public void mostrarBonos(){
        System.out.println("Bonos de "+ nombre +":");
        for(Bono b: bonos){
            System.out.println(b);
        }
        System.out.println("Total de bonos: "+calcularTotalBonos());
    }

    public void registrarVenta(Venta venta){
        ventas.add(venta);
    }

    public double calcularComision(){
        double totalVentas = 0;
        for(Venta v: ventas){
            totalVentas += v.getMonto();
        }
        return totalVentas;
    }

    public void mostrarVentas(){
        System.out.println("Ventas de "+ nombre +":");
        for(Venta v: ventas){
            System.out.println(v);
        }
        System.out.println("Comision total: "+calcularComision());
    }

    public void agregarEvaluacion(Evaluacion evaluacion){
        evaluaciones.add(evaluacion);
    }

    public double calcularPromedioEvaluaciones(){
        if (evaluaciones.isEmpty()) return 0.0;
        double totalPromedio = 0;
        for (Evaluacion e : evaluaciones) {
            totalPromedio+= e.getPuntuacion();
        }
        return totalPromedio/ evaluaciones.size();
    }

    public void mostrarEvaluaciones(){
        System.out.println("Evaluaciones de "+ nombre +":");
        for(Evaluacion e: evaluaciones){
            System.out.println(e);
        }
        System.out.println("Promedio de desempeño: "+calcularPromedioEvaluaciones());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public Departamento getDepartamento() {
        return departamento;
    }
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    public Proyecto getProyecto() {
        return proyecto;
    }
    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

}
