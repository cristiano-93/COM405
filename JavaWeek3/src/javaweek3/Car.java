/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaweek3;

/**
 *
 * @author Cristiano
 */
public class Car {

    //Atributes
    private int currentSpeed;
    private int maxSpeed;
    private int fuelLevel;

    //Constructors
    public Car() {
        currentSpeed = 130;
        maxSpeed = 150;
        fuelLevel = 40;
    }

    public Car(int currentSpeedIn, int maxSpeedIn, int fuelLevelIn) {
        currentSpeed = currentSpeedIn;
        maxSpeed = maxSpeedIn;
        fuelLevel = fuelLevelIn;
    }

    //Getters
    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    //Setters
    public void setCurrentSpeed(int currentSpeedIn) {
        currentSpeed = currentSpeedIn;
    }

    public void setMaxSpeed(int maxSpeedIn) {
        maxSpeed = maxSpeedIn;
    }

    public void setFuelLevel(int fuelLevelIn) {
        fuelLevel = fuelLevelIn;
    }

    //Methods
    public void accelerate(int changeBy) {

        if (currentSpeed + changeBy <= maxSpeed) {
            currentSpeed = currentSpeed + changeBy;
            fuelLevel = fuelLevel - 2;

        } else {
            System.out.println("If you want to go faster, get a better car");
        }

    }

    public void brake(int changeBy) {
        
        if(currentSpeed-changeBy>=0){
            currentSpeed = currentSpeed - changeBy;
        }
        
        else{
            System.out.println("Can't go slower than 0");
        }
    }

    public void refuel() {
        fuelLevel = 100;
    }

}
