package ru.isbo1016.chumakov.lab3;

public class lab31 {
    public static void main(String[] args) {
        Dish s1 = new Spoon("Silver", 12, "Desert");
        Dish s2 = new Spoon("Gold", 1000, "Soup");
        Dish p1 = new Plate("Ceramic", 5, 8);
        Dish p2 = new Plate("Mud", 1, 12);

        System.out.println("Чумаков Дмитрий ИСБО-10-16");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(p1);
        System.out.println(p2);

    }
}
