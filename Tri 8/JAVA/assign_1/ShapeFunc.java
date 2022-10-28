import java.util.*;
import java.io.*;

abstract class shape{
    abstract public float area(float f1, float f2);
    abstract public float perimeter(float f1, float f2);
}

class rectangle extends shape{
    
    public float area(float length, float width){
        return length*width;
    }

    public float perimeter(float length, float width){
        return 2*(length + width);
    }
}

class square extends shape{

    
    public float area(float length, float f2){
        return length*length;
    }

    public float perimeter(float length, float f2){
        return 4*length;
    }
}

class circle extends shape{
    final float pi = 3.14F;
    public float area(float radius, float f2){
        return pi*radius*radius;
    }

    public float perimeter(float radius, float f2){
        return 2*pi*radius;
    }
}


public class ShapeFunc {
    public static void main(String arg[]){

        Scanner scan_obj = new Scanner(System.in);

        float num_1, num_2, area, perimeter;

        circle circle_1 = new circle();
        rectangle rectangle_1 = new rectangle();
        square square_1 = new square();

        //Rectangle
        System.out.println("Enter Length of Rectangle : ");
        num_1 = Float.parseFloat(scan_obj.nextLine());
        System.out.println("Enter with of Rectangle : ");
        num_2 = Float.parseFloat(scan_obj.nextLine());
        area = rectangle_1.area(num_1, num_2);
        System.out.println("Area of rectangle = " +area);
        perimeter = rectangle_1.perimeter(num_1, num_2);
        System.out.println("Perimeter of rectangle = " +perimeter);

        //Circle
        System.out.println("Enter radius of Circle : ");
        num_1 = Float.parseFloat(scan_obj.nextLine());
        num_2 = 10;
        area = circle_1.area(num_1, num_2);
        System.out.println("Area of circle = " +area);
        perimeter = circle_1.perimeter(num_1, num_2);
        System.out.println("Perimeter of Circle = " +perimeter);

        //Square
        System.out.println("Enter side length of Square : ");
        num_1 = Float.parseFloat(scan_obj.nextLine());
        num_2 = 10;
        area = square_1.area(num_1, num_2);
        System.out.println("Area of square = " +area);
        perimeter = square_1.perimeter(num_1, num_2);
        System.out.println("Perimeter of square = " +perimeter);

    }
}
