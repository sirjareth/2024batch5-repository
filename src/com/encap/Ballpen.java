/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.encap;


public class Ballpen {
    private String brand;
    private float point;
    private int price;
    private String color;
    private String manufacturer = "China";
    
    
    
    // default constructor
    public Ballpen(){
        
    }
    
    // setter constructor
    public Ballpen(String brand, float point, int price){ // default constructor
        this.brand = brand;
        this.point = point;
        this.price = price;
        this.manufacturer = "China";
        
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
    
    public Ballpen(String brand, float point){
        this.brand = brand;
        this.point = point;
        
    }
    
    public Ballpen(float point, String brand){
        this.brand = brand;
        this.point = point;
        
    }
    

    
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getPoint() {
        return point;
    }

    public void setPoint(float point) {
        this.point = point;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    
    
    
    
    @Override
    public String toString() { // String representation of object
        return "Ballpen{" + "brand=" + brand + ", point=" + point + ", price=" + price + ", color=" + color + ", manufacturer=" + manufacturer + '}';
    }
    
    
    
    
}





