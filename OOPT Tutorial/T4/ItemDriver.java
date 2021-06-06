/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zixuan
 */
public class ItemDriver {
   
    public static void main(String[] args) {
        Item item2 = new Item("Corn flakes");
        Item item3 = new Item(3.95);
        Item item4 = new Item("Corn flakes", 3.95);
        Item item1 = new Item();
      
        System.out.println(item2.getPrice());
    }
}
