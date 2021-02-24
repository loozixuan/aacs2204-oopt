
public class VerifyBookID {
    public static boolean verifyBookId(String id){
        if(id.length()==10 && id.indexOf('_')==5){
            String digit = id.substring(0,5);
            for(int i=0;i<5;i++){
                if(!Character.isDigit(digit.charAt(i))){
                    return false;
                }
            }     
            
            String year = id.substring(6,10);
            int yearPurchase = Integer.parseInt(year);
            if(yearPurchase < 2013 || yearPurchase > 2018){
                return false;
            }
            return true;                    
        }else{
            return false;
        }
    
    }
    
    public static void main(String[] args) {
        String id = "12345_2018";
        
        if(verifyBookId(id)){
            System.out.println("Valid");
        }else{
            System.out.println("Invalid");
        }
    }
}
