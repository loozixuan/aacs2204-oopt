
public class FlowerDriver {
    public static void main(String[] args) {
        Flower f1 = new Flower();
        
        f1.setId("F101");
        f1.setName("Rose");
        f1.setColor("Red");
        f1.setPricePerBouquet(169.99);
        
        Flower f2=new Flower("F102","Tulip","White",188.80);
        
        System.out.println("ID: " + f1.getId());
        System.out.println("Name: " + f1.getName());
        System.out.println("Color: " + f1.getColor());
        System.out.println("Price per bouquet: RM" + f1.getPricePerBouquet()+"\n");
        
        System.out.println("ID: " + f2.getId());
        System.out.println("Name: " + f2.getName());
        System.out.println("Color: " + f2.getColor());
        System.out.println("Price per bouquet: RM" + f2.getPricePerBouquet()+"\n");
        
        System.out.println("Total Of Flowers Type: " + Flower.getTotalOfFlowersType());
    }
}
