import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class TicTacToeGame extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Tic-Tac-Toe");
        primaryStage.setScene(new Scene(createBoard()));
        primaryStage.show();
    }

    private Pane createBoard() {
        //creates the top-level pane for our scene that we add all other visual gameboard components to
        Pane root = new Pane();
        root.setPrefSize(600, 600);

        // creates the Tic-Tac-Toe board by arranging Square objects (StackPanes)
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Square square = new Square();
                square.setTranslateX(200 * j);
                square.setTranslateY(200 * i);

                // adds squares of type StackPane to running list of children in root Pane 
                // we are essentially constructing our gameboard scene layer by layer
                root.getChildren().add(square); 
            }
        }

        return root; // to be passed into the Scene constructor
    }



}