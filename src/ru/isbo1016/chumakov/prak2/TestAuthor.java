package ru.isbo1016.chumakov.prak2;

public class TestAuthor {
    public static void main(String[] args) {
        Author author1 = new Author("Sue Grant", "Sue.Grant@yahoo.com", 'f');
        System.out.println("Чумаков Дмитрий ИСБО-10-16");
        System.out.println(author1);
        author1.setEmail("Sue.Grant@gmail.com");
        System.out.println(author1);
    }
}
