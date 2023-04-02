package Prob1;

public class FictionBook extends Book{
    private String category;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public FictionBook() {
    }

    public FictionBook(String name, double price, String author) {
        super(name, price, author);
    }
}
