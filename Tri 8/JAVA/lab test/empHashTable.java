import java.util.*;
import java.io.*;


public class empHashTable {
    
    public static void main(String arg[]){

        Hashtable emp_hash_table = new Hashtable();
        Scanner scan_obj  = new Scanner(System.in);
        int no_of_emp;
        String name, search_name, desig;
        System.out.println("Enter the number of employees : ");
        no_of_emp = scan_obj.nextInt();
        scan_obj.nextLine();
        
        for(int i = 0 ; i < no_of_emp ; i++){
            System.out.println("Name : ");
            name = scan_obj.nextLine();

            System.out.println("Designation : ");
            desig = scan_obj.nextLine();
            System.out.println("\n");
            
            emp_hash_table.put(name, desig);
        }

        Enumeration keys = emp_hash_table.keys();
        Enumeration values = emp_hash_table.elements();

        System.out.println("\n");
        
        
        System.out.println(emp_hash_table);

        System.out.println("\n");
        System.out.println("Enter employee name to search : ");
        search_name = scan_obj.nextLine();
        int flag = 0;
        while(keys.hasMoreElements()){
            name = (String)keys.nextElement();
            desig = (String)values.nextElement();
            if(name.equals(search_name)){
                System.out.println("Name\t Designation ");
                System.out.println(name+ "\t" +desig);
                flag = 1;
            }
        }
        if(flag == 0){
            System.out.println("Employee not found!");
        }


    }
}

