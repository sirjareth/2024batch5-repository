/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inheritance;

// DRY 
public class Car extends Vehicle{
    String color = "black";
    
    public static void main(String[] args) {
        Car car = new Car();
        car.run(); 
    }
    
}
