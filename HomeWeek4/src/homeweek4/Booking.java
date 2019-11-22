/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeweek4;

/**
 *
 * @author Cristiano
 */
public class Booking 
{
    private String name;
    private int guests;
    private boolean isOutside;
    
    //constructor
    public Book(String nameIn,int guestsIn)
    {
        name = nameIn;
        guests = guestsIn;
        
    }
    
    //getters
    public String getName()
    {
        return name;
    }
    public int getGuests()
    {
        return guests;
    }
    
    
}
