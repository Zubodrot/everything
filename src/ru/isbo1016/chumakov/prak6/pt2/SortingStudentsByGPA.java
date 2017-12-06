package ru.isbo1016.chumakov.prak6.pt2;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student>{
    @Override
    public int compare(Student s1, Student s2){
        return s1.getGPA()-s2.getGPA();
    }
}
