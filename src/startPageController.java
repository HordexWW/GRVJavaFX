import Graph.Vertex;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

import java.io.IOException;

public class startPageController {

    @FXML
    AnchorPane drawingPane;
    @FXML
    Label mouseCoordsLabel;

    public void drawVertex(MouseEvent mouseEvent){
        double locX = mouseEvent.getX();
        double locY = mouseEvent.getY();

        Vertex v = new Vertex(locX, locY, "5");


        drawingPane.getChildren().add(v.getVertex());
        v.getVertex().setTranslateX(locX - 15);
        v.getVertex().setTranslateY(locY - 15);


        //graphDrawingRectangle.getParent().getChildren().;

        mouseCoordsLabel.setText(locX + " ; " + locY);

    }



}
