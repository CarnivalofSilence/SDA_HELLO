package pl.cwiczenia.structures;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListApp {
    public static void main(String[] args) {
/*        CustomArrayList list = new CustomArrayList();
        list.add("Piotr");
        list.add("Asia");
        list.add("Tomek");
        list.add("Paweł");
        System.out.println(list.lenght());
        list.printAll();

        list.remove(0);

        System.out.println(list.lenght());
        list.printAll();
*/

        CustomLinkedList list = new CustomLinkedList();
        list.add("Piotr");
        list.add("Asia");
        list.add("Tomek");
        list.add("Paweł");
        System.out.println(list.length());
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println("_____________________________________________________");
        list.remove(0);

        System.out.println(list.length());
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println("_____________________________________________________");

        System.out.println(list.length());
        list.printAll();

    }


    }

