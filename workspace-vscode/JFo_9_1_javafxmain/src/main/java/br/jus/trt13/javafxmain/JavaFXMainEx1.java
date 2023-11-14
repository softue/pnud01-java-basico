package br.jus.trt13.javafxmain;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class JavaFXMainEx1 extends Application {

    @Override
    public void start(Stage primaryStage) {
        // remove code from here
        Button btn = new Button();
        btn.setText("Say 'HelloWorld'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });

        //StackPane root = new StackPane();
        Group root = new Group();
        Rectangle rect = new Rectangle(20, 20, 100, 200);
        //root.getChildren().add(btn);
        root.getChildren().add(rect);
        rect.setX(100);
        rect.setY(10);
        rect.setFill(Color.BLUEVIOLET);
        rect.setStroke(Color.WHITE);
        rect.setStrokeWidth(10);

        

        Scene scene = new Scene(root, 300, 250, Color.GOLDENROD);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
        // to here to add your own code
    }

    public static void main(String[] args) {
        launch(args);
    }
}
