/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lectureweek5;

/**
 *
 * @author Cristiano
 */
public class Deck 
{
    private Card[] cards;
    
    public Deck()
    {
        cards=new Card[52];
    }
    
    public boolean addCard(Card cardIn)
    {
        for(int i=0;i<cards.length;i++)
        {
            if(cards[i]==null)
            {
                cards[i] = cardIn;
                return true;
            }
        }
        return false;
    }
    
    public boolean removeCard(int number)
    {
        for(int i=0;i<cards.length;i++)
        {
            if(cards[i]!=null)
            {
               if(cards[i].getNumber()==number)
            {
                cards[i] =null;
                return true;
            }
            }
                
        }
        return false;
    }
    
   
    public String toString()
    {
        String ret="";
        
        for(int i=0;i<cards.length;i++)
        {
            if(cards[i]!=null)
            {
                ret += "Element "+ i +"holds card: "+cards[i].getNumber()+"/n";
                
            }
            else
            {
                ret += "Element "+i+" is empty";
               
            }
        } return ret;
        
    }
    
    
    
    
}
