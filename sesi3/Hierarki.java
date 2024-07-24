package sesi3;

// superclass
class Item{
    // deklarasi variabel
    private String title;
    private String publicationDate;
    private int year;

    // constructor dengan parameter
    public Item(String tittle, String publicationDate, int year){
        // menginisialisasi variabel
        this.title = tittle;
        this.publicationDate = publicationDate;
        this.year = year;
    }

    // getter untuk title
    public String getTittle(){
        return title;
    }
    // getter untuk publicationDate
    public String getPublicationDate(){
        return publicationDate;
    }
    // getter untuk year
    public int getYear(){
        return year;
    }

    // setter untuk title
    public void setTittle(String title){
        this.title = title;
    }
    // setter untuk publicationDate
    public void setPublicationDate(String publicationDate){
        this.publicationDate = publicationDate;
    }
    // setter untuk year
    public void setYear(int year){
        this.year = year;
    }

    // Method untuk menampilkan informasi Item
    public void displayInfo() {
        System.out.println("Title    : " + title + ", Publication Date : " + publicationDate);
    }
}

// Subclass untuk buku
class Book extends Item {
    // Deklarasi variabel
    private String author;

    // constructor dengan parameter
    public Book(String title, String publicationDate, int year, String author) {
        super(title, publicationDate, year);
        // menginisialisasi variabel
        this.author = author;
    }

    // getter untuk author
    public String getAuthor() {
        return author;
    }

    // setter untuk author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Method untuk menampilkan informasi Book
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author   : " + author);
    }
}

// Subclass untuk majalah
class Magazine extends Item {
    // Deklarasi variabel
    private int volume;
    private int issue;

    // constructor dengan parameter
    public Magazine(String title, String publicationDate, int year, int volume, int issue) {
        super(title, publicationDate, year);
        // menginisialisasi varibel
        this.volume = volume;
        this.issue = issue;
    }

    // getter untuk volume
    public int getVolume() {
        return volume;
    }
    // getter untuk issue
    public int getIssue() {
        return issue;
    }

    // setter untuk volume
    public void setVolume(int volume) {
        this.volume = volume;
    }
    // setter untuk issue
    public void setIssue(int issue) {
        this.issue = issue;
    }

    // Method untuk menampilkan informasi Magazine
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Volume   : " + volume + ", Issue : " + issue);
    }
}

// Subclass untuk DVD
class DVD extends Item {
    // Deklarasi variabel
    private int duration; 
    private String genre;

    // constructor dengan parameter
    public DVD(String title, String publicationDate, int year, int duration, String genre) {
        super(title, publicationDate, year);
        // menginisialisasi variabel
        this.duration = duration;
        this.genre = genre;
    }

    // getter untuk duration
    public int getDuration() {
        return duration;
    }
    // getter untuk genre
    public String getGenre() {
        return genre;
    }

    // setter untuk duration
    public void setDuration(int duration) {
        this.duration = duration;
    }
    // setter untuk genre
    public void setGenre(String genre) {
        this.genre = genre;
    }

    // Method untuk menampilkan informasi DVD
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Duration : " + duration + " minutes, Genre : " + genre);
    }
}

// Main class untuk menguji
public class Hierarki {
    public static void main(String[] args){
        // Membuat objek Book
        Book book = new Book("The Great Gatsby", "1925-04-10", 1925, "F. Scott Fitzgerald");
        book.displayInfo();

        // Membuat objek Magazine
        Magazine magazine = new Magazine("National Geographic", "2023-07-01", 2023, 20, 7);
        magazine.displayInfo();

        // Membuat objek DVD
        DVD dvd = new DVD("Inception", "2010-07-16", 2010, 148, "Science Fiction");
        dvd.displayInfo();   
    }
}
