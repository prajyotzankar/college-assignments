import java.io.*;
import java.util.*;
class Even implements Runnable
{
    public void run()
    {
        for(int i=1;i<=50;i++)
        {
            if(i%2==0)
                System.out.println("Even no " +i);
        }
    }
}

class Vowel implements Runnable
{
    public void run()
    {
           try
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the string");
            String data=br.readLine();
            int len=data.length();
            for(int i=0;i<len;i++)
            {
                if(data.charAt(i)=='a'|| data.charAt(i)=='e'|| data.charAt(i)=='i'|| data.charAt(i)=='o'|| data.charAt(i)=='u' || data.charAt(i)=='A'|| data.charAt(i)=='E'|| data.charAt(i)=='I'|| data.charAt(i)=='O'|| data.charAt(i)=='U')
                System.out.println("Vowel in entered string at position "+(i+1)+" is "+data.charAt(i));
            }
        }
        catch(Exception e){}
    }
}

public class twoChildEvenVowel
{
    public static void main(String args[])
    {
        try
        {
            Even no=new Even();
            Thread t1=new Thread(no);
            t1.start();
            t1.sleep(1000);
            Vowel ch=new Vowel();
            Thread  t2=new Thread(ch);
            t2.start();

        }
        catch(Exception e){}
    }
}