
public class RoundMirror extends Mirror{
    private int diameter;

    public RoundMirror() {
    }

    public RoundMirror(int diameter, String id, String frameType, String frameColor, double price) {
        super(id, frameType, frameColor, price);
        this.diameter = diameter;
    }
    
     public String toString(){
        return super.toString() + "\n" +
                "Diameter: " + diameter;
    }
}
