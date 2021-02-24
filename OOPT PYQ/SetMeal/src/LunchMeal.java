
public class LunchMeal extends SetMeal{
  private String additionalFood;

    public  LunchMeal(String additionalFood, String mealCode, String mealName, double mealPrice, String mealType) {
        super(mealCode, mealName, mealPrice, mealType);
        this.additionalFood = additionalFood;
    }

    public String toString(){
        return super.toString() + "\n"
                + "Additional Food: " + additionalFood;
    }

}