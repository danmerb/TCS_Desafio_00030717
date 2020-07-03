package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class EnsamblajeController {
    @FXML
    void openCondFinal(MouseEvent event) throws IOException {
        Node source = (Node)  event.getSource();
        Stage stage  = (Stage) source.getScene().getWindow();
        Pane myPane = null;
        myPane = FXMLLoader.load(getClass().getResource("Finalescon.fxml"));
        stage.setTitle("MEF en 3 Dimensiones");
        Scene scene = new Scene(myPane, 800, 600);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    void openNeu2(MouseEvent event) throws IOException {
        Node source = (Node)  event.getSource();
        Stage stage  = (Stage) source.getScene().getWindow();
        Pane myPane = null;
        myPane = FXMLLoader.load(getClass().getResource("Finalescon2.fxml"));
        stage.setTitle("MEF en 3 Dimensiones");
        Scene scene = new Scene(myPane, 800, 600);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    void openNeu3(MouseEvent event) throws IOException {
        Node source = (Node)  event.getSource();
        Stage stage  = (Stage) source.getScene().getWindow();
        Pane myPane = null;
        myPane = FXMLLoader.load(getClass().getResource("Finalescon3.fxml"));
        stage.setTitle("MEF en 3 Dimensiones");
        Scene scene = new Scene(myPane, 800, 600);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void openNeu4(MouseEvent event) throws IOException {
        Node source = (Node)  event.getSource();
        Stage stage  = (Stage) source.getScene().getWindow();
        Pane myPane = null;
        myPane = FXMLLoader.load(getClass().getResource("Finalescon4.fxml"));
        stage.setTitle("MEF en 3 Dimensiones");
        Scene scene = new Scene(myPane, 800, 600);
        stage.setScene(scene);
        stage.show();
    }


    @FXML
    void openEnsb2(MouseEvent event) throws IOException {
        Node source = (Node)  event.getSource();
        Stage stage  = (Stage) source.getScene().getWindow();
        Pane myPane = null;
        myPane = FXMLLoader.load(getClass().getResource("EnsB2.fxml"));
        stage.setTitle("MEF en 3 Dimensiones");
        Scene scene = new Scene(myPane, 800, 600);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void openEnsb(MouseEvent event) throws IOException {
        Node source = (Node)  event.getSource();
        Stage stage  = (Stage) source.getScene().getWindow();
        Pane myPane = null;
        myPane = FXMLLoader.load(getClass().getResource("EnsB.fxml"));
        stage.setTitle("MEF en 3 Dimensiones");
        Scene scene = new Scene(myPane, 800, 600);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void openEnsk(MouseEvent event) throws IOException {
        Node source = (Node)  event.getSource();
        Stage stage  = (Stage) source.getScene().getWindow();
        Pane myPane = null;
        myPane = FXMLLoader.load(getClass().getResource("Ensk.fxml"));
        stage.setTitle("MEF en 3 Dimensiones");
        Scene scene = new Scene(myPane, 800, 600);
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    void opendef(MouseEvent event) throws IOException {
        Node source = (Node)  event.getSource();
        Stage stage  = (Stage) source.getScene().getWindow();
        Pane myPane = null;
        myPane = FXMLLoader.load(getClass().getResource("DefL.fxml"));
        stage.setTitle("MEF en 3 Dimensiones");
        Scene scene = new Scene(myPane, 800, 600);
        stage.setScene(scene);
        stage.show();

    }
    @FXML
    void openEnsK2(MouseEvent event) throws IOException {
        Node source = (Node)  event.getSource();
        Stage stage  = (Stage) source.getScene().getWindow();
        Pane myPane = null;
        myPane = FXMLLoader.load(getClass().getResource("EnsK2.fxml"));
        stage.setTitle("MEF en 3 Dimensiones");
        Scene scene = new Scene(myPane, 800, 600);
        stage.setScene(scene);
        stage.show();
    }


    @FXML
    void open_ensK(MouseEvent event) throws IOException {
        Node source = (Node)  event.getSource();
        Stage stage  = (Stage) source.getScene().getWindow();
        Pane myPane = null;
        myPane = FXMLLoader.load(getClass().getResource("EnsK.fxml"));
        stage.setTitle("MEF en 3 Dimensiones");
        Scene scene = new Scene(myPane, 800, 600);
        stage.setScene(scene);
        stage.show();
    }


    @FXML
    void openEnsK3(MouseEvent event) throws IOException {
        Node source = (Node)  event.getSource();
        Stage stage  = (Stage) source.getScene().getWindow();
        Pane myPane = null;
        myPane = FXMLLoader.load(getClass().getResource("EnsK3.fxml"));
        stage.setTitle("MEF en 3 Dimensiones");
        Scene scene = new Scene(myPane, 800, 600);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    void openEnsK4(MouseEvent event) throws IOException {
        Node source = (Node)  event.getSource();
        Stage stage  = (Stage) source.getScene().getWindow();
        Pane myPane = null;
        myPane = FXMLLoader.load(getClass().getResource("EnsK4.fxml"));
        stage.setTitle("MEF en 3 Dimensiones");
        Scene scene = new Scene(myPane, 800, 600);
        stage.setScene(scene);
        stage.show();
    }
}
