import java.net.*;
import java.io.*;
import java.util.*;

public class ServerMachine {
    public static void main(String args[]) throws Exception{
        ServerSocket serverSocket = new ServerSocket(1000);
        System.out.println("Server started waiting for Request from Client ... ");

        Socket socket = serverSocket.accept();
        System.out.println("Client connected ... ");
        InputStream inputStream = socket.getInputStream();
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        String filename = dataInputStream.readUTF();

        OutputStream outputStream = socket.getOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);

        File file1 = new File(filename);

        if(file1.exists()){
            int ch;
            String messageString = "";
            System.out.println("File exists ...");
            FileInputStream fileInputStream = new FileInputStream(file1);
            while((ch = fileInputStream.read()) != -1){
                messageString += (char) ch;
            }
            dataOutputStream.writeUTF(messageString);
            fileInputStream.close();
        }
        else{
            dataOutputStream.writeUTF("0");
            dataInputStream.close();
            dataOutputStream.close();
            serverSocket.close();
        }
    }
}
