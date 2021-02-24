
public class SquareVase extends Vase{
    private int width;
    private int length;

    public SquareVase() {
    }

    public SquareVase(int width, int length, String id, String brand, double price, int height) {
        super(id, brand, price, height);
        this.width = width;
        this.length = length;
    }
    
    public String toString(){
        return super.toString() + "\n"
                + "Width: " + width +" cm" + "\n"
                +"Length: "  +length + " cm";
    }
}
