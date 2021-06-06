
import java.util.Calendar;
import java.util.Locale;

public class Invoice {
  private String invoiceNumber;
  private Calendar date;
  private Customer customer;
  private InvoiceLine[] lines;
  private int totalLines;
  private static int nextInvoiceNumber = 1;
  private final static String INVOICE_NUMBER_PREFIX = "INV";
  public final static int MAX_LINES = 10;

  public Invoice(Customer customer) {
    invoiceNumber = INVOICE_NUMBER_PREFIX + String.format("%04d", nextInvoiceNumber++);
    date = Calendar.getInstance();
    this.customer = customer;
    lines = new InvoiceLine[MAX_LINES];
    totalLines = 0;
  }

  public Calendar getDate() {
    return date;
  }

  public String getDateFormatted() {
    String dateStr = date.get(Calendar.DATE) + "-";
    dateStr += date.getDisplayName(Calendar.MONTH, Calendar.SHORT, Locale.ENGLISH);
    dateStr += "-" + date.get(Calendar.YEAR);
    return dateStr;
  }

  public String getInvoiceNumber() {
    return invoiceNumber;
  }

  public static int getNextInvoiceNumber() {
    return nextInvoiceNumber;
  }

  public Customer getCustomer() {
    return customer;
  }

  public int getTotalLines() {
    return totalLines;
  }

  public InvoiceLine[] getLines() {
    return lines;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  public void addLine(InvoiceLine line) {
    lines[totalLines++] = line;
  }

  public double getGrandTotal() {
    double total = 0.0;
    for (int i = 0; i < totalLines; ++i) {
      total += lines[i].getLineTotal();
    }
    return total;
  }
}
