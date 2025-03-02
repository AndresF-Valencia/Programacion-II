package co.edu.uniquindio.poo.sistemagestionempleados;

public class Departamento {
    private String nombre;
    private String codigo;
    Empleado listaEmpleado;

    /**
     * Metodo constructor
     * @param nombre
     */
    public Departamento(String nombre) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.listaEmpleado = listaEmpleado;
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
    public Empleado getListaEmpleado() {
        return listaEmpleado;
    }
    public void setListaEmpleado(Empleado listaEmpleado) {
        this.listaEmpleado = listaEmpleado;
    }
}
