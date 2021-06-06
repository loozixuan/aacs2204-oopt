
public class MealDriver {
    public static void main(String[] args) {
        Meal m1 = new Meal();
        m1.setCode("M101");
        m1.setPrice(5.8);
        
        Meal m2= new Meal("M102",10.5);
        
        System.out.println(m1.toString() + "\n");
        System.out.println(m2.toString());
        System.out.println("\nTotal Meal: " + Meal.getCountMeal());
    }
}
