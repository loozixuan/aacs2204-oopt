
public class Movie extends Product{
    private String cast;
    private double duration;

    public Movie() {
    }

    public Movie(String cast, double duration, String itemID, String title, double price) {
        super(itemID, title, price);
        this.cast = cast;
        this.duration = duration;
    }
    
    public String toString(){
        return super.toString() + "\n" +
                "Cast: " + cast + "\n" + 
                 "Duration: " + duration;
    }
}
