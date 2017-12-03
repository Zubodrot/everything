package ru.isbo1016.chumakov.lab1;

import java.util.Random;
import java.util.Random.*;



public class lab14 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i =0; i<10; i++){
            arr[i] = (int)(Math.random()*100);
        }

        System.out.println("Чумаков Дмитрий ИСБО-10-16");

        for (int i =0; i<10; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int min_i = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }
        }

        for (int i =0; i<10; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    }



