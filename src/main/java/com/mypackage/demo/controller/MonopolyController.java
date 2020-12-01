package com.mypackage.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mypackage.demo.model.MonoBean;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/monopoly")
public class MonopolyController {
    int cashPrizeA;
     int cashPrizeB;
     int dies1;
     int dies2;
     int roll;
     String won;
    
    
    
    //get method
    @GetMapping("/create-game")
    public ResponseEntity<MonoBean> restartGame() {
        System.out.println("--------------Game is restarted");
        this.cashPrizeA=0;
        this.cashPrizeB=0;
        this.dies1=0;
        this.dies2=0;
        this.roll=0;
        this.won=null;
        MonoBean m=new MonoBean(0,0,0,0,0,"GAME RESTARTED");
       
        
        
        return new ResponseEntity<>(m, HttpStatus.OK);
    }
    
    @GetMapping("/roll-die-p1")
    public ResponseEntity<MonoBean> playerAPlay() {
     
        dies1=(int)(Math.random()*6)+1;
        dies2=(int)(Math.random()*6)+1;
        roll=dies1+dies2;
        System.out.println("--------------player A is playing");
        int prize=roll*10;
        cashPrizeA=cashPrizeA+prize;
        
        
       MonoBean m=new MonoBean(cashPrizeA,cashPrizeB,dies1,dies2,roll,"PLAYER A GOT AMOUNT "+prize);
       
       if (cashPrizeA>500){
          m=new MonoBean(cashPrizeA,cashPrizeB,dies1,dies2,roll,"PLAYER A  WIN THE MATCH WITH SCORE "+cashPrizeA);
          this.cashPrizeA=0;
        this.cashPrizeB=0;
        this.dies1=0;
        this.dies2=0;
        this.roll=0;
        this.won=null;
       }
       
        return new ResponseEntity<>(m, HttpStatus.OK);
    }
    
    @GetMapping("/roll-die-p2")
    public ResponseEntity<MonoBean> playerBplay() {
         dies1=(int)(Math.random()*6)+1;
        dies2=(int)(Math.random()*6)+1;
         roll=dies1+dies2;
        System.out.println("--------------player B is playing");
        int prize=roll*10;
        cashPrizeB=cashPrizeB+prize;
       MonoBean m=new MonoBean(cashPrizeA,cashPrizeB,dies1,dies2,roll,"PLAYER B GOT AMOUNT "+prize);
        if (cashPrizeB>500){
         m=new MonoBean(cashPrizeA,cashPrizeB,dies1,dies2,roll,"PLAYER B WON THE MATCH WITH SCORE "+cashPrizeB);
          this.cashPrizeA=0;
        this.cashPrizeB=0;
        this.dies1=0;
        this.dies2=0;
        this.roll=0;
        this.won=null;
        }
        return new ResponseEntity<>(m, HttpStatus.OK);
    }
    
   
    
}