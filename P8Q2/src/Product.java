
public class Product {
  private int number;
  private String description;
  private double price;

  public Product() {
  }

  public Product(int number, String description, double price) {
    this.number = number;
    this.description = description;
    this.price = price;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return number + "  " + description + "  RM" + price;
  }



}
