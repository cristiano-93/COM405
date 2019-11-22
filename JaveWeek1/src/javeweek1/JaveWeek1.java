/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javeweek1;

/**
 *
 * @author Cristiano
 */
public class JaveWeek1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("My name is Cristiano");
        System.out.println("_______");
        System.out.println("| o o |");
        System.out.println("| --- |      < Hello!");
        System.out.println("-------- ");
        String name = "Cristiano";
        System.out.println(name);
        int age = 26;
        System.out.println("My name is " + name + " and i am " + age + " years old.");
        Boolean isBirthday = true;
        if (isBirthday == true) {
            System.out.println("You are " + age + " years old");
            if (isBirthday == true) {
                age = age + 1;
                System.out.println("YAY!! Its your Birthday! Now you are " + age + " years old");

            }
            if (age >= 18) {
                System.out.println("That means you are old enough to drink!");

            }
            if (age >= 20 && age < 40) {
                System.out.println("Your are in the 20s & 30s club");

            }

        }

        int speed = 140;
        int speedlimit = 120;

        if (speed >= speedlimit + 10)
        {
            System.out.println("You're speed is " 
                    + speed 
                    + ", the speed limit is " + speedlimit 
                    + ", you're speeding by " + (speed - speedlimit) 
                    + " and you will now face a ticket and a possible courts summon");

        }
        else if (speed <= speedlimit + 10)
        {
            System.out.println("You're speed is " + speed + " and the speed limit is "
                    + speedlimit + " and you will get a ticket");
            
        }
        else {
            System.out.println("Please continue to drive safely");

        }
        
        double price = 4;
        boolean isStudent = true;
        
        if(age < 3 || age >= 65)
        {
            System.out.println("free");
            
        }
        else if (isStudent && age <19)
        {
            System.out.println("You pay: £" + price/2);
           
        }
        else{
            System.out.println("You pay: £" + price);
        }
        
        int miles = 13;
        double value = 20;
        
        if (miles <= 10 && value > 100)
        {
            System.out.println("You pay: 0£");
            
        }
        else if (miles < 10)
        {
            System.out.println("You pay: 5£");
        }
        else if (miles < 20)
        {
            System.out.println("You pay: 10£");
            
        }
        else if (miles < 30)
        {
            System.out.println("You pay: 15£");
            
        }
        else 
        {
            double cost = (miles-30)*0.5+15;
            System.out.println("You pay: £" + cost);
        } 
            
// TODO code application logic here

    }

}
