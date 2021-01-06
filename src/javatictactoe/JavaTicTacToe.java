/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatictactoe;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Aya Hussein
 */
public class JavaTicTacToe extends Application {
    Thread th;
    @Override
    public void start(Stage primaryStage) {
        
        GUIBase root=new GUIBase();
        th= new Thread(root);
        th.start();
        
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
