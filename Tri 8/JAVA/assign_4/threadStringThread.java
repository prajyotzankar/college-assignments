import java.util.*;

class StringThread1 extends Thread{
    String string1;
    String string2;

    StringThread1(String string1, String string2){
        this.string1 = string1;
        this.string2 = string2;
    }

    @Override
    public void run(){
        synchronized(string1){
            System.out.println("Inside StringThread1 : locked resource string1 "+string1);
            try{Thread.sleep(200);}
            catch(Exception e){System.out.println(e);}
        
            synchronized(string2){
                    System.out.println("Inside StringThread1 : locked resource string2 "+string2);
            }
            System.out.println("End of StringThread1 \n");
        } 
    }
}

class StringThread2 extends Thread{
    String string1;
    String string2;

    StringThread2(String string1, String string2){
        this.string1 = string1;
        this.string2 = string2;
    }

    @Override
    public void run(){
        synchronized(string1){
            System.out.println("Inside StringThread2 : locked resource string2 "+string2);
            try{Thread.sleep(200);}
            catch(Exception e){System.out.println(e);}
        
            synchronized(string2){
                System.out.println("Inside StringThread2 : locked resource string1 "+string1);
            }
            System.out.println("End of StringThread2 \n");
        } 
    }
}

public class threadStringThread {
    public static void main(String[] args){
        String string1 = "Python", string2 = "JAVA";

        StringThread1 stringThread1 = new StringThread1(string1, string2);
        StringThread2 stringThread2 = new StringThread2(string1, string2);

        stringThread1.start();
        stringThread2.start();

    }
}



