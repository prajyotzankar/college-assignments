import java.io.*;
import java.net.*;

public class ChatClient {
    public static void main(String args[]) throws Exception{
        Socket socket = new Socket(InetAddress.getLocalHost(), 3000);

        BufferedReader keyboardBufferedReader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader rBufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        System.out.println("Start chatting ... ");
        System.out.println("Type 'STOP' to stop chatting");

        try{
            String receivedMessage = "", sendMessage = "";
            while(!receivedMessage.equals("STOP")){
                sendMessage = keyboardBufferedReader.readLine(); //read keyboard
                printWriter.println(sendMessage);// sending to server
                printWriter.flush();

                if((receivedMessage = rBufferedReader.readLine()) != null){
                    System.out.println(receivedMessage);
                }
                else if((receivedMessage = rBufferedReader.readLine()) != "STOP"){
                    socket.close();
                    keyboardBufferedReader.close();
                    rBufferedReader.close();
                    printWriter.close();
                }
            }
        }
        catch(Exception e){
            System.out.println("Chatting Stopped ... ");
        }


    }
}
