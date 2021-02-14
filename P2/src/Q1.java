/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zixua
 */
public class Q1 {
        public static void sqrtNum(){
        final int NUM = 20;

        System.out.println("Number SquareRoot");
          for (int i = 0; i <= NUM; i+=2) {
            System.out.printf("%-5d\t%-5.4f\n", i, Math.sqrt((double)i));
          }
        }

    	public static void main(String args[]) {
        sqrtNum();
    }
}
