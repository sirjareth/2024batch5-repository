/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;


public class HashSetThurs {
    
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        
        set.add("value1");
        set.add("value2");
        set.add("value3");
        System.out.println(set);
        // unordered collection
    }
}


/*
    // creating LinkedHashSet using the Set    
        Set<String> data = new HashSet<>();     
        data.add("JavaTpoint");     
        data.add("Set");     
        data.add("Example");     
        data.add("Set");     
        System.out.println(data);


// LotoGenerator Using HashSet (no duplicates)

        HashSet<Integer> lottoNumbers = new HashSet<>();
        Random random = new Random();
        
        while(lottoNumbers.size() < 6){
            int randomNumbers = random.nextInt(58) + 1;
            lottoNumbers.add(randomNumbers);
        }
        System.out.print("Lotto Numbers: " + lottoNumbers);
*/