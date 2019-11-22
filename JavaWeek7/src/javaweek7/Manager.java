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
public class Manager extends Employee
{
    private int bonus;
    public Manager(String nameIn,int hrs, int hol, double payIn, int bonusIn)
    {
        super(nameIn, hrs, hol, payIn);
        bonus = bonusIn;
    }
    
    @Override
    public double getYearlySalary()
    {
        double extra = (bonus * pay)/100;
        return pay+extra;
    }
    public int getBonus()
    {
        return bonus;
    }
    public boolean setBonus(int bonusIn)
    {
        if(bonusIn>=0 && bonusIn <=100)
        {
            bonus = bonusIn;
            return true;
        }
        return false;
    }
    
}
