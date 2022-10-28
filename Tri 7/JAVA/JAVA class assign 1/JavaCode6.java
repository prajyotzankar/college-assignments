public class JavaCode6 {
    public static void main(String[] args){
        int num = 11, i, flag = 1;
        for(i = 2 ; i < num ; i++){

            flag = num%i;
            
            if(flag == 0){
                System.out.println(num +" is not prime.");
                break;
            }
        }
        if(flag == 1)
            System.out.println(num +" is a Prime.");
    }
}
