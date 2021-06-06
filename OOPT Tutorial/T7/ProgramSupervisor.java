
public class ProgramSupervisor extends AcademicStaff {

    public ProgramSupervisor(int year) {
        super(year);
    }

    public void displayDetail() {
        double basicSalary = 3500;
        double totalSalary;
        double transportationAllowance = 300;
        double administrativeAllowance = 400;
        
        totalSalary = basicSalary + transportationAllowance + administrativeAllowance
                + calcEntertainmentAllowance() + calcHousingAllowance();
        
        System.out.printf("Basic Salary : RM %.2f\n", basicSalary);
        System.out.printf("Transportation Allowance: RM %.2f\n", transportationAllowance);
        System.out.printf("Administrative Allowance: RM %.2f\n", administrativeAllowance);
        System.out.printf("Entertainment Allowance : RM %.2f\n", calcEntertainmentAllowance());
        System.out.printf("Housing Allowance : RM %.2f\n", calcHousingAllowance());
        System.out.printf("Total monthly salary for this program supervisor is RM %.2f.\n", totalSalary);
        System.out.printf("Year of Service : %d\n", getYearOfService());
    }
}
