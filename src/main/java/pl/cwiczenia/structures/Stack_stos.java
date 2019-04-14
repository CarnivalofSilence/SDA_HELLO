package pl.cwiczenia.structures;

import java.util.LinkedList;

public class Stack_stos {

    LinkedList<String> data = new LinkedList<>();


    String pop() {

        return data.removeLast();
    }

    void push(String value) {
        data.add(value);


    }

}
