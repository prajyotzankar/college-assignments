import java.util.*;

public class Bank {
    int balance, amt;

    Bank(){
        balance = 50000;
    }
    int accept(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount : ");
        amt = sc.nextInt();
        return amt;
    }
    void deposite(int deposite_amt){
        balance = balance + deposite_amt;
        System.out.println("New balance = " +balance);
    }

    void withdrawal(int debit_amt){
        balance = balance - debit_amt;
        System.out.println("New balance = " +balance);
    }

    public static void main(String[] args){
        int amt, option = 1;
        Bank transaction = new Bank();
        Scanner sc = new Scanner(System.in);

        System.out.println("1 -> Deposite");
        System.out.println("2 -> Withdrawal");
        
        while(option != 0){
            System.out.println("Enter the option");
            option = sc.nextInt();

            switch(option){
                case 1 :    transaction.deposite(transaction.accept());
                            break;

                case 2 :    transaction.withdrawal(transaction.accept());
                            break;
            }
        }
    }
}
