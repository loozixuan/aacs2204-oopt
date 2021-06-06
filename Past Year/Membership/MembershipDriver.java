
public class MembershipDriver {
    public static void main(String[] args) {
        Membership [] member = new Membership[2];
        
        member[0] = new Membership("Premium","Available",185);
        member[1] = new Membership("Sunrise","None",140);
        
        for(int i=0;i<2;i++){
            System.out.println(member[i].toString() + "\n");
        }
    }
}
