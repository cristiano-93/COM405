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
public class LorryTest {
    
    public LorryTest()
    {
        
    }    
    

    /**
     * Test of calcFee method, of class Lorry.
     */
    @Test
    public void testCalcFee() 
    {
        Lorry l = new Lorry("asdf", 8000);
        
        assertEquals(10.0, l.calcFee(), 0);
        
        l = new Lorry("asdf", 8001);
        assertEquals(15.0, l.calcFee(), 0);
      
    }
    
}
