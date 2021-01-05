/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatictactoe;

import java.io.File;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *
 * @author Aya Hussein
 */
public class JavaTicTacToe extends Application {

    @Override
    public void start(Stage primaryStage) {
        
        
 /*       
        imageView.setFitHeight(400.0);
        imageView.setFitWidth(565.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        //imageView.setImage(new Image(getClass().getResource("../../gamebckground.PNG").toExternalForm()));
 
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
       root.getChildren().add(imageView);
       */
        GUIBase root=new GUIBase();
        Scene scene = new Scene(root, 530, 400);
        
        
        primaryStage.setTitle("Tic Tac Toe");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
