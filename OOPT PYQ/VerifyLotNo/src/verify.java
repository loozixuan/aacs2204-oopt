
public class verify {
  public static boolean verifySoilID(String ID){
      if(ID.length()==10){
          String codeScheme = ID.substring(0,3);
          String digit = ID.substring(3,9);
          char size= ID.charAt(9); 
          if(codeScheme.equals("PTY") || codeScheme.equals("SDY") || codeScheme.equals("CLY") || codeScheme.equals("LMY")){
              if(size=='S' || size =='M' || size=='L'){
                  for(int i=0;i< digit.length();i++){
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
      }else{
          return false;
      }
  return true;
  }
  
    public static void main(String[] args) {
        String id="SDY123S56S";
       
        if(verifySoilID(id)){
            System.out.println("Valid");
        }else{
            System.out.println("Invalid");
        }
    }
}
