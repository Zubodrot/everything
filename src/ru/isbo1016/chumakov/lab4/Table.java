package ru.isbo1016.chumakov.lab4;

public class Table implements Priceable{
    private int priceoflegs;
    private int priceofdesk;

    public Table(int priceoflegs, int priceofdesk) {
        this.priceoflegs = priceoflegs;
        this.priceofdesk = priceofdesk;
    }

    @Override
    public int getPrice() {
        return priceofdesk+priceoflegs;
    }
}
