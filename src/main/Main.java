package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
<<<<<<< HEAD
    public void start(Stage stage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/vistas/home.fxml"));
        
        Scene scene = new Scene(root);
        stage.setScene(scene);
        
        stage.show();
=======
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/vistas/Imprimir_Cuadro.fxml"));
        primaryStage.setTitle("Colegio Moriah");
        primaryStage.setScene(new Scene(root, 759, 750));
        primaryStage.setResizable(false);
        primaryStage.show();
>>>>>>> eb163c14368ffa3313f1b26c8af64256e5cfcbd6
    }


    public static void main(String[] args) {
        launch(args);
    }
}
