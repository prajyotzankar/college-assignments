import java.util.*;
import java.io.*;

class JavaCode1{
    public static void main(String[] args){
       try{
           System.out.println("Hello");
           System.out.println(6/0);
       }
       catch(Exception ee){System.out.println(ee);}
       catch(ArithmeticException ae){System.out.println(ae);}
    }
}