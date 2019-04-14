package pl.cwiczenia.structures;

import java.util.LinkedList;

public class Queue_Kolejka {

    LinkedList<String> kolejka = new LinkedList<>();



void add(String string){
   kolejka.add(string);
}

String pull(){


    return kolejka.removeFirst();
    }
}
