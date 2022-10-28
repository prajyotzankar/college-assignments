import java.util.*;

abstract class Staff{
    String name, address;
    abstract void accept();
    abstract void display();
}

class FullTimeStaff extends Staff{
    String dept;
    double salary;

    void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Name : ");
        name = sc.nextLine();
        
        System.out.println("Address : ");
        address = sc.nextLine();

        System.out.println("Department : ");
        dept = sc.nextLine();

        System.out.println("Salary : ");
        salary = sc.nextDouble();
    }

    void display(){
        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
        System.out.println("Department: "+dept);
        System.out.println("Salary: "+salary);
    }
}

class PartTimeStaff extends Staff{
    int hours, rate;

    void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Name : ");
        name = sc.nextLine();
        
        System.out.println("Address : ");
        address = sc.nextLine();

        System.out.println("Hours : ");
        hours = sc.nextInt();

        System.out.println("Rate : ");
        rate = sc.nextInt();
    }

    void display(){
        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
        System.out.println("No of Working Hours: "+hours);
        System.out.println("Rate per hour: "+rate);
    } 
}

public class Staffdemo {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int option;

        System.out.println("1 -> Full time Staff");
        System.out.println("2 -> Part time Staff");

        System.out.println("Enter the choice -> ");
        option = sc.nextInt();
        sc.nextLine();

        switch(option){
            case 1  :   System.out.println("Enter the number of Full Time Staff: ");
                        int no_of_full_staff = sc.nextInt();
                        sc.nextLine();

                        FullTimeStaff full_arr[] = new FullTimeStaff[no_of_full_staff];
                        for(int i = 0; i < no_of_full_staff ; i++){
                            full_arr[i] = new FullTimeStaff();
                            full_arr[i].accept();
                            full_arr[i].display();
                        }
                        break;

            case 2  :   System.out.println("Enter the number of Part Time Staff: ");
                        int no_of_part_staff = sc.nextInt();
                        sc.nextLine();

                        PartTimeStaff part_arr[] = new PartTimeStaff[no_of_part_staff];
                        for(int i = 0; i < no_of_part_staff ; i++){
                            part_arr[i] = new PartTimeStaff();
                            part_arr[i].accept();
                            part_arr[i].display();
                        }
                        break;

        }

    }
}
