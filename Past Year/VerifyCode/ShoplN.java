
public class ShoplN {
    public static boolean veridyShopLotNo(String shopLotNo){
        if(shopLotNo.length()==5 && shopLotNo.indexOf("-")==2){
            String code  = shopLotNo.substring(0,2);
            String unit = shopLotNo.substring(3,5);
            
            if(code.equals("LG") || code.equals("L1") || code.equals("L2")){
                for(int i=0;i<unit.length();i++){
                    if(!Character.isDigit(unit.charAt(i))){
                        return false;
                    }
                }
                int unitNo = Integer.parseInt(unit);
                if(unitNo < 1 || unitNo > 35){
                    return false;
                }
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
 
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
