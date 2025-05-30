package co.edu.uniquindio.preparcial.model;

import java.util.ArrayList;
import java.util.List;

public class EstacionPeaje {
    private String nombre;
    private String departamento;
    private double totalRecaudado;
    private List<Vehiculo> vehiculos = new ArrayList<>();
    private List<Recaudador> recaudadores = new ArrayList<>();

    public EstacionPeaje(String nombre, String departamento) {
        this.nombre = nombre;
        this.departamento = departamento;
    }

    public void registrarPasoVehiculo(Vehiculo v) {
        double valor = v.calcularPeaje();
        v.registrarPaso();
        totalRecaudado += valor;
        vehiculos.add(v);
    }

    public void agregarRecaudador(Recaudador r) {
        recaudadores.add(r);
    }

    public double getTotalRecaudado() {
        return totalRecaudado;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public Recaudador buscarRecaudador(String nombreCompleto) {
        return recaudadores.stream()
                .filter(r -> (r.nombre() + " " + r.apellidos()).replaceAll("\\s+", "").equalsIgnoreCase(nombreCompleto.replaceAll("\\s+", "")))
                .findFirst()
                .orElse(null);
    }

    public void imprimirReporte() {
        System.out.println("Reporte de Estación: " + nombre);
        for (Vehiculo v : vehiculos) {
            System.out.println(v.descripcionVehiculo() + " - Peaje: $" + v.calcularPeaje());
        }
        System.out.println("Total Recaudado: $" + totalRecaudado);
    }

    public List<Conductor> conductoresConCamionMayor10t(List<Conductor> conductores) {
        return conductores.stream()
                .filter(Conductor::tieneCamionMayor10t)
                .toList();
    }
}
