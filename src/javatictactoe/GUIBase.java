package javatictactoe;

import java.io.DataInputStream;
import java.io.File;
import java.io.PrintStream;
import java.net.Socket;
import javafx.event.EventHandler;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;

public class GUIBase extends AnchorPane implements Runnable{ 
    /*In game array we will represet X as 4 and O as 5 and game[0] is rect0 game[1] is rect1 and so on used to check who wins (used also to be flags 0 means this place not used yet)*/
    int[] game = {0, 0, 0, 0, 0, 0, 0, 0, 0};  //this array is NOT used for the DB and replay as it doesn't show the sequence order
    String[] gameRecord; //not used yet
    Socket mySocket;
    DataInputStream dis;
    PrintStream ps;
    
    
    @Override
    public void run() {
        while(true){
         try{
            dis=new DataInputStream(mySocket.getInputStream());
            String replyMsg=dis.readLine();
            System.out.println(replyMsg);
            
            
            if(xoFlag==0){  
                    xoFlag=1;
                    File file=new File("D:\\ITI\\Java\\JavaTicTacToe\\Ximg.PNG");
                    Image image = new Image(file.toURI().toString());
                    switch(replyMsg){
                        case "rect0":
                                   game[0]=4;// 4 means X
                                   imageView0.setImage(image);
                                   break;
                        case "rect1":
                                   game[1]=4;
                                   imageView1.setImage(image);
                                   break;    
                        case "rect2":
                                   game[2]=4;
                                   imageView2.setImage(image);
                                   break;                                   
                        case "rect3":
                                   game[3]=4;
                                   imageView3.setImage(image);
                                   break;                    
                         case "rect4":
                                   game[4]=4;
                                   imageView4.setImage(image);
                                   break;                   
                        case "rect5":
                                   game[5]=4;
                                   imageView5.setImage(image);
                                   break;                    
                        case "rect6":
                                   game[6]=4;
                                   imageView6.setImage(image);
                                   break;                
                        case "rect7":
                                   game[7]=4;
                                   imageView7.setImage(image);
                                   break;
                        case "rect8":
                                   game[8]=4;
                                   imageView8.setImage(image);
                                   break;                                   
                    }
 
             
            }
            else{
                    xoFlag=0;
                    File file=new File("D:\\ITI\\Java\\JavaTicTacToe\\Oimg.PNG");
                    Image image = new Image(file.toURI().toString());
                    switch(replyMsg){
                        case "rect0":
                                   game[0]=5;//5 means O
                                   imageView0.setImage(image);
                                   break;
                        case "rect1":
                                    game[1]=5;
                                   imageView1.setImage(image);
                                   break;   
                        case "rect2":
                                    game[2]=5;
                                   imageView2.setImage(image);
                                   break;                                   
                        case "rect3":
                                    game[3]=5;
                                   imageView3.setImage(image);
                                   break;                    
                         case "rect4":
                                    game[4]=5;
                                   imageView4.setImage(image);
                                   break;                   
                        case "rect5":
                                    game[5]=5;
                                   imageView5.setImage(image);
                                   break;                    
                        case "rect6":
                                    game[6]=5;
                                   imageView6.setImage(image);
                                   break;                
                        case "rect7":
                                    game[7]=5;
                                   imageView7.setImage(image);
                                   break;
                        case "rect8":
                                    game[8]=5;
                                   imageView8.setImage(image);
                                   break;                                   
                    }
                  
                    
             }        
            
        }
        catch(Exception ex){
           ex.printStackTrace();}       
    /****************************after every turn check if any body won******************************/
        if((game[0]==game[1])&&(game[1]==game[2])&&(game[0]!=0)){
             if(game[0]==4){System.out.println("X wins");} 
             else{System.out.println("O wins");}
             break;
        } 
        
        if((game[3]==game[4])&&(game[4]==game[5])&&(game[3]!=0)){
             if(game[0]==4){System.out.println("X wins");} 
             else{System.out.println("O wins");}
             break;
        } 
        if((game[6]==game[7])&&(game[7]==game[8])&&(game[6]!=0)){
             if(game[0]==4){System.out.println("X wins");} 
             else{System.out.println("O wins");}
             break;
        } 
        if((game[0]==game[7])&&(game[7]==game[3])&&(game[0]!=0)){
             if(game[0]==4){System.out.println("X wins");} 
             else{System.out.println("O wins");}
             break;
        } 
        if((game[5]==game[8])&&(game[8]==game[0])&&(game[5]!=0)){
             if(game[0]==4){System.out.println("X wins");} 
             else{System.out.println("O wins");}
             break;
        } 
        if((game[1]==game[8])&&(game[8]==game[4])&&(game[1]!=0)){
             if(game[0]==4){System.out.println("X wins");} 
             else{System.out.println("O wins");}
             break;
        } 
        if((game[2]==game[6])&&(game[6]==game[5])&&(game[2]!=0)){
             if(game[0]==4){System.out.println("X wins");} 
             else{System.out.println("O wins");}
             break;
        } 
        if((game[3]==game[2])&&(game[2]==game[8])&&(game[3]!=0)){
             if(game[0]==4){System.out.println("X wins");} 
             else{System.out.println("O wins");}
             break;
        } 
   
        //if(((game[0]==game[1])&&(game[1]==game[2]))||((game[3]==game[4])&&(game[4]==game[5]))||((game[6]==game[7])&&(game[7]==game[8]))){break;}
        //if(((game[0]==game[7])&&(game[7]==game[3]))||((game[1]==game[8])&&(game[8]==game[4]))||((game[2]==game[6])&&(game[6]==game[5]))){break;}
        //if(((game[5]==game[8])&&(game[8]==game[0]))||((game[3]==game[2])&&(game[2]==game[8]))){break;}
   
        
        }
    }
    
/******************************************************************************************************************/
/**********************************************End of Run *********************************************************/
/******************************************************************************************************************/
  
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
/****************************************************************************************/
/***************************************** Constructor **********************************/
/****************************************************************************************/
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
        

        try{
                    mySocket=new Socket("127.0.0.1",5005);

        }
        catch(Exception ex){
                  ex.printStackTrace();
                  }
             
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
                             try{
                                ps=new PrintStream(mySocket.getOutputStream());
                                ps.println("rect0");
                                }catch(Exception ex){
                                ex.printStackTrace();
                                }
                        }
                    });        
imageView1.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {

                        @Override
                        public void handle(MouseEvent event) {
                             try{
                                ps=new PrintStream(mySocket.getOutputStream());
                                ps.println("rect1");
                                }catch(Exception ex){
                                ex.printStackTrace();
                                }
                        }
                    });

imageView2.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {

                        @Override
                        public void handle(MouseEvent event) {
                              try{
                                ps=new PrintStream(mySocket.getOutputStream());
                                ps.println("rect2");
                                }catch(Exception ex){
                                ex.printStackTrace();
                                }
                        }
                    });

imageView3.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {

                        @Override
                        public void handle(MouseEvent event) {
                             try{
                                ps=new PrintStream(mySocket.getOutputStream());
                                ps.println("rect3");
                                }catch(Exception ex){
                                ex.printStackTrace();
                                }
                        }
                    });

imageView4.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {

                        @Override
                        public void handle(MouseEvent event) {
                             try{
                                ps=new PrintStream(mySocket.getOutputStream());
                                ps.println("rect4");
                                }catch(Exception ex){
                                ex.printStackTrace();
                                }
                        }
                    });

imageView5.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {

                        @Override
                        public void handle(MouseEvent event) {
                             try{
                                ps=new PrintStream(mySocket.getOutputStream());
                                ps.println("rect5");
                                }catch(Exception ex){
                                ex.printStackTrace();
                                }
                        }
                    });

imageView6.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {

                        @Override
                        public void handle(MouseEvent event) {
                             try{
                                ps=new PrintStream(mySocket.getOutputStream());
                                ps.println("rect6");
                                }catch(Exception ex){
                                ex.printStackTrace();
                                }
                        }
                    });

imageView7.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {

                        @Override
                        public void handle(MouseEvent event) {
                             try{
                                ps=new PrintStream(mySocket.getOutputStream());
                                ps.println("rect7");
                                }catch(Exception ex){
                                ex.printStackTrace();
                                }
                        }
                    });

imageView8.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {

                        @Override
                        public void handle(MouseEvent event) {
                             try{
                                ps=new PrintStream(mySocket.getOutputStream());
                                ps.println("rect8");
                                }catch(Exception ex){
                                ex.printStackTrace();
                                }
                        }
                    });


    }
    

}
