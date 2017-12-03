package ru.isbo1016.chumakov.prak3.pt1;

import java.math.*;
public class Circle extends Shape{
    protected double radius;
    public Circle(){
        super();
        radius = 1;
    }
    public Circle(double radius){
        super();
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }
    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }
    @Override
    public String toString() {
        return "Shape: circle, radius: "+this.radius+", color: "+this.color+", Area: "+getArea()+", Perimeter: "+getPerimeter()+", Color:"+color;
    }
}
