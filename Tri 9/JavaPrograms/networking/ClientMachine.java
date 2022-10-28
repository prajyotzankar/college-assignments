import java.io.*; 
import java.net.*;

public class ClientMachine {
    public static void main(String[] args) throws Exception {
        Socket sock = new Socket(InetAddress.getByName("localhost"), 1000);

        // reading file name from keyboard
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        System.out.println("Enter the FileName to Fetch on Server Side:");
        String filename = br.readLine();

        OutputStream ostream = sock.getOutputStream(); 
        DataOutputStream dos = new DataOutputStream(ostream); 
        dos.writeUTF(filename);

        // receiving from server
        InputStream istream = sock.getInputStream(); 
        DataInputStream dis = new DataInputStream(istream); 
        String msg = dis.readUTF();

        if (msg.equals("0")) {
            System.out.println("File does not exists at Server Side:");
        } else {
            System.out.println("The Contents of the file at Server Side are:"); 
            System.out.println(msg);
        }
        dis.close();
        dos.close();
        sock.close();
        br.close();
    }
}
