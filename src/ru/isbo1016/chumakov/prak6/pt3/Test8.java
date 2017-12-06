package ru.isbo1016.chumakov.prak6.pt3;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.Collections;

public class Test8 {
    public static void main(String[] args) {
        ArrayList<Student> group1 = new ArrayList<Student>();
        ArrayList<Student> group2 = new ArrayList<Student>();
        ArrayList<Student> groupall = new ArrayList<Student>();


        Student s1 = new Student("Владимир",97);
        Student s2 = new Student("Николай",76);
        Student s3 = new Student("Ксения",84);

        Student s4 = new Student("Иван",65);
        Student s5 = new Student("Екатерина",88);
        Student s6 = new Student("Дмитрий", 75);

        group1.add(s3);
        group1.add(s2);
        group1.add(s1);

        group2.add(s6);
        group2.add(s5);
        group2.add(s4);

        groupall.addAll(group1);
        groupall.addAll(group2);


        System.out.println("Первая группа");
        System.out.println(group1);

        System.out.println("Вторая группа");
        System.out.println(group2);

        Collections.sort(groupall,Student.GPAcomparator.reversed());


        System.out.println("Две сортированные группы");
        System.out.println(groupall);



    }
}
