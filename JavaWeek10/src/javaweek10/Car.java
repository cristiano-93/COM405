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
public class Car extends Vehicle {

    public Car(String regIn, double weightIn) {
        super(regIn, weightIn);

    }

    @Override
    public double calcFee() {
        double fee = 5;
        if (weight > 1590) {
            double excess = weight - 1590;
            fee = fee+ Math.round(excess /100) * 0.1;
        }
        return fee;
    }
}
