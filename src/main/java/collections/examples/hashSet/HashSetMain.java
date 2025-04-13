package collections.examples.hashSet;

import java.util.*;

public class HashSetMain {
    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();

        //Add elements
        hs.add("one");
        hs.add("two");
        hs.add("three");
        hs.add("four");
        hs.add("five");

        //Add function return a bool
        boolean result = hs.add("five");
        System.out.println("set allow duplicates: " + result);

        //Set is not sorteable
        System.out.println(hs);

        //Set is sorteable when implements List interface
        List<String> list = new ArrayList<>(hs);
        Collections.sort(list);

        System.out.println(list);
    }
}
