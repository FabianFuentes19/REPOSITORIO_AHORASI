module mx.edu.utez.u2_ti_05 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens mx.edu.utez.u2_ti_05 to javafx.fxml;
    exports mx.edu.utez.u2_ti_05;
}