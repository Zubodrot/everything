package ru.isbo1016.chumakov.lab2;

public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(5, "Green", true);
        Circle c2 = new Circle(6, "Red", false);
        Circle c3 = new Circle(3, "Blue", true);

        System.out.println("Чумаков Дмитрий ИСБО-10-16");

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        c1.setColor("Yellow");
        System.out.println(c1);
    }
}
