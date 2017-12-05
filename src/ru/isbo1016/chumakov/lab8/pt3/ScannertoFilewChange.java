package ru.isbo1016.chumakov.lab8.pt3;

import java.util.Scanner;
import java.io.*;

public class ScannertoFilewChange {
    public static void main(String[] args) {
        System.out.println("Чумаков Дмитрий ИСБО-10-16");
        Scanner in = new Scanner(System.in);
        String text = in.next();
        try(FileWriter newFile = new FileWriter("C:\\Users\\User\\Desktop\\text1.txt",false)){
            newFile.write(text);
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
