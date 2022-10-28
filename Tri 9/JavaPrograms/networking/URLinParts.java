import java.net.URL;

public class URLinParts{
    public static void main(String args[]) throws Exception{
        String urlStr = "https://drive.google.com/drive/u/0/my-drive";
        URL url = new URL(urlStr);
        System.out.println("URL is " + url.toString());
        System.out.println("Protocol is " + url.getProtocol());
        System.out.println("File name is " + url.getFile());
        System.out.println("Host is " + url.getHost());
        System.out.println("Path is " + url.getPath());
        System.out.println("Port is " + url.getPort());
        System.out.println("Default port is " + url.getDefaultPort());

    }
}
