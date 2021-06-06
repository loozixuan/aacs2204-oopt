
public class InvoiceLine {
  private Product product;
  private int quantity;
  private double price;

  public InvoiceLine() {
  }

  public InvoiceLine(Product product, int quantity, double price) {
    this.product = product;
    this.quantity = quantity;
    this.price = price;
  }

  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public double getLineTotal() {
    return quantity * price;
  }

  @Override
  public String toString() {
    return product.toString() + "  " + quantity;
  }

}
