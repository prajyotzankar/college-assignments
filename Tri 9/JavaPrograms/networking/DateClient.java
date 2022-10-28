import java.net.*;
import java.io.*;
import java.util.*;

public class DateClient {
    public static void main(String args[]){
        try{
            InetAddress inetAddress = InetAddress.getLocalHost();
            System.out.println(inetAddress.getHostName());
            Socket socket = new Socket(inetAddress.getHostName(), 5952);

            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());

            dataOutputStream.writeUTF("Hello Server");

            dataOutputStream.flush();
            dataOutputStream.close();
            socket.close();

        }

        catch(Exception e){
            System.out.println(e);
        }
    }
}
