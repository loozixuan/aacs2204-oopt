
public abstract class SetMeal {
    protected String mealCode;
    protected String mealName;
    protected double mealPrice;
    protected String mealType;

    public SetMeal() {
    }

    public SetMeal(String mealCode, String mealName, double mealPrice, String mealType) {
        this.mealCode = mealCode;
        this.mealName = mealName;
        this.mealPrice = mealPrice;
        this.mealType = mealType;
    }
    
    public String toString(){
        return "Meal Code: " + mealCode + 
                "\n" + "Meal Name: " + mealName +
                "\n" + "Meal Price: RM " + mealPrice  +
                "\n" + "Meal Type: " + mealType;
    }
 }
