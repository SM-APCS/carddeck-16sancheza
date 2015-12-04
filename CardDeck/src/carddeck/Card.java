/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carddeck;
/**
 *
 * @author Alex
 */
public class Card {
    public final static int ACE = 1, TWO = 2, THREE = 3, FOUR = 4, FIVE = 5, SIX = 6, SEVEN = 7, EIGHT = 8,
            NINE = 9, TEN = 10, JACK = 11, QUEEN = 12, KING = 13; //Setting The Card Face Values
    public final static int CLUBS = 1, DIAMONDS = 2, HEARTS = 3, SPADES = 4; //Setting The Suit Face Values
    
    private final static int numSuits = 4;        //Number of suits 
    private final static int numFaceValues = 13;  //Number of Faces
    
    private String suitName;   //String for the suits 
    private String faceName;   //String for the faces

    private static int face;
    private static int suit;

    public Card()
    {
        face = (int) (Math.random() * numFaceValues) + 1;
        setFaceName();
        
        suit = (int) (Math.random() * numSuits) + 1;
        setSuitName();
    }
    
    public Card(int faceValue, int suitValue)
    {
        face = faceValue;
        setFaceName();

        suit = suitValue;
        setSuitName();
    }
    

    //Generates the Suit of the Card
    private void setSuitName()
    {
        switch (suit)
      {
         case CLUBS:
            suitName = "Clubs";
            break;
         case DIAMONDS:
            suitName = "Diamonds";
            break;
         case HEARTS:
            suitName = "Hearts";
            break;
         case SPADES:
            suitName = "Spades";
            break;
      }
    }
    

    //Generates the Face Value of the Card
    private void setFaceName()
    {
        switch (face)
      {
         case ACE:
            faceName = "Ace";
            break;
         case TWO:
            faceName = "Two";
            break;
         case THREE:
            faceName = "Three";
            break;
         case FOUR:
            faceName = "Four";
            break;
         case FIVE:
            faceName = "Five";
            break;
         case SIX:
            faceName = "Six";
            break;
         case SEVEN:
            faceName = "Seven";
            break;
         case EIGHT:
            faceName = "Eight";
            break;
         case NINE:
            faceName = "Nine";
            break;
         case TEN:
            faceName = "Ten";
            break;
         case JACK:
            faceName = "Jack";
            break;
         case QUEEN:
            faceName = "Queen";
            break;
         case KING:
            faceName = "King";
            break;
      }
    }
    
    public int getFace ()
    {
        return face;
    }
    
    public int getSuit()
    {
        return suit;
    }
    
    public String getFaceName()
    {
        return faceName;
    }
    
    public String getSuitName()
    {
        return suitName;
    }
    public String toString()
    {
        return faceName + " of " + suitName;
    }
}