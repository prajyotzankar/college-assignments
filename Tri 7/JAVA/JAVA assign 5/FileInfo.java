import java.io.File;
import java.util.*;

public class FileInfo {
    
    public static void main(String args[]) {

        String input_path;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file/dir location");
        input_path = sc.nextLine();

        try {
            File file = new File(input_path);
    
            file.createNewFile();
            System.out.println("File is readable: "+file.canRead());
		    System.out.println("File is writable: "+file.canWrite());

            long bytes = file.length();
            System.out.println(String.format("%,d bytes", bytes));
            System.out.println(String.format("%,d kilobytes", bytes / 1024));

            String abs_path = file.getAbsolutePath();
            System.out.println("Absolute path : "+abs_path);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}


