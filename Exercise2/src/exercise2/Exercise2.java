/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise2;

/**
 *
 * @author Cristiano
 */
import java.util.Scanner;

public class Exercise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        int state =1;
        Scanner scanIn = new Scanner(System.in);
        while( state == 1)
            {

            System.out.println("Please enter the letter which corresponds with your choice");
            System.out.println("a - Calculate the area of a rectangle");
            System.out.println("b - Display a multiplication table");
            System.out.println("c - Add two numbers");
            System.out.println("x - Close the program");
            System.out.println("Your choice: ");
            String input = scanIn.nextLine();



            if("a".equals(input))
            {
                System.out.println("Rectangle Height: ");
                int height = Integer.parseInt(scanIn.nextLine());
                System.out.println("Rectangle Width: ");
                int width = Integer.parseInt(scanIn.nextLine());
                System.out.println("The Rectangle Area is: " + (height * width));

            }
            else if("b".equals(input))
            {
                System.out.println("Which Multiplication table would you like to see: ");
                int table = Integer.parseInt(scanIn.nextLine());
                System.out.println("You chose: " + table);
                for(int i=1;i<=12;i++)
                {
                    System.out.println(i*table);
                }

            }
            else if("c".equals(input))
            {
                System.out.println("You want to add: ");
                int number1 = Integer.parseInt(scanIn.nextLine());
                System.out.println("to: ");
                int number2 = Integer.parseInt(scanIn.nextLine());
                System.out.println("Result: " + (number1 + number2));

            }
            else if("x".equals(input))
            {
                System.out.println("You are finished");
                state = 0;
            }
            else {
                System.out.println("wrong input");
            }
            
        }
        
                
        
    }
    
}
