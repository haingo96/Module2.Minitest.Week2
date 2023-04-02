package Prob1;

public class Book {
    private static long bookCode;
    private String name;
    private double price;
    private String author;

    public static long getBookCode() {
        return bookCode;
    }

    public static void setBookCode(long bookCode) {
        Book.bookCode = bookCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book() {
    }

    public Book(String name, double price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }
}
