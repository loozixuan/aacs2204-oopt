import java.util.Scanner;

public class validatePass {
    public static boolean validatePassword(String pw){
        int countLowerLetter=0;
        int countDigit=0;
        //A password must have at least 7 characters
        if(pw.length()<7){
          return false;
        }  
        
        //A password consists of only letters and digits.
        for(int i=0;i<pw.length();i++){
          if(!Character.isLetter(pw.charAt(i))&& !Character.isDigit(pw.charAt(i))){
              return false;
          }
        }
        
        //A password must contain at least one letter and at least one digit.
          for (int i = 0; i < pw.length(); i++) {
            if (Character.isLowerCase(pw.charAt(i))) {               
                      countLowerLetter++;        
            }else{
                if (Character.isDigit(pw.charAt(i))) {               
                          countDigit++;        
                }
            }
        }
        if(countLowerLetter==0||countDigit==0){
           return false;
        }else{
            return true;
        }        
    }
    
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("A password must be: ");
        System.out.println("-at least 7 characters");
        System.out.println("-consists of only letters and digits");
        System.out.println("-must contain at least one letter and at least one digit");
        System.out.print("\n Enter a password: ");

        String password= scan.nextLine();
        
        if(validatePassword(password)){
            System.out.println("Valid password");
        }else{
            System.out.println("Invalid password");
        }
        
        
    }
   
}
