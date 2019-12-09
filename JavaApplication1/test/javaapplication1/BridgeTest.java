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
import static org.junit.Assume.assumeTrue;

/**
 *
 * @author Cristiano
 */
public class BridgeTest {
    Bridge br;
    public BridgeTest() {
    }
       
    @Before
    public void setUp() {
         new Bridge(30000,20);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcWeight method, of class Bridge.
     */
    @Test
    public void testCalcWeight() 
    {
        
        assertEquals(0,br.calcWeight());
        
        assumeTrue(br.addVehicle(new Motorbike("asdf", 500)));
        assertEquals(500,br.calcWeight());
        
        
        
    }

    /**
     * Test of addVehicle method, of class Bridge.
     */
    @Test
    public void testAddVehicle() {
       Motorbike m = new Motorbike("asdf", 500);
       assertTrue(br.addVehicle(m));
       
       assertFalse(br.addVehicle(new Lorry("qwerty", 29501)));
       for(int i =0;i<19;i++)
       {
           assertTrue(br.addVehicle(new Motorbike("a"+ i,10)));
       }
       
       assertFalse(br.addVehicle(new Motorbike("qwty",10 )));
    }

    /**
     * Test of removeVehicle method, of class Bridge.
     */
    @Test
    public void testRemoveVehicle() {
        System.out.println("removeVehicle");
        String reg = "";
        Bridge instance = null;
        boolean expResult = false;
        boolean result = instance.removeVehicle(reg);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
