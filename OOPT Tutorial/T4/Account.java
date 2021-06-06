public class Account {
    private int accountNo;
    private String accountHolderName;
    private double balance;
    static int accountCount;
    private static double annualInterestRate;

    public Account(int accountNo, String accountHolderName, double balance) {
        this.accountNo = accountNo;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        accountCount++;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public static int getAccountCount() {
        return accountCount;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate;
    }
    
    public void cashIn(double cash){
        this.balance+=cash; 
    }
    
    public void cashOut(double cash){
        this.balance-=cash; 
    }
    
    public double calculateInterest(){
        return(this.balance * Account.annualInterestRate);    
    }
}
