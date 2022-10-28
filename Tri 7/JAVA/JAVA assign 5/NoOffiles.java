import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class NoOffiles {
    public static void main(String args[]) {
    List<String> fileNames = new ArrayList<>();
    String input_path;
    Scanner sc = new Scanner(System.in);
    int count = 0;
    System.out.println("Enter file/dir location");
    input_path = sc.nextLine();
    try {
      DirectoryStream<Path> directoryStream = Files.newDirectoryStream(Paths.get(input_path));
      for (Path path : directoryStream) {
        count += 1;
      }
    }
    catch (IOException ex) {
    }
    System.out.println("File Count : "+count);
  }
}
