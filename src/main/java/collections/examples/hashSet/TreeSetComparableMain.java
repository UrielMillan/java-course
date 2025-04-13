package collections.examples.hashSet;

import collections.examples.comparable.Student;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetComparableMain {
    public static void main(String[] args) {
        Set<Student> students = new TreeSet<>();

        students.add(new Student("Erick", 10));
        students.add(new Student("Jenny", 10));
        students.add(new Student("Andres", 6));
        students.add(new Student("Andrea", 6));
        students.add(new Student("Manuel", 8));

        System.out.println(students);

        //Iterate by forEach
        for (Student s : students) {
            System.out.println(s);
        }

        //Iterate by While and Iterator
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student s = iterator.next();
            System.out.println(s);
        }

        //Iterate by lamba forEach
        students.forEach(System.out::println);
    }
}
