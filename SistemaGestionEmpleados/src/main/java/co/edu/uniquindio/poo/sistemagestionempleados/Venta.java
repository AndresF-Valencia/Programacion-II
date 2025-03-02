package co.edu.uniquindio.poo.sistemagestionempleados;

public class Venta {
    private double monto;
    private String fecha;

    /**
     * Metodo constructor
     * @param monto
     * @param fecha
     */
    public Venta(double monto, String fecha) {
        this.monto = monto;
        this.fecha = fecha;
    }
    public double getMonto() {
        return monto;
    }
    public void setMonto(double monto) {
        this.monto = monto;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}