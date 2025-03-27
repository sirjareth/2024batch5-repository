/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.polymorphism;


public class Cat extends Animal{
    // default protected public
    
    @Override
    public void eat(){
        System.out.println("Munch munch....");
    }
    
  
    void eat(String food){
    
    }
    
}

// static, private, final