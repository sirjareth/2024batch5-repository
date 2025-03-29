/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abstraction;


public class Motor implements Vehicle{

    @Override
    public void startEngine() {
        System.out.println("Alisin ang side stand bago i start.");
    }

    @Override
    public void displayColor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public void breakMethod(){
        
    }
    
}
