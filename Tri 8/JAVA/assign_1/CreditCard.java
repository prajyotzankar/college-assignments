import java.util.*;

interface CreditCardInterface{
    public void viewCreditAmount(); //View Balance
    public void useCredit(); //spend money
    public void payCredit(); //pay card bill
    public void increaseLimit();   //increase the car limit
}

class BronzeCardCustomer implements CreditCardInterface{

    int no_of_limit_inc_left, creditAmount, creditLimit;
    int creditIncLimit, payAmount, spentAmount, incAmount;
    String cardNumber, name;

    Scanner scan_obj = new Scanner(System.in);

    BronzeCardCustomer(){
        this.no_of_limit_inc_left = 3;
        this.creditAmount = 0;
        this.creditLimit = 50000;
        this.creditIncLimit = 5000;
        this.cardNumber = "123456789";
    }

    public void accept(){

        System.out.println("Name : ");
        name = scan_obj.nextLine();
        
        System.out.println("Card Number (16 digits) : ");
        while (true) {
            cardNumber = scan_obj.nextLine();
            if(cardNumber.length() == 16 && cardNumber.matches("[0-9]+"))
                break;
            System.out.println("Card Number (16 digits) : ");
        }
        System.out.println("\n");
        
    }

    public void viewCreditAmount(){
        System.out.println("Card Number : "+cardNumber);
        System.out.println("Name : "+name);
        System.out.println("Current available Credit Limit : "+creditAmount);
        System.out.println("\n");
    }

    public void payCredit(){

        System.out.println("Enter the amount to pay(less than "+(creditLimit - creditAmount)+" ): ");
        while (true) {
            payAmount = Integer.parseInt(scan_obj.nextLine());
            if(payAmount > 0 && payAmount <= creditLimit - creditAmount)
                break;
            System.out.println("Enter the amount to pay(less than "+(creditLimit - creditAmount)+" ): ");
        }

        creditAmount += payAmount;
        System.out.println("Operation Successful \n");
        
    }

    public void useCredit(){

        System.out.println("Enter the amount to spend(less than "+creditAmount+" ): ");
        while (true) {
            spentAmount = Integer.parseInt(scan_obj.nextLine());
            if(spentAmount > 0 && spentAmount <= creditAmount)
                break;
            System.out.println("Enter the amount to pay(less than "+creditAmount+" ): ");
        }

        creditAmount -= spentAmount;
        System.out.println("Operation Successful \n");
        
    }

    public void increaseLimit(){

        if(no_of_limit_inc_left > 0){
            System.out.println("Enter amount to increment by (below "+creditIncLimit+" )");
            while (true) {
                incAmount = Integer.parseInt(scan_obj.nextLine());
                if(incAmount > 0 && incAmount <= creditIncLimit)
                    break;
                System.out.println("Enter amount to increment by (below "+creditIncLimit+" )");
            }
            creditLimit += incAmount;
            no_of_limit_inc_left--;
            System.out.println("Operation Successful \n");
        }
        else{
            System.out.println("No limit increments available \n");
        }

    }

    public void useService(BronzeCardCustomer serviceCustomer){
        int serviceChoice;
        System.out.println("1 -> View available limit");
        System.out.println("2 -> Pay the Card Bill");
        System.out.println("3 -> Spend money");
        System.out.println("4 -> Increase Credit Limit");
        System.out.println("5 -> Exit \n");

        do{
            
            System.out.println("Enter service choice : ");
            serviceChoice = Integer.parseInt(scan_obj.nextLine());

            switch(serviceChoice){
                case 1 :    serviceCustomer.viewCreditAmount();
                            break;

                case 2 :    serviceCustomer.payCredit();
                            break;

                case 3 :    serviceCustomer.useCredit();
                            break;

                case 4 :    serviceCustomer.increaseLimit();
                            break;

                case 5 :    break;

                default :   System.out.println("Enter a valid choice");
            }

        }while(serviceChoice != 5);
    }
}

class SilverCardCustomer extends BronzeCardCustomer{

    SilverCardCustomer(){
        super.no_of_limit_inc_left = 5;
        super.creditAmount = 0;
        super.creditLimit = 100000;
        super.creditIncLimit = 8000;
        super.cardNumber = "123456789";
    }
}

class GoldCardCustomer extends BronzeCardCustomer{

    GoldCardCustomer(){
        super.no_of_limit_inc_left = 6;
        super.creditAmount = 0;
        super.creditLimit = 150000;
        super.creditIncLimit = 10000;
        super.cardNumber = "123456789";
    }
}


public class CreditCard {

    public static void main(String arg[]){

        int customerType;
        Scanner scan_obj = new Scanner(System.in);

        System.out.println("1 -> Gold Card Customer");
        System.out.println("2 -> Silver Card Customer");
        System.out.println("3 -> Bronze Card Customer");
        System.out.println("4 -> Exit \n");

        do{
            System.out.println("Enter Customer type : ");
            customerType = Integer.parseInt(scan_obj.nextLine());

            switch(customerType){

                case 1  :   BronzeCardCustomer goldCardCustomer = new GoldCardCustomer();
                            goldCardCustomer.accept();
                            goldCardCustomer.useService(goldCardCustomer);
                            break;

                case 2  :   BronzeCardCustomer silverCardCustomer = new SilverCardCustomer();
                            silverCardCustomer.accept();
                            silverCardCustomer.useService(silverCardCustomer);
                            break;
                
                case 3  :   BronzeCardCustomer bronzeCardCustomer = new BronzeCardCustomer();
                            bronzeCardCustomer.accept();
                            bronzeCardCustomer.useService(bronzeCardCustomer);
                            break;
                
                case 4 :    break;

                default :   System.out.println("Enter a valid choice");

            }

        }while(customerType != 4);
    }
}
