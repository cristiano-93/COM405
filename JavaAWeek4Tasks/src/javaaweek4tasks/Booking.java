
package javaaweek4tasks;
/**
 *
 * @author Cristiano
 */
public class Booking 
{
    //
    private String name;
    private int seats;
    private boolean isOutside;
    
    public Booking(String nameIn,int seatsIn,boolean outside)
    {
        name=nameIn;
        seats=seatsIn;
        isOutside=outside;
    }

    

    public String getName() 
    {
        return name;
    }

    public int getSeats() 
    {
        return seats;
    }    

    public boolean isOutside() 
    {
        return isOutside;
    }

    
    
}
