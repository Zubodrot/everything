package ru.isbo1016.chumakov.lab4;

public class Car implements Priceable{
    private int priceofwheels;
    private int priceofglass;
    private int priceofcorpus;
    private int priceofinsurance;

    public Car(int priceofwheels, int priceofglass, int priceofcorpus, int priceofinsurance) {
        this.priceofwheels = priceofwheels;
        this.priceofglass = priceofglass;
        this.priceofcorpus = priceofcorpus;
        this.priceofinsurance = priceofinsurance;
    }

    @Override
    public int getPrice() {
        return priceofwheels + priceofglass + priceofcorpus + priceofinsurance;
    }
}
