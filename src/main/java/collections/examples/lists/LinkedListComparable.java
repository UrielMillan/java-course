package collections.examples.lists;

import collections.examples.comparable.Student;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListComparable {


    public static void main(String[] args) {
        LinkedList<Student> students = new LinkedList<>();

        students.add(new Student("Perla", 10));
        students.add(new Student("Mike", 9));
        students.add(new Student("Juan", 8));
        students.add(new Student("Jose", 7));
        System.out.println(students);

        // Add elements at first position
        students.addFirst(new Student("Samantha", 10));
        students.addFirst(new Student("Jake", 9));
        System.out.println(students);

        // Add elements at last position
        students.addLast(new Student("Jun", 7));
        students.addLast(new Student("Carl", 8));

        // Get first and last element, these methods throw an exception if no element is found
        System.out.println( "First element = " + students.getFirst());
        System.out.println( "Last element = " + students.getLast());

        // peekFirst and peekLast no throw an exception if no element is found, these methods return null
        System.out.println( "First element = " + students.peekFirst());
        System.out.println( "Last element = " + students.peekLast());

        // these methods Remove the elements from de list and return it, these methods throw an exception if no element is found
        Student firstStudentRemoved = students.removeFirst();
        Student lastStudentRemoved  = students.removeLast();

        // these methods Remove the elements from de list and return it, no throw an exception if no element is found, these methods return null
        students.pollFirst();
        students.pollLast();

        // Get index using and object
        Student student = new Student("Lazaro", 9);
        students.add(student);
        System.out.println("Get index of = " + students.indexOf(student));

        //Remove element using index
        students.remove(4);
        System.out.println(students);

        //Replace element using index
        students.set(1, new Student("Maria", 10));
        System.out.println(students);

        // Using list iterator
        ListIterator<Student> iterator = students.listIterator();

        // Move cursor to next element
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Move cursor to previous element
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }

}
