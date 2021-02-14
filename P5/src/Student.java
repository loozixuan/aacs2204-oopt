
public class Student {
    private String studentID;
    private String name;
    private int quizTaken;
    private int totalScore;
    
    //constructor overloading
    public Student(){
    }
    
    public Student(String studID, String n){
        studentID=studID;
        name = n;     
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
    
}
