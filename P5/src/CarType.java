public class CarType {
    private String make;
    private String model;
    private double capacity;

    public CarType(String make, String model, double capacity) {
        this.make = make;
        this.model = model;
        this.capacity = capacity;
    }
    
    @Override
    public String toString(){
      return String.format("%-10s %-10s %-10.1f",make,model,capacity);
    }
}
