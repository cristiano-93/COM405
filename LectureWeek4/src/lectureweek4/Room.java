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
public class Room 
{
    private String name;
    private int cap;
    private int numComps;
    
    public Room(String nameIn,int capIn, int numCompsIn)
    {
        name = nameIn;
        cap=capIn;
        numComps=numCompsIn;
    }
    
    public String getName()
    {
        return name;
    }
    public int getCap()
    {
        return cap;
    }
    public int getNumComps()
    {
        return numComps;
    }
    
}
