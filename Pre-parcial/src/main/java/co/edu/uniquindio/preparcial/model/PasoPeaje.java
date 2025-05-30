package co.edu.uniquindio.preparcial.model;

import java.time.LocalDateTime;

public class PasoPeaje {
    private Vehiculo vehiculo;
    private String peaje;
    private LocalDateTime fechaHora;

    public PasoPeaje(Vehiculo vehiculo, String peaje, LocalDateTime fechaHora) {
        this.vehiculo = vehiculo;
        this.peaje = peaje;
        this.fechaHora = fechaHora;
    }

    // Getters
    public Vehiculo getVehiculo() { return vehiculo; }
    public String getPeaje() { return peaje; }
    public LocalDateTime getFechaHora() { return fechaHora; }
}