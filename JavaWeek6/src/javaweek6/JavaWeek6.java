/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaweek6;

import java.util.Scanner;

/**
 *
 * @author Cristiano
 */
public class JavaWeek6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        CarPark cp=new CarPark();
        
        int state=1;
        Scanner scanIn = new Scanner(System.in);
        while (state==1)
        {
            System.out.println("A-add car");
            System.out.println("B-remove car");
            System.out.println("X-exit");
            
            String input=scanIn.nextLine();
            
            if(input.equals("A"))
            {
                System.out.println("enter Reg: ");
                String reg = scanIn.nextLine();
                Car c1=new Car(reg);
                if(cp.addCar(c1))
                {
                    System.out.println("car added");
                }
                else
                {
                    System.out.println("car park full");
                }
            }
            else if(input.equals("B"))
            {
                System.out.println("enter Reg: ");
                String reg = scanIn.nextLine();
                if(cp.removeCar(reg))
                {
                    System.out.println("car removed");
                }
                else
                {
                    System.out.println("couldn't find car");
                }
            }
            else if(input.equals("X"))
            {
                state=0;
            }
            else 
            {
                System.out.println("invalid input");
            }
        }
        scanIn.close();
    }
    
}
