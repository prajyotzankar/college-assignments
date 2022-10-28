public class JavaCode2 {
    public static void main(String[] args){
        int num1 = 500, num2 = 70, num3 = 3000;

        if(num1 > num2){
            if(num1 > num3)
                System.out.println(num1 + " is greatest.");
            else{
                if(num3 > num2)
                    System.out.println(num3 + " is greatest.");
                else
                    System.out.println(num2 + " is greatest.");
            }
        }
        else{
            if(num2 > num3)
                System.out.println(num2 + " is greatest");
        }
    }
}
