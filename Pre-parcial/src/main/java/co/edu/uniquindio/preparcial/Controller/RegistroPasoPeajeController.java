package co.edu.uniquindio.preparcial.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.time.LocalDate;

public class RegistroPasoPeajeController {

    @FXML
    private TextField txtPlaca;

    @FXML
    private ComboBox<String> comboPeaje;

    @FXML
    private DatePicker dateFecha;

    @FXML
    public void initialize() {
        // Puedes cargar los nombres de peajes desde tu modelo o datos de ejemplo
        comboPeaje.getItems().addAll("Peaje Norte", "Peaje Sur", "Peaje Central");
    }

    @FXML
    public void registrarPaso() {
        String placa = txtPlaca.getText();
        String peaje = comboPeaje.getValue();
        LocalDate fecha = dateFecha.getValue();

        if (placa.isEmpty() || peaje == null || fecha == null) {
            mostrarAlerta("Todos los campos son obligatorios.");
            return;
        }

        // Aquí iría la lógica para registrar el paso en tu sistema
        System.out.println("Paso registrado: " + placa + " - " + peaje + " - " + fecha);

        mostrarAlerta("Paso por peaje registrado con éxito.");
    }

    private void mostrarAlerta(String mensaje) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Información");
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }
}