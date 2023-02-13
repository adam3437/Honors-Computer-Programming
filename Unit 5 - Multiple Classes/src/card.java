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
        if (number.equals("2")){number = "2";}
        else if (number.equals("3")){number = "3";}
        else if (number.equals("4")){number = "4";}
        else if (number.equals("5")){number = "5";}
        else if (number.equals("6")){number = "6";}
        else if (number.equals("7")){number = "7";}
        else if (number.equals("8")){number = "8";}
        else if (number.equals("9")){number = "9";}
        else if (number.equals("10")){number = "10";}
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
        return number + " of " + suit;
    }
    //checks for illegal cards
    public boolean isLegal()
    {
        if (number.equals("2") || number.equals("3") || number.equals("4") || number.equals("5") || number.equals("6") || number.equals("7") || number.equals("8") || number.equals("9") || number.equals("10") || number.equals("Jack") || number.equals("Queen") || number.equals("King") || number.equals("Ace"))
        {
            if (suit.equals("Hearts") || suit.equals("Diamonds") || suit.equals("Clubs") || suit.equals("Spades") || suit.equals("Hearts"))
            {
                return true;
            }
        }
        return false;
    }    
}