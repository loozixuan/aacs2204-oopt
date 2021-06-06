
public class Treatment {
    private String id;
    private String name;
    private int duration;
    private double price;
    private static int totalNoOfTreatment;

    public Treatment() {
        totalNoOfTreatment++;
    }

    public Treatment(String id, String name, int duration, double price) {
        this.id = id;
        this.name = name;
        this.duration = duration;
        this.price = price;
        totalNoOfTreatment++;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static int getTotalNoOfTreatment() {
        return totalNoOfTreatment;
    }

    public static void setTotalNoOfTreatment(int totalNoOfTreatment) {
        Treatment.totalNoOfTreatment = totalNoOfTreatment;
    }
    
    public void display(){
        System.out.println("ID: " + this.id 
                + "\n" + "Name: " + this.name + "\n" + 
                "Duration: "+ this.duration + "\n"+ 
                "Price: "+ this.price);
    }
}
