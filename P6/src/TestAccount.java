public class TestAccount {
    public static void main(String[] args) {

    CurrentsAccount cAcc= new CurrentsAccount("C0001",1000.00);
    
    cAcc.addCharges();
    System.out.println("Balance: "+ cAcc.getBalance());
   
    SavingsAccount sAcc= new SavingsAccount("S001",100);
    sAcc.deposit(100);
    System.out.println(sAcc.calculateInterest());
    sAcc.addInterest();
    System.out.println("Balance: "+ sAcc.getBalance());
    
}
    
}
