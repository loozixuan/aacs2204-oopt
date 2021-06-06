
public class TestAcademicStaff {

    public static void main(String[] args) {
        AcademicStaff Staff[] = new AcademicStaff[3];
        
        Staff[0] = new Lecturer("JL", "Master", 5);
        Staff[1] = new Lecturer("SL", "PhD", 10);
        Staff[2] = new ProgramSupervisor(8);
        
        for (int x = 0; x < Staff.length; x++) {
            if (Staff[x] instanceof Lecturer) {
                System.out.println("\nLecturer");
            } else if (Staff[x] instanceof ProgramSupervisor) {
                System.out.println("\nProgram Supervisor");
            }
        
            System.out.println("------------------");
            Staff[x].displayDetail();
            
        }
    }
}
