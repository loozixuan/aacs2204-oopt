
public class Course {
    private String courseTitle;
    private double feesPerStudent;
    private int noOfStudents;
    private String[] studentNames;
    private static int courseCount;
    
    //constructor
    public Course(String courseTitle, double feesPerStudent){
       this.courseTitle = courseTitle;
       this.feesPerStudent= feesPerStudent;
       this.noOfStudents=0;
       this.studentNames=new String[100];
       Course.courseCount++;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public double getFeesPerStudent() {
        return feesPerStudent;
    }

    public void setFeesPerStudent(double feesPerStudent) {
        this.feesPerStudent = feesPerStudent;
    }

    public int getNoOfStudents() {
        return noOfStudents;
    }

    public void setNoOfStudents(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }

    public void setStudentNames(String[] studentNames) {
        this.studentNames = studentNames;
    }

    public String[] getStudentNames() {
        return studentNames;
    }

    public static int getCourseCount() {
        return courseCount;
    }

    public static void setCourseCount(int courseCount) {
        Course.courseCount = courseCount;
    }
    
    public double calcFeesCollected(){
        return feesPerStudent * noOfStudents;
    }
    
    public void addStudent(String studName) {
        if(noOfStudents<100){
             this.studentNames[this.noOfStudents] = studName;
             this.noOfStudents++; 
        }else{
            System.out.println("Maximun numbers only 100 students");
        }
    }
    
    public String toString(){
        return ("Course Title  : "+ this.courseTitle +"\n" 
                + "Total Course Fees : RM"+ this.feesPerStudent + "\n"
                + "Total Number of Students : "+ this.noOfStudents + "\n" 
                + "Total Fees collected for the course : RM" + this.calcFeesCollected() + "\n"
                + "Total Course Count : " + Course.courseCount);
    }
}
