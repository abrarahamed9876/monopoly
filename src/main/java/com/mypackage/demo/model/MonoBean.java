/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mypackage.demo.model;

/**
 *
 * @author ABRAR AHAMED
 */
public class MonoBean {
    
    int cashPrizeA;
     int cashPrizeB;
     int dies1;
     int dies2;
     int roll;
     String won;

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public MonoBean(int cashPrizeA, int cashPrizeB, int dies1, int dies2, int roll, String won) {
        this.cashPrizeA = cashPrizeA;
        this.cashPrizeB = cashPrizeB;
        this.dies1 = dies1;
        this.dies2 = dies2;
        this.roll = roll;
        this.won = won;
    }

 

  
    public MonoBean() {
    }

    public String getWon() {
        return won;
    }

    public void setWon(String won) {
        this.won = won;
    }

 

   
    public int getCashPrizeA() {
        return cashPrizeA;
    }

    public void setCashPrizeA(int cashPrizeA) {
        this.cashPrizeA = cashPrizeA;
    }

    public int getCashPrizeB() {
        return cashPrizeB;
    }

    public void setCashPrizeB(int cashPrizeB) {
        this.cashPrizeB = cashPrizeB;
    }

    public int getDies1() {
        return dies1;
    }

    public void setDies1(int dies1) {
        this.dies1 = dies1;
    }

    public int getDies2() {
        return dies2;
    }

    public void setDies2(int dies2) {
        this.dies2 = dies2;
    }
    
     
     
    
}
