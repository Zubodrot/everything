package ru.isbo1016.chumakov.prak6.pt1;

import java.util.TreeSet;

public class Test6 {
    public static void main(String[] args) {
        Student[] Studentarchive = new Student[6];
        Studentarchive[0] = new Student("Владимир",1015);
        Studentarchive[1] = new Student("Николай",1034);
        Studentarchive[2] = new Student("Ксения",1013);
        Studentarchive[3] = new Student("Иван",1076);
        Studentarchive[4] = new Student("Екатерина",1010);
        Studentarchive[5] = new Student("Дмитрий", 1054);

        System.out.println("Чумаков Дмитрий ИСБО-10-16");
        System.out.println("Несортированный список");
        for(int i = 0; i<6; i++){
            System.out.print(Studentarchive[i].name+"  "+Studentarchive[i].IDnumber+"  ");
        }
    }

}
