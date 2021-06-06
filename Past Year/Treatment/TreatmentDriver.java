
public class TreatmentDriver {
    public static void main(String[] args) {
        Treatment t1 = new Treatment();
        t1.setId("T304");
        t1.setName("Thai Massage");
        t1.setDuration(45);
        t1.setPrice(120.00);
         
        Treatment t2 = new Treatment("T520","Body Scrub",20,50.00);
         
        t1.display();
        System.out.println("");
        
        t2.display();
        System.out.println("");
        
        System.out.println("Total no of treatment: " + Treatment.getTotalNoOfTreatment());
    }
    
}
