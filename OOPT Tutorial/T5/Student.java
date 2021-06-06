
public class Student {
    private String studentID;
    private String name;
    private String school;
   
    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
       
    
    public static boolean validateStudentID(Student s){    
        if(s.studentID.length()==6){
            if(s.school.equals("FASC") && s.studentID.charAt(0)=='A'){
                for(int i=1;i<6;i++){
                    char ch= s.studentID.charAt(i);                    
                    if(!Character.isDigit(ch)){
                        return false;
                    }
                }
            }else if(s.school.equals("FAFB") && s.studentID.charAt(0)=='B'){
                 for(int i=1;i<6;i++){
                    char ch= s.studentID.charAt(i);                    
                    if(!Character.isDigit(ch)){
                        return false;
                    }
                }
            }
        }else{
            return false;
        }
    return true;
    }
    
}
