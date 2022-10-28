import java.util.*;

public class basic {
    int x, y, sum, sub;

    basic(){
        x = 20;
        y = 30;
    }

    void accept(){
        System.out.println("Enter tvalue for x and y ");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
    }

    void display(){
        System.out.println("X = "+x+" Y = "+y);
        sum = x + y;
        System.out.println("Addition = "+sum);
        sub = x - y;
        System.out.println("Subtraction = "+sub);
    }

    public static void main(String[] args){
        basic b = new basic();
        b.display();
        b.accept();
        b.display();
    }
}
