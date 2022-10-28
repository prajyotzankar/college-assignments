import java.net.*;
import java.io.*;
import java.util.*;

public class DateServer {
    public static void main(String args[]) throws Exception{
        ServerSocket serverSocket = new ServerSocket(5952);
        while(true){
            System.out.println("Waiting for connection ... ");
            Socket socket = serverSocket.accept();
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            dataOutputStream.writeBytes("Server Data : " + (new Date()).toString() + "\n");
            dataOutputStream.close();
            socket.close();
            
        }
        
    }    
}
