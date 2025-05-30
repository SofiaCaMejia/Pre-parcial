package co.edu.uniquindio.preparcial.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Recaudador extends Persona {
    private double sueldoMensual;

    public Recaudador(String nombre, String apellidos, String documento, String fechaNacimiento, double sueldo) {
        super(nombre, apellidos, documento,parseFecha(fechaNacimiento));
        this.sueldoMensual = sueldo;
    }
    private static LocalDate parseFecha(String fecha) {
        try {

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/M/d");
            return LocalDate.parse(fecha, formatter);
        } catch (DateTimeParseException e1) {
            try {

                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d");
                return LocalDate.parse(fecha, formatter);
            } catch (DateTimeParseException e2) {
                throw new IllegalArgumentException("Formato de fecha inválido. Use AAAA/MM/DD o AAAA-MM-DD");
            }
        }
    }

    public double getSueldoMensual() {
        return sueldoMensual;
    }
}
