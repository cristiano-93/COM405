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
public class Lorry extends Vehicle
{
    public Lorry (String regIn, double weightIn)
    {
        super(regIn, weightIn);
        
    }
    @Override
    public double calcFee()
    {
        double fee = 10;
        if(weight>8000)
        {
            return fee;
        }
        else if (weight<8000)
        {
            fee = 15;                    
        }
        return fee;
    }
}
