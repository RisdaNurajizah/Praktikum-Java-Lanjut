package sesi2;

public class Book {
    String title;
    String author;
    int year;

    public Book(){
        title = "Unknown";
        author = "Unknown";
        year = 0;
    }

    public Book(String title, String author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public static void main(String[] args){
        Book book1 = new Book();
        System.out.println(book1.title + ", " + book1.author + ", " + book1.year);

        Book book2 = new Book("Java Fundamentals", "John Doe", 2021);
        System.out.println(book2.title + ", " + book2.author + ", " + book2.year);
    }
}
