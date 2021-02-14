
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public abstract class Payslip {
  private Employee employee;
  private static Calendar calendar = new GregorianCalendar();
  
  private final static int MONTH_INDEX = Calendar.MONTH;
  private final static int YEAR_INDEX = Calendar.YEAR;

  public Payslip() {
  }

  public Payslip(Employee employee) {
   	this.employee = employee;
  }

  public Employee getEmployee(){
    return employee;
  }

  public static String getMonthName() {
    return calendar.getDisplayName(MONTH_INDEX, Calendar.LONG, Locale.ENGLISH);
  }

  public static int getYear() {
    return calendar.get(YEAR_INDEX);
  }

  public static String getMonthAndYear() {
    return getMonthName() + " " + getYear();
  }

  public static void setCalendar(Calendar calendar) {
    Payslip.calendar = calendar;
  }

  public static void setCalendar(int month, int year) {
    calendar.set(year, month-1, 1);
  }

  public void setEmployee(Employee employee) {
    this.employee = employee;
  }


  public String toString() {
    return "Payslip for " + getMonthName() + " " + getYear() + "\n" +
            employee;
  }

  public abstract double calculateSalary();
}
