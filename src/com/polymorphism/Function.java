/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.polymorphism;

// jump()
// Method Overloading
public class Function {
    
    public static void main(String[] args) {
        Function f = new Function();
        f.jump(10);
        
        
    }
    

    public void jump(int noOfJump){
        System.out.println(noOfJump);
    }
    
    public void jump(Integer noOfJump){
        System.out.println(noOfJump);
    }
    
    
    public void jump(){
        
    }
    
    public void jump(String style){
        System.out.println(style);
    }
    
    public void jump(String style, int noOfJump){
        
    }
    
    
    public void jump(int noOfJump, int animation){
        
    }
    
    
    public void jump(int noOfJump, String animation, int roll){
        
    }
    
    public void jump(int noOfJump, String roll, String animation){
        
    }
    
    public void jump(int noOfJump, int roll, String animation, double flip){
        
    }
    
}
