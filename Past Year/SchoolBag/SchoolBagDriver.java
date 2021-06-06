
public class SchoolBagDriver {
    public static void main(String[] args) {
        SchoolBag bag1 = new SchoolBag();
        bag1.setId("B0234");
        bag1.setMaterial("Canvas");
        bag1.setVolume(35);
        bag1.setPrice(55.00);
        
        SchoolBag bag2 = new SchoolBag("B3278","Nylon",30,40.90);
        
        System.out.println(bag1.toString() + "\n");
        System.out.println(bag2.toString() + "\n");
        
        System.out.println("Total no of school bags: " + SchoolBag.getTotalNoOfSchoolBag());
        
    }
}
