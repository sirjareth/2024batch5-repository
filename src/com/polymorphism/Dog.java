/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.polymorphism;


public class Dog extends Animal{
    
    
    @Override
    public void diet(){
        System.out.println("omnivore");
    }
    
    @Override
    public void eat(){
        System.out.println("crunch crunch...");
    }
    
    @Override
    public void walk(){
        System.out.println("sun walk....");
    }
    
}
