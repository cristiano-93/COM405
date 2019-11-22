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
    public class Dog {
        //atributes
    private String name;
    private int weight;
    private int energy;
    private int hunger;
    private boolean isGood;
    private Heart heart;

    //constructor
    public Dog(String nameIn,int weightIn)
    {
        name=nameIn;
        weight=weightIn;
        energy=100;
        hunger=50;
        isGood=true;
        heart =new Heart (60);
    }
    
    
    //methods
    public void chasePostman()
    {
        System.out.println("Bark! Bark! Bark!GRRRRRR!!!");
        energy--;
        hunger--;
        //if he chased the postman and got less hungry, did he took a bite of the postman?
        weight--;
        isGood=false;
    }
    public void walk()
    {
        weight--;
        energy--;
        heart.increaseBPM(5);
    }
    public void sleep()
    {
        energy=100;
        hunger--;
        heart.rest();
    }
    public void eat()
    {
        hunger=100;
        weight++;
    }
    
    //getters
    public String getName()
    {
        return name;
    }
    public int getWeight()
    {
        return weight;
    }
    public int getEnergy()
    {
        return energy;
    }
    public int getHunger()
    {
        return hunger;
    }
    public boolean getHasBeenGood()
    {
        return isGood;
    }
    

    

}
