package ru.isbo1016.chumakov.prak5;

import java.util.Scanner;

public class Everything {

    public static  String task1(int n) {

        if (n == 1) {
            System.out.print("1");
        } else {
            for (int i = 0; i < n; i++) {
                System.out.print(n+" ");
            }
            System.out.print(task1(--n) + " " );
        }
        return "";
    }

    public static String task2(int n) {
        if (n == 1)
            return "1";

        return task2(n - 1) + " " + n;
    }

    public static String task3(int a, int b) {
        if (a > b) {
            return a + " " + task3(a - 1, b);
        } else {
            if (a == b)
                return Integer.toString(a);

            return a + " " + task3(a + 1, b);
        }
    }

    public static int task5(int n) {
        if (n < 10)
            return n;
        else
            return n % 10 + task5(n / 10);
    }

    public static String task6(int n, int del) {
        if (n < 2)
            return "NO";
        else if (n == 2)
            return "YES";
        else if (n % del == 0)
            return "NO";
        else if (del < n / 2)
            return task6(n, del + 1);
        else
            return "YES";
    }

    public static void task7(int n, int del) {

        if (del > n / 2) {
            System.out.print(n + " ");
            return;
        }
        if (n % del == 0) {
            System.out.print(del + " ");
            task7(n / del, del);
        } else
            task7(n, del+1);
    }

    public static String task8(String s) {
        if (s.length() == 1)
            return "YES";
        else {
            if (s.charAt(0) == s.charAt(s.length()-1)) {
                if (s.length() == 2) {
                    return "YES";
                }
                return task8(s.substring(1, s.length() - 1));
            } else
                return "NO";

        }
    }

    public static int task9(int a, int b) {
        if (a > b + 1)
            return 0;

        if (a == 0 || b == 0)
            return 1;

        return task9(a, b - 1) + task9(a - 1, b - 1);
    }

    public static int task10(int n, int i) {
        if (n == 0){
            return i;
        }
        else {
            return task10(n / 10, i * 10 + n % 10);
        }
    }

    public static int task11() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n == 0) {
            int m = in.nextInt();
            if (m == 0) {
                return m;
            } else {
                int k = in.nextInt();
                if (k == 1) {
                    return task11() + k;
                } else {
                    return task11();
                }
            }
        } else {

            if (n == 1) {
                return task11() + n ;
            } else {
                return task11();
            }
        }
    }

    public static void task12() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) {
            if (n % 2 == 1) {
                System.out.println("Нечётное " + n);
                task12();
            } else
                task12();
        }
        else return;
    }

    public static void task13() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) {
            int m = in.nextInt();
            System.out.println("Нечётный номер имеет" + n);
            if (m > 0)
                task13();
        }
        else return;
    }

    public static String task14(int n) {

        if (n < 10)
            return Integer.toString(n);
        else
            return task14(n / 10) + " " + n % 10;
    }

    public static int task15(int n) {
        if (n < 10)
            return n;
        else {
            System.out.print(n % 10 + " ");
            return task15(n / 10);
        }
    }

    public static void task16(int max, int count) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) {
            if (n > max)
                task16(n, 1);
            else if (n == max)
                task16(max, ++count);
            else
                task16(max, count);
        }
        else
            System.out.println(count);

    }

    public static int task17() {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        if (n == 0)
            return 0;
        else
            return Math.max(n, task17());

    }





    public static void main(String[] args) {
        System.out.println("Чумаков Дмитрий ИСБО-10-16");
        System.out.println();

        System.out.println("Треугольная последовательность");
        task1(10);
        System.out.println();

        System.out.println("От 1 до n");
        System.out.println(task2(7));
        System.out.println();

        System.out.println("От A до B");
        System.out.println(task3(4, 18));
        System.out.println();


        System.out.println("Сумма цифр числа");
        System.out.println(task5(1024));
        System.out.println();

        System.out.println("Проверка числа на простоту");
        System.out.println(task6(37, 2));
        System.out.println();

        System.out.println("Разложение на множители");
        task7(830, 2);
        System.out.println();

        System.out.println("Палиндром");
        System.out.println(task8("pullup"));
        System.out.println();

        System.out.println("Без двух нулей");
        System.out.println(task9(3, 5));
        System.out.println();

        System.out.println("Разворот числа");
        System.out.println(task10(125, 0));
        System.out.println();

        System.out.println("Количество единиц");
        System.out.println(task11());
        System.out.println();

        System.out.println("Вывести нечетные числа последовательности");
        task12();
        System.out.println();

        System.out.println("Вывести члены последовательности с нечетными номерами");
        task13();
        System.out.println();

        System.out.println(" Цифры числа слева направо");
        System.out.println(task14(337));
        System.out.println();

        System.out.println("Цифры числа справа налево");
        System.out.println(task15(4321));
        System.out.println();


        System.out.println("Количество элементов, равных максимуму");
        task16(0,0);
        System.out.println();

        System.out.println("Максимум последовательности");
        System.out.println(task17());
        System.out.println();
    }




}
