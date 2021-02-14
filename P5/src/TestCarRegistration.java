import java.util.Scanner;

public class TestCarRegistration {
    public static void main(String[] args) {
        
        //todo:: By using array, create 3 CarType objects
        CarType[] types={new CarType("Toyota","Vios",1.5),
            new CarType("Nissan","Teana",2.0),
            new CarType("Honda","City",1.6)};
        
  	//todo:: create an array that will able to store 6 registrations
        Registration[] registration = new Registration[1];
         
  	Scanner scanner = new Scanner(System.in);
  	
  	for (int i = 0; i < registration.length ; ++i) {

  		System.out.println("\nRegistration number: " + Registration.getCount());
  		
                //todo:: request and read the owner detail
                System.out.print("Enter the owner name : ");
                String name = scanner.nextLine();
                System.out.print("Enter the IC Number : ");
                String icNo = scanner.nextLine();
                              
                //construct owner object
                Owner owner =new Owner(name,icNo);
                
  		//todo:: request and read car detail
                System.out.print("Enter the Plate No : ");
                String plateNo = scanner.nextLine();
                System.out.print("Enter the color : ");
                String color = scanner.nextLine();
                System.out.print("Enter year : ");
                int year = scanner.nextInt();
                
  		System.out.println("\nCar Types: ");
  		//todo:: display all available carType
                for(int j=0;j<types.length;j++){
                    System.out.printf("%d %s\n",j+1,types[j].toString());
                }
                		
                System.out.print("\nSelect car type [1.." + types.length + "]: ");
  		int selection = scanner.nextInt();
  		
                //todo:: get cartype from array (based on selection)
                //NOTES: index start from 0 so selection should minus 1
                Car car = new Car(plateNo, color, year, types[selection-1] );
                
                //todo:: register the car
              	registration[i]= new Registration(owner,car);  
                     
  		scanner.nextLine();
  	}
  
  	//todo:: display all registration detail
       displayListing(registration);
  }
  
  public static void displayListing(Registration[] regArr) {
  	System.out.printf("\n\n%50s\n", "Car Registration Listing");
  	System.out.printf("%-6s %-12s %-12s %-10s %-8s %-6s %-10s %-10s %5s\n", 
  		"Reg No", "Name", "IC No.", "Plate No", "Color", "Year", "Make", "Model", "Capacity");
  	for (int i = 0; i < regArr.length; ++i) 
  		System.out.println(regArr[i]);
  }
}