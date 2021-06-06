
public class Bird extends Pet{
    private String sound;

    public Bird() {
    }

    public Bird(String sound, String regNo, String petType, String petName, String color, String size, String lifeSpan) {
        super(regNo, petType, petName, color, size, lifeSpan);
        this.sound = sound;
    }
    
    public String toString(){
        return super.toString() + "\n"
                + "Sound: " + sound;
    }
}
