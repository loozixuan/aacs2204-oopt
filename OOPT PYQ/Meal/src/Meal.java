
public class Meal {
    private String code;
    private double price;
    private static int countMeal;

    public Meal() {
        countMeal++;
    }

    public Meal(String code, double price) {
        this.code = code;
        this.price = price;
        countMeal++;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static int getCountMeal() {
        return countMeal;
    }

    public static void setCountMeal(int countMeal) {
        Meal.countMeal = countMeal;
    }
    
   public String toString(){
       return "Code: " + code + "\n" + 
               "Price: RM "  + price;
   } 
}
