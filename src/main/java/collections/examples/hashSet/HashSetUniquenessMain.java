package collections.examples.hashSet;

import collections.examples.comparable.Student;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetUniquenessMain {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<Student>();

        students.add(new Student("Erick", 10));
        students.add(new Student("Jenny", 10));
        students.add(new Student("Andres", 6));
        students.add(new Student("Andrea", 6));
        students.add(new Student("Manuel", 8));
        students.add(new Student("Manuel", 8));

        System.out.println(students);

        Student student = new Student("Carlos", 6);
        students.add(student);
        students.add(student);

        //Only when the object share de same hashCode they are duplicates
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
