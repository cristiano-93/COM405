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
public class JavaWeek3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Car c1=new Car();
        Car c2=new Car();
        
        c1.setCurrentSpeed(100);
        c1.setMaxSpeed(150);
        c1.setFuelLevel(40);
        
        c2.setCurrentSpeed(80);
        c2.setMaxSpeed(200);
        c2.setFuelLevel(30);
        
        System.out.println("----Car 1----");
        System.out.println("Current Speed: "+ c1.getCurrentSpeed());
        System.out.println("Max Speed: "+ c1.getMaxSpeed());
        System.out.println("Fuel: "+c1.getFuelLevel());
        
        System.out.println("----Car 2----");
        System.out.println("Current Speed: "+c2.getCurrentSpeed());
        System.out.println("Max Speed: "+c2.getMaxSpeed());
        System.out.println("Fuel: "+c2.getFuelLevel());
        
        c1.accelerate(30);
        c2.brake(80);
        
        System.out.println("#####################");
        
        System.out.println("----Car 1----");
        System.out.println("Current Speed: "+ c1.getCurrentSpeed());
        System.out.println("Max Speed: "+ c1.getMaxSpeed());
        System.out.println("Fuel: "+c1.getFuelLevel());
        
        System.out.println("----Car 2----");
        System.out.println("Current Speed: "+c2.getCurrentSpeed());
        System.out.println("Max Speed: "+c2.getMaxSpeed());
        System.out.println("Fuel: "+c2.getFuelLevel());
        
        System.out.println("######################");
        
        /*
        Car c3=new Car();
        Car c4=new Car(100,160,60);
        
        System.out.println("----Car 3----");
        System.out.println("Current Speed: "+ c3.getCurrentSpeed());
        System.out.println("Max Speed: "+ c3.getMaxSpeed());
        System.out.println("Fuel: "+c3.getFuelLevel());
        
        System.out.println("----Car 4----");
        System.out.println("Current Speed: "+c4.getCurrentSpeed());
        System.out.println("Max Speed: "+c4.getMaxSpeed());
        System.out.println("Fuel: "+c4.getFuelLevel());
        */
        
        
    }        
}
