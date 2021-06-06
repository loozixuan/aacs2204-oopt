/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zixua
 */

class Test1 {
    static int i=2;
    int j=1;
    
    Test1(){
    i++;
    j+=i;
    }    
}

public class Q8 {
    public static void main(String[] args) {
       Test1 t1=new Test1();
        System.out.println("t1:i="+t1.i+"j="+t1.j);
        Test1 t2= new Test1();
        t1.i+=3;
        System.out.println("Test:i="+Test1.i);
    }

}
