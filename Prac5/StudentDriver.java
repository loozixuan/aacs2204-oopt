
public class StudentDriver {
    public static void main(String[] args) {
        //RESULT 1
        Student s=new Student();
        
        s.setSchool("FASC");
        s.setName("Ali");
        s.setStudentID("A12345");
              
        boolean result= Student.validateStudentID(s);
        if(result==true){
            System.out.println(s.getName() + "(" + s.getStudentID() +")" +" is a valid student ID");
        }else{
             System.out.println(s.getName()+ "(" +s.getStudentID()+")" +" is not a valid student id");
        }            
        
        //RESULT2
        Student s2=new Student();
        
        s2.setSchool("FAFB");
        s2.setName("Abu");
        s2.setStudentID("B12345");
              
        boolean result2= Student.validateStudentID(s2);
        if(result2==true){
            System.out.println(s2.getName() + "(" + s2.getStudentID() +")" +" is a valid student ID");
        }else{
             System.out.println(s2.getName()+ "(" +s2.getStudentID()+")" +" is not a valid student id");
        }           
    }
}
