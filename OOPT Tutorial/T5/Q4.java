
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zixua
 */

public class Q4 {
    Scanner scan= new Scanner(System.in);
    public static boolean nameValidation(String name){
        //!=-1 means founds empty space in the name variable
        if(name.indexOf(" ") != -1 || name.length()<6){
            return false;
        }else{
           return true;
        }
    
    }
    public static void main(String[] args) {
        String name="John123";
        
        System.out.println(nameValidation(name));
    }
}
