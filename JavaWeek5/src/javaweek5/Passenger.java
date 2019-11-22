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
public class Passenger 
{
    private String name;
    private int age;
    private double farePaid;
    private int id;
    
    public Passenger(int idIn, String nameIn, int ageIn, double fare)
    {
        id=idIn;
        name=nameIn;
        age=ageIn;
        farePaid=fare;
    }
    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()

    {
        return age;
    }
    public double getFarePaid()
    {
        return farePaid;
    }
    
    
    
    
}
