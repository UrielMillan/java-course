package collections.examples.lists;

import collections.examples.comparable.Student;

import java.util.*;

public class ArrayListComparableMain {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Erick", 10));
        students.add(new Student("Jenny", 10));
        students.add(new Student("Andres", 6));
        students.add(new Student("Andrea", 6));
        students.add(new Student("Manuel", 8));
        students.add(new Student("Manuel", 8));

        //Override comparateTo methods from Student class
        students.sort((a, b) -> a.getName().compareTo(b.getName()));
        System.out.println(students);

        //Other way to sort elements from ArrayList
        students.sort(Comparator.comparing(Student::getName).reversed());
        System.out.println(students);
    }
}
