package Comparator;

import java.util.Comparator;

import Comparable.Student;

public class AgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        if (student1.getAge() < student2.getAge()) {
            return -1;
        }
        if (student1.getAge() > student2.getAge()) {
            return 1;
        } else {
            return 0;
        }
    }
}
