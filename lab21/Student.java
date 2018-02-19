package ru.isbo1016.chumakov.lab21;

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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", IDnumber=" + IDnumber +
                '}';
    }
}
