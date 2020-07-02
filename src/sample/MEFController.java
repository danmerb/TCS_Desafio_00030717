package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.scene.control.ToolBar;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class MEFController {
    @FXML
    private AnchorPane PaneMef;
    @FXML
    private ToolBar toolB;

    @FXML
    void inicioMef(MouseEvent event) throws IOException {
        Node source = (Node)  event.getSource();
        Stage stage  = (Stage) source.getScene().getWindow();
        Pane myPane = null;
        myPane = FXMLLoader.load(getClass().getResource("MEF.fxml"));
        Camera camera = new PerspectiveCamera();
        stage.setTitle("MEF en 3 Dimensiones");
        Scene scene = new Scene(myPane, 800, 600);
        scene.setCamera(camera);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void open_malla(MouseEvent event) throws IOException {
        Node source = (Node)  event.getSource();
        Stage stage  = (Stage) source.getScene().getWindow();
        Pane myPane = null;
        myPane = FXMLLoader.load(getClass().getResource("Malla.fxml"));
        Camera camera = new PerspectiveCamera();
        stage.setTitle("MEF en 3 Dimensiones");
        Scene scene = new Scene(myPane, 800, 600);
        scene.setCamera(camera);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void open_mef1(MouseEvent event) throws IOException {
        Node source = (Node)  event.getSource();
        Stage stage  = (Stage) source.getScene().getWindow();
        Pane myPane = null;
        myPane = FXMLLoader.load(getClass().getResource("Mef1.fxml"));
        Camera camera = new PerspectiveCamera();
        stage.setTitle("MEF en 3 Dimensiones");
        Scene scene = new Scene(myPane, 800, 600);
        scene.setCamera(camera);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void open_mef2(MouseEvent event) throws IOException {
        Node source = (Node)  event.getSource();
        Stage stage  = (Stage) source.getScene().getWindow();
        Pane myPane = null;
        myPane = FXMLLoader.load(getClass().getResource("Mef2.fxml"));
        Camera camera = new PerspectiveCamera();
        stage.setTitle("MEF en 3 Dimensiones");
        Scene scene = new Scene(myPane, 800, 600);
        scene.setCamera(camera);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void open_mef3(MouseEvent event) throws IOException {
        Node source = (Node)  event.getSource();
        Stage stage  = (Stage) source.getScene().getWindow();
        Pane myPane = null;
        myPane = FXMLLoader.load(getClass().getResource("Mef3.fxml"));
        Camera camera = new PerspectiveCamera();
        stage.setTitle("MEF en 3 Dimensiones");
        Scene scene = new Scene(myPane, 800, 600);
        scene.setCamera(camera);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void open_mef4(MouseEvent event) throws IOException {
        Node source = (Node)  event.getSource();
        Stage stage  = (Stage) source.getScene().getWindow();
        Pane myPane = null;
        myPane = FXMLLoader.load(getClass().getResource("Mef4.fxml"));
        Camera camera = new PerspectiveCamera();
        stage.setTitle("MEF en 3 Dimensiones");
        Scene scene = new Scene(myPane, 800, 600);
        scene.setCamera(camera);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void open_mef5(MouseEvent event) throws IOException {
        Node source = (Node)  event.getSource();
        Stage stage  = (Stage) source.getScene().getWindow();
        Pane myPane = null;
        myPane = FXMLLoader.load(getClass().getResource("Mef5.fxml"));
        Camera camera = new PerspectiveCamera();
        stage.setTitle("MEF en 3 Dimensiones");
        Scene scene = new Scene(myPane, 800, 600);
        scene.setCamera(camera);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void open_mef6(MouseEvent event) throws IOException {
        Node source = (Node)  event.getSource();
        Stage stage  = (Stage) source.getScene().getWindow();
        Pane myPane = null;
        myPane = FXMLLoader.load(getClass().getResource("Mef6.fxml"));
        Camera camera = new PerspectiveCamera();
        stage.setTitle("MEF en 3 Dimensiones");
        Scene scene = new Scene(myPane, 800, 600);
        scene.setCamera(camera);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void open_def(MouseEvent event) throws IOException {
        Node source = (Node)  event.getSource();
        Stage stage  = (Stage) source.getScene().getWindow();
        Pane myPane = null;
        myPane = FXMLLoader.load(getClass().getResource("DefL.fxml"));
        Camera camera = new PerspectiveCamera();
        stage.setTitle("MEF en 3 Dimensiones");
        Scene scene = new Scene(myPane, 800, 600);
        scene.setCamera(camera);
        stage.setScene(scene);
        stage.show();

    }
}
