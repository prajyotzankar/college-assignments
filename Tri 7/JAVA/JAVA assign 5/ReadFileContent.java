import java.util.*;
import java.io.FileReader;  

public class ReadFileContent {
    public static void main(String args[]) {
        String input_path;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file/dir location");
        input_path = sc.nextLine();

        try {
            FileReader file = new FileReader(input_path);
            int i;    
            while((i=file.read())!=-1)    
                System.out.print((char)i);    
            file.close(); 
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
