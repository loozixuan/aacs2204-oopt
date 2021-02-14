
import java.util.Scanner;



public class VendingMachine {
	private CashRegister cashRegister;
  private Dispenser[] dispenserArr;
  private Scanner input = new Scanner(System.in);
  
  public VendingMachine(CashRegister cashRegister, Dispenser[] dispenserArr) {
  	this.cashRegister = cashRegister;
  	this.dispenserArr = dispenserArr;
  	operate();
  }
 private void operate() {
		int choice;
		
		do {
			displayMenu();
    	choice = input.nextInt();
    	
    	if (choice >= 1 && choice <= dispenserArr.length) {
    		if (dispenserArr[choice-1].soldOut()) {
    			System.out.println("This item is SOLD OUT.");
    		} else
    		sellProduct(choice);
    	}
    	else if (choice != 9)
    		System.out.println("Invalid input.");

		} while (choice != 9);

  }
public void displayMenu(){
  	String str = "\n=====Drink Vending Machine=====";
   	str += "\nEnter number (1 - 4) to select an item :-";
   	for (int i = 0; i < dispenserArr.length; ++i) {
   		str += "\n" + (i + 1) + " - " + dispenserArr[i].getDrink();
   		if (dispenserArr[i].soldOut())
   			str += " [SOLD OUT]";
   	}
   	str += "\n9 - Exit\nEnter selection: ";
   	System.out.print(str);
  }
public void sellProduct(int drinkSelection){
		Dispenser dispenser = dispenserArr[drinkSelection-1];

    double balanceAmount = dispenser.getPrice();
    double totalAmountEntered = 0;
   	while(balanceAmount > 0){
      System.out.printf("Please insert RM%.2f\nAmount tendered: ", balanceAmount);
 	    double amountEntered = input.nextDouble();
 	    totalAmountEntered += amountEntered;
 	    balanceAmount -= amountEntered;
    }
   	System.out.println();
  cashRegister.acceptAmount(totalAmountEntered);
    dispenser.makeSale();
    System.out.println("Collect your drink and enjoy...");
  }

}
