package co.edu.uniquindio.preparcial.model;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Camion extends Vehiculo {
    private IntegerProperty ejes = new SimpleIntegerProperty();
    private DoubleProperty capacidadToneladas = new SimpleDoubleProperty();

    public Camion(String placa, int ejes, double capacidadToneladas) {
        super(placa, "Camión", "María García");
        this.ejes.set(ejes);
        this.capacidadToneladas.set(capacidadToneladas);
    }


    public IntegerProperty ejesProperty() {
        return ejes;
    }

    public DoubleProperty capacidadToneladasProperty() {
        return capacidadToneladas;
    }


    @Override
    public double calcularPeaje() {
        double base = 7000 * ejes.get();
        if (capacidadToneladas.get() > 10) base *= 1.1;
        return base;
    }

    @Override
    public String descripcionVehiculo() {
        return "Camión - Placa: " + placa + " - Ejes: " + ejes.get() + " - Capacidad: " + capacidadToneladas.get() + " t";
    }

    @Override
    public TipoVehiculo getTipo() {
        return TipoVehiculo.CAMION;
    }

    public double getCapacidadToneladas() {
        return capacidadToneladas.get();
    }
}