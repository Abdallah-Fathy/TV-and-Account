/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assigment.pkg1;

/**
 *
 * @author DELL
 */
public class Assigment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Account a1 =new Account(1122,20000);
        a1.setAnnualInterestRate(4.5);
        a1.withdraw(2500);
        a1.deposit(3000);
        System.out.println("Balance equal " + a1.getBalance());
        System.out.println("Monthly Interested equal" + a1.getMonthlyInterstedRate());
        System.out.println("Date Created is " + a1.getDataCreated());  
    }
    
}
