package co.edu.uniquindio.poo.sistemagestionempleados;

import java.util.ArrayList;

public class Proyecto {
    private String nombre;
    private String codigo;
    private ArrayList<Empleado> ListaEmpleadosAsignados ;
    private EstadoProyecto estadoProyecto;

    /**
     * Metodo constructor
     * @param nombre
     */
    public Proyecto(String nombre) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.ListaEmpleadosAsignados = new ArrayList<>();
        this.estadoProyecto = EstadoProyecto.PENDIENTE;
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
    public ArrayList<Empleado> getListaEmpleadosAsignados() {
        return ListaEmpleadosAsignados;
    }
    public void setListaEmpleadosAsignados(final ArrayList<Empleado> listaEmpleadosAsignados) {
        this.ListaEmpleadosAsignados = listaEmpleadosAsignados;
    }
    public EstadoProyecto getEstadoProyecto() {
        return estadoProyecto;
    }
    public void setEstadoProyecto(EstadoProyecto estadoProyecto) {
        this.estadoProyecto = estadoProyecto;
    }


}
