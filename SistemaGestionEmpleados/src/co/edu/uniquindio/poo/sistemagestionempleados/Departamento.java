package co.edu.uniquindio.poo.sistemagestionempleados;

import java.util.ArrayList;

public class Departamento {
    private String nombre;
    private String codigo;
    private ArrayList<Empleado> listaEmpleado;

    /**
     * Metodo constructor
     * @param nombre
     */
    public Departamento(String nombre) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.listaEmpleado = new ArrayList<>();
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public ArrayList<Empleado> getListaEmpleado() {
        return listaEmpleado;
    }
    public void setListaEmpleado(final ArrayList<Empleado> listaEmpleado) {
        this.listaEmpleado = listaEmpleado;
    }
}
