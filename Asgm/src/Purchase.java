public class Purchase {
    private String purchaseID;
    private Product []prodPurchased = new Product[100];
    private double discount;
    private double total;
    private int numberOfProduct;
    private static int numberOfPurchase;
    
    public Purchase(){
        
    }
    
    public Purchase(Product []prodPurchase, int numberOfProduct) {
        numberOfPurchase++;
        int id = 1000 + numberOfPurchase;
        this.purchaseID = "I" + Integer.toString(id);
        this.numberOfProduct = numberOfProduct;
        this.prodPurchased = prodPurchase;
        this.total = calculateTotal();
        
    }
    
    private double calculateTotal(){
        double total = 0;
        for (int i = 0; i < numberOfProduct; i++) {       
            total += (this.prodPurchased[i].getPrice() * this.prodPurchased[i].getQuantity());
        }
        return total;
    }

    public String getPurchaseID() {
        return purchaseID;
    }

    public Product[] getProdPurchased() {
        return prodPurchased;
    }

    public double getDiscount() {
        return discount;
    }

    public double getTotal() {
        return total;
    }

    public int getNumberOfProduct() {
        return numberOfProduct;
    }

    public static int getNumberOfPurchase() {
        return numberOfPurchase;
    }

    public void setProdPurchased(Product[] prodPurchased) {
        this.prodPurchased = prodPurchased;
        this.total = calculateTotal();
    }
    
    public void setDiscount(double total) {
        this.discount = total * Member.getDISCOUNT_RATE(total);
        this.total-=discount;
    }

    public void addProduct(String prodID, String prodName, int quantity, double price){
        prodPurchased[numberOfProduct] = new Product(prodName, quantity, price);
        numberOfProduct++;
    }

    public String toString() {
        return "Purchase ID : " + purchaseID + "\n" + 
               "numberOfProduct=" + numberOfProduct + "\n" +
               "Discount : " + discount + "Total : " + total + "\n";
    }
}