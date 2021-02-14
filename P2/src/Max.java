/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zixuan
 */
public class Max {
    public static double printMax(int[] numbers){
        double largest = numbers[0];
        
        for(int i:numbers){
            if(i>largest)
                largest=i;
        
        }
    return largest;
    }
    
    public static void main(String[] args) {
         int []arr={1,2,3,4};
         System.out.println(printMax(arr));
    }

}
