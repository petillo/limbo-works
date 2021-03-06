package _12_choiceBoxes;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Starter extends Application {
    Stage window;
    Scene scene;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Choice Box");
        button = new Button("Click me");

        ChoiceBox<String> choiceBox = new ChoiceBox<>();
        choiceBox.getItems().add("Knives");
        choiceBox.getItems().add("Guns");
        choiceBox.getItems().addAll("Whores","Bombs");

        //set default choice
        choiceBox.setValue("Knives");

        //button lambda
        button.setOnAction(event -> getChoice(choiceBox));

        //layout
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20,20,20,20));
        layout.getChildren().addAll(choiceBox,button);

        //scene
        scene = new Scene(layout,350,200);
        window.setScene(scene);
        window.show();
    }

    //getting the value of selected choice
    private void getChoice(ChoiceBox<String> choiceBox) {
        String food = choiceBox.getValue();
        System.out.println(food);
    }
}
