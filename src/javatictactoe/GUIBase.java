package javatictactoe;

import java.io.File;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;

public class GUIBase extends AnchorPane{ //implements Initializable  {
  /*  
    @Override
    public void initialize(URL location, ResourceBundle resources) {
    File file = new File("../../gamebckground.PNG");
    Image image = new Image(file.toURI().toString());
    imageView.setImage(image);
  }    
  */  
    int xoFlag=0;
    protected final ImageView imageView;
    protected final Rectangle rectangle;
    protected final Rectangle rectangle0;
    protected final Rectangle rectangle1;
    protected final Rectangle rectangle2;
    protected final Rectangle rectangle3;
    protected final Rectangle rectangle4;
    protected final Rectangle rectangle5;
    protected final Rectangle rectangle6;
    protected final Rectangle rectangle7;
    protected final ImageView imageView0;
    protected final ImageView imageView1;
    protected final ImageView imageView2;
    protected final ImageView imageView3;
    protected final ImageView imageView4;
    protected final ImageView imageView5;
    protected final ImageView imageView6;
    protected final ImageView imageView7;
    protected final ImageView imageView8;

    public GUIBase() {

        imageView = new ImageView();
        rectangle = new Rectangle();
        rectangle0 = new Rectangle();
        rectangle1 = new Rectangle();
        rectangle2 = new Rectangle();
        rectangle3 = new Rectangle();
        rectangle4 = new Rectangle();
        rectangle5 = new Rectangle();
        rectangle6 = new Rectangle();
        rectangle7 = new Rectangle();
        imageView0 = new ImageView();
        imageView1 = new ImageView();
        imageView2 = new ImageView();
        imageView3 = new ImageView();
        imageView4 = new ImageView();
        imageView5 = new ImageView();
        imageView6 = new ImageView();
        imageView7 = new ImageView();
        imageView8 = new ImageView();

        setId("AnchorPane");
        setPrefHeight(400.0);
        setPrefWidth(485.0);

        imageView.setFitHeight(400.0);
        imageView.setFitWidth(565.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        

        //imageView.setImage(new Image(getClass().getResource("../../gamebckground.PNG").toExternalForm()));
    //File file = new File("../../gamebckground.PNG");
    File file=new File("D:\\ITI\\Java\\JavaTicTacToe\\gamebckground.PNG");
    Image image = new Image(file.toURI().toString());
    imageView.setImage(image);
    
        
        rectangle.setArcHeight(5.0);
        rectangle.setArcWidth(5.0);
        rectangle.setFill(javafx.scene.paint.Color.valueOf("#deefff"));
        rectangle.setHeight(82.0);
        rectangle.setLayoutX(131.0);
        rectangle.setLayoutY(67.0);
        rectangle.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle.setWidth(84.0);

        rectangle0.setArcHeight(5.0);
        rectangle0.setArcWidth(5.0);
        rectangle0.setFill(javafx.scene.paint.Color.valueOf("#deefff"));
        rectangle0.setHeight(82.0);
        rectangle0.setLayoutX(224.0);
        rectangle0.setLayoutY(67.0);
        rectangle0.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle0.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle0.setWidth(84.0);

        rectangle1.setArcHeight(5.0);
        rectangle1.setArcWidth(5.0);
        rectangle1.setFill(javafx.scene.paint.Color.valueOf("#deefff"));
        rectangle1.setHeight(82.0);
        rectangle1.setLayoutX(318.0);
        rectangle1.setLayoutY(67.0);
        rectangle1.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle1.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle1.setWidth(84.0);

        rectangle2.setArcHeight(5.0);
        rectangle2.setArcWidth(5.0);
        rectangle2.setFill(javafx.scene.paint.Color.valueOf("#deefff"));
        rectangle2.setHeight(82.0);
        rectangle2.setLayoutX(318.0);
        rectangle2.setLayoutY(255.0);
        rectangle2.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle2.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle2.setWidth(84.0);

        rectangle3.setArcHeight(5.0);
        rectangle3.setArcWidth(5.0);
        rectangle3.setFill(javafx.scene.paint.Color.valueOf("#deefff"));
        rectangle3.setHeight(82.0);
        rectangle3.setLayoutX(224.0);
        rectangle3.setLayoutY(255.0);
        rectangle3.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle3.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle3.setWidth(84.0);

        rectangle4.setArcHeight(5.0);
        rectangle4.setArcWidth(5.0);
        rectangle4.setFill(javafx.scene.paint.Color.valueOf("#deefff"));
        rectangle4.setHeight(82.0);
        rectangle4.setLayoutX(131.0);
        rectangle4.setLayoutY(255.0);
        rectangle4.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle4.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle4.setWidth(84.0);

        rectangle5.setArcHeight(5.0);
        rectangle5.setArcWidth(5.0);
        rectangle5.setFill(javafx.scene.paint.Color.valueOf("#deefff"));
        rectangle5.setHeight(89.0);
        rectangle5.setLayoutX(131.0);
        rectangle5.setLayoutY(159.0);
        rectangle5.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle5.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle5.setWidth(84.0);

        rectangle6.setArcHeight(5.0);
        rectangle6.setArcWidth(5.0);
        rectangle6.setFill(javafx.scene.paint.Color.valueOf("#deefff"));
        rectangle6.setHeight(89.0);
        rectangle6.setLayoutX(318.0);
        rectangle6.setLayoutY(159.0);
        rectangle6.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle6.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle6.setWidth(84.0);

        rectangle7.setArcHeight(5.0);
        rectangle7.setArcWidth(5.0);
        rectangle7.setFill(javafx.scene.paint.Color.valueOf("#deefff"));
        rectangle7.setHeight(89.0);
        rectangle7.setLayoutX(225.0);
        rectangle7.setLayoutY(159.0);
        rectangle7.setStroke(javafx.scene.paint.Color.BLACK);
        rectangle7.setStrokeType(javafx.scene.shape.StrokeType.INSIDE);
        rectangle7.setWidth(84.0);

        imageView0.setFitHeight(82.0);
        imageView0.setFitWidth(84.0);
        imageView0.setLayoutX(131.0);
        imageView0.setLayoutY(67.0);
        imageView0.setPickOnBounds(true);
        imageView0.setPreserveRatio(true);

        imageView1.setFitHeight(82.0);
        imageView1.setFitWidth(84.0);
        imageView1.setLayoutX(225.0);
        imageView1.setLayoutY(67.0);
        imageView1.setPickOnBounds(true);
        imageView1.setPreserveRatio(true);

        imageView2.setFitHeight(82.0);
        imageView2.setFitWidth(84.0);
        imageView2.setLayoutX(318.0);
        imageView2.setLayoutY(67.0);
        imageView2.setPickOnBounds(true);
        imageView2.setPreserveRatio(true);

        imageView3.setFitHeight(82.0);
        imageView3.setFitWidth(84.0);
        imageView3.setLayoutX(131.0);
        imageView3.setLayoutY(255.0);
        imageView3.setPickOnBounds(true);
        imageView3.setPreserveRatio(true);

        imageView4.setFitHeight(82.0);
        imageView4.setFitWidth(84.0);
        imageView4.setLayoutX(224.0);
        imageView4.setLayoutY(255.0);
        imageView4.setPickOnBounds(true);
        imageView4.setPreserveRatio(true);

        imageView5.setFitHeight(82.0);
        imageView5.setFitWidth(84.0);
        imageView5.setLayoutX(318.0);
        imageView5.setLayoutY(255.0);
        imageView5.setPickOnBounds(true);
        imageView5.setPreserveRatio(true);

        imageView6.setFitHeight(89.0);
        imageView6.setFitWidth(84.0);
        imageView6.setLayoutX(318.0);
        imageView6.setLayoutY(159.0);
        imageView6.setPickOnBounds(true);
        imageView6.setPreserveRatio(true);

        imageView7.setFitHeight(89.0);
        imageView7.setFitWidth(84.0);
        imageView7.setLayoutX(131.0);
        imageView7.setLayoutY(159.0);
        imageView7.setPickOnBounds(true);
        imageView7.setPreserveRatio(true);

        imageView8.setFitHeight(89.0);
        imageView8.setFitWidth(84.0);
        imageView8.setLayoutX(225.0);
        imageView8.setLayoutY(159.0);
        imageView8.setPickOnBounds(true);
        imageView8.setPreserveRatio(true);

        getChildren().add(imageView);
        getChildren().add(rectangle);
        getChildren().add(rectangle0);
        getChildren().add(rectangle1);
        getChildren().add(rectangle2);
        getChildren().add(rectangle3);
        getChildren().add(rectangle4);
        getChildren().add(rectangle5);
        getChildren().add(rectangle6);
        getChildren().add(rectangle7);
        getChildren().add(imageView0);
        getChildren().add(imageView1);
        getChildren().add(imageView2);
        getChildren().add(imageView3);
        getChildren().add(imageView4);
        getChildren().add(imageView5);
        getChildren().add(imageView6);
        getChildren().add(imageView7);
        getChildren().add(imageView8);
        
imageView0.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {

                        @Override
                        public void handle(MouseEvent event) {
 
                             if(xoFlag==0){
                            
                                File file=new File("D:\\ITI\\Java\\JavaTicTacToe\\Ximg.PNG");
                                Image image = new Image(file.toURI().toString());
                                imageView0.setImage(image);
                                xoFlag=1;
                             }
                             else{
                                File file=new File("D:\\ITI\\Java\\JavaTicTacToe\\Oimg.PNG");
                                Image image = new Image(file.toURI().toString());
                                imageView0.setImage(image);
                                xoFlag=0;
                             }
                        }
                    });        
imageView1.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {

                        @Override
                        public void handle(MouseEvent event) {
 
                             if(xoFlag==0){
                            
                                File file=new File("D:\\ITI\\Java\\JavaTicTacToe\\Ximg.PNG");
                                Image image = new Image(file.toURI().toString());
                                imageView1.setImage(image);
                                xoFlag=1;
                             }
                             else{
                                File file=new File("D:\\ITI\\Java\\JavaTicTacToe\\Oimg.PNG");
                                Image image = new Image(file.toURI().toString());
                                imageView1.setImage(image);
                                xoFlag=0;
                             }
                        }
                    });

imageView2.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {

                        @Override
                        public void handle(MouseEvent event) {
 
                             if(xoFlag==0){
                            
                                File file=new File("D:\\ITI\\Java\\JavaTicTacToe\\Ximg.PNG");
                                Image image = new Image(file.toURI().toString());
                                imageView2.setImage(image);
                                xoFlag=1;
                             }
                             else{
                                File file=new File("D:\\ITI\\Java\\JavaTicTacToe\\Oimg.PNG");
                                Image image = new Image(file.toURI().toString());
                                imageView2.setImage(image);
                                xoFlag=0;
                             }
                        }
                    });

imageView3.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {

                        @Override
                        public void handle(MouseEvent event) {
 
                             if(xoFlag==0){
                            
                                File file=new File("D:\\ITI\\Java\\JavaTicTacToe\\Ximg.PNG");
                                Image image = new Image(file.toURI().toString());
                                imageView3.setImage(image);
                                xoFlag=1;
                             }
                             else{
                                File file=new File("D:\\ITI\\Java\\JavaTicTacToe\\Oimg.PNG");
                                Image image = new Image(file.toURI().toString());
                                imageView3.setImage(image);
                                xoFlag=0;
                             }
                        }
                    });

imageView4.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {

                        @Override
                        public void handle(MouseEvent event) {
 
                             if(xoFlag==0){
                            
                                File file=new File("D:\\ITI\\Java\\JavaTicTacToe\\Ximg.PNG");
                                Image image = new Image(file.toURI().toString());
                                imageView4.setImage(image);
                                xoFlag=1;
                             }
                             else{
                                File file=new File("D:\\ITI\\Java\\JavaTicTacToe\\Oimg.PNG");
                                Image image = new Image(file.toURI().toString());
                                imageView4.setImage(image);
                                xoFlag=0;
                             }
                        }
                    });

imageView5.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {

                        @Override
                        public void handle(MouseEvent event) {
 
                             if(xoFlag==0){
                            
                                File file=new File("D:\\ITI\\Java\\JavaTicTacToe\\Ximg.PNG");
                                Image image = new Image(file.toURI().toString());
                                imageView5.setImage(image);
                                xoFlag=1;
                             }
                             else{
                                File file=new File("D:\\ITI\\Java\\JavaTicTacToe\\Oimg.PNG");
                                Image image = new Image(file.toURI().toString());
                                imageView5.setImage(image);
                                xoFlag=0;
                             }
                        }
                    });

imageView6.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {

                        @Override
                        public void handle(MouseEvent event) {
 
                             if(xoFlag==0){
                            
                                File file=new File("D:\\ITI\\Java\\JavaTicTacToe\\Ximg.PNG");
                                Image image = new Image(file.toURI().toString());
                                imageView6.setImage(image);
                                xoFlag=1;
                             }
                             else{
                                File file=new File("D:\\ITI\\Java\\JavaTicTacToe\\Oimg.PNG");
                                Image image = new Image(file.toURI().toString());
                                imageView6.setImage(image);
                                xoFlag=0;
                             }
                        }
                    });

imageView7.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {

                        @Override
                        public void handle(MouseEvent event) {
 
                             if(xoFlag==0){
                            
                                File file=new File("D:\\ITI\\Java\\JavaTicTacToe\\Ximg.PNG");
                                Image image = new Image(file.toURI().toString());
                                imageView7.setImage(image);
                                xoFlag=1;
                             }
                             else{
                                File file=new File("D:\\ITI\\Java\\JavaTicTacToe\\Oimg.PNG");
                                Image image = new Image(file.toURI().toString());
                                imageView7.setImage(image);
                                xoFlag=0;
                             }
                        }
                    });

imageView8.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {

                        @Override
                        public void handle(MouseEvent event) {
 
                             if(xoFlag==0){
                            
                                File file=new File("D:\\ITI\\Java\\JavaTicTacToe\\Ximg.PNG");
                                Image image = new Image(file.toURI().toString());
                                imageView8.setImage(image);
                                xoFlag=1;
                             }
                             else{
                                File file=new File("D:\\ITI\\Java\\JavaTicTacToe\\Oimg.PNG");
                                Image image = new Image(file.toURI().toString());
                                imageView8.setImage(image);
                                xoFlag=0;
                             }
                        }
                    });


    }
}
