package ru.isbo1016.chumakov.prak3.pt2;

public class Test4 {
    public static void main(String[] args) {
        Movable Dot1 = new MovablePoint(3,4,4,6);
        Movable Cir1 = new MovableCircle(7, 4, 3,2, 10);

        System.out.println("Чумаков Дмитрий ИСБО-10-16");

        System.out.println(Dot1);

        Dot1.moveDown();
        Dot1.moveRight();

        System.out.println(Dot1);

        Dot1.moveUp();
        Dot1.moveLeft();

        System.out.println(Dot1);

        System.out.println(Cir1);

        Cir1.moveUp();

        System.out.println(Cir1);

        Cir1.moveLeft();

        System.out.println(Cir1);

    }
}

