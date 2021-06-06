
import java.util.Scanner;

public class ProcessInvoice {
  private Product[] items;
  private Customer[] customers;
  private Scanner scn = new Scanner(System.in);
  
  private Product[] initializeProducts() {
    Product[] productArr = {new Product(1111, "Toaster", 90.00), 
                      new Product(2222, "Electric Iron", 120.00),
                      new Product(3333, "Air-conditioner", 1200.00),
                      new Product(4444, "Television", 3000.00)};
    return productArr;
  }
  
  private Customer[] initializeCustomers() {
    Customer[] customerArr = {new Customer("C72635", "Big Sdn. Bhd.", new Address("23 Jalan D9", 42100, "Selangor")),
                              new Customer("C58751", "Tiger Sdn. Bhd.", new Address("25 Jalan 12", 53000, "Kuala Lumpur"))};
    return customerArr;
  }
  
  public int selectCustomers() {
    System.out.println("\nCustomers:");
    for (int i = 0; i < customers.length; ++i) {
      System.out.printf("%-3s %-8s %-20s\n", (i+1)+".", customers[i].getId(), customers[i].getName());
    }
    System.out.print("Select customer [1.." + (customers.length) + "]: ");
    int choice = scn.nextInt();
    return choice-1;
  }
  
  public void enterInvoiceLines(Invoice invoice) {
    char anymore = 'Y';
    do {
      System.out.println("\nProducts");
      for (int i = 0; i < items.length; ++i) {
        System.out.printf("%-3s %-8d %-15s RM%8.2f\n", (i+1)+".", items[i].getNumber(), items[i].getDescription(), items[i].getPrice());
      }
      System.out.print("Enter product [1.." + items.length + "]: ");
      int selection = scn.nextInt()-1;
      System.out.print("Enter quantity: ");
      int quantity = scn.nextInt();

      invoice.addLine(new InvoiceLine(items[selection], quantity, items[selection].getPrice()));
      System.out.print("Anymore items (Y/N)? ");
      anymore = Character.toUpperCase(scn.next().charAt(0));
    } while (anymore == 'Y');
  }
  
  public Invoice enterSale() {
    System.out.println("\n\nProcess Sale");
    int customerIndex = selectCustomers();
    Invoice invoice = new Invoice(customers[customerIndex]);
    enterInvoiceLines(invoice);
    return invoice;
  }

  public static void drawLine() {
    for (int i = 0; i < 71; ++i)
      System.out.print("-");
    System.out.println();
  }

  public static void displayHeader() {
    System.out.printf("%-10s %-20s %-8s %-15s %-15s\n", "Product No", "Description", "Qty", "Unit Price(RM)", "Line Total(RM)");
  }
  
  public static void generateInvoice(Invoice inv) {
    System.out.printf("\n\n%40s\n", "INVOICE");
    System.out.printf("%45s %-12s %s\n", " ", "Invoice No:", inv.getInvoiceNumber());
    System.out.printf("%45s %-12s %s\n", " ", "Date:", inv.getDateFormatted());
    System.out.printf("%-45s %-12s %s\n", "BILL TO: ", "Cust. ID: ", inv.getCustomer().getId());
    System.out.println("\t" + inv.getCustomer().getName() + inv.getCustomer().getAddress());
    drawLine();
    displayHeader();
    InvoiceLine[] lines = inv.getLines();
    for (int i = 0; i < inv.getTotalLines(); ++i) {
      Product item = lines[i].getProduct();
      System.out.printf("%-10d %-21s %-8d %12.2f %15.2f\n", item.getNumber(), item.getDescription(),
              lines[i].getQuantity(), lines[i].getPrice(), lines[i].getLineTotal());
    }
    drawLine();
    System.out.printf("%-61s RM%-14.2f\n", "Grand Total: ", inv.getGrandTotal());
  }

  public ProcessInvoice() {
    items = initializeProducts();
    customers = initializeCustomers();
    for (int i = 0; i < 3; ++i) {
      Invoice inv = enterSale();
      generateInvoice(inv);
    }
  }


  public static void main(String[] args) {
    new ProcessInvoice();
  }
}
