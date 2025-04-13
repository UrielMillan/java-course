package collections.examples.comparable;

import java.util.Objects;

//To use a class in a TreeSet it need to implement a Comparable interface
public class Student implements Comparable<Student> {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }
    

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
      return "Name=" + name + ", Grade=" + grade ;
    }

    //This is the default sorter
    //if return is 0, the object is considered duplicate
    @Override
    public int compareTo(Student object) {
        /*
        if(this.name == null) return 0;
        return this.name.compareTo(object.name);
         */

        if(this.grade == object.grade){
            return 0;
        } else if (this.grade > object.grade) {
            return 1;
        }else{
            return -1;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return grade == student.grade && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, grade);
    }
}
