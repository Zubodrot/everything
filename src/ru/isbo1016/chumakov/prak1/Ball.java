package ru.isbo1016.chumakov.prak1;

public class Ball {
    private double radius;
    private String color;

    public Ball(){
        radius = 1;
        color = "Red";
    }

    public Ball(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Ball(double radius) {
        this.radius = radius;
        this.color = "red";
    }

    public Ball(String color) {
        this.color = color;
        this.radius = 1;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getVolume(){
        return Math.PI*4*radius*radius*radius/3;
    }

    public double getArea(){
        return Math.PI*radius*radius*4;
    }

    @Override
    public String toString() {
        return color+" ball radius: "+radius+" Area: "+getArea()+" Volume: "+getVolume();
    }
}
