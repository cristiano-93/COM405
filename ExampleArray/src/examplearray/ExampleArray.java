/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examplearray;

/**
 *
 * @author Cristiano
 */
import java.util.*;

public class ExampleArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        char choice;
        Scanner keyboard = new Scanner(System.in);
        int[]someArray;
        System.out.println("How many elements to store?: ");
        int size = keyboard.nextInt();
        someArray = new int [size];
        
            do 
            {
                System.out.println();
                System.out.println("[1] Enter Values");
                System.out.println("[2] Find Maximum");
                System.out.println("[3] Calculate sum");
                System.out.println("[4] Check membership");
                System.out.println("[5] Search Array");
                System.out.println("[6] Display values");
                System.out.println("[7] Exit");
                System.out.print("Enter your choice [1-7]: ");
                choice = keyboard.next().charAt(0);
                System.out.println();
                switch(choice)
                {
                    case '1': fillArray(someArray);
                        break;
                    case '2': int max = max(someArray);
                        System.out.println("Maximum array values = "+max);
                        break;
                    case '3': int total = sum(someArray);
                        System.out.println("Sum of array values = "+total);
                        break;
                    case '4': System.out.print("Enter value to find: ");
                        int value = keyboard.nextInt();
                        boolean found = contains(someArray, value);
                        if(found)
                        {
                            System.out.println(value+" is in the array");
                        }
                        else 
                        {
                            System.out.println(value+" is not in the array");                            
                        }
                        break;
                    case '5': System.out.print("Enter value to find: ");
                        int item = keyboard.nextInt();
                        int index = search(someArray, item);
                        if(index == -999)
                        {
                            System.out.println("This value is not in the array");
                        }
                        else
                        {
                            System.out.println("This value is at array index "+index);
                        }
                        break;
                    case '6': System.out.println("Array values");
                        displayArray(someArray);
                        break;
                }
                
            
            }
            while (choice !='7');
            System.out.println("Goodbye");
        }
    //methods
    public void fillArray(int[] arrayIn)
    {
        Scanner keyboard = new Scanner(System.in);
        for(int i=0;i<arrayIn.length;i++)
        {
            System.out.println("enter value: ");
            arrayIn[i] = keyboard.nextInt();
        }
    }
    
    public int sum(int[]arrayIn)
    {
        int total = 0;
        for(int currentElement : arrayIn)
        {
            total = total + currentElement;
        }
        return total;
    }
    
    public int max(int[]arrayIn)
    {
        int result = arrayIn[0];//set result to the first value in the array
        //this loops runs from the 2nd item to the last item in the array
        for(int i=0;i<arrayIn.length;i++)
        {
            if(arrayIn[i]>result)
            {
                result = arrayIn[i];
            }
        }
        return result;
    }
    
    public boolean contains(int[]arrayIn, int valueIn)
    {
        //enhanced 'for' loop used here
        for(int currentElement : arrayIn)
        {
            if(currentElement == valueIn)
            {
                return true; // exit loop
            }
        }
        return false;// value not present
    }
    
    //returns the position of a item within a array or -999 if not found within the array
    public int search(int[] arrayIn, int valueIn)
    {
        for(int i=0;i<arrayIn.length;i++)
        {
            if(arrayIn[i]==valueIn)
            {
                return i;
            }
        }
        return -999;
    }
    
    //display the values of the array items
    public void displayArray(int[]arrayIn)
    {
        System.out.println();
        for(int i=0;i<arrayIn.length;i++)
        {
            System.out.println("array["+i+"] = "+arrayIn[i]);            
        }
    }
    
}
