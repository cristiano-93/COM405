/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeweek1;

/**
 *
 * @author Cristiano
 */


public class HomeWeek1 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        System.out.println("Hello World");
        String name = "Cristiano";
        
        int age = 26;
        System.out.println("My name is " + name + "and i am " +age + " years old");
        boolean isBirthday = true;
        System.out.println("You are "+ age + " years old");
        
        if(isBirthday=true)
        {
            age++;
            System.out.println("YAY! Its your Birthday! you are now " + age + " years old");
        }
        if(age >= 18)
        {
            System.out.println("That means you are old enough to drink");
        }
        if(age > 20 && age < 30)
        {
            System.out.println("you are in 20s/30s club");
        }
        
        
        int speed = 127;
        int speedLimit = 120;
        
        
        
        
        if(speed>(speedLimit+10))
        {
            System.out.println("your speed is "+speed+" the limit is "+speedLimit+" you are going "+(speed-speedLimit)+" over the limit, you will get a ticket");
            
        }
        else if(speed<(speedLimit+10)&& speed>speedLimit)
        {
            System.out.println("Your speed is "+speed+" and the limit is "+speedLimit+". get a ticket");
        }
        else 
        {
            System.out.println("Continue to drive safely");
        }
        
    }
    
}
