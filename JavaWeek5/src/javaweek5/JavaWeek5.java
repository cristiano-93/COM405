/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaweek5;

/**
 *
 * @author Cristiano
 */
public class JavaWeek5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
     
        //create bus object
        Bus b1 = new Bus();
        
        /*if(b1.addPassenger(new Passenger(1,"meh",25,5.00)))
        {
            System.out.println("Passenger boarded");
        }
        else
        {
            System.out.println("Bus is full");
        }
        
        
        if(b1.removePassenger(3))
            {
                System.out.println("Byee");
            }
        else
            {
                System.out.println("Passenger not found");
            }
        */
        b1.addPassenger(new Passenger(2,"beh",60,5.00));
        b1.addPassenger(new Passenger(3,"lalala",30,5.00));
        Passenger pass = b1.getPassenger(3);
        if(pass!=null)
        {
            System.out.println("Name: "+pass.getName());
            System.out.println("Age: "+pass.getAge());
         
        }
        else
        {
            System.out.println("No passenger found");
        }
        
        
        
    }
        
       
        
        
        
        

}
