
import java.util.Date;

public class CurrentsAccount extends Account{
    private final static double TRANS_CHARGES=0.50;
    private final static int FREE_TRANS_LIMIT=3;
    
    private int transactionCount;

    public CurrentsAccount() {
    }

    public CurrentsAccount(int transactionCount) {
        this.transactionCount = transactionCount;
    }

    public CurrentsAccount(String accountNo, double balance) {
        super(accountNo, balance);
    }
    
    private void resetTransactionCount(){
        transactionCount = 0;
    }
    
    //getter for view only, cannot change!!!
    public static double getTRANS_CHARGES() {
        return TRANS_CHARGES;
    }

    public static int getFREE_TRANS_LIMIT() {
        return FREE_TRANS_LIMIT;
    }

    public int getTransactionCount() {
        return transactionCount;
    }      
    
    public void increaseTransactionCount(){
        transactionCount++;
    }
    
    public void addCharges(){
        super.withdrawal(TRANS_CHARGES);
    }
    
    //override another class must be same parameter and data type!!!
    //different implementation with parent class
    public boolean withdrawal(double amount){
        if( super.withdrawal(amount)){
            increaseTransactionCount();
            if(transactionCount>FREE_TRANS_LIMIT){
                addCharges();
                System.out.println("Charges: "+ CurrentsAccount.getTRANS_CHARGES());
            }
            return true;
        }else{
            return false;
        }     
    }

    public void deposit(double amount){
        super.deposit(amount);
        increaseTransactionCount();
        if(transactionCount>FREE_TRANS_LIMIT){
                addCharges();
                System.out.println("Charges: "+ CurrentsAccount.getTRANS_CHARGES());
        }
    }
    
    public String toString(){
        return super.toString() + "\n"+ "transactionCount: "+ transactionCount;
    }
}
