import java.util.*;
import java.io.FileReader;  
import java.io.BufferedWriter; 
import java.io.FileWriter;
public class CountryData {
    public static void main(String args[]) throws Exception{
        String input_path, country, state, city;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file/dir location");
        input_path = sc.nextLine();
        
        FileWriter writer = new FileWriter(input_path);
        BufferedWriter buffer = new BufferedWriter(writer);

        System.out.println("Country : ");
        country = sc.nextLine();

        System.out.println("State : ");
        state = sc.nextLine();

        System.out.println("City : ");
        city = sc.nextLine();

        String line = country + " " + state + " " + city;
        buffer.write(line);
        buffer.close();
        
        FileReader file = new FileReader(input_path);
        int i;    
        while((i=file.read())!=-1)    
            System.out.print((char)i);    
        file.close(); 
        
    }
}
