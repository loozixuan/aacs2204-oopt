
public class Insurance {
    protected String policyNumber;
    protected String policyHolderName;
    protected double premium;

    public Insurance() {
    }

    public Insurance(String policyNumber, String policyHolderName, double premium) {
        this.policyNumber = policyNumber;
        this.policyHolderName = policyHolderName;
        this.premium = premium;
    }

    @Override
    public String toString() {
        return "Policy No: " + policyNumber + "\n" 
                +"Policy Holder Name: " + policyHolderName + "\n" +
                "Premium: " + premium;
    }
    
}
