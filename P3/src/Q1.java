import java.util.Scanner;

public class Q1 {
    
    public static double countAverage(int[] numbers){
        int sum=0;
        for(int i=0;i<numbers.length;i++){
           sum+=numbers[i];
        }
        return (double)sum/ numbers.length;
    }
    
    public static int aboveOrEqualAverage(int[] numbers, double average){
         int bAverage=0;
         for(int i=0;i<numbers.length;i++){
            if(numbers[i]>=average)
              bAverage++;      
         }
    return bAverage;
    }
    
    public static int belowAverage(int[] numbers, double average){
         int aAverage=0;
         for(int i=0;i<numbers.length;i++){
            if(numbers[i]<average)
              aAverage++;      
         }
    return aAverage;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double average;
        int bAverage=0,aAverage=0;
        System.out.print("Enter number of quiz scores to process:");
        int numQuiz = scan.nextInt();
        
        int [] numbers= new int[numQuiz];  
        for(int i = 0; i< numQuiz; i++){
            System.out.printf("Score %d: ",i+1);
            numbers[i] = scan.nextInt();
        }
        
        average = countAverage(numbers);
        bAverage = aboveOrEqualAverage(numbers,average);
        aAverage = belowAverage(numbers,average);
        
        System.out.println("\nResults\n=======");
        System.out.printf("Average : %5.2f\n",average);
        System.out.println("Numbers of scores above or equal to the average is "+ bAverage);
        System.out.println("Numbers of scores below the avearage is "+ aAverage);
    }
    
    
    
}
