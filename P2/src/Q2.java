/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zixua
 */
public class Q2 {
    
    public static double sqrt(double x){
        double lLimit=0, uLimit=0;
        double midPoint=0;
        double sMid=0;
        
        if(x<0){
            System.out.println("Error: Invalid number");
            System.exit(-1);
        }else if(x==1 || x==0){
            return x;
        }else if(x>1){
            lLimit= 1;
            uLimit= x;
        }else if(x<1){
            lLimit = x;
            uLimit =1;
        }
        
        while( Math.abs ((lLimit-uLimit)/lLimit )>=1.0e-8) {
             midPoint=(lLimit+uLimit) / 2;
             sMid=midPoint*midPoint;
              if(sMid>x){
                uLimit=midPoint;
              }else{
                lLimit=midPoint;
            }
       }
        
        return (lLimit+uLimit)/2;
    }
    
    public static void main(String[] args){
        System.out.println("Number \t SquareRoot");
        for(int i=0;i<=20;i+=2)
        System.out.printf("%d \t %.4f\n",i, sqrt(i));
    }
    
}
