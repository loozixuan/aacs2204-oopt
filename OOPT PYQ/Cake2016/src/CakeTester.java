
public class CakeTester {
    public static void main(String[] args) {
        Cake c1 = new Cake();
        c1.setCode("C0885");
        c1.setFlavor("Chocolate");
        c1.setShape("Square");
        c1.setPrice(45.00);
        
        Cake c2 = new Cake("C0886","Vanilla","Round",48.00);
        
        System.out.println("Code: " + c1.getCode());
        System.out.println("Flavor: " + c1.getFlavor());
        System.out.println("Shape: " + c1.getShape());
        System.out.println("Price: " + c1.getPrice()+"\n");
        
        System.out.println("Code: " +c2.getCode());
        System.out.println("Flavor: " +c2.getFlavor());
        System.out.println("Shape: " +c2.getShape());
        System.out.println("Price: " + c2.getPrice()+"\n");
        
        System.out.println("Total of cakes: " + Cake.getTotalOfCakes());
    }
}
