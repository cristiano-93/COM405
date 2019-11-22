/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise4;

/**
 *
 * @author Cristiano
 */
public class Exercise4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
         for (int row=1; row<=3; row++)
         {
             for(int i=1;i<=5;i++)
             {
                 if(i==row+1)
                 {
                     System.out.print(" ");
                 }
                 else 
                 {
                     System.out.print("*");
                 }
             }
             System.out.println();
         }

        
    }

}
