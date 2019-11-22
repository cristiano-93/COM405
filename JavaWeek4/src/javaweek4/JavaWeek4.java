/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaweek4;

/**
 *
 * @author Cristiano
 */
public class JavaWeek4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Dog d1=new Dog("fido",16);
        Dog d2=new Dog ("puddles",30);
        
        d1.walk();
        d1.sleep();
        d1.chasePostman();
        
        d2.walk();
        d2.eat();
        
        System.out.println("-----Displaying Dog 1-----");
        System.out.println("Name: "+d1.getName());
        System.out.println("Weight: "+d1.getWeight());
        System.out.println("Energy: "+d1.getEnergy());
        System.out.println("Hunger: "+d1.getHunger());
        System.out.println("Been a good Dog? "+d1.getHasBeenGood());
        //problem with the missing get. in the hasbeengood getter
        
        System.out.println("-----Displaying Dog 2-----");
        System.out.println("Name: "+d2.getName());
        System.out.println("Weight: "+d2.getWeight());
        System.out.println("Energy: "+d2.getEnergy());
        System.out.println("Hunger: "+d2.getHunger());
        System.out.println("Been a good Dog? "+d2.getHasBeenGood());
        
    }
    
}
