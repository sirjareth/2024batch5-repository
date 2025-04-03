/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.collections;

import java.util.LinkedList;
import java.util.Random;

public class LotoGeneratorUsingList {
    public static void main(String[] args) {
        LinkedList<Integer> lottoNumbers = new LinkedList<>();
        Random random = new Random();
        
        while(lottoNumbers.size() < 6){
            int randomNumbers = random.nextInt(58) + 1;
            
            if(!lottoNumbers.contains(randomNumbers))
                lottoNumbers.add(randomNumbers);
            
        }
        
        System.out.print("Lotto Numbers: " + lottoNumbers);

    }
}
