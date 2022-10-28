import java.util.*;
import java.io.*;

abstract class Staff{
    String name, address;

    public Staff(String name, String address){
        this.name = name;
        this.address = address;
    }
    abstract public void display();
}

class FullTime extends Staff{

    String dept;
    float salary;

    public FullTime(String name, String address, String dept, float salary){
        super(name, address);
        this.dept = dept;
        this.salary = salary;
    }
    public void display(){
        System.out.println("Name : "+name);
        System.out.println("Address : "+address);
        System.out.println("Department : "+dept);
        System.out.println("Salary : "+salary+"\n");
    }


}

class PartTime extends Staff{

    float no_of_hrs, rate;

    public PartTime(String name, String address, float no_of_hrs, float rate){
        super(name, address);
        this.rate = rate;
        this.no_of_hrs = no_of_hrs;
    }

    public void display(){
        System.out.println("Name : "+name);
        System.out.println("Address : "+address);
        System.out.println("No of Hours : "+no_of_hrs);
        System.out.println("Rate : "+rate);
        System.out.println("Payout : "+no_of_hrs*rate+"\n");
    }
}

public class StaffInfo {

    public static void main(String arg[]){

        Scanner scan_obj = new Scanner(System.in);
        String name, address, dept;
        float salary, no_of_hrs, rate;
        int choice, i, no_of_emp;
        System.out.println("1 -> Full Time Employees");
        System.out.println("2 -> Part Time Employees");
        System.out.println("3 -> Exit");

        do{
            System.out.println("Enter the choice : ");
            choice = Integer.parseInt(scan_obj.nextLine());

            switch(choice){

                case 1 :    System.out.println("No of Employees : ");
                            no_of_emp = Integer.parseInt(scan_obj.nextLine());

                            FullTime fullTimeArr[] = new FullTime[no_of_emp];

                            for(i = 0 ; i < no_of_emp ; i++){
                                System.out.println("Name : ");
                                name = scan_obj.nextLine();

                                System.out.println("Address : ");
                                address = scan_obj.nextLine();

                                System.out.println("Department : ");
                                dept = scan_obj.nextLine();

                                System.out.println("Salary : ");
                                salary = Float.parseFloat(scan_obj.nextLine());

                                fullTimeArr[i] = new FullTime(name, address, dept, salary);
                                fullTimeArr[i].display();

                            }
                            break;

                case 2 :    System.out.println("No of Employees : ");
                            no_of_emp = Integer.parseInt(scan_obj.nextLine());

                            PartTime partTimeArr[] = new PartTime[no_of_emp];

                            for(i = 0 ; i < no_of_emp ; i++){
                                System.out.println("Name : ");
                                name = scan_obj.nextLine();

                                System.out.println("Address : ");
                                address = scan_obj.nextLine();

                                System.out.println("No of hours : ");
                                no_of_hrs = Float.parseFloat(scan_obj.nextLine());

                                System.out.println("Rate : ");
                                rate = Float.parseFloat(scan_obj.nextLine());

                                partTimeArr[i] = new PartTime(name, address, no_of_hrs, rate);
                                partTimeArr[i].display();

                            }
                            break;

                case 3 : return;

                default :   System.out.print("Enter a valid choice \n");;
                            break;
            }
        }
        while(choice != 3);


    }
    
}
