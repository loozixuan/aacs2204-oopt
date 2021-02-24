
public class Flower {
    private String id;
    private String name;
    private String color;
    private double pricePerBouquet;
    private static int totalOfFlowersType;

    public Flower() {
        totalOfFlowersType++;
    }

    public Flower(String id, String name, String color, double pricePerBouquet) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.pricePerBouquet = pricePerBouquet;
        totalOfFlowersType++;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPricePerBouquet() {
        return pricePerBouquet;
    }

    public void setPricePerBouquet(double pricePerBouquet) {
        this.pricePerBouquet = pricePerBouquet;
    }

    public static void setTotalOfFlowersType(int totalOfFlowersType) {
        Flower.totalOfFlowersType = totalOfFlowersType;
    }
    
    public static int getTotalOfFlowersType() {
        return totalOfFlowersType;
    }

    
}
