import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class EventHandling extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Event Handling Demo");

        // Create Label
        Label label = new Label("Click the button!");

        // Create Button
        Button button = new Button("Click Me");

        // Event Handling - when button clicked, update label
        button.setOnAction(e -> {
            label.setText("Button Clicked!");
        });

        // Layout - VBox vertical
        VBox vbox = new VBox(20);
        vbox.getChildren().addAll(label, button);
        vbox.setStyle("-fx-alignment: center; -fx-padding: 20;");

        // Scene 600x400
        Scene scene = new Scene(vbox, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
