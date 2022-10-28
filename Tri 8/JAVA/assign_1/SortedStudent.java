import java.util.*;
import java.io.*;

class SortByRollNo implements Comparator<Student>{
    public int compare(Student s1, Student s2){
        return s1.rollNo - s2.rollNo ;
    }
}

class SortByName implements Comparator<Student>{
    public int compare(Student s1, Student s2){
        return s1.name.compareTo(s2.name);
    }
}

class Student{
    int rollNo;
    String name, address;

    public Student(int rollNo, String name, String address){
        this.name = name;
        this.rollNo = rollNo;
        this.address = address;
    }

    @Override
    public String toString(){
        return this.rollNo+ " " +this.name+ " " +this.address;
    }

}


public class SortedStudent {
    public static void main(String arg[]){

        int no_of_students, rollNo, i;
        String name, address;

        Scanner scan_obj = new Scanner(System.in);

        System.out.println("Enter no of students : ");
        no_of_students = scan_obj.nextInt();
        scan_obj.nextLine();

        ArrayList <Student> students_arr = new ArrayList<Student>();

        for(i = 0 ; i < no_of_students ; i++ ){
            System.out.println("Name : ");
            name = scan_obj.nextLine();

            System.out.println("Roll No : ");
            rollNo = scan_obj.nextInt();
            scan_obj.nextLine();

            System.out.println("Address : ");
            address = scan_obj.nextLine();

            students_arr.add(new Student(rollNo, name, address));
        }

        System.out.println("Unsorted List of Student objects ->");
        for(i = 0 ; i < no_of_students ; i++)
            System.out.println(students_arr.get(i));
        System.out.println("\n");

        System.out.println("Students objects sorted by Name");
        Collections.sort(students_arr, new SortByName());
        for(i = 0 ; i < no_of_students ; i++ )
            System.out.println(students_arr.get(i));
        System.out.println("\n");

        System.out.println("Student objects sorted by Roll No ");
        Collections.sort(students_arr, new SortByRollNo());
        for(i = 0 ; i < no_of_students ; i++ )
            System.out.println(students_arr.get(i));
        System.out.println("\n");

        



    }
}
