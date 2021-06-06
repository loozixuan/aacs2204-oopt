
public class PetDriver {
    public static void main(String[] args) {
        Pet [] petArray = new Pet []{new Cat("Curious and affectionate","C0001","Cat","Tonkiness","Cream","Medium","Up to 16 years"),
                                    new Bird("Chatterer and whistler","B0001","Bird","Song Canary","Yellow","Small","Up to 10 years")};
        
        for(int i=0;i<petArray.length;i++){
            if(petArray[i] instanceof Cat){
                System.out.println("Cat Details\n************************************");
            }else{
                System.out.println("\nBird Details\n************************************");
            }
            
            System.out.println(petArray[i].toString());
        }
    }
}

