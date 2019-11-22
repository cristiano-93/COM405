/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaweek8;

/**
 *
 * @author Cristiano
 */
public class Car {

    private String reg;
    private String colour;
    private String make;
    private String model;

    public Car(String regIn, String colourIn, String makeIn, String modelIn) {
        reg = regIn;
        colour = colourIn;
        make = makeIn;
        model = modelIn;
    }

    // getters
    public String getRegNo() {
        return reg;
    }

    public String getColor() {
        return colour;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }
    

}
