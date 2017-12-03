package ru.isbo1016.chumakov.prak3.pt1;

public  class Rectangle extends Shape{
    protected double width;
    protected double length;

    public Rectangle(){
        super();
        width = 1;
        length = 1;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width*length;
    }
    @Override
    public double getPerimeter() {
        return 2*(width+length);
    }
    @Override
    public String toString() {
        return "Shape: Rectangle, width: "+this.width+", length: "+this.length+", Area: "+getArea()+", Perimeter: "+getPerimeter()+", Color:"+color;
    }
}
