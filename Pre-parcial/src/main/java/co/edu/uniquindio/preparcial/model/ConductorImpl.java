package co.edu.uniquindio.preparcial.model;

import java.time.LocalDate;

public class ConductorImpl extends Conductor {
    public ConductorImpl(String nombre, String apellidos, String documento, LocalDate fechaNacimiento) {
        super(nombre, apellidos, documento, fechaNacimiento);
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        return "";
    }
}
