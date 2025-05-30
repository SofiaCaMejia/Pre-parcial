package co.edu.uniquindio.preparcial.Controller;

import co.edu.uniquindio.preparcial.model.*;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class RegistroVehiculoController {
    @FXML private TextField placaField, cilindrajeField, ejesField, capacidadField;
    @FXML private ComboBox<String> tipoCombo;
    @FXML private CheckBox electricoCheck, publicoCheck;
    @FXML private Label mensajeLabel;

    @FXML
    public void initialize() {
        tipoCombo.getItems().addAll("Carro", "Moto", "Camión");
    }

    @FXML
    public void registrarVehiculo() {
        String tipo = tipoCombo.getValue();
        String placa = placaField.getText();

        Vehiculo vehiculo = switch (tipo) {
            case "Carro" -> new Carro(placa, electricoCheck.isSelected(), publicoCheck.isSelected());
            case "Moto" -> new Moto(placa, Integer.parseInt(cilindrajeField.getText()));
            case "Camión" -> new Camion(placa,
                    Integer.parseInt(ejesField.getText()),
                    Double.parseDouble(capacidadField.getText()));
            default -> null;
        };

        if (vehiculo != null) {
            SistemaDatos.getInstance().agregarVehiculo(vehiculo);
            mensajeLabel.setText("Vehículo registrado: " + vehiculo.descripcionVehiculo());
        }
    }
}