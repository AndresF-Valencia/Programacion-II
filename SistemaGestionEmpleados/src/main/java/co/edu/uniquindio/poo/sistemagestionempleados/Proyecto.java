<<<<<<< Updated upstream
package co.edu.uniquindio.poo.sistemagestionempleados;

import java.util.ArrayList;
import java.util.List;

=======
>>>>>>> Stashed changes
public class Proyecto {
    private String nombre;
    private String codigo;
    private EstadoProyecto estado;
    private List<Empleado> listaEmpleadosAsignados;



    public Proyecto(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
<<<<<<< Updated upstream
=======
        this.estado = PENDIENTE; // Estado inicial por defecto
>>>>>>> Stashed changes
        this.listaEmpleadosAsignados = new ArrayList<>();
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
<<<<<<< Updated upstream
    
    public List<Empleado> getListaEmpleadosAsignados() {
        return listaEmpleadosAsignados;
    }

    public void agregarEmpleado(Empleado empleado) {
        listaEmpleadosAsignados.add(empleado);
    }

    public void eliminarEmpleado(Empleado empleado) {
        listaEmpleadosAsignados.remove(empleado);
    }
}

=======

    public String getEstado() {
        return estado;
    }

    public void cambiarEstado(String estado) {
        this.estado = estado;
    }

    public List<Empleado> getListaEmpleadosAsignados() {
        return listaEmpleadosAsignados;
    }

    public void agregarEmpleado(Empleado empleado) {
        listaEmpleadosAsignados.add(empleado);
    }

    public void eliminarEmpleado(Empleado empleado) {
        listaEmpleadosAsignados.remove(empleado);
    }
}
>>>>>>> Stashed changes
