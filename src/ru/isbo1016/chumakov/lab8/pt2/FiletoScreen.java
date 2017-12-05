package ru.isbo1016.chumakov.lab8.pt2;

import java.io.*;

public class FiletoScreen {
    public static void main(String[] args) {
        System.out.println("Чумаков Дмитрий ИСБО-10-16");
        try(FileReader reader = new FileReader("C:\\Users\\User\\Desktop\\text1.txt")){
            int c;
            while((c=reader.read())!=-1){
                System.out.print((char)c);
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
