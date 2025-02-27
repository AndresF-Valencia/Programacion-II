package co.edu.uniquindio.poo.sistemagestionempleados;

public class Gerente extends Empleado implements IRolGerente, IContribuyentes {
    @Override
    public void contribuir() {

    }

    public Gerente(String nombre, String id){
        super(nombre, id);
    }


    @Override
    public void planificar() {

    }

    @Override
    public void coordinar() {

    }

    @Override
    public void consultarContribuciones() {

    }

    @Override
    public void seguimientoProyectos() {

    }
}
