package ru.isbo1016.chumakov.prak6.pt2;

import java.util.Arrays;

public class Test7 {
    public static void main(String[] args) {
        Student[] Studentarchive = new Student[6];
        Studentarchive[0] = new Student("Владимир",97);
        Studentarchive[1] = new Student("Николай",76);
        Studentarchive[2] = new Student("Ксения",84);
        Studentarchive[3] = new Student("Иван",65);
        Studentarchive[4] = new Student("Екатерина",88);
        Studentarchive[5] = new Student("Дмитрий", 75);

        System.out.println("Чумаков Дмитрий ИСБО-10-16");
        System.out.println("Несортированный список студентов: ");
        for (int i = 0; i<Studentarchive.length; i++){
            System.out.print(Studentarchive[i].name+" "+Studentarchive[i].GPA+" ");
        }
        System.out.println();

        System.out.println("Отсортированный список студентов по убыванию по баллам: ");
        Arrays.sort(Studentarchive, new SortingStudentsByGPA().reversed());
        for (int i = 0; i<Studentarchive.length; i++) {
            System.out.print(Studentarchive[i].name + " " + Studentarchive[i].GPA + " ");
        }
    }
}
