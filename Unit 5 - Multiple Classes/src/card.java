/**     
 * A blueprint that allows us to create a card object
 * @author Spy_Gaming_TF2
 * 2/13/2023
 */
public class card
{
    private String number;
    private String suit;

    //constructor
    public card(String number, String suit)
    {
        this.number = number;
        this.suit = suit;
    }
    //getDescription method
    public String getDescription()
    {
        //sets cards to numbers and letters
        if (number.equals("2")){number = "Two";}
        else if (number.equals("3")){number = "Three";}
        else if (number.equals("4")){number = "Four";}
        else if (number.equals("5")){number = "Five";}
        else if (number.equals("6")){number = "Six";}
        else if (number.equals("7")){number = "Seven";}
        else if (number.equals("8")){number = "Eight";}
        else if (number.equals("9")){number = "Nine";}
        else if (number.equals("10")){number = "Ten";}
        else if (number.equals("J") || number.equals("j")){number = "Jack";}
        else if (number.equals("Q") || number.equals("q")){number = "Queen";}
        else if (number.equals("K") || number.equals("k")){number = "King";}
        else if (number.equals("A") || number.equals("a")){number = "Ace";}
        //same for suits
        if (suit.equals("H") || suit.equals("h")){suit = "Hearts";}
        else if (suit.equals("D") || suit.equals("d")){suit = "Diamonds";}
        else if (suit.equals("C") || suit.equals("c")){suit = "Clubs";}
        else if (suit.equals("S") || suit.equals("s")){suit = "Spades";}
       //returns the card
        if (isLegalNumber() == false) { return ("Illegal Number");}
        else if (isLegalSuit() == false) {return ("Illegal Suit");}
        if(isLegalNumber() && isLegalSuit())
        {
            return number + " of " + suit;
        }
        return "Input error: ";
    }
    //checks for illegal cards
    public boolean isLegalNumber()
    {
        if (number.equals("Two") || number.equals("Three") || number.equals("Four") || number.equals("Five") || number.equals("Six") || number.equals("Seven") || number.equals("Eight") || number.equals("Nine") || number.equals("Ten") || number.equals("Jack") || number.equals("Queen") || number.equals("King") || number.equals("Ace"))
        {
            return true;
        }
        return false;
    }
    public boolean isLegalSuit() 
    {
    	if (suit.equals("Hearts") || suit.equals("Diamonds") || suit.equals("Clubs") || suit.equals("Spades") || suit.equals("Hearts"))
        {
    		return true;
        }
		return false;
    }
}