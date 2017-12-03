package ru.isbo1016.chumakov.prak3.pt1;

public class Test3 {
    public static void main(String[] args){
        Shape r1 = new Rectangle("Blue", false, 3,10);
        Shape s1 = new Square(6, "Yellow", true);
        Shape c1 = new Circle(3, "Green", false);
        System.out.println("Чумаков Дмитрий ИСБО-10-16");
        System.out.println(r1);
        System.out.println(s1);
        System.out.println(c1);
    }
}
