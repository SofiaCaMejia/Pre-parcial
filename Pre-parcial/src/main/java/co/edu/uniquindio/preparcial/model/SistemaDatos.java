package co.edu.uniquindio.preparcial.model;

import java.util.ArrayList;
import java.util.List;

public class SistemaDatos {
    private static SistemaDatos instance;
    private List<Vehiculo> vehiculos = new ArrayList<>();

    private SistemaDatos() {}

    public static SistemaDatos getInstance() {
        if (instance == null) {
            instance = new SistemaDatos();
        }
        return instance;
    }

    public void agregarVehiculo(Vehiculo v) {
        vehiculos.add(v);
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }
}
