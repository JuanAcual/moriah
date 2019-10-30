package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import javafx.scene.control.Button;

public class HomeController {
    @FXML
    private Pane panelCatedraticos, panelAlumnos;
    
    @FXML
    private Button buttonCatedraticos, buttonAlumnos;
    
    @FXML
    private void handleButtonCatedraticos(ActionEvent e) {
        panelCatedraticos.toFront();
    }
    
    @FXML
    private void handleButtonAlumnos(ActionEvent e) {
        panelAlumnos.toFront();
    }
    
}
