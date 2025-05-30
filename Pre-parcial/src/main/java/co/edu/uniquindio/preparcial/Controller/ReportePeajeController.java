package co.edu.uniquindio.preparcial.Controller;

import co.edu.uniquindio.preparcial.model.PasoPeajeDTO;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.time.LocalDate;

public class ReportePeajeController {

    @FXML
    private TableView<PasoPeajeDTO> tablaReporte;

    @FXML
    private TableColumn<PasoPeajeDTO, String> colPlaca;

    @FXML
    private TableColumn<PasoPeajeDTO, String> colPeaje;

    @FXML
    private TableColumn<PasoPeajeDTO, LocalDate> colFecha;

    @FXML
    private TableColumn<PasoPeajeDTO, Double> colValor;

    @FXML
    public void initialize() {
        colPlaca.setCellValueFactory(data -> data.getValue().placaProperty());
        colPeaje.setCellValueFactory(data -> data.getValue().peajeProperty());
        colFecha.setCellValueFactory(data -> data.getValue().fechaProperty());
        colValor.setCellValueFactory(data -> data.getValue().valorProperty().asObject());

        tablaReporte.setItems(obtenerDatosReporte());
    }

    private ObservableList<PasoPeajeDTO> obtenerDatosReporte() {
        // Simulación de datos. Aquí deberías consultar tu modelo o repositorio real
        return FXCollections.observableArrayList(
                new PasoPeajeDTO("ABC123", "Peaje Norte", LocalDate.now().minusDays(1), 5000),
                new PasoPeajeDTO("XYZ789", "Peaje Sur", LocalDate.now(), 7500)
        );
    }
}
