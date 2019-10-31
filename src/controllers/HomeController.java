/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Juan
 */
public class HomeController implements Initializable {
    
    @FXML
     private AnchorPane paneContenedor;
    
    @FXML
    public void handleButtonCatedraticos(ActionEvent event) throws IOException {
        AnchorPane paneCatedraticos = FXMLLoader.load(getClass().getResource("/vistas/catedraticos.fxml"));
        paneContenedor.getChildren().setAll(paneCatedraticos);
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
