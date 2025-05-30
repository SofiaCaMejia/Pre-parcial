package co.edu.uniquindio.preparcial.Controller;


import co.edu.uniquindio.preparcial.model.Camion;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class GestionCamionController {
    @FXML
    private TableView<co.edu.uniquindio.preparcial.model.Camion> camionesTable;
    @FXML
    private TableColumn<co.edu.uniquindio.preparcial.model.Camion, String> placaColumn;
    @FXML
    private TableColumn<co.edu.uniquindio.preparcial.model.Camion, String> conductorColumn;
    @FXML
    private TableColumn<co.edu.uniquindio.preparcial.model.Camion, Number> capacidadColumn;

    private ObservableList<co.edu.uniquindio.preparcial.model.Camion> camionesList = FXCollections.observableArrayList();
    private boolean yaFiltrado = false;

    public GestionCamionController() {

    }

    @FXML
    public void initialize() {

        placaColumn.setCellValueFactory(new PropertyValueFactory<>("placa"));
        conductorColumn.setCellValueFactory(new PropertyValueFactory<>("conductor"));
        capacidadColumn.setCellValueFactory(new PropertyValueFactory<>("capacidadToneladas"));

        cargarDatosEjemplo();
        camionesTable.setItems(camionesList);
    }

    private void cargarDatosEjemplo() {
        camionesList.addAll(
                new co.edu.uniquindio.preparcial.model.Camion("ABC123", 2, 8.5),
                new co.edu.uniquindio.preparcial.model.Camion("DEF456", 1, 12.0),
                new co.edu.uniquindio.preparcial.model.Camion("GHI789", 6, 15.5),
                new co.edu.uniquindio.preparcial.model.Camion("JKL012", 30, 9.0)
        );
    }


    @FXML
    public void filtrarMayor10Toneladas() {
        if (yaFiltrado) return; // Evita ejecutar más de una vez
        System.out.println("Filtrando conductores con camiones > 10 toneladas...");
        camionesTable.setItems(camionesList.filtered(camion ->
                camion.getCapacidadToneladas() > 10
        ));
        yaFiltrado = true;
    }


    @FXML
    private void mostrarTodos() {
        camionesTable.setItems(camionesList);
    }

}