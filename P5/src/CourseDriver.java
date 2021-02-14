
public class CourseDriver {
    public static void main(String[] args) {
        Course newCourse = new Course("Introduction to Computer", 250.00);
        
        /*String [] nameList={"Ali said","",""};
        newCourse.setStudentName(nameList);*/
        
        newCourse.addStudent("Ali Said");
        newCourse.addStudent("Wong Kein");
        newCourse.addStudent("Peter Lim");
        
        System.out.println("Program's Details:\n==================");
        System.out.println(newCourse.toString());
        System.out.println("\nNames of students enrolled for the new course : ");
        for (int i = 0; i < newCourse.getNoOfStudents(); i++) {
            System.out.println(newCourse.getStudentNames()[i]);
        }
      
    }
}
