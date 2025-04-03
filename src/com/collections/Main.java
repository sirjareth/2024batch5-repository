/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.collections;

import java.util.ArrayList;


public class Main {
    
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
//        Employee employee1 = new Employee(2024001, "Jonathan", 39, 50000);
//        Employee employee2 = new Employee(2024002, "Kenneth", 38, 60000);
//        Employee employee3 = new Employee(2024003, "Oscar", 37, 70000);
        
        employees.add(new Employee(2024001, "Jonathan", 39, 50000));
        employees.add(new Employee(2024002, "Kenneth", 38, 60000));
        employees.add(new Employee(2024003, "Oscar", 37, 70000));
        
        employees.forEach(System.out::println);
    }
}
