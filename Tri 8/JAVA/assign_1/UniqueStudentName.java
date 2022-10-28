import java.util.*;
import java.io.*;

public class UniqueStudentName {
    public static void main(String[] args){

        Scanner scan_obj = new Scanner(System.in);
        ArrayList student_arr = new ArrayList();

        int no_of_students, i;
        String name;

        System.out.println("Enter no of students : ");
        no_of_students = scan_obj.nextInt();
        scan_obj.nextLine();
        System.out.println("Enter Student names -> ");
        for(i = 0 ; i < no_of_students ; i++){
            name = scan_obj.nextLine();

            if(student_arr.contains(name))
                System.out.println("Name exists.");
            else
                student_arr.add(name);
        }

        System.out.println("Student names entered - > ");
        for(i = 0 ; i < no_of_students ; i++)
            System.out.println(student_arr.get(i));

        Collections.sort(student_arr);
        System.out.println("Student names in Ascending order -> ");
        for(i = 0 ; i < no_of_students ; i++)
            System.out.println(student_arr.get(i));

    }
}
