
public class Monitor extends Hardware{
    private String type;
    private int DPI;

    public Monitor() {
    }

    public Monitor(String type, int DPI, String ID, String brand, double price) {
        super(ID, brand, price);
        this.type = type;
        this.DPI = DPI;
    }
    
    public String toString(){
        return super.toString() + "\n" +
                "Type: " + type + "\n" + 
                "DPI: " + DPI + "  DPI";
            
    }
    
}
