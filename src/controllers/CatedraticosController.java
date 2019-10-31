package controllers;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class CatedraticosController {

    @FXML
    public void handleAgregarCatedratico(ActionEvent e) throws IOException {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("/vistas/formulario-catedraticos.fxml"));
            
            Scene scene = new Scene(fxmlLoader.load(), 600, 700);
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setTitle("Ingresar Catedratico");
            stage.setScene(scene);
            stage.show();
        } catch(IOException ex) {
            System.out.println("error al cargar formulario: " + ex.getMessage());
        }
    }
}
