
public class Mirror {
    protected String id;
    protected String frameType;
    protected String frameColor;
    protected double price;

    public Mirror() {
    }

    public Mirror(String id, String frameType, String frameColor, double price) {
        this.id = id;
        this.frameType = frameType;
        this.frameColor = frameColor;
        this.price = price;
    }
    
    public String toString(){
        return "id: " +id + "\n" +
                "Frame Type: " + frameType + "\n" +
                "Frame Color: " + frameColor + "\n" +
                "Price: " + price;
    }
}
