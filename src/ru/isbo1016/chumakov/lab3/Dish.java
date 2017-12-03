package ru.isbo1016.chumakov.lab3;

public abstract class Dish {
    protected String material;
    protected int price;

    public Dish(String material, int price) {
        this.material = material;
        this.price = price;
    }

    public Dish (){
        this.material = "Steel";
        this.price = 1;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
