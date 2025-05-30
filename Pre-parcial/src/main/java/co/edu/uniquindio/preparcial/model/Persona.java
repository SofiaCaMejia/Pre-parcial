package co.edu.uniquindio.preparcial.model;

import java.time.LocalDate;

public class Persona {
    protected String nombre;
    protected String apellidos;
    protected String documento;
    protected LocalDate fechaNacimiento;
    private String cedula;

    public Persona(String nombre, String apellidos, String documento, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.documento = documento;
        this.fechaNacimiento = fechaNacimiento;
    }


    public String nombre() {
        return "";
    }

    public String apellidos() {
        return "";
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPeajeAsignado() {
        return "";
    }
}