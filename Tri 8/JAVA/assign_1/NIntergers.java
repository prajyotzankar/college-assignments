import java.util.*;
import java.io.*;

public class NIntergers {

    public static void main(String arg[]){
        
        TreeSet nIntegers = new TreeSet();

        Scanner scan_obj = new Scanner(System.in);

        int no_of_integers;
        System.out.println("Enter number of Integers : ");
        no_of_integers = scan_obj.nextInt();
        scan_obj.nextLine();

        System.out.println("Enter the Integers : ");
        for(int i = 0 ; i < no_of_integers ; i++){
            nIntegers.add(scan_obj.nextInt());
        }

        Iterator tree_set_itr = nIntegers.iterator();

        while(tree_set_itr.hasNext()){
            System.out.println(tree_set_itr.next());
        }
        scan_obj.nextLine();
        System.out.println("Enter the Integer to search for : ");
        int search_int = scan_obj.nextInt();

        System.out.println(nIntegers.contains(search_int));


    }
}
