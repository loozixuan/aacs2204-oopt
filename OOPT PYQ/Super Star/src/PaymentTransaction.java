public class PaymentTransaction implements Discount{
	private double totalPurchase;

	public double calTotalDisc(){
		return this.totalPurchase * DISCOUNT_RATE;
	}
}
