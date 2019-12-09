/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Cristiano
 */
public class CarTest {
    
    
    /**
     * Test of calcFee method, of class Car.
     */
    @Test
    public void testCalcFee() 
    {
        Car c = new Car ("asdf", 1590);
        assertEquals(5.0, c.calcFee(),0);
        
        c = new Car ("asdf", 1689);
        assertEquals(5.0, c.calcFee(),0);
              
    }
    
}
