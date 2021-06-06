
public class Cat extends Pet{
    private String temperament;

    public Cat() {
    }

    public Cat(String temperament, String regNo, String petType, String petName, String color, String size, String lifeSpan) {
        super(regNo, petType, petName, color, size, lifeSpan);
        this.temperament = temperament;
    }
    
    public String toString(){
        return super.toString() + "\n"
                + "Temperament: " + temperament;
    }
}
