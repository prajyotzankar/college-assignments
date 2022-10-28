import java.io.*;
import java.net.*;
import java.util.*;

public class server {
    public static void main (String args []) {
        try {
            ServerSocket serverSocket = new ServerSocket(5217);
            System.out.println( "waiting for permission" );
            Socket socket = serverSocket.accept();
            System.out.println ( "Connection established....." );
            DataOutputStream dataOutputStream = new DataOutputStream( socket.getOutputStream() );
            dataOutputStream.writeBytes( "Local Date & Time: "+( new Date()).toString() );
            socket.close();
            serverSocket.close();
        } catch ( Exception e ) {
            System.out.println(e.getMessage());
        }
    }
}
