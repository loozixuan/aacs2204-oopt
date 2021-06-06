
public class DogDriver {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.setName("Tuffy");
        dog1.setBreed("papillon");
        dog1.setYearOfBirth(2017);
        dog1.setColor("white");
        
        Dog dog2 = new Dog("Kengken","chinook",2018,"brown");
        
        System.out.println(dog1.toString() + "\n");
        System.out.println(dog2.toString());
        System.out.println("\n" + Dog.getCountDog());
    }
  
    
}
