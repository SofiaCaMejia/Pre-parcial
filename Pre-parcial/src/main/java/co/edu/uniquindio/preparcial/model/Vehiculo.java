package co.edu.uniquindio.preparcial.model;

public abstract class Vehiculo implements PeajeCalculable {
    protected String placa;
    protected int numeroPeajesPagados;
    protected Conductor conductor;

    public Vehiculo(String placa, String camión, String s) {
        this.placa = placa;
        this.numeroPeajesPagados = 0;
    }

    public void asignarConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public String getPlaca() {
        return placa;
    }

    public int getNumeroPeajesPagados() {
        return numeroPeajesPagados;
    }

    public void registrarPaso() {
        numeroPeajesPagados++;
    }

    public abstract TipoVehiculo getTipo();
}
