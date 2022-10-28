import java.util.*;

public class FactSqCube {


    void fact(int num){
        int i;
        for(i = num - 1 ; i > 0  ; i--)
            num = num*i;
        System.out.println("Factorial = "+num);

    }

    void sqCube(int num){
        System.out.println("Square = "+(Math.pow(num, 2)));
        System.out.println("Cube = "+(Math.pow(num, 3)));
    }

    public static void main(String[] args){
        int num;
        Scanner sc = new Scanner(System.in);
        FactSqCube check = new FactSqCube();

        System.out.println("Enter a number : ");
        num = sc.nextInt();
        check.fact(num);
        check.sqCube(num);
    }
}
