
public class Vase {
    protected String id;
    protected String brand;
    protected double price;
    protected int height;

    public Vase() {
    }

    public Vase(String id, String brand, double price, int height) {
        this.id = id;
        this.brand = brand;
        this.price = price;
        this.height = height;
    }
    
    public String toString(){
        return "ID: "+ id +"\n"
                +"Brand: " +brand+"\n"+
                "Price: RM"+ price + "\n" +
                "Height: " + height +"cm";
    }
}
