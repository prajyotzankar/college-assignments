import java.io.FileReader;
import java.util.*;
import java.io.BufferedReader;


public class ReadFileContent2 {
    
    public static void main(String args[]) {
        String input_path;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file/dir location");
        input_path = sc.nextLine();

        try {
            
            FileReader reader = new FileReader(input_path);
            BufferedReader br = new BufferedReader(reader);

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        
    }
}
