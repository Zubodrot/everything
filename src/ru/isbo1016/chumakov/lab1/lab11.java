package ru.isbo1016.chumakov.lab1;

public class lab11 {
    public static void main(String[] args) {
        int summ = 0;
        int [] array = new int [5];
        array[0] = 6;
        array[1] = 4;
        array[2] = 2;
        array[3] = 10;
        array[4] = 13;

        System.out.println("Чумаков Дмитрий ИСБО-10-16");

        for (int i =0; i<5; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();

        for (int i =0; i<5; i++){
            summ += array[i];
        }

        System.out.println(summ);
        summ = 0;
        int j = 4;

        while (j != -1){
            summ += array[j];
            j--;
        }

        System.out.println(summ);
        summ = 0;
        j = 4;

        do {
            summ += array[j];
            j--;
        }while (j>-1);

        System.out.println(summ);

    }
}

