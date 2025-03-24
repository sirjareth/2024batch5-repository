/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.first_package;

// class: public / default
// variable / method: public, protected, default, private
public class B {

    protected String word = "Hello";
    
    protected void greet(){
        System.out.println(word);
    }
    
    
    void tryToAccess(){
        System.out.println(word);
        greet();
    }
    
    
    
    
    public static int id = 2024001;
    
    public static void getId(){
        B b = new B();
        b.greet();
        System.out.println(id);
    }
    
    
}
