/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigment.pkg1;

import java.util.Date;

/**
 *
 * @author DELL
 */
public class Account {
    private int id ;
    private double balance ;
    private double annualInterestRate;
    private Date dataCreated;
    
    public Account(){
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dataCreated=new Date();
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
         dataCreated=new Date();
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDataCreated() {
        return dataCreated;
    }
    public double getMonthlyInterstedRate(){
        return (annualInterestRate/100/12);
    }
    public void withdraw(double withdrawbalane){
        if (withdrawbalane <= balance){
            balance -= withdrawbalane;
        }
    }
     public void deposit(double depositbalane){
         balance += depositbalane;
       
    }
    
    
    
}
