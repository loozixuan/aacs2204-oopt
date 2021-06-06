
public class GuestRoom extends Facility{
    private String view;
    private double rate;

    public GuestRoom() {
    }

    public GuestRoom(String view, double rate, String type, int size) {
        super(type, size);
        this.view = view;
        this.rate = rate;
    }
    
    public String displayDeal(){
        return "Annual Room Deal - 20% off";
    }
     
    public String toString(){
        return super.toString() + "\n" +
                "View: " + view + "\n" + 
                "Rate: " + rate + 
                "Deal: " + displayDeal();
    }
}
