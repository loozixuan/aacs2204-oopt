
public class PlanDriver {
    public static void main(String[] args) {
        DataPlan [] planArr = new DataPlan[]{new PostPaidPlan(200,1000,"POS089","Hallp Moments",15,78),
                                            new PrepaidPlan(7,"PRE153","Smart Traveler",3,28.00)};
        
        for(int i=0; i< planArr.length ; i++){
            if(planArr[i] instanceof PostPaidPlan){
                System.out.println("Postpaid Plan");
            }else{
                System.out.println("\nPrepaid Plan");
            }
            System.out.println(planArr[i].toString());
        }   
    }
}
