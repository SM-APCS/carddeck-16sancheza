/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carddeck;
import java.util.Random;

/**
 *
 * @author Alex
 */
public class Deck {
    private int numCards;//Number of Cards remaining in the Deck
    private final int NUM_CARDS = 52; //Number of Cards in the original Deck
    private Card[] cards;     //Instantiates Deck Array
    Random generator = new Random();
    
    //Creates a deck with cards created in order.
    public Deck()
    {
        numCards = NUM_CARDS;
        cards = new Card[numCards];
        
        //Create the deck
        int cardIndex = 0;
        for (int face = Card.ACE; face <= Card.KING; face++)
        {
            for (int suit = Card.CLUBS; suit <= Card.SPADES; suit++)
            {
                cards[cardIndex++] = new Card(face, suit);
            }
        }
    }
    //Deals a card from the deck.
    public Card deal()
    {
        if (numCards > 0)
            return cards[--numCards];
        else
            return null;
    }
    
    //Returns the number of cards left in the deck
    public int getNumCardsInDeck()
    {
        return numCards;
    }
    
    //Returns true if the deck has cards in it, else false
    public boolean hasMoreCards()
    {
        return (numCards > 0);
    }
    
    //Shuffles the deck. Resets the number of cards in the deck to 52.
    public void shuffle()
    {
        numCards = NUM_CARDS;
        
        boolean[] taken = new boolean[NUM_CARDS];
        for (int i = 0; i < numCards; i++)
        {
            taken[i] = false;
        }
        
        int[] shufflePositions = new int[NUM_CARDS];
        int count = 0;
        
        //determine the shuffled positions
        while (count < 52)
        {
            int place = generator.nextInt(NUM_CARDS);
            if (!taken[place])
            {
                shufflePositions[count] = place;
                taken[place] = true;
                count++;
            }
        }
        
        //move cards to shuffled positions
        Card[] temp = new Card[NUM_CARDS];
        
        for (int i = 0; i < numCards; i++)
            temp[shufflePositions[i]] = cards[i];
        
        cards = temp;
        
    }
    
}
