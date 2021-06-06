
public class array {
    public static void main(String[] args) {
       int [] num = {1,2,3,4,5,6};
       double average = calculateAverage(num);
        System.out.println("Average is " + average);
    }
    
    public static double calculateAverage(int[] num){
        int sum=0;
        for(double number : num){
            sum+=number;
        }
      return (double)sum / num.length;
    }
}
