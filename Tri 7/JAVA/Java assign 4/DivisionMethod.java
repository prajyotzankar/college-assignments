import java.util.*;

class divide{

    void division(int num_1, int num_2){
        try {
            if (num_1 > num_2) {
                System.out.println("Division is: "+ num_1/num_2);
            } else {
                System.out.println("Division is: "+ num_2/num_1);
            }
        } catch (InputMismatchException e) {
            System.out.println("Cannot divide by zero.");
        }
    }
}

public class DivisionMethod {
    
    public static void main(String[] args){

        divide div = new divide();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num_1 = sc.nextInt();

        System.out.println("Enter second number: ");
        int num_2 = sc.nextInt();

        div.division(num_1, num_2);

    }
}
