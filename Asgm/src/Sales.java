public class Sales{
    
    
    private Product []prodSales = new Product[100];
    private double []subtotal=new double[100];
    private double totalAmount;
    private int noOfProduct=0;

    public Sales() {
    }

   public Sales(Product []prodSales){
       this.prodSales=prodSales;
   }


    public Product[] getProdSales() {
        return prodSales;
    }

    public int getNoOfProduct() {
        noOfProduct=Product.getNumProd();
        return noOfProduct;
    }

    public double[] getSubtotal() {

        return subtotal;
    }
    
    public double getTotalAmount() {
     
        return totalAmount;
    }
    
    public double [] calculateSubtotal(){
        for(int i=0;i<noOfProduct;i++){
            subtotal[i]=prodSales[i].getPrice()*prodSales[i].getUpdateProductSales();
        }
        return subtotal;
    }

  
    
    public double calculateTotalAmount(){
         for(int i=0;i<noOfProduct;i++){
            totalAmount+=subtotal[i];
        }
        return totalAmount;
    }
    
   public String toString(){
       return "Number of Product:"+noOfProduct+"\n"+
              "Total Amount:"+totalAmount;
   }
    

    
}
