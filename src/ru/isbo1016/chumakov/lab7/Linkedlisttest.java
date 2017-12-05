package ru.isbo1016.chumakov.lab7;

import java.util.LinkedList;

public class Linkedlisttest {
    public static void main(String[] args) {
        LinkedList<Integer> IDnumbers = new LinkedList<>();
        IDnumbers.addFirst(10233);
        IDnumbers.addFirst(10213);
        IDnumbers.add(10315);
        IDnumbers.addLast(10447);
        System.out.println("Чумаков Дмитрий ИСБО-10-16");
        System.out.println("Список: ");
        System.out.print(IDnumbers);
        System.out.println();

        IDnumbers.set(2,17333);
        IDnumbers.removeLast();

        System.out.println("Список: ");
        System.out.print(IDnumbers);
    }
}
