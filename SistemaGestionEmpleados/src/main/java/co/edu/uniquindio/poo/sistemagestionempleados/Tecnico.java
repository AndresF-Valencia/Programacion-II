package co.edu.uniquindio.poo.sistemagestionempleados;

public class Tecnico extends Empleado implements IRolTecnico, IContribuyentes {
    @Override
    public void contribuir() {
        
    }

    @Override
    public void realizarPruebas() {

    }

    @Override
    public void ejecutarProyectos() {

    }

    @Override
    public void entregarDocumentos() {

    }

    public Tecnico(String nombre, String id) {
        super(nombre, id);
    }


}
