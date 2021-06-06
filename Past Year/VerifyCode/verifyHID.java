
public class verifyHID {
    public static boolean verifyHardwareID(String ID){
        if(ID.length()==8){
            String code= ID.substring(0,2);
            if(code.equals("MS") || code.equals("MT") || code.equals("KB")){
                for(int i=2 ; i< ID.length(); i++){
                    if(! Character.isDigit(ID.charAt(i))){
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
       String s1="The more that you read, the more things you will know!";
       
        System.out.println(s1.substring(40,54));
        System.out.println(s1.charAt(19));
        System.out.println(s1.equalsIgnoreCase("read"));
        System.out.println(s1.replace("e","x"));
        System.out.println(s1.length());
    }
}
