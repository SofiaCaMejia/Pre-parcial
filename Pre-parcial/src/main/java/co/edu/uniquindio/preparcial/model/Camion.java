package co.edu.uniquindio.preparcial.model;

public class Camion extends Vehiculo {
    private int ejes;
    private double capacidadToneladas;

    public Camion(String placa, int ejes, double capacidadToneladas) {
        super(placa, "Camión", "María García");
        this.ejes = ejes;
        this.capacidadToneladas = capacidadToneladas;
    }

    @Override
    public double calcularPeaje() {
        double base = 7000 * ejes;
        if (capacidadToneladas > 10) base *= 1.1;
        return base;
    }

    @Override
    public String descripcionVehiculo() {
        return "Camión - Placa: " + placa + " - Ejes: " + ejes + " - Capacidad: " + capacidadToneladas + " t";
    }

    @Override
    public TipoVehiculo getTipo() {
        return TipoVehiculo.CAMION;
    }

    public double getCapacidadToneladas() {
        return capacidadToneladas;
    }
}
