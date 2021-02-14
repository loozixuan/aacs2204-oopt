import java.util.Scanner;

public class AccountDriver {
    
    public static void main(String[] args) {
        int selection=4;
        double amount;
        Scanner scan= new Scanner(System.in);
        CurrentsAccount cAcc= new CurrentsAccount("C0001",1000.00);
        CurrentsAccount cAcc2= new CurrentsAccount("C0001",1000.00);
        
        //testing only
        //System.out.println(cAcc.equals(cAcc2));
        
       do{
            System.out.print("Main menu\n"+
                    "1. Deposit\n"+
                    "2. Withdrawal\n"+
                    "3. Check Balance\n"+
                    "4. Account Details\n"+
                    "5. Quit\n"+
                    "Enter a choice: ");
            
            selection= scan.nextInt();
            switch(selection){
                case 1:
                    System.out.print("Enter amount of deposit: ");
                    amount=scan.nextDouble();
                    cAcc.deposit(amount);                    
                    break;  
                    
                case 2:
                    System.out.print("Enter amount of withdrawal: ");
                    amount=scan.nextDouble();
                    if(cAcc.withdrawal(amount)==true){           
//                        cAcc.increaseTransactionCount();
//                        
//                        if(cAcc.getTransactionCount() > CurrentsAccount.getFREE_TRANS_LIMIT()){
//                            System.out.println("Charges: "+ CurrentsAccount.getTRANS_CHARGES());
//                            cAcc.addCharges();
//                        }
                        System.out.println("Completed.");
                    }else{
                        System.out.println("Withdrawal failed.");
                    }        
                    break;                    
                case 3:
                    System.out.println("Your current balance is "+ cAcc.getBalance());
                    break;  
                case 4:
                    System.out.println(cAcc.toString());
                    break;
                default:
                    System.out.println("Terminating program...");
            }
        }while(selection >= 1 && selection <= 4);
        
    }
}
