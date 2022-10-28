import java.net.*;

public class displayIp {
    public static void main (String args []) throws Exception {
       
        InetAddress inetAddress = InetAddress.getLocalHost();
        String host_name = inetAddress.getHostName();
        String ipAddress = inetAddress.getHostAddress();
        System.out.println ( "Host Name: " +host_name );
        System.out.println ( "IP Address: " +ipAddress );
    }
}
