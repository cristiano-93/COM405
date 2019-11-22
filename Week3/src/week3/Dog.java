/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

/**
 *
 * @author Cristiano
 */
public class Dog 
{
    //atributes
    private String name;
    private int age;
    private String breed;
    private int bladder;
    private int energy;
    
    //Constructor
    public Dog()
    {
        name = "meh";
        age = 5;
        breed = "Jack Russel";
        bladder = 50;
        energy = 50;
    }
    
    public Dog(String nameIn,int ageIn, String breedIn)
    {
        name = nameIn;
        age = ageIn;
        breed = breedIn;
        
    }
    

    // methods
    public void bark()
    {
        System.out.println("Bark Bark Bark");
    }
    public void run()
    {
        energy--;
        System.out.println("pant pant pant !");
    }
    public void takeAWizz()
    {
        bladder = 0;
        energy--;
        System.out.println("ahhhhhhhh");
    }
            
    //accessers - known as getters
    
    public String getName()
    {
        return name;
    }
    public int getBladder()
    {
        return bladder;
    }
    
    //mutater - most known as setters
    
    public void setName(String nameIn)
    {
        name = nameIn;
    }
    public void setBladder(int bladderIn)
    {
        bladder = bladderIn;
    }
    public void setEnergy(int energyIn)
    {
        energy = energyIn;
    }
    
}
