package co.edu.uniquindio.preparcial.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {
    public void abrirRegistroVehiculo(ActionEvent event) {
        cargarVentana("/co/edu/uniquindio/preparcial/registroVehiculo.fxml", "Registrar Vehículo");
    }

    @FXML
    private void abrirRegistroPasoPeaje() {
        cargarVentana("/co/edu/uniquindio/preparcial/registroPasoPeaje.fxml", "Registrar Paso por Peaje");
    }

    @FXML
    private void abrirReportePeaje() {
        cargarVentana("/co/edu/uniquindio/preparcial/reportePeaje.fxml", "Reporte de Peaje");
    }


    @FXML
    private void abrirBuscarRecaudador() {
        cargarVentana("/co/edu/uniquindio/preparcial/buscarRecaudador.fxml", "Buscar Recaudador");
    }
    // En MainController.java
    @FXML
    private void filtrarMayor10Toneladas(ActionEvent event) {
        // Aquí puedes cambiar de escena, abrir una nueva ventana, o mostrar los datos
        System.out.println("Filtrando conductores con camiones > 10 toneladas...");
    }

    @FXML
    private void abrirVentanaFiltrada() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/preparcial/view/GestionCamion.fxml"));
            Parent root = loader.load();

            // Obtener el controlador para llamar al método de filtrado
            GestionCamionController controller = loader.getController();
            controller.filtrarMayor10Toneladas();

            Stage stage = new Stage();
            stage.setTitle("Camiones > 10 Toneladas");
            stage.setScene(new Scene(root));
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void cargarVentana(String fxml, String titulo) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxml));
            Stage stage = new Stage();
            stage.setScene(new Scene(loader.load()));
            stage.setTitle(titulo);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void GestionCamiones(ActionEvent actionEvent) {
    }
}