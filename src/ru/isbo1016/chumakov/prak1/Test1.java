package ru.isbo1016.chumakov.prak1;

public class Test1 {
    public static void main(String[] args){
        Ball b1 = new Ball(5, "Blue");
        Ball b2 = new Ball(6, "Yellow");
        Ball b3 = new Ball(3, "Green");
        System.out.println("Чумаков Дмитрий ИСБО-10-16");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        b3.setRadius(10);
        System.out.println(b3);
    }
}
