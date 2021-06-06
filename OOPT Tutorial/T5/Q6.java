/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zixua
 */
public class Q6 {
    
    public static boolean validateID (String loginID){
             
        int countLowerLetter=0;
        int countDigit=0;
        //Has between 6 and 10 characters
        if(loginID.length()<6 || loginID.length()>10){
          return false;
        }
        
        //Begins with an uppercase letter
        if (Character.isUpperCase(loginID.charAt(0)) == false) {
            return false;
        }
        
        //Consists of only letters and digits
        for(int i=0;i<loginID.length();i++){
            if(Character.isDigit(loginID.charAt(i))==false){
                if(Character.isLetter(loginID.charAt(i))==false){
                   return false;
                }
            }
        }
        
        //Contains at least one lowercase letter and at least one digit
        for (int i = 0; i < loginID.length(); i++) {
            if (Character.isLowerCase(loginID.charAt(i))) {               
                      countLowerLetter++;        
            }else{
                if (Character.isDigit(loginID.charAt(i))) {               
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
        String id= "Abc12345";
        
        boolean result= validateID(id);
        System.out.print("Result: "+result +"\n");
    }
}
