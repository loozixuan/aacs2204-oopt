public class Member extends Person{ 
    private String memberID;
    private Purchase []purchase = new Purchase[100];
    private final static double DISCOUNT_RATE1 = 0.05;
    private final static double DISCOUNT_RATE2 = 0.1;
    private final static double DISCOUNT_RATE3 = 0.15;
    private int numberOfPurchase;
    private static int numOfMember;
    
    public Member(){
        
    }

    public Member(String name, String phoneNo) {
        super(name, phoneNo);
        numOfMember++;
        int id=1000+numOfMember;
        this.memberID = "M" + Integer.toString(id);
    }
    
    public String getMemberID() {
        return memberID;
    }
    
    public Purchase[] getPurchase(){
        return this.purchase;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    public void setPurchase(Purchase purcahse) {
        this.purchase[numberOfPurchase] = purcahse;
        numberOfPurchase++;
    }
    
    public static double getDISCOUNT_RATE1(){
        return DISCOUNT_RATE1;
    }
    
    public static double getDISCOUNT_RATE2(){
        return DISCOUNT_RATE2;
    }

    public static double getDISCOUNT_RATE3(){
        return DISCOUNT_RATE3;
    }
 
    public static int getNumOfMember() {
        return numOfMember;
    }  
    
    public int getNumberOfPurchase() {
        return numberOfPurchase;
    }
    
    public static double getDISCOUNT_RATE(double amount){
      if(amount >= 500){
            return getDISCOUNT_RATE3();
        }else if(amount >= 300 && amount <= 500){
            return getDISCOUNT_RATE2();
        }else{
            return getDISCOUNT_RATE1();
        }
    }  
    
    
    public boolean memberValidation(String id){
        if(id.equals(memberID)){
            return true;
        }
        else{
             return false;
        }
    }

    public String toString() {
        return super.toString() + "\t\t" + this.memberID;
    }  
    
}

