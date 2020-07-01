package sample;

import javafx.animation.FadeTransition;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Camera;
import javafx.scene.Node;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;

public class ModeloController {
    public Label varMod;
    private double anchorX, anchorY;
    private double anchorAngleX = -200;
    private double anchorAngleY = -200;
    private final DoubleProperty angleX = new SimpleDoubleProperty(0);
    private final DoubleProperty angleY = new SimpleDoubleProperty(0);
    Stage prevStage;
    public void setPrevStage(Stage stage)
    {
        this.prevStage = stage;
    }


    @FXML
    void open_domain(MouseEvent event) throws IOException {
        Node source = (Node)  event.getSource();
        Stage stage  = (Stage) source.getScene().getWindow();
        Pane myPane = null;
        myPane = FXMLLoader.load(getClass().getResource("Dominio.fxml"));
        Camera camera = new PerspectiveCamera();
        stage.setTitle("MEF en 3 Dimensiones");
        Scene scene = new Scene(myPane, 800, 600);
        scene.setCamera(camera);
        stage.setScene(scene);
        stage.show();




    }


}
