public class Person {
    
    private String name;
    private String phoneNo;
  
    public Person(){
    }

    public Person(String name, String phoneNo) {
        this.name = name;
        this.phoneNo = phoneNo;
    }
    
   
    public void setPhoneNo(String phoneNo){
        this.phoneNo = phoneNo;
    }
     
    public void setName(String name){
        this.name = name;
    }
    
     public String getName() {
        return name;
    }

    public String getPhoneNo(){
        return phoneNo;
    }
    
   public boolean validatePhoneNo(String validatePhoneNo){
       boolean validPhone=false;
       if(validatePhoneNo.length()<10||validatePhoneNo.length()>11){
           validPhone= false;
       }else{
           for(int i=0;i<validatePhoneNo.length();i++){
                char ch=validatePhoneNo.charAt(i);
                if(!Character.isDigit(ch)){
                    validPhone= false;
                }else{
                    validPhone= true;
                }
           }
       }
       return validPhone;
         
   }
           
   

    public String toString() {
        return   name +"\t\t|" + phoneNo;
    }
}
