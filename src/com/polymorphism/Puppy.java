/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.polymorphism;


public class Puppy extends Dog{
    String name = "Puppy";
    
    public void name(){
        System.out.println();
    }
    
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.name();
    }
}
