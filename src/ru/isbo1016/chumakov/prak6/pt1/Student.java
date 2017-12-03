package ru.isbo1016.chumakov.prak6.pt1;

import java.util.Comparator;

public class Student {
    public String name;
    public int IDnumber;

    public Student(String name, int IDnumber) {
        this.name = name;
        this.IDnumber = IDnumber;
    }

    public String getName() {
        return name;
    }

    public int getIDnumber() {
        return IDnumber;
    }

    public class CompareID implements Comparator<Student>{
        public int compare(Student a, Student b){
            if (a.getIDnumber()>b.getIDnumber()){
                return 1;
            }
            else if (a.getIDnumber()<b.getIDnumber()){
                return -1;
            }
            else return 0;
        }

    }

}
