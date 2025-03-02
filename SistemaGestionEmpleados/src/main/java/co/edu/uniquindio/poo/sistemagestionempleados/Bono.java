package co.edu.uniquindio.poo.sistemagestionempleados;

public class Bono {
    private String motivo;
    private double monto;

    /**
     * Metodo constructor
     * @param motivo
     * @param monto
     */
    public Bono(String motivo, double monto) {
        this.motivo = motivo;
        this.monto = monto;
    }
    public String getMotivo() {
        return motivo;
    }
    public double getMonto() {
        return monto;
    }
    public void setMonto(double monto) {
        this.monto = monto;
    }
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Bono{" +
                "monto=" + monto +
                ", motivo='" + motivo + '\'' +
                '}';
    }
}