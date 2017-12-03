package ru.isbo1016.chumakov.prak;

public class Book {
    private String author;
    private String name;
    private double pages;

    public Book(){
        author = "Tolkien";
        name = "Lord of the Rings";
        pages = 453;
    }

    public Book(String author){
        name = "Brave New World";
        pages = 351;
    }

    public Book(String author, String name, double pages) {
        this.author = author;
        this.name = name;
        this.pages = pages;
    }

    public double getChapters(){
        return pages/20;
    }

    @Override
    public String toString() {
        return "Book " + name + " by " + author + " in " + pages + " pages in "+(int)getChapters()+" chapters";
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPages() {
        return pages;
    }

    public void setPages(double pages) {
        this.pages = pages;
    }
}