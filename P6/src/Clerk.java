
public class Clerk extends Employee{
    private double allowance;
    private int overtimeHours;
    private static double overtimeRate=5;

    public Clerk() {
    }    
    
    public Clerk(String name, int yearJoined, double basicSalary, double allowance, int overtimeHours) {
        super(name, yearJoined, basicSalary);
        this.allowance = allowance;
        this.overtimeHours = overtimeHours;
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    public int getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    public static double getOvertimeRate() {
        return overtimeRate;
    }

    public static void setOvertimeRate(double overtimeRate) {
        Clerk.overtimeRate = overtimeRate;
    }

    public String toString() {
        return super.toString()+"\n"+
                "Allowance: " + allowance + "\n"+
                "OvertimeHours: " + overtimeHours+ "\n"+
                "Overtime Rates: "+ overtimeRate;
    }
    
    public double calculateSalary(){
        return super.calculateSalary()+this.allowance+(this.overtimeHours*Clerk.overtimeRate);
    }
    
     public boolean equals(Object obj){        
        if(super.equals(obj)){
            return true;
        }else{
            return false;
        }
    }
    
}
