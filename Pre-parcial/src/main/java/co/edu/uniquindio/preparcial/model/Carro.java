package co.edu.uniquindio.preparcial.model;

public class Carro extends Vehiculo {
    private boolean electrico;
    private boolean servicioPublico;

    public Carro(String placa, boolean electrico, boolean servicioPublico) {
        super(placa, "Camión", "María García");
        this.electrico = electrico;
        this.servicioPublico = servicioPublico;
    }

    @Override
    public double calcularPeaje() {
        double valor = 10000;
        if (electrico) valor *= 0.8;
        if (servicioPublico) valor *= 1.15;
        return valor;
    }

    @Override
    public String descripcionVehiculo() {
        return "Carro - Placa: " + placa + " - Eléctrico: " + electrico + " - Público: " + servicioPublico;
    }

    @Override
    public TipoVehiculo getTipo() {
        return TipoVehiculo.CARRO;
    }
}
