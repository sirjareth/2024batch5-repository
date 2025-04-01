/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abstraction;


public class SavingsAccount extends Account{
    String accountHolder;
    
    public SavingsAccount(String accountNumber, double balance, String accountHolder) {
        super(accountNumber, balance);
        this.accountHolder = accountHolder;
    }
    
}
