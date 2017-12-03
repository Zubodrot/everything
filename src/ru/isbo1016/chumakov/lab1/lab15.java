package ru.isbo1016.chumakov.lab1;

public class lab15 {

    public static int factorial(int n){
        int res = 1;
        while (n != 1){
            res *= n;
            n--;
        }
        return res;
    }

    public static void main(String[] args) {
        int n=6;

        System.out.println("Чумаков Дмитрий ИСБО-10-16");

        System.out.println(factorial(n));
    }
}
