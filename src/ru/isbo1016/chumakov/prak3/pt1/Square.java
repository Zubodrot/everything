package ru.isbo1016.chumakov.prak3.pt1;

public class Square extends  Rectangle{
    protected double side;

    public Square() {
        super();
        this.side = 1;
    }

    public Square(double side) {
        super();
        this.side = side;
    }

    public Square(double side, String color, boolean filed){
        this.color = color;
        this.filled = filed;
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setWidth(){
        super.setWidth(side);
    }

    public void setLength(){
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "Shape: Square, side: "+this.side+", Area: "+super.getArea()+", Perimeter: "+super.getPerimeter()+", Color:"+color;
    }
}
