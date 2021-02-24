
public class VaseDriver {
    public static void main(String[] args) {
        Vase [] vaseArr= new Vase[]{new SquareVase(14,14,"S1122","Wilko Glass",55.00,25),
                                    new CylinderVase(15,"C1003","Rayware",99.99,60)};
        
        for(int i=0;i<vaseArr.length;i++){
            if(vaseArr[i] instanceof SquareVase){
                System.out.println("Square Vase\n===========");
            }else{
                System.out.println("\nCylinder Vase\n=============");
            }
            System.out.println(vaseArr[i].toString());
        }
    }
}
