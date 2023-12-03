/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package pildoras.ventanas;

import emergente.VentanaDialogo;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Pedro
 */
public class Video247_249_SalirAplicacion extends Application {

    private int contadorClicks;
    Stage miStage;

    @Override
    public void start(Stage primaryStage) {

        miStage = primaryStage;

        Button btnClick = new Button();
        btnClick.setText("Pulsar");
        btnClick.setOnAction(e -> hazClick());

        Button btnCerrar = new Button();
        btnCerrar.setText("Cerrar");
        btnCerrar.setOnAction(e
                -> botonCerrar());

        VBox miVBox = new VBox(10);
        miVBox.getChildren().addAll(btnCerrar, btnClick);
        miVBox.setAlignment(Pos.CENTER);

        Scene scene = new Scene(miVBox, 350, 250);

        primaryStage.setTitle("Salir Aplicación");
        primaryStage.setScene(scene);
        primaryStage.setOnCloseRequest(e -> {
            // detener la propagación del evento para que no cierre la ventana con la x
            // se llamará al método de cerrar y allí se confirma.
            // cerrar con la x no cierra porque se captura el evento
            e.consume();
            botonCerrar();
        });
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    public void hazClick() {
        contadorClicks++;
        if (contadorClicks == 1) {
            emergente.VentanaEmergente.mostrar("Has hecho click una vez", "Ventana contador de clicks");
        } else {
            emergente.VentanaEmergente.mostrar("Has hecho click " + contadorClicks + " veces.", "Ventana contador de clicks");
        }
    }

    public void botonCerrar() {
        boolean confirmar = false;

        confirmar = VentanaDialogo.mostrar("Estás seguro de salir?", "Saliendo...");
        if (confirmar) {
            // aquí irían todas las tareas antes de cerrar: cerrar bases de datos, conexiones, etc
            miStage.close();
        }
    }
}
