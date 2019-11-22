/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaweek6;

/**
 *
 * @author Cristiano
 */
public class CarPark 
{
      private Car[] spaces;
      
      public CarPark()
      {
          spaces = new Car[5];
      }
      
      public boolean addCar(Car carIn)
      {
          for(int i=0;i<spaces.length;i++)
          {
              if(spaces[i]==null)
              {
                  spaces[i]=carIn;
                  return true;
              }
          }
          return false;
      }
      public boolean removeCar(String reg)
      {
          for(int i=0;i<spaces.length;i++)
          {
              if(spaces[i]!=null)
              {
                  if(spaces[i].getRegNo().equals(reg))
                  {
                      spaces[i]=null;
                      return true;
                  }
              }
          }
          return false;
      }
      public int getFreeSpaces()
      {
          int tally = 0;
          for(int i=0;i<spaces.length;i++)
          {
              if(spaces[i]==null)
              {
                  tally++;
              }
          }
          return tally;
      }
    
}
