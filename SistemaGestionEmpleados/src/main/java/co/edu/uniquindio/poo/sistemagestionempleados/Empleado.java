package co.edu.uniquindio.poo.sistemagestionempleados;

public abstract class Empleado implements IContribuyentes{
    String nombre;
    String id;
    Departamento departamento;


    public Empleado(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    public Empleado() {
    }

    @Override
    public void contribuir() {

    }

    public abstract void ejecutarProyecto();

    public abstract void realizarPruebas();

    public abstract void enviarDocumentacion();
}
