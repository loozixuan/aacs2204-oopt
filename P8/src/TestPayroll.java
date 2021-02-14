
import java.util.Scanner;

public class TestPayroll {

  public static void processPayroll(Payslip[] payslips) {
    Scanner scn = new Scanner(System.in);
    System.out.println("PAYROLL PROCESSING");
    System.out.println("------------------");
    
    //todo:: get inputs and process payroll
    for (int i = 0; i < payslips.length; ++i) {
        System.out.println("\nProcessing payroll for employee # " + (i+1));
        System.out.println(payslips[i].getEmployee());
        
        if(payslips[i] instanceof FullTimePayslip){
            System.out.println("Enter mode of contribution. [1] Volunteer or [2] Donation :");
            int selection=scn.nextInt();
            
            switch(selection){
                case 1:
                   ((FullTimePayslip)payslips[i]).volunteer();
                   break;
                case 2:
                    System.out.print("Enter amount to donate: RM");
                    double donation=scn.nextDouble();
                    ((FullTimePayslip)payslips[i]).donate(donation);
                    break;              
            }
        }
    }
  }

  public static void displayPayslips(Payslip[] payslips) {
    System.out.println("\n\nGENERATING PAYSLIPS FOR " + Payslip.getMonthAndYear());
    System.out.println("------------------------------------------");

    for (int i = 0; i < payslips.length; ++i) {
      //todo:: display payslop result
        System.out.println("Employee # "+ (i+1));
        System.out.println(payslips[i].toString()+"\n");
    }
  }

  public static void main(String[] args) {
      
      //todo:: using Array, created 4 payslip objects
      Payslip[] payslip={new PartTimePayslip(new Employee(1001,"Ali"),10),
          new PartTimePayslip(new Employee(1002,"Ahmad"),40),
          new FullTimePayslip(new Employee(1003,"Siti"),2000,300),
          new FullTimePayslip(new Employee(1004,"AhMei"),2100,400)};
   
      //todo:: process payroll
      processPayroll(payslip);
      
      //todo:: display pay slip
      displayPayslips(payslip);

      //todo:: display total donation
      System.out.println("Total Amount of Donation : RM" + FullTimePayslip.getDonationFund());
      //todo:: display total number of volunteer
      System.out.println("Total number of volunteer : " + FullTimePayslip.getVolunteerCount());
  }
}
