package ru.isbo1016.chumakov.prak6.pt3;

import java.util.Comparator;

public class Student {
    public String name;
    public int GPA;

    public Student(String name, int GPA) {
        this.name = name;
        this.GPA = GPA;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGPA() {
        return GPA;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }

    public static Comparator<Student> GPAcomparator =
            Comparator.comparing(Student::getGPA);

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", GPA=" + GPA +
                '}';
    }
}

