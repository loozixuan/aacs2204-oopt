
public class TestSmartPhone {
    public static void main(String[] args) {
        SmartPhone s1 = new SmartPhone();
        
        s1.setBrand("Samsung");
        s1.setModel("SM-G532");
        s1.setColour("Gold");
        s1.setPrice(459.00);
        
        SmartPhone s2 = new SmartPhone("Xiaomi","5A","Gray",349.00);
         
        System.out.println(s1.toString() + "\n");
        System.out.println(s2.toString() + "\n");
        System.out.println("Total of Smart Phone: " + SmartPhone.getTotalOfSmartPhone());
    }
}
