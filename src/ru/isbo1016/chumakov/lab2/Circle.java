package ru.isbo1016.chumakov.lab2;

public class Circle {
    private double radius;
    private String color;
    private boolean filled;

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public Circle(){
        this.radius = 1;
        this.color = "Red";
        this.filled = true;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return (color+" Circle of radius " + radius + " is filled?  " + filled);
    }
}
