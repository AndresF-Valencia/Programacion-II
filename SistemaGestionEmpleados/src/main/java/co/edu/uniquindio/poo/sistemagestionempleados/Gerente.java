package co.edu.uniquindio.poo.sistemagestionempleados;

import java.util.List;

public class Gerente extends Empleado implements IRolGerente, IContribuyentes {

    public Gerente(String nombre, String id){
        super(nombre, id);
    }

    @Override
    public void contribuir() {

    }

    @Override
    public void asignarDepartamento(Departamento departamento) {


    }

    @Override
    public void asignarProyecto(Proyecto proyecto) {

    }

    @Override
    public List<Departamento> obtenerDepartamento() {

        return List.of();
    }

    @Override
    public List<Proyecto> obtenerProyecto() {

        return List.of();
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
