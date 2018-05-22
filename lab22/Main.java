package ru.isbo1016.chumakov.lab22;

public class Main {
    public static void main(String[] args) {
        Dictionary d = new Dictionary();

        System.out.println("Чумаков Дмитрий ИСБО-10-16");

        System.out.println();


        d.put("book", "книга");
        String b = d.get("book");
        System.out.println(b);
    }
}
