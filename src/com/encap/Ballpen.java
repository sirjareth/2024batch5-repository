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
    
    // default construtor
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
    
}



class Printer {
    public static void main(String[] args) {
        Ballpen ballpen = new Ballpen("HBW", 0.5f, 15);
        
    }
}

