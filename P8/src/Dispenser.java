public class Dispenser {
	private String drink;
  private int quantity;
  private double price;

  public Dispenser() {
  }

  public Dispenser(String drink, int quantity, double price){
  	this.drink = drink;
   	this.quantity = quantity;
   	this.price = price;
  }
  
  public String getDrink() {
  	return drink;
  }

  public int getQuantity(){
    return quantity;
  }

  public double getPrice(){
   	return price;
  }
  
  public boolean soldOut() {
  	return quantity == 0;
  }

public boolean makeSale(){
  	if (quantity > 0) {
  		quantity--;
  		return true;
  	}
   	return false;
  }


}
