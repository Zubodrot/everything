package ru.isbo1016.chumakov.lab3;

public class Plate extends Dish{
    protected int radius;

    public Plate(String material, int price, int radius) {
        super(material, price);
        this.radius = radius;
    }

    public Plate() {
        super();
        this.radius = 1;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return radius +" santimeter radius Plate made of " + material + " costs " + price + " Euros";
    }
}
