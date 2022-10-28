import java.net.InetAddress;
public class GetIPAdd {
	public static void main(String[] argv) throws Exception {
		InetAddress addr = InetAddress.getLocalHost();
		System.out.println("Host name is: "+addr.getHostName());
		System.out.println("Ip address is: "+ addr.getHostAddress());
	}
}
