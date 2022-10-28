import java.util.*;
import java.io.*;

class Animal{
    public void eat(){
        System.out.print("Animal eat");
    }
}

class Herbivores extends Animal{
    public void eat(){
        System.out.print("Herbivores eat grass \n");
    }
} 

class Carnivores extends Animal{
    public void eat(){
        System.out.print("Carnivores eat meat \n");
    }
} 

class Omnivores extends Animal{
    public void eat(){
        System.out.print("Omnivores eat both grass and meat \n");
    }
} 

public class AnimalEat {
    
    public static void main(String arg[]){
        Animal carnAnimal = new Carnivores();
        Animal oAnimal = new Omnivores();
        Animal herAnimal = new Herbivores();

        carnAnimal.eat();
        oAnimal.eat();
        herAnimal.eat();
    }
}
