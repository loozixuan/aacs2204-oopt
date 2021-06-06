
public class Staff extends Person{
    
    private String staffID;
    private String password;
    private String position;
    private double salary;
    public static int totalEpy=0;
    private static int noOfStaff=0;
    private static int noOfManager=0;
    
    
    public Staff(){
    }

    public Staff(String password, char position, double salary, String name, String phoneNo) {
        
        super(name, phoneNo);
        this.password = password;
        this.salary = salary;
        totalEpy++;
        if(position=='M'){
            this.position = "Manager";
            noOfManager++;
        int id=1000+noOfManager;
        this.staffID = "A" + Integer.toString(id);
       
        }else{
            noOfStaff++;
        int id=1000+noOfStaff;
        this.staffID = "S" + Integer.toString(id);
        this.position = "Cashier";
       
        }
        
    }

    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public void setPosition(char position) {
        if(position=='C'){
            this.position = "Cashier";
        }else{
            this.position = "Manager";
        }
        
    }
    
     public void setSalary(double salary){
        this.salary = salary;
    }
    
    public String getStaffID() {
        return staffID;
    }

    public String getPassword() {
        return password;
    }


    public String getPosition() {
        return position;
    }
    
    public double getSalary(){
        return salary;
    }

    public static int getTotalEpy() {
        return totalEpy;
    }

    public static int getNoOfStaff() {
        return noOfStaff;
    }

    public static int getNoOfManager() {
        return noOfManager;
    }  
    
    public boolean validatePassword(String validatePassword){
      
        int countLetter=0;
        int countDigit=0;
        
         if(validatePassword.length()!=8){
            return false;
        }else{
             for(int i=0;i<validatePassword.length();i++){
                char ch=validatePassword.charAt(i);
                if(!Character.isLetter(ch)&&!Character.isDigit(ch)){
                    return false;
                }else{
                    if(Character.isLetter(ch)){
                        countLetter++;
                    }else if(Character.isDigit(ch)){
                        countDigit++;
                    }
                }
             
         
               }
             
            if(countLetter!=0&&countDigit!=0){
                return true;
            }else{
                return false;
            }
            
          
       
    }
         
    }
    
    public String toString() {
        return  staffID + "\t\t|"+super.toString()+"\t |"+ position + "\t |" + salary+"\t |";
    }
    
   
}

      
        
        


