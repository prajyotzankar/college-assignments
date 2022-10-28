import java.util.*;

public class Division {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num_1 = sc.nextInt();

        System.out.println("Enter second number: ");
        int num_2 = sc.nextInt();

        try {
            if (num_1 > num_2) {
                System.out.println("Division is: "+ num_1/num_2);
            } else {
                System.out.println("Division is: "+ num_2/num_1);
            }
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }

        sc.close();

    }
}
