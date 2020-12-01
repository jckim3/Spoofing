

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {

    private BufferedReader reader;
    private ServerSocket server= null;
    private Socket socket;

    public void start(){
        try{
            server = new ServerSocket(12345);
            System.out.println("Server started");
            while(true){
                socket = server.accept();
                reader =  new BufferedReader(new InputStreamReader(socket.getInputStream()));
                getMessage();
            }
        } catch(Exception e){
            e.printStackTrace();
        } finally{
            try{
                if ( reader != null ) reader.close();
                if ( socket != null )  socket.close();
            } catch(Exception e){
                e.printStackTrace();
            }
        }

    }

    public void getMessage() {
        try{
            while(true){
                System.out.println(" Client : "+ reader.readLine());
            }
        }catch(Exception e){
            e.printStackTrace();
        }

    }

}