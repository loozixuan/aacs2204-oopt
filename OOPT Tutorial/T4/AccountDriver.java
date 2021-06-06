import java.util.Scanner;

public class AccountDriver {
    public static void main(String[] args) {
        Account acc1= new Account(909,"Ali Baba",1000);
        Account.setAnnualInterestRate(0.1);
        Scanner scan= new Scanner(System.in);
        int choice;
    
    do{
        System.out.println("Main menu\n1 : Check Balance\n2 : Cash In\n3 : Cash Out\n4 : Interest\n5 : Exit\nEnter a choice:");
        choice=scan.nextInt();
        
        switch(choice){
            case 1:
                System.out.println(acc1.getBalance());break;
            case 2:
                System.out.println("Enter the amount of cash In");
                acc1.cashIn(scan.nextDouble());
                System.out.println("New Balance: "+ acc1.getBalance());
                break;
            case 3:
                System.out.println("Enter the amount of cash Out");
                acc1.cashOut(scan.nextDouble());
                System.out.println("New Balance: "+ acc1.getBalance());
                break;
            case 4:
                System.out.println("Your interest amount is "+ acc1.calculateInterest());
                break;
            case 5:
                System.exit(0);break;
        }
        System.out.print("\n");
    }while(choice!=5);  
    }    
}
