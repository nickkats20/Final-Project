import javafx.geometry.Pos;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Square extends StackPane{      //Square is a StackPane
    public Square(){
        Rectangle cell = new Rectangle(200,200);
        cell.setFill(null);
        cell.setStroke(Color.BLACK);
        setAlignment(Pos.CENTER);

        // cells objects of type Rectangle are the children of the Square StackPane
        // this adds such cell objects to the running list of children of Square StackPane
        getChildren().addAll(cell);

    }
}