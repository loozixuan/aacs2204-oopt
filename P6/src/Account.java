import java.util.Date;
public class Account {
    private String accountNo;
    private double balance;
    private Date dateCreated;

    public Account() {
        this.dateCreated = new Date();
    }

    public Account(String accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
        this.dateCreated = new Date();
    }
       
    public String getAccountNo() {
        return accountNo;
    }

    public double getBalance() {
        return balance;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void deposit(double amount){
         this.balance+=amount;
    }
    
    public boolean withdrawal(double amount){    
        if(this.balance < amount){
            return false;
        }else{
             this.balance-=amount;
             return true;
        }
    }

    public String toString() {
        return "AccountNo= " + accountNo + "\n" +
                "Balance= " + balance + "\n" +
                "DateCreated= " + dateCreated ;
    }
    
    public boolean equals(Object obj){
        //casting, change Object data type to Account data type
        Account temp = (Account)obj;
        
        if(temp.getAccountNo().equals(accountNo)&& temp.getBalance()==(this.balance)){
            return true;
        }else{
            return false;
        }
    }
    
    
}
