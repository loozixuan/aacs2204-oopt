
public abstract class DataPlan {
    protected String planID;
    protected String planName;
    protected int dataSize;
    protected double price;

    public DataPlan() {
    }

    public DataPlan(String planID, String planName, int dataSize, double price) {
        this.planID = planID;
        this.planName = planName;
        this.dataSize = dataSize;
        this.price = price;
    }
    
    public String toString(){
        return "Plan id: " + planID + "\n" + 
                "Plan Name: " + planName + "\n" +
                "Data Size: " + dataSize + "\n"  +
                "Price: " + price;
    }
}
