/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zixuan
 */
public class Item {
    private String description;
    private double price;
    
    public Item(String description, double price) {
        this.description = description;
        this.price = price;
    }

    public Item(String description) {
          this.description = description;
          this.price = 0.0;
    }

    public Item(double price) {
        this.price = price;
        this.description ="";
    }

    
    public Item() {
       this.description ="";
       this.price = 0.0;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    

}
