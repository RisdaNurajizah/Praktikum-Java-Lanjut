package sesi2;

public class Book2 {
    // inisialisasi variabel
    String title;
    String author;
    int year;
    
    // konstruktor tanpa parameter
    public Book2(){
        title = "Unknown";
        author = "Unknown";
        year = 0;
    }

    // konstruktor dengan parameter
    public Book2(String title, String author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // konstruktor dengan parameter title 
    public Book2(String title){
        this.title = title;
        this.author = "Unknown";
        this.year = 0;
    }

    // main method
    public static void main(String[] args){
        Book2 book1 = new Book2();
        System.out.println(book1.title + " " + book1.author + " " + book1.year);

        Book2 book2 = new Book2("Java Fundamentals", "John Doe", 2021);
        System.out.println(book2.title + ", " + book2.author + ", " + book2.year);

        Book2 book3 = new Book2("Logika Pemrograman Menggunakan Java");
        System.out.println(book3.title + ", " + book3.author + ", " + book3.year);
    }
}
