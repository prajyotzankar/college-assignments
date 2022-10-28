import java.util.*;

class Course{
    private int courseno;
    private double fees;
    private String course_name;

    void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Course Name : ");
        course_name = sc.nextLine();
        
        System.out.println("Course No. : ");
        courseno = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Fees : ");
        fees = sc.nextDouble();

    }

    void display(){
        System.out.println("Course No.: "+courseno);
        System.out.println("Course Name : "+course_name);
        System.out.println("Fees : "+fees);
    }
}

class Student extends Course{
    private int stu_no;
    private String student_name, city;

    void accept(){
        super.accept();

        Scanner sc = new Scanner(System.in);
        System.out.println("Student Name : ");
        student_name = sc.nextLine();
        
        System.out.println("City Name : ");
        city = sc.nextLine();

        System.out.println("Student No. : ");
        stu_no = sc.nextInt();
        sc.nextLine();
        
    }

    void display(){
        super.display();
        System.out.println("Student No.: "+stu_no);
        System.out.println("Student Name : "+student_name);
        System.out.println("City : "+city);
    } 
}



public class StudentsDemo {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Students: ");
        int no_of_students = sc.nextInt();
        sc.nextLine();

        Student student_arr[] = new Student[no_of_students];
        for(int i = 0; i < no_of_students ; i++){
            student_arr[i] = new Student();
            student_arr[i].accept();
            student_arr[i].display();
            System.out.println(""+ '\n' + "");
        }

    }
}
