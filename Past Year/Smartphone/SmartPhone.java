
public class SmartPhone {
    private String brand;
    private String model;
    private String colour;
    private double price;
    private static int totalOfSmartPhone;

    public SmartPhone() {
        totalOfSmartPhone++;
    }

    public SmartPhone(String brand, String model, String colour, double price) {
        this.brand = brand;
        this.model = model;
        this.colour = colour;
        this.price = price;
        totalOfSmartPhone++;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static int getTotalOfSmartPhone() {
        return totalOfSmartPhone;
    }

    public static void setTotalOfSmartPhone(int totalOfSmartPhone) {
        SmartPhone.totalOfSmartPhone = totalOfSmartPhone;
    }
    
    public String toString(){
        return "Brand: " + brand + "\n" + 
                "Model: " + model + "\n" + 
                "Colour: " + colour + "\n" + 
                "Price: " + price;
    }
    
}
