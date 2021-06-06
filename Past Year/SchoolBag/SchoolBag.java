
public class SchoolBag {
    private String id;
    private String material;
    private int volume;
    private double price;
    private static int totalNoOfSchoolBag;

    public SchoolBag() {
        totalNoOfSchoolBag++;
    }

    public SchoolBag(String id, String material, int volume, double price) {
        this.id = id;
        this.material = material;
        this.volume = volume;
        this.price = price;
        totalNoOfSchoolBag++;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static int getTotalNoOfSchoolBag() {
        return totalNoOfSchoolBag;
    }

    public static void setTotalNoOfSchoolBag(int totalNoOfSchoolBag) {
        SchoolBag.totalNoOfSchoolBag = totalNoOfSchoolBag;
    }
    
    public String toString(){
        return "ID" + id + "\n"
                + "Material: " + material + "\n"
                + "Volume: " + volume + "\n" + 
                "Price: " + price;
    }
}
