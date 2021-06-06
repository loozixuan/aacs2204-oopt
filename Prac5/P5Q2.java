import java.util.Scanner;

public class P5Q2 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        
        System.out.print("Enter a sting: ");
        String sentence= scan.nextLine();
        
        //convert to uppercase
        sentence = sentence.toUpperCase();
        
        //replace vowels to x
        sentence = sentence.replaceAll("A|E|I|O|U", "x");
        
        System.out.println("Modified sting: "+ sentence);
    }
}
