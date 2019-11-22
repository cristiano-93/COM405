/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaaweek4tasks;

/**
 *
 * @author Cristiano
 */
public class JavaAWeek4Tasks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Staff s1=new Staff("Harry");
        Staff s2=new Staff("Daisy");
        Table t1=new Table(1,5,true);
        Table t2=new Table(2,6,false);
        
        t1.assignStaffMember(s1);
        
        Booking b1=new Booking("Meh",5,false);
        
        if(t1.bookTable(b1))
        {
            System.out.println("Table Booked");
        }
        else
        {
                System.out.println("Table is not suitable");
        }
        
    }
    
}
