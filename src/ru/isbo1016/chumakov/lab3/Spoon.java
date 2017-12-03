package ru.isbo1016.chumakov.lab3;

public class Spoon extends Dish {
    protected String type;

    public Spoon(String material, int price, String type) {
        super(material, price);
        this.type = type;
    }

    public Spoon() {
        super();
        this.type = "Dessert";
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type +" Spoon made of " + material + " costs " + price + " Euros";
    }
}
