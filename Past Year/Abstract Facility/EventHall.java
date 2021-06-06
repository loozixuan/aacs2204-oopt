
public class EventHall extends Facility{
    private int capacity;
    private String arrangement;

    public EventHall() {
    }

    public EventHall(int capacity, String arrangement, String type, int size) {
        super(type, size);
        this.capacity = capacity;
        this.arrangement = arrangement;
    }
    
    public String displayDeal(){
        return "End of Year Deal  - 10% off";
    }
    
    public String toString(){
        return super.toString() + "\n" + 
                "Capacity: " + capacity + "\n" +
                "Arrangement: " + arrangement + "\n" + 
                "Deal: " + displayDeal();
    }
}
