
public class VerifyPassport {
    public static boolean verifyPassportNo(String passportNo){
        if(passportNo.length()==9){
            if(passportNo.charAt(0)=='A' || passportNo.charAt(0)=='H' || passportNo.charAt(0)=='K'){
                String digit = passportNo.substring(1,9);
                for(int i=0;i<digit.length();i++){
                    if(!Character.isDigit(digit.charAt(i))){
                     return false;
                    }
                }
            }else{
                return false;
            }
        }else{
            return false;
        }
    return true;
    }
    
    public static void main(String[] args) {
        String pNo = "A12345238";
        
        if(verifyPassportNo(pNo)){
            System.out.println("Valid");
        }else{
            System.out.println("Not valid");
        }
    }
}
