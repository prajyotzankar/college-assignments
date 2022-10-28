import java.util.*;

public class Remainder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num_1 = sc.nextInt();

        System.out.println("Enter second number: ");
        int num_2 = sc.nextInt();

        try {
            System.out.println("Remainder = "+num_1%num_2);
        } catch (InputMismatchException  e) {
            System.out.println("Invalid Input.");

        }

    }
}
