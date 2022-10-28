import java.util.*;

class OwnException extends Exception{
    public OwnException(String str){
        super(str); 
    }
}

public class VoteEligible {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter voter age: ");
        int age_1 = sc.nextInt();

        try {
            if(age_1 < 18){ 
                throw new OwnException("Person is not eligible to vote");
            }
            else {  
                System.out.println("Person is eligible to vote!!");  
            }
        }
        catch (OwnException oe) 
        {  
            System.out.println("Caught the exception");  
            System.out.println(oe.getMessage());  
        }    
    }
}
