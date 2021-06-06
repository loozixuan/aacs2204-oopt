/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zixuan
 */
public class Question {
    private int no1;
    int no2;
    
    public void Question(int a,int b){
        no1=a;
        no2=b;
    }
    
    public int sum(){
       return no1+no2;
    }
}
