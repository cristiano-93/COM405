/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintwosemestersbook;

/**
 *
 * @author Cristiano
 */
import java.util.*;

public class JavainTwoSemestersBook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        double price, tax;
        System.out.println("*** Product Price check ***");
        System.out.print("Enter initial price: ");
        price = keyboard.nextDouble();
        System.out.print("Enter tax rate: ");
        tax = keyboard.nextDouble();
        price = price * (1 + tax/100);
        System.out.println("Cost after tax = " + price);
                
        // TODO code application logic here
    }
    
}
