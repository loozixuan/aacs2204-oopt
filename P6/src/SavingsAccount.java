import java.util.Date;

public class SavingsAccount extends Account{    
    private final static double INTEREST_RATE=0.03;

    public SavingsAccount() {
    }

    public SavingsAccount(String accountNo, double balance) {
        super(accountNo, balance);
    }

    public static double getINTEREST_RATE() {
        return INTEREST_RATE;
    }

    public double calculateInterest(){
        return (super.getBalance()*INTEREST_RATE/12);
    }

   public void addInterest(){
       double interest =calculateInterest();
       deposit(interest);
   }
      
}
