/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaweek5;

/**
 *
 * @author Cristiano
 */
public class Bus 
{

    //atribute
    /*private Passenger[] seats;
    
    public Bus ()
    {
        seats = new Passenger[15];
    }
*/
    Passenger[] seats = new Passenger[15];
    
    
    //method
    public boolean addPassenger(Passenger passenger) {
        for( int i = 0; i < seats.length; i++)
        {
            if(seats[i]==null){
                seats[i]=passenger;
                return true;
            }
        }
        return false;
    }
    public boolean removePassenger(int id)
    {
        for( int i = 0; i < seats.length; i++)
        {
            if(seats[i] != null)
            {
                
                if(seats[i].getId() ==id)
                {
                    seats[i]= null;
                    return true;
                }
            }
        }
        return false;
    }
    
    
    public Passenger getPassenger(int id)
    {
        for( int i = 0; i < seats.length; i++)
        {
            if(seats[i] != null)
            {
                
                if(seats[i].getId() ==id)
                {
                    return seats[i];
                }
            }    
        }
        return null;
    }
    
    
            

}
