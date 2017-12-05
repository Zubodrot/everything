package ru.isbo1016.chumakov.lab7;

import java.util.ArrayList;

public class Allaylisttest {
    public static void main(String[] args) {
        ArrayList<String>workers = new ArrayList<String>();
        workers.add("Иванов");
        workers.add("Петров");
        workers.add("Кривошеев");
        workers.add("Карпов");
        workers.add("Кузнеццов");
        workers.add("Джонсон");
        workers.add("Полищук");
        workers.add("де Лафей");
        workers.add("Гонсалез");

        System.out.println("Чумаков Дмитрий ИСБО-10-16");
        System.out.println("Список: ");
        System.out.print(workers);
        System.out.println();

        workers.set(2, "Ыглык Оды");
        workers.remove("Карпов");

        System.out.println("Список: ");
        System.out.print(workers);

    }
}
