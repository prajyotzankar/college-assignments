import java.util.*;
import java.io.*;

class OwnException extends Exception{
    public OwnException(String str){
        super(str); 
    }
}

class CricketPlayer{
    String name;
    int inning, no_time_notout, total_runs, bat_avg;

    public CricketPlayer(){
        name = null;
        inning = 0;
        no_time_notout = 0;
        total_runs = 0;
        bat_avg = 0;
    }

    public void get_info() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name: ");
        name = sc.nextLine();

        System.out.println("Enter inning: ");
        inning = sc.nextInt();

        System.out.println("Enter No of times notout: ");
        no_time_notout = sc.nextInt();

        System.out.println("Enter Total Runs: ");
        total_runs = sc.nextInt();

        try {
            if(no_time_notout > inning){ 
                throw new OwnException("No of times not out should be less than no of innings");
            }
        }
        catch (OwnException oe) 
        {  
            System.out.println("Caught the exception");  
            System.out.println(oe.getMessage());  
        } 
    }

    public void display(){
        System.out.println("Name = "+name);
        System.out.println("no of innings = "+inning);
        System.out.println("no times notout = "+no_time_notout);
        System.out.println("total runs = "+total_runs);
        System.out.println("bat avg = "+bat_avg);
    }


    static void avg(int n, CricketPlayer cric_arr[]){
        try{
            for(int i = 0; i < n ; i++){
                cric_arr[i].bat_avg = cric_arr[i].total_runs/cric_arr[i].inning;
            }
        }
        catch(InputMismatchException e){
            System.out.println("Invalid arg");
        }
    }
}

public class Cricket {
    
    public static void main(String args[]) {
        int no_of_players;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no_of_players : ");
        no_of_players = sc.nextInt();

        CricketPlayer player_arr[] = new CricketPlayer[no_of_players];

        for(int i = 0 ; i < no_of_players ; i++){
            player_arr[i] = new CricketPlayer();
            player_arr[i].get_info();
        }

        CricketPlayer.avg(no_of_players, player_arr);

        for(int i = 0 ; i < no_of_players ; i++){
            player_arr[i].display();
        }

    }
}
