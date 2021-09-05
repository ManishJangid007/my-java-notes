package Comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import encapsulation.Student;
import encapsulation.student;

public class comparable {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        Student jhon = new Student(3, "John", 21);
        Student jane = new Student(1, "Jane", 18);
        Student tom = new Student(2, "Tom", 20);

        list.add(jhon);
        list.add(jane);
        list.add(tom);

        Collections.sort(list);

        System.out.println("Students after sorting : ");
        list.forEach(Student -> System.out.println(Student.getName()));
    }
}
