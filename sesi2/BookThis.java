package sesi2;

public class BookThis {
    String title;
    String author;
    int year;

    public BookThis(){
        title = "Unknown";
        author = "Unknown";
        year = 0;
    }

    public BookThis(String title, String author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public void setDetails(String title, String author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public static void main(String[] args){
        BookThis book1 = new BookThis();
        book1.setDetails("Effective Java", "Joshua Bloch", 2008);
        System.out.println(book1.title + ", " + book1.author + ", " + book1.year);
    }
}
