package collections.examples.hashSet;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

//todo Search what is Comparator

public class TreeSetMain {
    public static void main(String[] args) {
        Set<String> ts = new TreeSet<String>();

        ts.add("one");
        ts.add("two");
        ts.add("three");
        ts.add("four");
        ts.add("five");
        ts.add("five");

        //TreeSet is sorted
        System.out.println(ts);

        Set<Integer> tsNumber = new TreeSet<>();

        tsNumber.add(4);
        tsNumber.add(3);
        tsNumber.add(2);
        tsNumber.add(1);
        tsNumber.add(10);

        //clearly example of threeSet Sorted
        System.out.println(tsNumber);

        //TreeSet implements Comparator
        Set<String> tsComparator = new TreeSet<>(Comparator.reverseOrder());

        tsComparator.add("one");
        tsComparator.add("two");
        tsComparator.add("three");

        System.out.println(tsComparator);

    }
}
