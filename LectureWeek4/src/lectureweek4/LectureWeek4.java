/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lectureweek4;

/**
 *
 * @author Cristiano
 */
public class LectureWeek4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
     Room r1 = new Room("JM310",30,30);
     Lecturer l1 = new Lecturer("Darren","Computing");
     Unit u1 = new Unit ("00P","COM405",70,true);
     
     u1.assignLecturer(l1);
     if(u1.assignRoom(r1))
     {
         System.out.println("YAY");
     }
     else{
         System.out.println("MEH");
     }
     
        System.out.println(u1.toString());
        
     
    }
    
}
