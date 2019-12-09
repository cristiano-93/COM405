/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaweek10;

/**
 *
 * @author Cristiano
 */
public abstract class Vehicle 
{
    protected String regNumber;
    protected double weight;
    
    public Vehicle (String regIn, double weightIn)
    {
        regNumber = regIn;
        weight = weightIn;
        
    }
    public String getReg()
    {
        return regNumber;
    }
    public double getWeight()
    {
        return weight;
    }
    public abstract double calcFee();
    
}
