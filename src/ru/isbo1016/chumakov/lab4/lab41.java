package ru.isbo1016.chumakov.lab4;

public class lab41 {
    public static void main(String[] args) {
        Car c1 = new Car(8000, 10000, 150000, 12000);
        Table t1 = new Table(300, 800);

        System.out.println("Чумаков Дмитрий ИСБО-10-16");

        System.out.println(c1.getPrice());
        System.out.println(t1.getPrice());
    }
}
