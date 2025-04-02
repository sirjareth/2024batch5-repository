/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.collections;

import java.util.ArrayList;


public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> firstFivePositiveEvenNumbers = new ArrayList<>();
        firstFivePositiveEvenNumbers.add(2);
        firstFivePositiveEvenNumbers.add(4);
        firstFivePositiveEvenNumbers.add(6);
        firstFivePositiveEvenNumbers.add(8);
        firstFivePositiveEvenNumbers.add(10);
        
        ArrayList<Integer> secondFivePositiveEvenNumbers = new ArrayList<>();
        secondFivePositiveEvenNumbers.add(12);
        secondFivePositiveEvenNumbers.add(14);
        secondFivePositiveEvenNumbers.add(16);
        secondFivePositiveEvenNumbers.add(18);
        secondFivePositiveEvenNumbers.add(20);
        
        
        ArrayList<Integer> firstTenPositiveEvenNumbers = new ArrayList<>(firstFivePositiveEvenNumbers);
        firstTenPositiveEvenNumbers.addAll(secondFivePositiveEvenNumbers);
        System.out.println(firstTenPositiveEvenNumbers);
        
        
        // create a collection from another collection
        
    }
}
