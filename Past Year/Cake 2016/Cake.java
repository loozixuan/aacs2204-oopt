
public class Cake {
    private String code;
    private String flavor;
    private String shape;
    private double price;
    private static int totalOfCakes;

    public Cake() {
        totalOfCakes++;
    }

    public Cake(String code, String flavor, String shape, double price) {
        this.code = code;
        this.flavor = flavor;
        this.shape = shape;
        this.price = price;
        totalOfCakes++;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static int getTotalOfCakes() {
        return totalOfCakes;
    }

    public static void setTotalOfCakes(int totalOfCakes) {
        Cake.totalOfCakes = totalOfCakes;
    }
    
    
    
}
