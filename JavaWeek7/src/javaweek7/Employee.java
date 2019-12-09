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
public abstract class Employee 
{
    protected String name;
    protected int hours, holiday;
    protected double pay;
    
    public Employee(String nameIn,int hoursIn, int holidayIn, double payIn)
    {
        name=nameIn;
        hours=hoursIn;
        holiday=holidayIn;
        pay=payIn;
        
    }
    
    public void setPay(double payIn)
    {
        pay=payIn;
    }
    
    public boolean setHours(int hrs)
    {
        if(hrs >= 0 && hrs <=40)
        {
            hours=hrs;
            return true; 
        }
        return false;
    }
    
    public abstract double getYearlySalary();    
    
    public boolean bookHoliday(int numDays)
    {
        if(holiday-numDays >=0 && numDays >0)
        {
            return true;            
        }
        return false;
    }
    public String getDetails()
    {
        String ret=name+""+holiday+""+getYearlySalary();
        return ret;
    }
    public String getName()
    {
        return name;
    }
}
