
public class PostPaidPlan extends DataPlan{
    private int freeTalkinMinute;
    private int noOfFreeSMS;

    public PostPaidPlan() {
    }

    public PostPaidPlan(int freeTalkinMinute, int noOfFreeSMS, String planID, String planName, int dataSize, double price) {
        super(planID, planName, dataSize, price);
        this.freeTalkinMinute = freeTalkinMinute;
        this.noOfFreeSMS = noOfFreeSMS;
    }
    
    public String toString(){
        return super.toString() + "\n" + 
                "Free Talk: " + freeTalkinMinute + "\n" +
                "Free sms: " + noOfFreeSMS;
    }
}
