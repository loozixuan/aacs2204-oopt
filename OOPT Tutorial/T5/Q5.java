
public class Q5 {
    public static boolean validateCreditCardNumber(String creditCardNumber){     
       if(creditCardNumber.length()!=16){
         return false;
       }else{
           for(int i=0;i<creditCardNumber.length();++i){
             char ch = creditCardNumber.charAt(i);
             
             if(!Character.isDigit(ch)){
               return false;
             }             
            }
             return true; 
            }
    } 
    
    public static void main(String[] args) {
        String cardNo="1111222233334444";
        
        System.out.println(validateCreditCardNumber(cardNo));
    }
 
}
