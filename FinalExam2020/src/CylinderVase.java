
public class CylinderVase extends Vase{
    private int diameter;

    public CylinderVase() {
    }

    public CylinderVase(int diameter, String id, String brand, double price, int height) {
        super(id, brand, price, height);
        this.diameter = diameter;
    }
    
     public String toString(){
        return super.toString() + "\n"
            + "Diameter: " + diameter + "cm";
    }
}
