/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.encap;


/* How to achieve full encapsualated class:
    data hiding - making all the data members private
    data validation - setter and getter to set and get the data

    Constructor
*/


public class User {
    private int id; //2024001 
    private String firstName;
    private String lastName;
    private int age;
    private String userName;
    private String password;

    // Construtor
    
    
    // Mutator Method / Setter Method
    public void setId(int id){
        // private field = parameter;
        this.id = id;
    }
    
    //Accessor Method // Getter Method
    public int getId(){
        return id;
    }
    
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    
}


    
    
    // syntax
    
    // 2024001
    // this -> immediately refer to the object
    
    // conventional 
    // unconventional