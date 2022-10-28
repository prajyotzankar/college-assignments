import java.util.*;

public class TableOfNumber {
    int i;
    void table(int n){
        for(i = 1 ; i <= 10 ; i++)
            System.out.println(n+" * " +i+ " = " +(n*i));
        
    }

    public static void main(String[] args){
        TableOfNumber t = new TableOfNumber();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to print its table ");
        int x = sc.nextInt();
        t.table(x);
    }
}
