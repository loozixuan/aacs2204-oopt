
public class StudentQ3 {
    private String studentID;
    private String name;
    private int quizTaken;
    private int totalScore;
    private static double Contribution;
    
    //constructor overloading
    public StudentQ3(){
        this("","");
    }
    
    public StudentQ3(String studentID, String name){
        this.studentID=studentID;
        this.name = name;     
    }

    //getter and setter
    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public int getQuizTaken() {
        return quizTaken;
    }
    

    public void setName(String name) {
        this.name = name;
    }
    
    public void addQuiz(int score){
       if(score<0 || score>10){
           System.out.println("Error : Invalid score");
       }else{
           totalScore+=score;
           quizTaken++;
       }
    }
    
    //method to getTotalScore
    public int getTotalScore(){
        return totalScore;
    }
    
    //method to getAverageScore
    public double getAverageScore(){
        return totalScore/(double)quizTaken;
    }

    public static double getContribution() {
        return Contribution;
    }

    public static void setContribution(double Contribution) {
        // contribution is under class level so use class name(StudentQ3)
        //not "this"
        StudentQ3.Contribution = Contribution;
    }
    
   
}
