
public class HardwareDriver {
    public static void main(String[] args) {
        Hardware [] hardware = new Hardware [] {new Monitor("LED",27,"MR0011","ACER",859.00),
                                            new Monitor("Gaming Mouse", 58000,"MS0012","FANTECH X9",42.50)};
        
        for(int i=0;i<hardware.length;i++){
           if(hardware[i] instanceof Monitor){
               System.out.println("\nMonitor\n=======");
           }else{
                System.out.println("\nMouse\n=====");
           }
           
            System.out.println(hardware[i].toString());
        }
    }


}

