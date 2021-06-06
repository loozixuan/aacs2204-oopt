
public class StudentDriver {
    public static void main(String[] args) {
        Student s=new Student();
        
        s.setSchool("FASC");
        s.setName("Ali");
        s.setStudentID("A12345");
      
        
        boolean result= Student.validateStudentID(s);
        if(result==true){
            System.out.println(s.getStudentID() + " is a valid student id");
        }else{
             System.out.println(s.getStudentID() + " is not a valid student id");
        }               
    }
}
