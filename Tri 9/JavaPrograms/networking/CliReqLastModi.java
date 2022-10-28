import java.io.*;
import java.net.*;

public class CliReqLastModi {
    public static void main(String args[]) throws IOException{

        Socket socket = new Socket(InetAddress.getLocalHost(), 5217);
        System.out.println("Request sent ... ");

        //read file name 
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter tht filename : ");
        String fileString = bufferedReader.readLine();

        //outputstream
        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
        dataOutputStream.writeUTF(fileString);

        DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
        String msg = dataInputStream.readUTF();
        System.out.println(msg);
    }

}
