import java.util.*;

class Prime {
    int num;
    Boolean flag = false;
    synchronized void primeSquare () {
        if( !flag ) {
            try { wait(); } catch ( Exception e ) {
                System.out.println( e );
            }
        }
        flag = false;
        System.out.println( "Prime Square: "+num*num );
        notify();
    }
    synchronized void prime ( int num ) {
        int count = 0;
        if( flag ) {
            try { wait(); } catch ( Exception e ) {
                System.out.println( e );
            }
        }
        this.num = num;
        for ( int i = 1 ; i <= num ; i++ ) {
            if ( num%i == 0 ) {
                count++;
            }
        }
        if ( count == 2 ) {
            flag = true;
            System.out.println( "Prime: "+this.num );
            notify();
        }
    }
}
 
class Thread1 extends Thread {
    Prime obj;
    Thread1 ( Prime obj ) {
        this.obj = obj;
    }
    public void run () {
        int i = 0;
        while ( i <= 50 ) {
            obj.prime( i++ );
        }
    }
}
 
class Thread2 extends Thread {
    Prime obj;
    Thread2 ( Prime obj ) {
        this.obj = obj;
    }
    public void run () {
        while ( true ) { obj.primeSquare(); }
    }
}
 
public class primeNumberBuffer {
    public static void main ( String[] args ) {
        Prime obj = new Prime();
        Thread1 t1 = new Thread1( obj );
        Thread2 t2 = new Thread2( obj );
        t1.start();
        t2.start();
    }
}
