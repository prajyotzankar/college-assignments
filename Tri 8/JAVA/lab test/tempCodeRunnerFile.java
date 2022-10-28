import java.util.*;
import java.io.*;

class SortBySalary implements Comparator<Manager>{
    public int compare(Manager s1, Manager s2){
        return s1.salary - s2.salary ;
    }
}

class SortByName implements Comparator<Manager>{
    public int compare(Manager s1, Manager s2){
        return s1.name.compareTo(s2.name);
    }
}

class Manager{
    int salary, eid;
    String name;

    public Manager(int salary, String name, int eid){
        this.name = name;
        this.salary = salary;
        this.eid = eid;
    }

    @Override
    public String toString(){
        return this.eid+ " " +this.name+ " " +this.salary;
    }

}


public class managerInfo {
    public static void main(String arg[]){

        int no_of_manager, salary, i, eid;
        String name;

        Scanner scan_obj = new Scanner(System.in);

        System.out.println("Enter no of manager : ");
        no_of_manager = scan_obj.nextInt();
        scan_obj.nextLine();

        ArrayList <Manager> manager_arr = new ArrayList<Manager>();

        for(i = 0 ; i < no_of_manager ; i++ ){
            System.out.println("EId : ");
            eid = scan_obj.nextInt();
            scan_obj.nextLine();
            
            System.out.println("Name : ");
            name = scan_obj.nextLine();

            System.out.println("Salary : ");
            salary = scan_obj.nextInt();
            scan_obj.nextLine();
            System.out.println("\n");

            manager_arr.add(new Manager(salary, name, eid));
            
        }

        System.out.println("Unsorted List of Manager objects ->");
        for(i = 0 ; i < no_of_manager ; i++)
            System.out.println(manager_arr.get(i));
        System.out.println("\n");

        System.out.println("Manager objects sorted by Name");
        Collections.sort(manager_arr, new SortByName());
        for(i = 0 ; i < no_of_manager ; i++ )
            System.out.println(manager_arr.get(i));
        System.out.println("\n");

        System.out.println("Manager objects sorted by Salary ");
        Collections.sort(manager_arr, new SortBySalary());
        for(i = 0 ; i < no_of_manager ; i++ )
            System.out.println(manager_arr.get(i));
        System.out.println("\n");

        



    }
}

