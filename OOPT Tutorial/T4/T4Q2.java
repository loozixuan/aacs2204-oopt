/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zixua
 */
public class T4Q2 {
    int count;
    
    public void init(){
    count=1;
    }
    
    public int add(){
        count = count +1;
        return count;
    }
    
}

class Guess{
    public static void main(String[] args) {
       T4Q2 q= new T4Q2();
        q.init();
       
        System.out.println("Result: " +q.add() +q.add());
    }

}
