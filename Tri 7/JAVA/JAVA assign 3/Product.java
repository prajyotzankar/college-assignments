import java.util.*;

public class Product{
    int pid; 
    String pname; 
    int price;

    void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the pid : ");
        pid = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Product Name : ");
        pname = sc.nextLine();

        System.out.println("Enter the Price : ");
        price = sc.nextInt();
    }
    void display(){
        System.out.println("Product id = " +pid);
        System.out.println("Product Name = " +pname);
        System.out.println("Price = " +price);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int noOfProducts;
        System.out.println("Enter the no of products : ");
        noOfProducts = sc.nextInt();
        sc.nextLine();

        
        Product arr[] = new Product[noOfProducts];

        for(int i = 0; i < noOfProducts ; i++){
            arr[i] = new Product();
            arr[i].accept();
            arr[i].display();
        }
    }
}