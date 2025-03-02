package co.edu.uniquindio.poo.sistemagestionempleados;

public class Evaluacion {
    private String comentarios;
    private int puntuacion;

    /**
     * Metodo constructor
     * @param comentarios
     * @param puntuacion
     */
    public Evaluacion(String comentarios, int puntuacion) {
        this.comentarios = comentarios;
        this.puntuacion = puntuacion;
    }

    public String getComentarios() {
        return comentarios;
    }
    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
    public int getPuntuacion() {
        return puntuacion;
    }
    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    @Override
    public String toString() {
        return "Evaluacion{" +
                "comentarios='" + comentarios + '\'' +
                ", puntuacion=" + puntuacion +
                '}';
    }
}