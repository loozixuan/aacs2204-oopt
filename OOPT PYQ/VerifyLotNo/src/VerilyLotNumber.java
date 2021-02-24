
public class VerilyLotNumber {
    public static boolean verifyshopLotNo(String shopLotNo){
        if(shopLotNo.length() == 5 && shopLotNo.indexOf('-')==2){

            String level = shopLotNo.substring(0, 2);
            if(level.equals("LG")||level.equals("L1")||level.equals("L2")){
                String lotNum = shopLotNo.substring(3,5);
                for (int i = 0; i < 2; i++){
                    if(! Character.isDigit(lotNum.charAt(i))){
                    return false;
                    }
                }
                int num = Integer.parseInt(lotNum);
                if(num < 1 || num > 35){
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
        String no="L1-27";
        
        if(verifyshopLotNo(no)){
            System.out.println("Valid shop lot number");
        }else{
            System.out.println("Invalid shop lot number");
        }
    }
}
