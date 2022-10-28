import java.util.*;

class Buffer{

    int num1;
    Boolean flag = false;

    synchronized void get(){
        if(!flag){
            try{wait();}
            catch(Exception e){System.out.println(e);}
        }
        flag = false;
        System.out.println("Get : "+num1);
        notify();
    }

    synchronized void put(int num1){
        if(flag){
            try{wait();}
            catch(Exception e){System.out.println(e);}
        }
        this.num1 = num1;
        flag = true;
        System.out.println("Put : "+this.num1);
        notify();
    }
}

class Thread1 extends Thread{
    Buffer obj;

    Thread1(Buffer obj){
        this.obj = obj;
    }

    public void run(){
    
        Scanner scan_obj = new Scanner(System.in);
        System.out.println("Enter Limit : ");
        int limit = Integer.parseInt(scan_obj.nextLine());
        for(int i = 0 ; i <= limit ; i++){
            obj.put(i);
        }
        scan_obj.close();
    }
}

class Thread2 extends Thread{
    Buffer obj;

    Thread2(Buffer obj){
        this.obj = obj;
    }

    public void run(){
        while(true){
            obj.get();
        }
    }
}

public class bufferThreadCom {
    public static void main(String[] args){
        Buffer obj = new Buffer();
        Thread1 thread1 = new Thread1(obj);
        Thread2 thread2 = new Thread2(obj);

        thread1.start();
        thread2.start();
    }
}
