public class StudentDriver {
    public static void main(String[] args) {
       
        Student s1 = new Student();
        s1.setName("Ali");
        s1.setStudentID("1910101");
        System.out.println("Name: "+ s1.getName() + "\nStudent ID: " + s1.getStudentID());
          
        Student s2 = new Student("19WNM1899","MFeng");
        System.out.println("Name: "+ s2.getName() + "\nStudent ID: " + s2.getStudentID());
        
        s1.addQuiz(10);
        s2.addQuiz(8);
        s1.addQuiz(9);
        s2.addQuiz(8);
        
        System.out.printf("%-15s %3d %3d %5.2f \n",s1.getName(),s1.getQuizTaken(),s1.getTotalScore(),s1.getAverageScore());     
        System.out.printf("%-15s %3d %3d %5.2f \n",s2.getName(),s2.getQuizTaken(),s2.getTotalScore(),s2.getAverageScore());
    }
}
