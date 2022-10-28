import java.util.Scanner;
import java.util.*;
import java.io.*;

class Employee{

    private int id, salary;
    int sal = salary, total;
    private String name, dept;
    

    public Employee(){
        this.id = 0;
        this.salary = 0;
        this.name = "name";
        this.dept = "dept";
    }

    public Employee(int id, String name, String dept, int salary){
        this.id = id;
        this.salary = salary;
        this.name = name;
        this.dept = dept;
    }

    public void accept(){

        Scanner scan_obj = new Scanner(System.in);

        System.out.println("ID : ");
        id = Integer.parseInt(scan_obj.nextLine());

        System.out.println("Name : ");
        name = scan_obj.nextLine();

        System.out.println("Department : ");
        dept = scan_obj.nextLine();

        System.out.println("Salary : ");
        salary = Integer.parseInt(scan_obj.nextLine());
    }

    public int total(){
        total += salary; 
        return total;
    }

    public void display(){

        System.out.println("ID : "+id);
        System.out.println("Name : "+name);
        System.out.println("Department : "+dept);
        System.out.println("Salary : "+salary);
        
    }
}

class Manager extends Employee{

    private int bonus;
    public int final_salary;


    public void accept(){
        super.accept();
        Scanner scan_obj = new Scanner(System.in);

        System.out.println("Bonus : ");
        bonus = Integer.parseInt(scan_obj.nextLine());
        total = bonus;

        
    }

    public void display(){
        super.display();
        System.out.println("Bonus : "+bonus);
        System.out.print("Total Salary : "+super.total);
        
    }
}

public class EmployeeInfo {
    
    public static void main(String arg[]){

        Scanner scan_obj = new Scanner(System.in);

        int no_of_manager;

        System.out.println("Enter no of Managers : ");
        no_of_manager = Integer.parseInt(scan_obj.nextLine());
        Manager manager_arr[] = new Manager[no_of_manager];

        for(int i = 0 ; i < no_of_manager ; i++){
            manager_arr[i] = new Manager();
            manager_arr[i].accept();
            manager_arr[i].total();
        }

        System.out.println("Manager with highest total salary is -> ");
        Manager manager_highest_tsalary = manager_arr[0];
        for(int i = 1 ; i < no_of_manager ; i++){
            if(manager_arr[i].total > manager_highest_tsalary.total)
                manager_highest_tsalary = manager_arr[i];
        }

        manager_highest_tsalary.display();

    }
}



