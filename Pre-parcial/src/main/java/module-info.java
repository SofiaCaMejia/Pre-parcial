module co.edu.uniquindio.preparcial {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.preparcial to javafx.graphics;
    opens co.edu.uniquindio.preparcial.Controller to javafx.fxml;

    exports co.edu.uniquindio.preparcial;
    exports co.edu.uniquindio.preparcial.Controller;
}