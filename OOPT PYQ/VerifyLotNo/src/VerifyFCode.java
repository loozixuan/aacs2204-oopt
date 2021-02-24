
public class VerifyFCode {
    public static boolean verifyProductID(String ID){
        if(ID.length()==6){
            String code= ID.substring(0,2);
            String id = ID.substring(2,6);
            if(code.equals("TB")|| code.equals("CH") || code.equals("CB")){
                for(int i=0;i<id.length();i++){
                    if(!Character.isDigit(id.charAt(i))){
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
        String id = "CH0012";
        
        if(verifyProductID(id)){
            System.out.println("Valid");
        }else{
            System.out.println("Invalid");
        }
    }
}
