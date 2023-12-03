package pildoras.ventanas;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * JavaFX Video243_ButtonLabel
 */
public class Video243_ButtonLabel extends Application {

    private Label miTexto = new Label();
    private int contador;

    @Override
    public void start(Stage stage) {
        
        contador = 0;
        
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root, 640, 480);
        stage.setScene(scene);
        stage.show();

        Button miBoton = new Button("Haz click");

        miBoton.setOnAction(e -> clickBoton());

        root.setCenter(miBoton);
        
        miTexto.setText("Hiciste click: " + contador + " veces.");
        root.setTop(miTexto);

    }

    public static void main(String[] args) {
        launch();
    }

    public void clickBoton() {
        System.out.println("Click!");
        
        contador++;
        if (contador==1) miTexto.setText("Hiciste click: " + contador + " vez.");
        else miTexto.setText("Hiciste click: " + contador + " veces.");
    }

}
