import java.net.*;
import java.io.*;
import java.util.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class SerResLastModi {
    public static void main(String args[]) throws IOException{

        ServerSocket serverSocket = new ServerSocket(5217);

        System.out.println("Server is running and waiting for client request ");
        Socket socket = serverSocket.accept();

        //reading from keyboard
        DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
        String fileString = dataInputStream.readUTF();

        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
        URL url = new URL(fileString);
        URLConnection urlConnection = url.openConnection();

        //timestamp
        long timestamp = urlConnection.getLastModified();
        SimpleDateFormat df = new SimpleDateFormat("dd MM yyyy HH:mm:ss:SSS Z"); 
        Date dt = new Date(timestamp);
        dataOutputStream.writeUTF("The last modification time is :" +df.format(dt));

        
    }
}
