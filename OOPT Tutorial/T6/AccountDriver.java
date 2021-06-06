
public class AccountDriver {
    public static void main(String[] args) {
    OverdraftAccount acc1 = new OverdraftAccount(123, "Adam", 1000.00, 0.02, "Premium");
    OverdraftAccount acc2 = new OverdraftAccount(124, "Brian", 30.00,0.02, "Gold");
    OverdraftAccount acc3 = new OverdraftAccount(125, "Christian", -100.00,0.02, "Silver");
    FixedDepositAccount acc4=new FixedDepositAccount(126, "David", 100, 0.02, 3);
    
    System.out.println(acc1.toString());
    System.out.println("");
    System.out.println(acc2.toString());
    System.out.println("");
    System.out.println(acc3.toString());
    System.out.println("");
    System.out.println(acc4.toString());
    }

}
