/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lectureweek4;

/**
 *
 * @author Cristiano
 */
public class Unit 
{
    private String name;
    private String id;
    private int numStudents;
    private boolean requiresComps;
    
    
    private Lecturer assignedLecturer;
    private Room assignedRoom;
    
    public Unit(String nameIn, String idIn, int numStudents, boolean requiresComps)
    {
        name=nameIn;
        id=idIn;
        numStudents=numStudents;
    }
    
    public boolean assignRoom(Room roomIn)
    {
        if(requiresComps)
        {
            if(numStudents <= roomIn.getNumComps())
            {
                assignedRoom=roomIn;
                return true;
            }
        }
        else 
        {
            if(numStudents<=roomIn.getCap())
            {
                assignedRoom=roomIn;
                return true;
            }
        }
        return false;
        
    }
    public void assignLecturer(Lecturer lec)
    {
        assignedLecturer = lec;
    }
    public String toString()
    {
        String ret = "Unit: "+name+" in room: ";
        if(assignedRoom !=null)
        {
            ret += assignedRoom.getName();
        }
        else{
            ret+="No room assigned";
        }
        return ret;
    }
    
}
