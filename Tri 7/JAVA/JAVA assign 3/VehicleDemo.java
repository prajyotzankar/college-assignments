import java.util.*;

class Vehicle{
    String company;
    double price;

    void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Company of the Vehicle : ");
        company = sc.nextLine();

        System.out.println("Enter Price of the Vehicle: ");
        price = sc.nextDouble();
    }

    void display(){
        System.out.println("Company = "+company);
        System.out.println("Price = "+price);
    }
}

class LightMotorVehicle extends Vehicle{
    double mileage;

    void accept(){
        Scanner sc = new Scanner(System.in);
        super.accept();

        System.out.println("Enter mileage of the Vehicle ");
        mileage = sc.nextDouble();
    }

    void display(){
        super.display();
        System.out.println("Mileage: "+mileage);
    }
}

class HeavyMotorVehicle extends Vehicle{
    double cap_in_tons;

    void accept(){
        Scanner sc = new Scanner(System.in);
        super.accept();

        System.out.println("Enter Capacity in tons of the Vehicle ");
        cap_in_tons = sc.nextDouble();
    }

    void display(){
        super.display();
        System.out.println("Capacity in tons: "+cap_in_tons);
    }
}

public class VehicleDemo {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int option;

        System.out.println("1 -> Light Motor Vehicle");
        System.out.println("2 -> Heavy Motor Vehicle");

        System.out.println("Enter the choice -> ");
        option = sc.nextInt();
        sc.nextLine();

        switch(option){
            case 1  :   System.out.println("Enter the number of Light Motor Vehicle: ");
                        int no_of_light_vehicle = sc.nextInt();
                        sc.nextLine();

                        LightMotorVehicle light_arr[] = new LightMotorVehicle[no_of_light_vehicle];
                        for(int i = 0; i < no_of_light_vehicle ; i++){
                            light_arr[i] = new LightMotorVehicle();
                            light_arr[i].accept();
                            light_arr[i].display();
                        }
                        break;

            case 2  :   System.out.println("Enter the number of Part Time Staff: ");
                        int no_of_heavy_vehicle = sc.nextInt();
                        sc.nextLine();

                        HeavyMotorVehicle heavy_arr[] = new HeavyMotorVehicle[no_of_heavy_vehicle];
                        for(int i = 0; i < no_of_heavy_vehicle ; i++){
                            heavy_arr[i] = new HeavyMotorVehicle();
                            heavy_arr[i].accept();
                            heavy_arr[i].display();
                        }
                        break;

        }

    }
}
