import java.util.*;

class Employee{
    private int id;
    private double salary;
    private String name, dept;
    double total;

    void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Name : ");
        name = sc.nextLine();
        
        System.out.println("ID : ");
        id = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Department : ");
        dept = sc.nextLine();

        System.out.println("Salary : ");
        salary = sc.nextDouble();
    }

    void display(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("Department: "+dept);
        System.out.println("Salary: "+salary);
    }

    double total(){
        total = total + salary;
        return total;
    }
}

class Manager extends Employee{
    private double bonus;

    void accept(){
        super.accept();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Bonus of Manager: ");
        bonus = sc.nextDouble();

        super.total = bonus;
    }

    void display(){
        super.display();
        System.out.println("Bonus: "+bonus);
        System.out.println("Total Salary: "+total);
    } 
}



public class ManagerDemo {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Managers: ");
        int no_of_managers = sc.nextInt();
        sc.nextLine();

        Manager manager_arr[] = new Manager[no_of_managers];
        for(int i = 0; i < no_of_managers ; i++){
            manager_arr[i] = new Manager();
            manager_arr[i].accept();
            manager_arr[i].display();
            manager_arr[i].total();
        }

        double max = 0;
        int max_index = 0;
        for(int i = 0; i < no_of_managers ; i++){
            if(max < manager_arr[i].total){
                max = manager_arr[i].total;
                max_index = i;
            }
        }

        System.out.println("The Employee having the maximum Total salary is :");
        manager_arr[max_index].display();

    }
}
