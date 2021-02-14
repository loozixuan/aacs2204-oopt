
public class PartTimePayslip extends Payslip {
    
  private final static double HOURLY_RATE = 3.50;
  private int hours;

  public PartTimePayslip() {
  }

  public PartTimePayslip(Employee employee, int hours) {
    super(employee);
    this.hours = hours;
  }

  public static double getHourlyRate() {
    return HOURLY_RATE;
  }

  public int getHours() {
    return hours;
  }

  public void setHours(int hours) {
    this.hours = hours;
  }

   public double calculateSalary() {
     return HOURLY_RATE * hours;
   }

  public String toString() {
    return super.toString() + "\n" + 
           "Hours worked: " + hours +"\n"+
           "Salary : RM " +  calculateSalary();
  }
}
