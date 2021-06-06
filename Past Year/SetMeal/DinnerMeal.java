
public class DinnerMeal extends SetMeal{
    private double mealDiscount;

    public DinnerMeal(double mealDiscount, String mealCode, String mealName, double mealPrice, String mealType) {
        super(mealCode, mealName, mealPrice, mealType);
        this.mealDiscount = mealDiscount;
    }
    
     public String toString(){
        return super.toString() + "\n"
                + "Discount: " + mealDiscount + "%";
    }
}
