/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.encap;


public class Employee {
    
    private int id;
    private String fullName;
    private String address;
    private String deparment;
    
    public Employee(){
        
    }

    public Employee(int id, String fullName, String address, String deparment) {
        this.id = id;
        this.fullName = fullName;
        this.address = address;
        this.deparment = deparment;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDeparment() {
        return deparment;
    }

    public void setDeparment(String deparment) {
        this.deparment = deparment;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", fullName=" + fullName + ", address=" + address + ", deparment=" + deparment + '}';
    }
    
    
    
    
    
    
    
    
}
