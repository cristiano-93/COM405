/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaweek4;

/**
 *
 * @author Cristiano
 */
public class Heart 
{
    //atributes
    private int bpm;
    private int restingRate;
    
    //constructor
    public Heart(int restingRateIn)
    {
        restingRate=restingRateIn;
        bpm=restingRateIn;
    }
    
    //methods
    public boolean increaseBPM(int increaseRate)
    {
        if(bpm<restingRate+100)
        {
            bpm=bpm+increaseRate;
            return true;
        }
        return false;
    }
    public void rest()
    {
        bpm=restingRate;
    }
    //why do some use the void and others dont?
    public int BPM()
    {
        return bpm;
    }
    
}
