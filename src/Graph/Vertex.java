package Graph;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;

import java.awt.event.MouseEvent;

public class Vertex implements EventHandler {
    private double x;
    private double y;
    private Circle circle;
    private Text inf;
    StackPane pane;

    public Vertex (double x, double y, String inf){

        pane = new StackPane();

        circle = new Circle();
        circle.setCenterX(x);
        circle.setCenterY(y);
        circle.setRadius(15);
        circle.setFill(Color.ORANGE);

        this.inf = new Text(inf);

        pane.getChildren().addAll(circle, this.inf);
    }

    public Node getVertex(){
        return (Node)pane;
    }


    @Override
    public void handle(Event event) {
        System.out.println(event.getEventType());
    }
}
