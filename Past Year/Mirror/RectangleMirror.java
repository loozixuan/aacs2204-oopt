
public class RectangleMirror extends Mirror{
    private int width;
    private int length;

    public RectangleMirror() {
    }

    public RectangleMirror(int width, int length, String id, String frameType, String frameColor, double price) {
        super(id, frameType, frameColor, price);
        this.width = width;
        this.length = length;
    }
    
    public String toString(){
        return super.toString() + "\n" +
                "Width: " + width + "\n" +
                "Length: " + length;
    }
}
