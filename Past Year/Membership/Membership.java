
public class Membership {
    private String packageType;
    private String spa;
    private double monthlyRate;
    private static int totalMembership;

    public Membership() {
        totalMembership++;
    }

    public Membership(String packageType, String spa, double monthlyRate) {
        this.packageType = packageType;
        this.spa = spa;
        this.monthlyRate = monthlyRate;
        totalMembership++;
    }

    public String getPackageType() {
        return packageType;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    public String getSpa() {
        return spa;
    }

    public void setSpa(String spa) {
        this.spa = spa;
    }

    public double getMonthlyRate() {
        return monthlyRate;
    }

    public void setMonthlyRate(double monthlyRate) {
        this.monthlyRate = monthlyRate;
    }

    public static int getTotalMembership() {
        return totalMembership;
    }

    public static void setTotalMembership(int totalMembership) {
        Membership.totalMembership = totalMembership;
    }
    
    public double calculateAnnualFee(){
        return this.monthlyRate * 12;
    }
    
    public String toString(){
        return "Package Type: " + packageType + "\n" +
                "Spa: " + spa + "\n" + 
                "Monthly Rate: RM" + monthlyRate + "\n" +
                "Annual Fee: RM" + calculateAnnualFee();
    
    }
    
}
