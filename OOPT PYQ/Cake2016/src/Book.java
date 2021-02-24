
public class Book extends Product{
    private String author;
    private int pages;

    public Book() {
    }

    public Book(String author, int pages, String itemID, String title, double price) {
        super(itemID, title, price);
        this.author = author;
        this.pages = pages;
    }
    
    public String toString(){
        return super.toString() + "\n" +
               "Author: " + author + "\n" + 
                "Pages: " + pages;
    }
}
