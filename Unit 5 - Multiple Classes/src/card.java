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
        switch (number) {
            case "2" -> number = "Two";
            case "3" -> number = "Three";
            case "4" -> number = "Four";
            case "5" -> number = "Five";
            case "6" -> number = "Six";
            case "7" -> number = "Seven";
            case "8" -> number = "Eight";
            case "9" -> number = "Nine";
            case "10" -> number = "Ten";
            case "J", "j" -> number = "Jack";
            case "Q", "q" -> number = "Queen";
            case "K", "k" -> number = "King";
            case "A", "a" -> number = "Ace";
        }
        //same for suits
        switch (suit) {
            case "H", "h" -> suit = "Hearts";
            case "D", "d" -> suit = "Diamonds";
            case "C", "c" -> suit = "Clubs";
            case "S", "s" -> suit = "Spades";
        }
       //returns the card
        if (!isLegalNumber()) { return ("Illegal Number");}
        else if (!isLegalSuit()) {return ("Illegal Suit");}
        if(isLegalNumber() && isLegalSuit())
        {
            return number + " of " + suit;
        }
        return "Input error: ";
    }
    //checks for illegal cards
    public boolean isLegalNumber()
    {
        return number.equals("Two") || number.equals("Three") || number.equals("Four") || number.equals("Five") || number.equals("Six") || number.equals("Seven") || number.equals("Eight") || number.equals("Nine") || number.equals("Ten") || number.equals("Jack") || number.equals("Queen") || number.equals("King") || number.equals("Ace");
    }
    public boolean isLegalSuit() 
    {
        return suit.equals("Hearts") || suit.equals("Diamonds") || suit.equals("Clubs") || suit.equals("Spades") || suit.equals("Hearts");
    }
}