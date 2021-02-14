public class CashRegister {
	private double cashOnHand;

  public CashRegister() {
    cashOnHand = 0.0;
  }

  public CashRegister(double cashOnHand){
   	this.cashOnHand = cashOnHand;
  }

  public double getCashOnHand(){
    return cashOnHand;
  }

  public void acceptAmount(double amount){
	  cashOnHand+=amount;
  }
}