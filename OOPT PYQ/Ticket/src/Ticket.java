
public class Ticket {
    private String ticketId;
    private String park;
    private String ticketType;
    private double price;
    private static int totalNoOfTicket;

    public Ticket() {
        totalNoOfTicket++;
    }

    public Ticket(String ticketId, String park, String ticketType, double price) {
        this.ticketId = ticketId;
        this.park = park;
        this.ticketType = ticketType;
        this.price = price;
        totalNoOfTicket++;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public String getPark() {
        return park;
    }

    public void setPark(String park) {
        this.park = park;
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static int getTotalNoOfTicket() {
        return totalNoOfTicket;
    }

    public static void setTotalNoOfTicket(int totalNoOfTicket) {
        Ticket.totalNoOfTicket = totalNoOfTicket;
    }
    
    public String toString(){
        return "Ticket id: " + ticketId + "\n" +
                "Park: " + park + "\n" + 
                "Ticket type: " + ticketType + "\n" + 
                "Price: " + price;
    }
}
