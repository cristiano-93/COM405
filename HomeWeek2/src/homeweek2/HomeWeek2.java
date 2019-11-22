/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeweek2;

/**
 *
 * @author Cristiano
 */
import java.util.Scanner;

public class HomeWeek2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        
        //int count = 1;
        
        /*
        while(count <=20)
        {
            System.out.println(count);
            count++;
        }
        */
        /*
        for(int count = 1;count<=20;count++)
        {
            System.out.println(count);
        }
        */
        /*
        while(count<=20)
        {
            System.out.println(count);
            count = count +2;
        }
        */
        /*
        for(int count = 1;count <= 20;count = count + 2)
        {
            System.out.println(count);
        }
        */
        /*
        int count = 5;
        while(count<=15)
        {
            System.out.println(count);
            count++;
        }
        */
        /*
        for(int count = 5;count<=15;count++)
        {
            System.out.println(count);
        }
        */
        /*
        int count = 10;
        while(count >= 1)
        {
            System.out.println(count);
            count--;
        }
        */
        /*
        for(int count=10;count>=1;count--)
        {
            System.out.println(count);
        }
        */
        
        System.out.println("Please enter the letter of your choice:");
        System.out.println("a - calculate the are of a rectangle");
        System.out.println("b - display multiplication table");
        System.out.println("c - add two numbers");
        System.out.println("Your choice: ");
        
        Scanner scanIn = new Scanner(System.in);
        String input = scanIn.nextLine();
        
        if("a".equals(input))
        {
            System.out.println("Rectangle Height: ");
            int height = Integer.parseInt(scanIn.nextLine());
            System.out.println("Rectangle Width: ");
            int width = Integer.parseInt(scanIn.nextLine());
            System.out.println("The are of the Rectangle is: " + (height*width));            
        }
        
    }
    
}
