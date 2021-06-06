
public class Hardware {
    protected String ID;
    protected String brand;
    protected double price;

    public Hardware() {
    }

    public Hardware(String ID, String brand, double price) {
        this.ID = ID;
        this.brand = brand;
        this.price = price;
    }
    
    public String toString(){
        return "ID: " + ID + "\n" + 
                "Brand: " + brand + "\n" + 
                "Price: RM" + price;
    }
}
