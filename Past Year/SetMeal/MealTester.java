
public class MealTester {
    public static void main(String[] args) {
        SetMeal[] mealArr = new SetMeal[] {new LunchMeal("Mushroom Soup","L0001","Nasi Lemak",6.5,"Lunch"),
                            new DinnerMeal(5.0,"D0001","Pattaya Fried Rice",5.90,"Dinner")};
    
        for(int i=0;i<mealArr.length;i++){
            if(mealArr[i] instanceof LunchMeal){
                System.out.println("Lunch Meal Details\n*************************************************");
            }else{
                System.out.println("\nDinner Meal Details\n*************************************************");
            }
            
            System.out.println(mealArr[i].toString());
        }
    }

}
