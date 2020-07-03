package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Camera;
import javafx.scene.Node;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class DefinicionController {
    @FXML
    void openD(MouseEvent event) throws IOException {
        Node source = (Node)  event.getSource();
        Stage stage  = (Stage) source.getScene().getWindow();
        Pane myPane = null;
        myPane = FXMLLoader.load(getClass().getResource("DefD.fxml"));
        Camera camera = new PerspectiveCamera();
        stage.setTitle("MEF en 3 Dimensiones");
        Scene scene = new Scene(myPane, 800, 600);
        scene.setCamera(camera);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void openF(MouseEvent event) throws IOException {
        Node source = (Node)  event.getSource();
        Stage stage  = (Stage) source.getScene().getWindow();
        Pane myPane = null;
        myPane = FXMLLoader.load(getClass().getResource("DefF.fxml"));
        Camera camera = new PerspectiveCamera();
        stage.setTitle("MEF en 3 Dimensiones");
        Scene scene = new Scene(myPane, 800, 600);
        scene.setCamera(camera);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void openG(MouseEvent event) throws IOException {
        Node source = (Node)  event.getSource();
        Stage stage  = (Stage) source.getScene().getWindow();
        Pane myPane = null;
        myPane = FXMLLoader.load(getClass().getResource("DefG.fxml"));
        Camera camera = new PerspectiveCamera();
        stage.setTitle("MEF en 3 Dimensiones");
        Scene scene = new Scene(myPane, 800, 600);
        scene.setCamera(camera);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void openK(MouseEvent event) throws IOException {
        Node source = (Node)  event.getSource();
        Stage stage  = (Stage) source.getScene().getWindow();
        Pane myPane = null;
        myPane = FXMLLoader.load(getClass().getResource("DefK.fxml"));
        Camera camera = new PerspectiveCamera();
        stage.setTitle("MEF en 3 Dimensiones");
        Scene scene = new Scene(myPane, 800, 600);
        scene.setCamera(camera);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void openL(MouseEvent event) throws IOException {
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

    @FXML
    void openZ(MouseEvent event) throws IOException {
        Node source = (Node)  event.getSource();
        Stage stage  = (Stage) source.getScene().getWindow();
        Pane myPane = null;
        myPane = FXMLLoader.load(getClass().getResource("DefZ.fxml"));
        Camera camera = new PerspectiveCamera();
        stage.setTitle("MEF en 3 Dimensiones");
        Scene scene = new Scene(myPane, 800, 600);
        scene.setCamera(camera);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void open_L2(MouseEvent event) throws IOException {
        Node source = (Node)  event.getSource();
        Stage stage  = (Stage) source.getScene().getWindow();
        Pane myPane = null;
        myPane = FXMLLoader.load(getClass().getResource("DefL2.fxml"));
        Camera camera = new PerspectiveCamera();
        stage.setTitle("MEF en 3 Dimensiones");
        Scene scene = new Scene(myPane, 800, 600);
        scene.setCamera(camera);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void openL3(MouseEvent event) throws IOException {
        Node source = (Node)  event.getSource();
        Stage stage  = (Stage) source.getScene().getWindow();
        Pane myPane = null;
        myPane = FXMLLoader.load(getClass().getResource("DefL3.fxml"));
        Camera camera = new PerspectiveCamera();
        stage.setTitle("MEF en 3 Dimensiones");
        Scene scene = new Scene(myPane, 800, 600);
        scene.setCamera(camera);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    void openK2(MouseEvent event) throws IOException {
        Node source = (Node)  event.getSource();
        Stage stage  = (Stage) source.getScene().getWindow();
        Pane myPane = null;
        myPane = FXMLLoader.load(getClass().getResource("DefK2.fxml"));
        Camera camera = new PerspectiveCamera();
        stage.setTitle("MEF en 3 Dimensiones");
        Scene scene = new Scene(myPane, 800, 600);
        scene.setCamera(camera);
        stage.setScene(scene);
        stage.show();
    }


    @FXML
    void openD2(MouseEvent event) throws IOException {
        Node source = (Node)  event.getSource();
        Stage stage  = (Stage) source.getScene().getWindow();
        Pane myPane = null;
        myPane = FXMLLoader.load(getClass().getResource("DefD2.fxml"));
        Camera camera = new PerspectiveCamera();
        stage.setTitle("MEF en 3 Dimensiones");
        Scene scene = new Scene(myPane, 800, 600);
        scene.setCamera(camera);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void openD3(MouseEvent event) throws IOException {
        Node source = (Node)  event.getSource();
        Stage stage  = (Stage) source.getScene().getWindow();
        Pane myPane = null;
        myPane = FXMLLoader.load(getClass().getResource("DefD3.fxml"));
        Camera camera = new PerspectiveCamera();
        stage.setTitle("MEF en 3 Dimensiones");
        Scene scene = new Scene(myPane, 800, 600);
        scene.setCamera(camera);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void open_ensamblaje(MouseEvent event) throws IOException {
        Node source = (Node)  event.getSource();
        Stage stage  = (Stage) source.getScene().getWindow();
        Pane myPane = null;
        myPane = FXMLLoader.load(getClass().getResource("Ensamblaje.fxml"));
        stage.setTitle("MEF en 3 Dimensiones");
        Scene scene = new Scene(myPane, 800, 600);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void open_paso6(MouseEvent event) throws IOException {
        Node source = (Node)  event.getSource();
        Stage stage  = (Stage) source.getScene().getWindow();
        Pane myPane = null;
        myPane = FXMLLoader.load(getClass().getResource("Mef6.fxml"));
        stage.setTitle("MEF en 3 Dimensiones");
        Scene scene = new Scene(myPane, 800, 600);
        stage.setScene(scene);
        stage.show();
    }



}
