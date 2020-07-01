package sample;



import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Camera;
import javafx.scene.Node;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Box;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;

import java.io.IOException;

public class DominioController {
    private static final int VIEWPORT_SIZE = 800;
    private double mouseOldX, mouseOldY = 0;
    private double mouseNewX, mouseNewY = 0;
    private Rotate rotateX = new Rotate(0, Rotate.X_AXIS);
    private Rotate rotateY = new Rotate(0, Rotate.Y_AXIS);
    private Rotate rotateZ = new Rotate(0, Rotate.Z_AXIS);
    private Rotate rotates = new Rotate(0,50,0,50, Rotate.Z_AXIS);

    @FXML
    void dom_rotateP(MouseEvent event) {
        Node source = (Node) event.getSource();
        Scene stage1 = (Scene) source.getScene();
        event.getPickResult().getIntersectedNode().getId();
        Box box = (Box) event.getSource();

        mouseOldX = event.getSceneX();
        mouseOldY = event.getSceneY();
        initMouseControl( stage1, box ,mouseOldX ,mouseOldY);

    }

    @FXML
    void open_contorno(MouseEvent event) throws IOException {
        Node source = (Node)  event.getSource();
        Stage stage  = (Stage) source.getScene().getWindow();
        Pane myPane = null;
        myPane = FXMLLoader.load(getClass().getResource("Contorno.fxml"));
        Camera camera = new PerspectiveCamera();
        stage.setTitle("MEF en 3 Dimensiones");
        Scene scene = new Scene(myPane, 800, 600);
        scene.setCamera(camera);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void open_modelo(MouseEvent event) throws IOException {
        Node source = (Node)  event.getSource();
        Stage stage  = (Stage) source.getScene().getWindow();
        Pane myPane = null;
        myPane = FXMLLoader.load(getClass().getResource("Modelo.fxml"));
        Camera camera = new PerspectiveCamera();
        stage.setTitle("MEF en 3 Dimensiones");
        Scene scene = new Scene(myPane, 800, 600);
        scene.setCamera(camera);
        stage.setScene(scene);
        stage.show();
    }



    private void initMouseControl(Scene scene, Box box, Double numberX, Double numberY) {
        scene.setOnMouseDragged(event2 ->
        {
            rotateX.setAngle(rotateX.getAngle()- (event2.getSceneX() - mouseNewX));
            //box.setRotationAxis(Rotate.X_AXIS);
            //box.setRotate(rotateX.getAngle());
            rotateY.setAngle(rotateY.getAngle() + (event2.getSceneY() - mouseNewY ));
            rotateZ.setAngle(rotateZ.getAngle() + (event2.getSceneY()  - mouseNewY));

            //box.setRotationAxis(Rotate.Y_AXIS);
            //box.setRotate(rotateY.getAngle());
            mouseNewX = event2.getSceneX();
            mouseNewY = event2.getSceneY();
            if(numberX!=mouseNewX  ){
                box.setRotationAxis(Rotate.Y_AXIS);
                box.setRotate(rotateX.getAngle());
            }else if(numberY!=mouseNewY ){
                box.setRotationAxis(Rotate.X_AXIS);
                box.setRotate(rotateY.getAngle());
            }else{
                box.setRotationAxis(Rotate.Z_AXIS);
                box.setRotate(rotateZ.getAngle());
            }
        });
    }




}
