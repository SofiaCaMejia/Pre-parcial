package co.edu.uniquindio.preparcial.model;

public class Moto extends Vehiculo {
    private int cilindraje;

    public Moto(String placa, int cilindraje) {
        super(placa, "Camión", "María García");
        this.cilindraje = cilindraje;
    }

    @Override
    public double calcularPeaje() {
        double valor = 5000;
        if (cilindraje > 200) valor += 2000;
        return valor;
    }

    @Override
    public String descripcionVehiculo() {
        return "Moto - Placa: " + placa + " - Cilindraje: " + cilindraje + " cc";
    }

    @Override
    public TipoVehiculo getTipo() {
        return TipoVehiculo.MOTO;
    }
}
