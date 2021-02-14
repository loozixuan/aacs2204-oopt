
public class TestStudentQ3 {
    public static void main(String[] args) {
       
        StudentQ3 s1 = new StudentQ3();
        s1.setName("Ali");
        s1.setStudentID("1910101");
        System.out.println("Name: "+ s1.getName() + "\nStudent ID: " + s1.getStudentID());
          
        StudentQ3 s2 = new StudentQ3("19WNM1899","MFeng");
        System.out.println("Name: "+ s2.getName() + "\nStudent ID: " + s2.getStudentID());
        
        s1.addQuiz(9);
        s2.addQuiz(8);
       
        
        s1.setContribution(20);
        
         System.out.printf("%s %s %s %s %s\n","Name","No.Quiz","Score","Average","Contribution");
        System.out.printf("%-5s %3d %6d %8.2f %10.2f\n",s1.getName(),s1.getQuizTaken(),s1.getTotalScore(),s1.getAverageScore(),s1.getAverageScore()/10 * StudentQ3.getContribution());     
        System.out.printf("%-5s %3d %6d %8.2f %10.2f\n",s2.getName(),s2.getQuizTaken(),s2.getTotalScore(),s2.getAverageScore(),s2.getAverageScore()/10 * StudentQ3.getContribution());
    }
}
