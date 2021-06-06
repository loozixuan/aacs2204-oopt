
public abstract class Facility {
    protected String type;
    protected int size;

    public Facility() {
    }

    public Facility(String type, int size) {
        this.type = type;
        this.size = size;
    }
    
    public abstract String displayDeal();
    
    public String toString(){
        return "Type: " + type + "\n" + 
                "Size " + size + "sqm";
    }
}
