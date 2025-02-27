package co.edu.uniquindio.poo.sistemagestionempleados;

import java.util.List;

public abstract class Empleado {
    String nombre;
    String id;
    Departamento departamento;
    Proyecto proyecto;


    public Empleado(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    public abstract void asignarDepartamento(Departamento departamento);
    public abstract void asignarProyecto(Proyecto proyecto);
    public abstract List<Departamento> obtenerDepartamento();
    public abstract List<Proyecto> obtenerProyecto();

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
