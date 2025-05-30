package co.edu.uniquindio.preparcial.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Conductor extends Persona {
    private List<Vehiculo> vehiculos = new ArrayList<>();

    public Conductor(String nombre, String apellidos, String documento, LocalDate fechaNacimiento) {
        super(nombre, apellidos, documento, fechaNacimiento);
    }

    public void asignarVehiculo(Vehiculo v) {
        vehiculos.add(v);
        v.asignarConductor(this);
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public List<Vehiculo> getVehiculosPorTipo(TipoVehiculo tipo) {
        return vehiculos.stream().filter(v -> v.getTipo() == tipo).toList();
    }

    public double calcularTotalPeajes() {
        return vehiculos.stream().mapToDouble(Vehiculo::calcularPeaje).sum();
    }

    public boolean tieneCamionMayor10t() {
        return vehiculos.stream().anyMatch(v ->
                v instanceof Camion c && c.getCapacidadToneladas() > 10
        );
    }
}
