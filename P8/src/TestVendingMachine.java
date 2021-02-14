public class TestVendingMachine {
	
	public static void initialize() {
		CashRegister cashRegister = new CashRegister(500.00);
  	Dispenser cola = new Dispenser("Coca-Cola", 5, 2.00);
		Dispenser sprite = new Dispenser("Sprite", 1, 1.50);
		Dispenser grape = new Dispenser("Grape", 100, 1.80);
		Dispenser orange = new Dispenser("Orange", 10, 2.00);
		Dispenser[] dispenserArr = {cola, sprite, grape, orange};
		VendingMachine vendingMachine = new VendingMachine(cashRegister, dispenserArr);
	}
	
  public static void main(String[] args) {
    initialize();
  }
}