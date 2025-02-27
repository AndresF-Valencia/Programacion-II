module co.edu.uniquindio.poo.sistemagestionempleados {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.poo.sistemagestionempleados to javafx.fxml;
    exports co.edu.uniquindio.poo.sistemagestionempleados;
}