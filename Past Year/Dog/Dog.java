
public class Dog {
    private String name;
    private String breed;
    private int yearOfBirth;
    private String color;
    private static int countDog;

    public Dog() {
        countDog++;
    }

    public Dog(String name, String breed, int yearOfBirth, String color) {
        this.name = name;
        this.breed = breed;
        this.yearOfBirth = yearOfBirth;
        this.color = color;
        countDog++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static int getCountDog() {
        return countDog;
    }

    public static void setCountDog(int countDog) {
        Dog.countDog = countDog;
    }
    
    
    public String toString(){
        return "Name: " + name + "\n" + 
                "Breed: " + breed + "\n" + 
                "yearOfBirth: " + yearOfBirth + "\n" + 
                "colour: " + color;
    }
   
}
