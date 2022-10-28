import java.util.*;
import java.io.*;


public class StudentHashTable {
    
    public static void main(String arg[]){

        Hashtable student_hash_table = new Hashtable();
        Scanner scan_obj  = new Scanner(System.in);
        int no_of_students;
        String name, search_name;
        Float percentage;
        System.out.println("Enter the number of students : ");
        no_of_students = scan_obj.nextInt();
        scan_obj.nextLine();
        
        for(int i = 0 ; i < no_of_students ; i++){
            System.out.println("Name : ");
            name = scan_obj.nextLine();

            System.out.println("Percentage : ");
            percentage = scan_obj.nextFloat();
            scan_obj.nextLine();
            
            student_hash_table.put(name, percentage);
        }

        Enumeration keys = student_hash_table.keys();
        Enumeration values = student_hash_table.elements();

        System.out.println("\n");
        
        System.out.println("Name \tPercentage ");
        System.out.println(student_hash_table);

        System.out.println("\n");
        System.out.println("Enter student name to search : ");
        search_name = scan_obj.nextLine();
        int flag = 0;
        while(keys.hasMoreElements()){
            name = (String)keys.nextElement();
            percentage = (Float)values.nextElement();
            if(name.equals(search_name)){
                System.out.println(name+ "\t" +percentage);
                flag = 1;
            }
        }
        if(flag == 0){
            System.out.println("Student not found!");
        }


    }
}
