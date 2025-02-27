package co.edu.uniquindio.poo.sistemagestionempleados;

import java.util.List;

public class Departamento {
    private String nombre;
    private String codigo;
    public List<Empleado> listaEmpleados;

    public Departamento(String nombre) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.listaEmpleados = listaEmpleados;
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
    public List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }
    public void setListaEmpleados(List<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

}
