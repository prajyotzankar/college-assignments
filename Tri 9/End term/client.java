import java.net.*;
import java.io.*;

public class client {
    public static void main ( String args []) {
        try {
            InetAddress inetAddress = InetAddress.getLocalHost();
            System.out.println( inetAddress.getHostName() );
            Socket socket = new Socket( inetAddress.getHostName(), 5217 );
            BufferedReader bReader = new BufferedReader( new InputStreamReader( socket.getInputStream()));
            System.out.println(bReader.readLine());
            socket.close();
        } catch ( Exception e ) {
            System.out.println(e.getMessage());
        }
    }
}
