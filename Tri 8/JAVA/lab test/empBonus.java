import java.util.Scanner;

class Employee
{
    private int id;
    private double salary;
    private String name;
    private String dept;
    double sal = salary;
    double total;
    public Employee()
    {
        id = 0;
        salary = 0.0;
        name = "";
        dept = "";
    }
    public Employee(int id,double salary,String name,String dept)
    {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }
    public void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id : ");
        id = sc.nextInt();
        System.out.println("Enter name : ");
        name = sc.next();
        System.out.println("Enter department : ");
        dept = sc.next();
        System.out.println("Enter salary : ");
        salary = sc.nextDouble();
    }
    public double total()
    {
        total += salary;
        return total;
    }
    public void display()
    {
        System.out.println("ID : "+id);
        System.out.println("Name : "+name);
        System.out.println("Department : "+dept);
        System.out.println("Salary : "+salary);
    }

}
class Manager extends Employee
{
    private double bonus;
    public void accept()
    {
        super.accept();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter bonus : ");
        bonus = sc.nextDouble();
        super.total = bonus;
    }
    public void display()
    {
        super.display();
        System.out.println("Bonus : "+bonus);
        System.out.println("Total Salary : "+total);
    }
}
public class empBonus
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of employees");
        int n = sc.nextInt();
        Manager[] m = new Manager[n];
        for(int i=0;i<n;i++)
        {
            m[i] = new Manager();
            m[i].accept();
            m[i].total();
        }
        for(int i=0;i<n;i++)
        {
            m[i].display();
        }
        double t = m[0].total;
        int temp = 0;
        for(int i=1;i<n;i++)
        {
            if(t<m[i].total)
            {
                t = m[i].total;
                temp=i;
            }
        }
        System.out.println("Employee having maximum salary : ");
        m[temp].display();
    }
}
