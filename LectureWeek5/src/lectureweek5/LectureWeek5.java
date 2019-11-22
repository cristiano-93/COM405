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
public class LectureWeek5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Deck deck = new Deck();
        
        
        deck.addCard(new Card(1));
        //deck.addCard(new Card(2));
        deck.addCard(new Card(3));
        deck.addCard(new Card(4));
        deck.addCard(new Card(5));
        System.out.println(deck.toString());
    }
    
}
