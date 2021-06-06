
public class PrepaidPlan extends DataPlan{
    private int validity;

    public PrepaidPlan() {
    }

    public PrepaidPlan(int validity, String planID, String planName, int dataSize, double price) {
        super(planID, planName, dataSize, price);
        this.validity = validity;
    }
    
     public String toString(){
        return super.toString() + "\n" + 
                "Validity: " + validity;
               
    }
}
