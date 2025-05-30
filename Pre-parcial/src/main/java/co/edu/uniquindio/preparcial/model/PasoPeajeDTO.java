package co.edu.uniquindio.preparcial.model;

import javafx.beans.property.*;

import java.time.LocalDate;

public class PasoPeajeDTO {
    private final StringProperty placa;
    private final StringProperty peaje;
    private final ObjectProperty<LocalDate> fecha;
    private final DoubleProperty valor;

    public PasoPeajeDTO(String placa, String peaje, LocalDate fecha, double valor) {
        this.placa = new SimpleStringProperty(placa);
        this.peaje = new SimpleStringProperty(peaje);
        this.fecha = new SimpleObjectProperty<>(fecha);
        this.valor = new SimpleDoubleProperty(valor);
    }

    public StringProperty placaProperty() { return placa; }
    public StringProperty peajeProperty() { return peaje; }
    public ObjectProperty<LocalDate> fechaProperty() { return fecha; }
    public DoubleProperty valorProperty() { return valor; }
}