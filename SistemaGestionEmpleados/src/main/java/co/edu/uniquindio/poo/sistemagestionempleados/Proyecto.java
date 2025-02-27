package co.edu.uniquindio.poo.sistemagestionempleados;

import java.util.List;

public class Proyecto {
    private String nombre;
    private String codigo;
    public List<Empleado> ListaEmpleadosAsignados ;

    public Proyecto(String nombre) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.ListaEmpleadosAsignados = ListaEmpleadosAsignados;
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
        return ListaEmpleadosAsignados;
    }
    public void setListaEmpleados(List<Empleado> listaEmpleados) {
        ListaEmpleadosAsignados = listaEmpleados;
    }


}
