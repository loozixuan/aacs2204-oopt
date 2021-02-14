import java.util.Scanner;

public class BankFundTransfer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[]denominations={100,50,20,10,5,1};
        int[]qty= new int[denominations.length];
        int[]value = new int [denominations.length];
        int grandTotal=0;
        
        System.out.println("Denomination(RM)\tQuantity");
        for(int i=0;i<denominations.length;i++){
            System.out.printf("%10d\t\t   ",denominations[i]);
            qty[i]= scan.nextInt();
            value[i]=denominations[i]*qty[i];
        }
      
        
        grandTotal=findGrandTotal(value);
        
        System.out.println("\n\nFinal Output\n============");
        System.out.println("Denomination(RM)\tQuantity\tValue (RM)");
        for(int i=0;i<denominations.length;i++){
            //non-zero quantities won't be show in this final output
            if(qty[i]>0)
                System.out.printf("%14d\t%15d\t%15d\n",denominations[i],qty[i],value[i]);
        }
        System.out.println("Total = RM"+grandTotal);
    }
    
    public static int findGrandTotal(int[]value){
        int grandTotal=0;
        for(int i=0;i<value.length;i++){
            grandTotal+=value[i];
        }
        return grandTotal;
    } 
}