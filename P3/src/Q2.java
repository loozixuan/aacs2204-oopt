
public class Q2 {
    
    public static int smallestIndex(int[]lists){
        int smallestIndex=0;
       
        
        for(int i=0;i<lists.length;i++){
            if(lists[smallestIndex]>lists[i]){
                smallestIndex=i;
            }         
        }
    return smallestIndex;
    }
    
    public static void main(String[] args) {
        int [] lists={1,-22,4,5,10,100,2,-22};
        
        System.out.println("Smallest Index is " + smallestIndex(lists));
    }
    
}
