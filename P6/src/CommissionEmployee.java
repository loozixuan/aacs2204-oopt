
public class CommissionEmployee extends Employee{
    private double grossSale;
    private double commisionRate;

    public CommissionEmployee() {
    }
    
    public CommissionEmployee(String name, int yearJoined, double basicSalary,double grossSale, double commisionRate) {
        super(name, yearJoined, basicSalary);
        this.grossSale = grossSale;
        this.commisionRate = commisionRate;
    }

    public double getGrossSale() {
        return grossSale;
    }

    public void setGrossSale(double grossSale) {
        this.grossSale = grossSale;
    }

    public double getCommisionRate() {
        return commisionRate;
    }

    public void setCommisionRate(double commisionRate) {
        this.commisionRate = commisionRate;
    }

    public String toString() {
        return super.toString()+"\n"+
                "GrossSale: " + grossSale + "\n"+
                "CommisionRate: " + commisionRate;
    }
    
    public double calculateSalary(){
        return super.calculateSalary()+(this.grossSale*this.commisionRate);
    }
    
    public boolean equals(Object obj){        
        if(super.equals(obj)){
            return true;
        }else{
            return false;
        }
    }
    
}
