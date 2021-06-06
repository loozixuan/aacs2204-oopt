
public class Mouse extends Hardware{
    private String backlight;
    private int size;

    public Mouse() {
    }

    public Mouse(String backlight, int size, String ID, String brand, double price) {
        super(ID, brand, price);
        this.backlight = backlight;
        this.size = size;
    }
    
    public String toString(){
        return super.toString() + "\n" +
                "Backlight: " + backlight + "\n" + 
                "Size: " + size + " inch";
            
    }
}
