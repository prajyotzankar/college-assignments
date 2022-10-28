import java.io.File;
import java.util.*;

public class CheckFileExists {
    
    public static void main(String args[]) {

        String input_path;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file/dir location");
        input_path = sc.nextLine();

        try {
            File file = new File(input_path);
            file.createNewFile();
            System.out.println("Is directory? " + file.isDirectory());
            System.out.println("Is file? " + file.isFile());
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}