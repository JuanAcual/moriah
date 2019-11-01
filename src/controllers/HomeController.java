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
    public void buttonCatedraticos(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/vistas/catedraticos.fxml"));
        paneContenedor.getChildren().setAll(pane);
    }
    
    @FXML
    public void buttonAlumnos(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/vistas/Alumnos.fxml"));
        paneContenedor.getChildren().setAll(pane);
    }
    
    @FXML
    public void buttonMaterias(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/vistas/Materias.fxml"));
        paneContenedor.getChildren().setAll(pane);
    }
    
    @FXML
    public void buttonCrearGrado(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/vistas/Crear_Grado.fxml"));
        paneContenedor.getChildren().setAll(pane);
    }
    
    @FXML
    public void buttonHabilitarSeccion(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/vistas/Habilitar_Seccion.fxml"));
        paneContenedor.getChildren().setAll(pane);
    }
    
    @FXML
    public void buttonAsignarMateria(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/vistas/Asignar_Mat_Grado.fxml"));
        paneContenedor.getChildren().setAll(pane);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
