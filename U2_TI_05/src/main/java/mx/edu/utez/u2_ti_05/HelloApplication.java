package mx.edu.utez.u2_ti_05;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {


        TextField nombre = new TextField();
        TextField apellido = new TextField();
        TextField edad = new TextField();

        ComboBox<String> comboBox = new ComboBox<>();
        comboBox.getItems().addAll("estudiante", "profesor", "admin");
        Label resultado = new Label();

        Button btncrear = new Button("Crear");
        Button btnreset = new Button("reset");

        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.add(new Label("Nombre: "),0,0);
        grid.add(nombre, 1, 0);
        grid.add(new Label("Apellido: "),0,1);
        grid.add(apellido, 1, 1);
        grid.add(new Label("Edad: "),0,2);
        grid.add(edad, 1, 2);
        grid.add(new Label("Rol: "),0,3);
        grid.add(comboBox, 1, 3);
        grid.add(btncrear, 1, 4);
        grid.add(btnreset, 2, 4);
        grid.add(resultado, 1, 5);

        btncrear.setOnAction(e -> {
                String valorNombre = nombre.getText();
                String valorApellido = apellido.getText();
                String valorEdad = edad.getText();
                String rol = comboBox.getValue();

                if (!valorNombre.isEmpty() && !valorApellido.isEmpty() && !valorEdad.isEmpty() && rol != null) {
                    grid.setStyle("-fx-background-color: lightgreen;");
                    resultado.setStyle("-fx-background-color: lightblue;");
                    resultado.setText("Nombre: " + valorNombre + " " + valorApellido + ", Edad: " + valorEdad + ", Rol: " + rol);
                } else {
                    grid.setStyle("-fx-background-color: #ffffff;");
                    resultado.setStyle("-fx-background-color: pink;");
                    resultado.setText("Por favor llena todos los campos.");
                }
            });

        btnreset.setOnAction(e -> {
            grid.setStyle("-fx-background-color: #ffffff;");
            nombre.setText("");
            apellido.setText("");
            edad.setText("");
            comboBox.setValue("");
            resultado.setText("");
        });
        Image image = new Image(getClass().getResourceAsStream("/imagenes/sitio-web.png"));
        stage.getIcons().add(image);


        Scene scene = new Scene(grid, 500, 240);
        stage.setTitle("Formulario T_05");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}