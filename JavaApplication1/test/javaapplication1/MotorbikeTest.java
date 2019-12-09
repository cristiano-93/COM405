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
public class MotorbikeTest {
    
    public MotorbikeTest() {
    }
    
    /**
     * Test of calcFee method, of class Motorbike.
     */
    @Test
    public void testCalcFee() {
        Motorbike m = new Motorbike("asdf", 500);
        assertEquals(3.0, m.calcFee(),0);
    }
    
}
