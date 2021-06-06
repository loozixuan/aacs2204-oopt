/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zixua
 */
public class MethodDemo {
    
    public static int sum(int x, int y){
        return x+y;
    }
    
    public static double sum(double x, double y){
        return x+y;
    }
    
    public static double sum(double... x){
        double result = 0;
        
        for(double temp: x){
            result+=temp;
        }
        
        return result;
    }
    
    public static void chg(int x){
        x=100;
    }
   
    public static void main(String[] args) {
       
        
    }
    
}