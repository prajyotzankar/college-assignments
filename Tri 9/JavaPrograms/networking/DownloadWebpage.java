import java.io.*;
import java.net.*;

public class DownloadWebpage {
    public static void main(String[] args){
        URL url;
        String urlStr = "file:///C:/Users/zanka/OneDrive/Documents/sage%20valo%20bind.xml";
        String line;

        try{
            url = new URL(urlStr);
            InputStream inputStream = url.openStream();
            BufferedReader bReader = new BufferedReader(new InputStreamReader(inputStream));

            while((line = bReader.readLine()) != null){
                System.out.println(line);
            }
        }
        catch(IOException ioe){
            ioe.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
