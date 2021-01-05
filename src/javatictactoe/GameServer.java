
package javatictactoe;


import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

/**
 *
 * @author Aya Hussein
 */
public class GameServer {
    ServerSocket serverSocket;
    public GameServer(){
        try{
        serverSocket = new ServerSocket(5005);
        while(true){
            Socket s=serverSocket.accept();
            new GameHandler(s);
        }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
   public static void main(String[] args){
       new GameServer();
   } 
}
class GameHandler extends Thread{
    DataInputStream dis;
    PrintStream ps;
    static Vector<GameHandler> clientsVector=new Vector<GameHandler>();
    public GameHandler(Socket cs){
        try{
        dis=new DataInputStream(cs.getInputStream());
        ps=new PrintStream(cs.getOutputStream());
        clientsVector.add(this);
        start();
        }        
        catch(IOException ex){
            ex.printStackTrace();
        }
        
    }
    public void run(){
        while(true){
            try{
            String str=dis.readLine();
            System.out.println(str);
            sendMessageToAll(str);
            }
            catch(IOException ex){
            ex.printStackTrace();
            //if(Vector.size() == 0){break;}
        }
        }
    }
    void sendMessageToAll(String msg){
        for(GameHandler ch: clientsVector){
            ch.ps.println(msg);
        }
    }

}

