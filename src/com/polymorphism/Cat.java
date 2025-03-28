/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.polymorphism;


public class Cat extends Animal{
    
    
   @Override
   public void walk(){
       System.out.println("moon walk...");
   }
   

    @Override
    public void diet() {
        System.out.println("herbivore");
    }

    @Override
    public void eat() {
        System.out.println("munch munch..");
    }
    
   
    
}
 


/*
     static final double PI = 3.14; // static constant

    
    public final static void main(String[] args) {
 
    }
    
    // static, private, final -> 
    
    // this -> refer immediate class object
    // super -> refer immediate parent object
    
    // non - access modifiers -> static, final, abstract
    // access modifiers -> public, protected, default, private
*/