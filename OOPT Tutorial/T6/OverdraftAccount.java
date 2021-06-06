
public class OverdraftAccount extends Account{
    private String accountType;
    private double overdraftLimit;
    private double overdraftInterestRate;

    public OverdraftAccount(int accountNo, String accountHolderName, double accountBalance, double annualInterestRate,String accountType) {
        super(accountNo, accountHolderName, accountBalance, annualInterestRate);
        this.accountType = accountType;
	switch(accountType){
            case "Premium":
                overdraftLimit = 10000;
                overdraftInterestRate = 0.05;
                break;
            case "Gold":
                overdraftLimit = 5000;
                overdraftInterestRate = 0.065;
                break;    
            case "Silver":
                overdraftLimit = 2000;
                overdraftInterestRate = 0.1;
                break;    
        }
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftInterestRate() {
        return overdraftInterestRate;
    }

    public void setOverdraftInterestRate(double overdraftInterestRate) {
        this.overdraftInterestRate = overdraftInterestRate;
    }
    
    public void cashOut(double cash){
        if (super.getAccountBalance()-cash < -(this.overdraftLimit)) {
            System.out.println("Exceed overdraft limit");
        }else{
         super.cashOut(cash);
         System.out.println("Transaction completed");
        }
    } 
    public double calculateInterest(){
        if(super.getAccountBalance()>=0)
         return super.calculateInterest();
        else
          return super.getAccountBalance()*overdraftInterestRate;
    }
    
    public String toString() {
        return super.toString()+
                "AccountType :" + accountType + "\n"+
                "OverdraftLimit :" + overdraftLimit +"\n"+
                "OverdraftInterestRate :" + 
                overdraftInterestRate ;
    }
    
    
}
