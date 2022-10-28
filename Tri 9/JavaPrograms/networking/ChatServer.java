import java.io.*;
import java.net.*;
import java.util.*;

public class ChatServer {
    public static void main(String args[]) throws Exception{
        ServerSocket serverSocket = new ServerSocket(3000);
        System.out.println("server is running and waiting for client to start ... ");
        Socket socket = serverSocket.accept();
        System.out.println("Connection established ... ");
        System.out.println("Start chatting ... ");
        System.out.println("Type 'STOP' to chatting");

        BufferedReader keyboardBufferedReader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader rBufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        try{
            String receiveMessage = "";
            String sendMessage = "";

            while(!receiveMessage.equals("STOP")){
                sendMessage = keyboardBufferedReader.readLine(); //read keyboard
                printWriter.println(sendMessage);// sending to server
                printWriter.flush();
                if((receiveMessage = rBufferedReader.readLine()) != null){
                    System.out.println(receiveMessage);
                }
                else if((receiveMessage = rBufferedReader.readLine()) != "STOP"){
                    serverSocket.close();
                    socket.close();
                    keyboardBufferedReader.close();
                    rBufferedReader.close();
                    printWriter.close();
                }

            }
        }
        catch(Exception e){
            System.out.println("Chatting stopped ... ");
        }


    }
}
