/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zixuan DIAG2
 */
public class UnitConverter {
    public static double inchToCentimeter(double in) {
        return in*2.54;     
    }
    
    public static double centimeterToInch(double cm){
        return cm/2.54;
    }
    
    public static void main(String[] args) {
        System.out.println("Inches\tCentimerters\t\tCentimeters\tInches");
        for(double i=1.0;i<=10.0;i++){
            System.out.printf("%5.1f\t%5.2f\t\t\t%5.1f\t\t%5.2f\n",i,inchToCentimeter(i),(i*5),centimeterToInch(i*5));
        }
    }


}
