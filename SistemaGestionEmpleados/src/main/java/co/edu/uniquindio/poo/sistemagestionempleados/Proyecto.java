package co.edu.uniquindio.poo.sistemagestionempleados;

public class Proyecto {
    private String nombre;
    private String codigo;
    Empleado ListaEmpleadosAsignados ;

    /**
     * Metodo constructor
     * @param nombre
     */
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
    public Empleado getListaEmpleadosAsignados() {
        return ListaEmpleadosAsignados;
    }

}
