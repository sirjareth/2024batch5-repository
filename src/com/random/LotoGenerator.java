/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.random;

import java.util.Random;


public class LotoGenerator {

    public static void main(String[] args) {
        Random random = new Random();

        int[] lottoNum = new int[6]; // container of generated lotto numbers
        //              4
        for (int i = 0; i < lottoNum.length; i++) {
            lottoNum[i] = (random.nextInt(58) + 1); //54
            
            // check for duplicates
            //              4   4
            for (int j = 0; j < i; j++) {
                //    // 44           44     
                if(lottoNum[i] == lottoNum[j]){
                    System.out.println(i + " : " + lottoNum[i] + " == " + j + " : " + lottoNum[j]);
                    i--; // i = 3
                }
            }
        }
        System.out.println("Lotto Numbers:");
        for (int i = 0; i < lottoNum.length; i++) {
            System.out.println(i + 1 + " : " + lottoNum[i]);
        }
        
        
    }
}
