/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CarsInACarpark;

/**
 *
 * @author Darren
 */
public class Carpark {
    private Car[] spaces;
    
    public Carpark()
    {
        spaces = new Car[15];
    }
    
    public boolean addCar(Car carIn)
    {
        for(int i=0; i<spaces.length; i++)
        {
            if(spaces[i] == null)
            {
                spaces[i] = carIn;
                return true;
            }
        }
        return false;
    }
    
    public boolean removeCar(String reg)
    {
        for(int i=0; i<spaces.length; i++)
        {
            if(spaces[i] != null)
            {
                if(spaces[i].getReg().equals(reg))
                {
                    spaces[i] = null;
                    return true;
                }
            }
        }
        return false;
    }
    
    public int calcEmptySpaces()
    {
        int tally = 0;
        for(int i=0; i<spaces.length; i++)
        {
            if(spaces[i] == null)
            {
                tally++;
            }
        }
        return tally;
    }
}
