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
public class Motorbike extends Vehicle
{
    public Motorbike (String regIn, double weightIn)
    {
        super(regIn, weightIn);
        
    }
    @Override
    public double calcFee()
    {
        double fee = 3;
        return fee;
    }
}
