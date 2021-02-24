
public class Product {
    protected String itemID;
    protected String title;
    protected double price;

    public Product() {
    }

    public Product(String itemID, String title, double price) {
        this.itemID = itemID;
        this.title = title;
        this.price = price;
    }
    
    public String toString(){
        return "Item ID: " + itemID + "\n"
                +"Title: " + title + "\n"
                +"Price: " + price;
    }
}
