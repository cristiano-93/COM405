/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaweek7;

/**
 *
 * @author Cristiano
 */
public class JavaWeek7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        Manager m = new Manager(" Bleh", 40, 30,60000,25);
        Admin a = new Admin("LALAla",40, 20, 25000 );        
        a.setManager(m);
        
        
        System.out.println(m.getDetails());
        System.out.println(a.getDetails());
      
        
    }
    
}