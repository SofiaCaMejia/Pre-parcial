package co.edu.uniquindio.preparcial.Controller;

import co.edu.uniquindio.preparcial.model.ModelFactory;
import co.edu.uniquindio.preparcial.model.Recaudador;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class BuscarRecaudadorController {

    @FXML private TextField campoBusqueda;
    @FXML private Label lblNombre;
    @FXML private Label lblCedula;
    @FXML private Label lblPeaje;

    private final ModelFactory gestor = ModelFactory.getInstance();

    @FXML
    private void buscarRecaudador() {
        String criterio = campoBusqueda.getText().trim();
        Recaudador recaudador = gestor.buscarRecaudador(criterio);

        if (recaudador != null) {
            lblNombre.setText(recaudador.getNombre());
            lblCedula.setText(recaudador.getCedula());
            lblPeaje.setText(recaudador.getPeajeAsignado());
        } else {
            lblNombre.setText("No encontrado");
            lblCedula.setText("-");
            lblPeaje.setText("-");
        }
    }
}