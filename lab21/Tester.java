package ru.isbo1016.chumakov.lab21;

public class Tester {
    public static void main(String[] args) {
        ArrayQueueModule arr = new ArrayQueueModule();
        Object [] A = new Object[100];
        Student s1 = new Student("S",16);
        Student s2 = new Student("A",11);
        Student s3 = new Student("D",12);
        Student s4 = new Student("F",13);
        Student s5 = new Student("G",14);
        Student s6 = new Student("H",15);
        arr.enqueue(A,s1);
        arr.enqueue(A,s2);
        arr.enqueue(A,s3);
        arr.enqueue(A,s4);
        arr.enqueue(A,s5);
        arr.enqueue(A,s6);

        System.out.println("Чумаков Дмитрий ИСБО-10-16");

        System.out.println();

        System.out.println("Очередь из студентов");

        for (int i =0; i<6; i++){
            System.out.println(A[i]);
        }

        System.out.println();

        System.out.println("Выброшенный первый элемент очереди");

        System.out.println(arr.dequeue(A));

        System.out.println();

        System.out.println("Новая очередь из студентов");

        for (int i =0; i<7; i++){
            System.out.println(A[i]);
        }

        System.out.println();

        System.out.println("Первый элемент очереди");
        System.out.println(arr.element(A));

        System.out.println();

        System.out.println("Количество элементов");
        System.out.println(arr.size(A));

        System.out.println();

        System.out.println("Пустая ли очередь");
        System.out.println(arr.isEmpty(A));

        System.out.println();


        System.out.println("Очистить очередь");
        arr.clear(A);
        for (int i =0; i<7; i++){
            System.out.println(A[i]);
        }

    }
}
