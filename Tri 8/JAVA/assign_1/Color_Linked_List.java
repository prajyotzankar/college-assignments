import java.util.*;
import java.io.*;

public class Color_Linked_List {
    public static void main(String args[]){

        LinkedList color_list = new LinkedList();

        color_list.add("red");
        color_list.add("blue");
        color_list.add("green");
        color_list.add("yellow");

        Iterator color_list_itr = color_list.iterator();
        while(color_list_itr.hasNext()){
            System.out.println(color_list_itr.next());
        }

        ListIterator color_list_listitr = color_list.listIterator(color_list.size());

        while(color_list_listitr.hasPrevious()){
            System.out.println(color_list_listitr.previous());
        }

        LinkedList color_list_2 = new LinkedList();

        color_list_2.add("black");
        color_list_2.add("white");

        
        color_list.add(2, color_list_2.get(0));
        color_list.add(2, color_list_2.get(1));

        System.out.println("\n\n");

        ListIterator color_list_listitr_2 = color_list.listIterator();
        while(color_list_listitr_2.hasNext()){
            System.out.println(color_list_listitr_2.next());
        }


    }
}
