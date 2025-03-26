/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.encap;


public class Ballpen {
    String brand;
    float point;
    int price;
    String color;
    String manufacturer = "China";
    

    // default constructor
    public Ballpen(){
        
    }
    
    // setter constructor
    public Ballpen(String brand, float point, int price){ // default constructor
        this.brand = brand;
        this.point = point;
        this.price = price;
        
        System.out.println("This Ballpen is created." );
        System.out.println("Brand : " + brand);
        System.out.println("Point: " + point);
        System.out.println("Price: " + price);
    }
    
    
    
    public Ballpen(String brand, float point, int price, String color, String manufacturer){
        this.brand = brand;
        this.point = point;
        this.price = price;
        this.color = color;
    }
    
    

    @Override
    public String toString() { // String representation of object
        return "Ballpen{" + "brand=" + brand + ", point=" + point + ", price=" + price + ", color=" + color + ", manufacturer=" + manufacturer + '}';
    }
    
    
    
    
}





