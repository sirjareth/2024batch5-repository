/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.methods;

public class Variable {
    
    static int num2 = 20; // static variable
    int num3 = 30; // instance variable
    
    
    public static void main(String[] args) {
        int num = 10; // local variable
        System.out.println(num2);
        
        Variable variable = new Variable();
        System.out.println(variable.num3);
        
    }
}
