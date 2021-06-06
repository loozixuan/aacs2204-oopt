public class FixedDepositAccount extends Account{  
    private int savingYears;

    public FixedDepositAccount(int accountNo, String accountHolderName, double accountBalance, double annualInterestRate,int savingYears) {
        super(accountNo, accountHolderName, accountBalance, annualInterestRate);
        this.savingYears = savingYears;
    }

    public int getSavingYears() {
        return savingYears;
    }

    public void setSavingYears(int savingYears) {
        this.savingYears = savingYears;
    }
    
    public double calculateInterest(){
        return super.calculateInterest()*savingYears;
    }

    public String toString() {
        return super.toString()+
                "savingYears: " + savingYears;
    }
    
    
    
}
