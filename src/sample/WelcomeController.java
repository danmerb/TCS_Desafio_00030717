package sample;

import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;

public class WelcomeController {

    Stage prevStage;
    public void setPrevStage(Stage stage)
    {
        this.prevStage = stage;
    }

    @FXML
    void open_instructions(MouseEvent event) throws IOException {
        Node source = (Node)  event.getSource();
        Stage stage1  = (Stage) source.getScene().getWindow();
        Pane myPane = null;
        myPane = FXMLLoader.load(getClass().getResource("Modelo.fxml"));
        stage1.setTitle("MEF en 3 Dimensiones");
        Scene scene = new Scene(myPane, 800, 600);
        stage1.setScene(scene);
        stage1.show();
        loadSplashScreen(myPane, stage1);
    }

    private void loadSplashScreen(Pane pn, Stage st) {
        try {
            //Load splash screen view FXML
            Pane pane = FXMLLoader.load(getClass().getResource(("Welcome.fxml")));
            //Add it to root container (Can be StackPane, AnchorPane etc)
            pn.getChildren().setAll(pane);



            //Finish splash with fade out effect
            FadeTransition fadeOut = new FadeTransition(Duration.seconds(2), pane);
            fadeOut.setFromValue(1);
            fadeOut.setToValue(0);
            fadeOut.setCycleCount(1);

            fadeOut.play();



            //After fade out, load actual content
            fadeOut.setOnFinished((e) -> {
                try {
                    Pane parentContent = FXMLLoader.load(getClass().getResource(("Modelo.fxml")));
                    pn.getChildren().setAll(parentContent);
                    st.show();
                } catch (IOException ee) {
                    ee.printStackTrace();
                }
            });

        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
