/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package pildoras.ventanas;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Pedro
 */
public class Video244_Stage extends Application {

    @Override
    public void start(Stage primaryStage) {

        // Algunos ajustes al stage
        // resizable es true por defecto, si ponemos false no se puede redimensionar
        // se pueden fijar los valores máximos y mínimos de ancho/alto
        /*
        primaryStage.setResizable(true);
        primaryStage.setMaxHeight(600);
        primaryStage.setMinHeight(100);
        primaryStage.setMinWidth(150);
        primaryStage.setMaxWidth(600);
*/
        // ajuste para maximo tamaño
        primaryStage.setMaximized(true);
        // ajuste para toda pantalla sin marco
        primaryStage.setFullScreen(true);

        StackPane root = new StackPane();

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Pruebas con Stage");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
