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
public class Bridge {

    private int maxWeight;    
    private Vehicle[] vehiclesInBridge;
    
    public Bridge(int weight, int carLimit)
    {
        maxWeight = weight;
        vehiclesInBridge = new Vehicle[carLimit];
        
    }

    public double calcTotal() {
        double total = 0;
        for (int i = 0; i < vehiclesInBridge.length; i++) {
            if(vehiclesInBridge [i]!= null){
                total = total + vehiclesInBridge[i].getWeight();
            }
                
        }
        return total;
    }

    public boolean addVehicle(Vehicle vehicleIn) {
        if(calcTotal()+vehicleIn.getWeight()<maxWeight){
            for (int i = 0; i < vehiclesInBridge.length; i++) {
                if(vehiclesInBridge [i]== null){
                    vehiclesInBridge[i]=vehicleIn;
                    return true;
                }
            }
        }
        return false;
    }
    public boolean removeVehicle(String reg)
    {
        for (int i = 0; i < vehiclesInBridge.length; i++) {
            if(vehiclesInBridge [i]!= null){
                if(vehiclesInBridge[i].getReg().equals(reg)){
                    vehiclesInBridge[i]=null;
                    return true;
                }
            }
        }
        return false;
    }
}
