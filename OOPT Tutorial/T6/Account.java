
public class Account {
    private int accountNo;
    private String accountHolderName;
    private double accountBalance;
    private double annualInterestRate;

    public Account(int accountNo, String accountHolderName, double accountBalance, double annualInterestRate) {
        this.accountNo = accountNo;
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    
    public void cashIn(double cash){
        this.accountBalance+=cash;
    }
    
    public void cashOut(double cash){
        this.accountBalance-=cash;
    }
    
    public double calculateInterest(){
        return (accountBalance*annualInterestRate);
    }

    public String toString() {
        return "AccountNo: " + accountNo + "\n"+
                "AccountHolderName :" + accountHolderName +"\n"+ 
                "AccountBalance: " + accountBalance + "\n";
    }
    
   
}
