package co.edu.uniquindio.preparcial.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

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
    private void abrirGestionCamiones() {
        cargarVentana("/co/edu/uniquindio/preparcial/view/GestionCamiones.fxml", "Gestión de Camiones");
    }

    @FXML
    public void filtrarConductores(ActionEvent event) {
        // Implementación del filtrado de conductores
        System.out.println("Filtrando conductores con camiones >10t...");
        // Aquí puedes abrir una nueva ventana o mostrar los resultados en la actual
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
}