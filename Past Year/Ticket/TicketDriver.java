
public class TicketDriver {
    public static void main(String[] args) {
        Ticket t1 = new Ticket();
        t1.setTicketId("P01C");
        t1.setPark("Water Park");
        t1.setTicketType("Children");
        t1.setPrice(20.00);
        
        Ticket t2 = new Ticket("P02A","Adventure Park","Adult",45.00);
        
        System.out.println(t1.toString() + "\n");
        System.out.println(t2.toString() + "\n");
        
        System.out.println("Total no of tickets: " + Ticket.getTotalNoOfTicket());
    }
}
