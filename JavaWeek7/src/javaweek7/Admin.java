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
public class Admin extends Employee
{
    private Manager assignedManager;
    public Admin(String nameIn,int hrs, int hol, double payIn)
    {
        super(nameIn, hrs, hol, payIn);
    }
    @Override
    public double getYearlySalary()
    {
        return pay;
    }
    
    public Manager getManager()
    {
        return assignedManager;
    }
    
    public void setManager(Manager managerIn)
    {
        assignedManager=managerIn;
    }
    @Override
    public String getDetails()
    {
        String ret= super.getDetails();
        if(assignedManager!=null)
        {
            ret+=""+assignedManager.getName();
        }
        else
        {
            ret += " No manager assigned";
        }
        return ret;
    }
}
