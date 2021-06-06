import java.util.Scanner; 

public class count {
    public static int countLetter(String str, char ch){
        int count=0;
        
        //ignore sensitive case(1)
        /*str=str.toLowerCase();
        ch= Character.toLowerCase(ch);*/
        
        /* (2)-->convert char into string by adding ""
        if(str.charAt(i)+"").equalsIgnoreCase(ch+"")
        */
        for(int i=0; i<str.length();i++){
            if(Character.toUpperCase(str.charAt(i))==Character.toUpperCase(ch)){
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
       Scanner scan= new Scanner(System.in);
       
       System.out.print("Enter a word: ");
       String word = scan.nextLine();
       
       System.out.print("Enter the letter you want to count: ");
       char letter= scan.nextLine().charAt(0);
       
       int countLetter = countLetter(word,letter);
       System.out.println(word + " contains " + countLetter + letter);
       
    }
    
}
