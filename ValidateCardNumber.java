import java.util.Scanner;

public class ValidateCardNumber {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int sum1 = 0, sum2 =0;    
        
        System.out.println("Enter 8-digit Card Number :");
        String cardNo = scan.nextLine();
        
        for(int i=7 ; i>=0 ; i-=2){
            
            int temp = cardNo.charAt(i) - '0';
            sum1 += temp;
        }
        
        for(int i=6 ; i>=0 ; i-=2){
            
            int temp = cardNo.charAt(i) - '0';
           
            int doubling = temp * 2;
            
            if (doubling >= 10){
                
                int q = doubling / 10;
                int r = doubling % 10;
                sum2 += (q + r);
            }else{
                sum2 += doubling;
            }
        }
        
        if( (sum1+sum2)%10 == 0)
        {
            System.out.println("Valid number");    
        }else{
             System.out.println("Invalid Number");   
        }
    }
   
   
}
    

