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
public class FrontLineStaff extends Employee
{
    public FrontLineStaff(String nameIn,int hrs, int hol, double payIn)
    {
        super(nameIn, hrs, hol, payIn);
    }
    
    @Override
    public double getYearlySalary()
    {
        return (pay * hours)*52;
    }
}
