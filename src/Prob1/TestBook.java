package Prob1;

import java.util.ArrayList;

public class TestBook {
    public static void main(String[] args) {
        ArrayList<Book> bookCollection = new ArrayList<>();

        Book java = new ProgrammingBook("Java", 123, "Hai");
        Book javaScript = new ProgrammingBook("JavaScript", 111, "Giang");
        Book python = new ProgrammingBook("Python", 99, "Hai");
        Book ruby = new ProgrammingBook("Ruby", 97, "Giang");
        Book cSharp = new ProgrammingBook("CSharp", 95, "Hai");

        Book harryPorter = new FictionBook("Harry Porter", 69, "J.K.Rolling");
        ((FictionBook) harryPorter).setCategory("Fiction1");
        Book dragonBall = new FictionBook("Dragon Ball", 20, "Akira Toriyama");
        ((FictionBook) dragonBall).setCategory("Fiction2");
        Book twilight = new FictionBook("Twilight", 110, "Stephenie Meyer");
        ((FictionBook) twilight).setCategory("Fiction1");
        Book lordsOfTheRing = new FictionBook("Lords of the Ring", 56, "J.R.R.Tolkien");
        ((FictionBook) lordsOfTheRing).setCategory("Fiction1");
        Book journeyToTheWest = new FictionBook("Journey To The West", 123, "Wu Cheng'en");
        ((FictionBook) journeyToTheWest).setCategory("Fiction3");

        bookCollection.add(java);
        bookCollection.add(javaScript);
        bookCollection.add(python);
        bookCollection.add(ruby);
        bookCollection.add(cSharp);
        bookCollection.add(harryPorter);
        bookCollection.add(dragonBall);
        bookCollection.add(twilight);
        bookCollection.add(lordsOfTheRing);
        bookCollection.add(journeyToTheWest);

        double sumBookPrice = 0;
        for (Book book : bookCollection) {
            sumBookPrice += book.getPrice();
        }

        int countFiction1 = 0;
        for (Book book : bookCollection) {
            if (book instanceof FictionBook && ((FictionBook) book).getCategory() == "Fiction1") {
                countFiction1++;
            }
        }

        int countPriceLessThan100 = 0;
        for (Book book : bookCollection) {
            if (book.getPrice() < 100) {
                countPriceLessThan100++;
            }
        }

        System.out.println(sumBookPrice);
        System.out.println(countFiction1);
        System.out.println(countPriceLessThan100);
    }
}
