/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author cunninghad
 */
public class Bridge 
{
    private int maxWeight;
    private Vehicle[] onBridge;
    
    public Bridge(int weight, int carLimit)
    {
        maxWeight = weight;
        onBridge = new Vehicle[carLimit];
    }
    
    public int calcWeight()
    {
        int totalWeight = 0;
        
        for(int i=0; i<onBridge.length; i++)
        {
            if(onBridge[i] != null)
            {
                totalWeight += onBridge[i].getWeight();
            }
        }
        return totalWeight;
    }
    
    public boolean addVehicle(Vehicle veh)
    {
        if(calcWeight() + veh.getWeight() <= maxWeight)
        {
            for(int i=0; i<onBridge.length; i++)
            {
                if(onBridge[i] == null)
                {
                    onBridge[i] = veh;
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean removeVehicle(String reg)
    {
        for(int i=0; i<onBridge.length; i++)
        {
            if(onBridge[i] != null)
            {
                if(onBridge[i].getReg().equals(reg))
                {
                    onBridge[i] = null;
                    return true;
                }
            }
        }
        return false;
    }
}
