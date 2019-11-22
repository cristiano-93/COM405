package javaaweek4tasks;

/**
 *
 * @author Cristiano
 */
public class Table {

    //atributes
    private int number;
    private int seats;
    private boolean isOutside;
    private Staff assignStaff;
    private Booking assignBooking;

    //constructor
    public Table(int numberIn, int seatsIn, boolean outside) 
    {
        number = numberIn;
        seats = seatsIn;
        isOutside = outside;
        
    }
    //methods
    public void assignStaffMember(Staff staffIn) 
    {
        assignStaff = staffIn;
    }
    
    public boolean bookTable(Booking bookIn)
    {
        if(assignBooking ==null)
        {
           int difference=seats-bookIn.getSeats();
            if(difference >=0 && difference <3 && isOutside==bookIn.isOutside())
            {
                assignBooking = bookIn;
                return true;
            } 
        }
        
        return false;
    }
    public void clearBooking()
    {
        assignBooking=null;
    }
    
    
    
    //how to add a staff member and not a specific person
    
    //getters

    public int getNumber() {
        return number;
    }

    public int getSeats() {
        return seats;
    }

    public boolean isOutside() {
        return isOutside;
    }

    public Staff getAssignStaff() {
        return assignStaff;
    }

    public Booking getAssignBooking() {
        return assignBooking;
    }
}
