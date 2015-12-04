/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carddeck;

/**
 *
 * @author Kurt
 */
public class CardDeck {

    public static void main(String[] args)  //Creates a deck, shuffles, and then deals.
    {
        Deck deck = new Deck();

        deck.shuffle();
        
        int cardNumber = 0;
        while (deck.hasMoreCards())
        {
            System.out.println("  " + ++cardNumber + ": " + deck.deal());
        }      
        
        
    }
}
