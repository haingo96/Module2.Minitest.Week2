package Prob1;

public class ProgrammingBook extends Book{
    private String language;
    private String framework;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    public ProgrammingBook() {
        super();
    }

    public ProgrammingBook(String name, double price, String author) {
        super(name, price, author);
    }
}
