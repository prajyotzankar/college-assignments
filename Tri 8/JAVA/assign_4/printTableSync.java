import java.util.*;

class Table{
    synchronized void printTable(int n){
        for(int i = 0 ; i <= 12 ; i++){
           System.out.println(n*i);
           try{
               Thread.sleep(400);
           }catch(Exception e){System.out.println(e);}
        }
    }
}

class MyThread1 extends Thread{
    Table table1;
    MyThread1(Table table1){
        this.table1 = table1;
    }
    public void run(){
        table1.printTable(5);   
    }
}

class MyThread2 extends Thread{
    Table table1;
    MyThread2(Table table1){
        this.table1 = table1;
    }
    public void run(){
        table1.printTable(100);
    }
}

public class printTableSync {
    public static void main(String args[]){
        Table obj = new Table();

        MyThread1 thread1 = new MyThread1(obj);
        MyThread2 thread2 = new MyThread2(obj);

        thread1.start();
        thread2.start();
    }
}
