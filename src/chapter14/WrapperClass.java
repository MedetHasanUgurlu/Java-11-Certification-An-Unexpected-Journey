package chapter14;

import java.util.ArrayList;
import java.util.List;

public class WrapperClass {
    public static void main(String[] args) {

        // PRIMITIVE TYPE
        // boolean, byte, short, int, long, float, double, char

        // WRAPPER CLASS
        // Boolean, Byte, Short, Integer, Long, Float, Double, Character

        // boolean --> Boolean (Autoboxing)
        Integer pounds = 120;
        Character character = "foo".charAt(0);

        // Boolean --> boolean (Unboxing)
        char c = character;

        List<Integer> list = new ArrayList<>();
        list.add(Integer.valueOf(1));
        list.add(2);
        list.add(Integer.valueOf(3));
        System.out.println(list);
        list.remove(1);
        System.out.println(list);




    }
}
