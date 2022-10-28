public class JavaCode4 {
    public static void main(String[] args){
        int num = 12345, numCopy = num, rev = 0;

        System.out.println("Number : " + num);

        for(int i = 0; i <= numCopy ; i++){
            rev = rev*10;
            rev = rev + numCopy%10;
            i = 0;
            numCopy = numCopy/10;
        }

        System.out.println("After reversing the number : " + rev);
        if(num == rev)
            System.out.println("Number is Palindrome.");
        else
            System.out.println("Number is not a Palindrome");

    }
}
