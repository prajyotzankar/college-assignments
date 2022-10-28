import java.io.FileOutputStream; 
import java.io.FileReader;
import java.util.*;
import java.io.BufferedReader;

public class SendInput {

    String input_path;
    String line;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter file/dir location");
    input_path = sc.nextLine();
    public static void main(String args[]){
            
        try{    
            FileOutputStream fout = new FileOutputStream(input_path);    
            String s = "Welcome to javaTpoint.";
            FileReader reader = new FileReader(input_path);
            BufferedReader br = new BufferedReader(reader);    
            line = br.readLine()    
            fout.write(line);    
            fout.close();    
            System.out.println("success...");    
        }
        catch(Exception e){System.out.println(e);}    
   } 
}

