
public abstract class Pet {
    protected String regNo;
    protected String petType;
    protected String petName;
    protected String color;
    protected String size;
    protected String lifeSpan;

    public Pet() {
    }

    public Pet(String regNo, String petType, String petName, String color, String size, String lifeSpan) {
        this.regNo = regNo;
        this.petType = petType;
        this.petName = petName;
        this.color = color;
        this.size = size;
        this.lifeSpan = lifeSpan;
    }
    
    public String toString(){
        return "Registered Number: " + regNo
                +"\n" + "Pet Type: " + petType
                +"\n" + "Pet Name: " + petName
                +"\n" + "Pet Coloue: " + color
                +"\n" + "Pet Size" + size
                +"\n" + "Life Span" + lifeSpan;
    }
    
}
