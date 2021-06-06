
public class Lecturer extends AcademicStaff {

    private String staffLevel;
    private String educationLevel;

    public Lecturer(String staffL, String educationL, int year) {
        super(year);
        setStaffLevel(staffL);
        setEducationLevel(educationL);
    }

    public void setStaffLevel(String level) {
        staffLevel = level;
    }

    public String getStaffLevel() {
        return staffLevel;
    }

    public void setEducationLevel(String level) {
        educationLevel = level;
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public void displayDetail() {
        double basicSalary = 0, totalSalary, transportationAllowance = 0;
        
        String level = "";
        
        if (staffLevel.equals("JL")) {
            if (educationLevel.equals("Degree")) {
                basicSalary = 1600;
            } else if (educationLevel.equals("Master")) {
                basicSalary = 2300;
            } else if (educationLevel.equals("PhD")) {
                basicSalary = 3000;
            }
            transportationAllowance = 220;
            level = "Junior Lecturer";
        } else if (staffLevel.equals("SL")) {
            if (educationLevel.equals("Degree")) {
                basicSalary = 2300;
            } else if (educationLevel.equals("Master")) {
                basicSalary = 3000;
            } else if (educationLevel.equals("PhD")) {
                basicSalary = 3500;
            }
            transportationAllowance = 270;
            level = "Senior Lecturer";
        }
        
        totalSalary = basicSalary + transportationAllowance + calcEntertainmentAllowance() + calcHousingAllowance();
        
        System.out.printf("Basic Salary : RM %.2f\n", basicSalary);
        System.out.printf("Transportation Allowance: RM %.2f\n", transportationAllowance);
        System.out.printf("Entertainment Allowance : RM %.2f\n",
                calcEntertainmentAllowance());
        System.out.printf("Housing Allowance : RM %.2f\n", calcHousingAllowance());
        System.out.printf("Total monthly salary for this %s (%s holder) is RM %.2f.\n",
                level, getEducationLevel(), totalSalary);
        System.out.printf("Year of Service : %d\n", getYearOfService());
    }
}
