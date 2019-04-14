package pl.cwiczenia.structures;

import java.sql.SQLOutput;
import java.util.*;

public class SetApp {
    public static void main(String[] args) {

/*
        Set<Integer> set = new TreeSet<>();

       set.add(4);
        set.add(78);
        set.add(90);
        set.add(32);
        for (Integer integer : set){
            System.out.println(integer);
        }

        Set<Integer> set2 = new TreeSet<>();//TreeSet układa w kolejności od najmniejszej do najwiekszej

      Set<Integer> set3 = new LinkedHashSet<>();//podaje liczbe w kolejnosci jakiej podalismy
 */

//------------------------------------To jest wywyłoanie do Stack_Stos-------------------------------------------
  /*      Stack_stos stack_stos = new Stack_stos();
        stack_stos.push("Piotr");
        stack_stos.push("Asia");
        stack_stos.push("Paweł");
        System.out.println(stack_stos.pop());
        System.out.println(stack_stos.pop());
*/
  //-------------------------------------------------------------------------------------------------------------------


        Queue_Kolejka queue_kolejka = new Queue_Kolejka();
        queue_kolejka.add("A");
        queue_kolejka.add("B");
        queue_kolejka.add("C");
        System.out.println(queue_kolejka.pull());
        System.out.println(queue_kolejka.pull());


      Map<Integer, String> map = new TreeMap<>();// - > implementacja mapy
       map.put(2 , "Paweł");
        System.out.println(map.get(2));

    }

}
