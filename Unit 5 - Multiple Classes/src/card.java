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
        else if(number.equals("3")){number = "Three";}
        else if (number.equals("4")){number = "Four";}
        else if (number.equals("5")){number = "Five";}
        else if (number.equals("6")){number = "Six";}
        else if (number.equals("7")){number = "Seven";}
        else if (number.equals("8")){number = "Eight";}
        else if (number.equals("9")){number = "Nine";}
        else if (number.equals("10")){number = "Ten";}
        else if (number.equals("J")){number = "Jack";}
        else if (number.equals("Q")){number = "Queen";}
        else if (number.equals("K")){number = "King";}
        else if (number.equals("A")){number = "Ace";}
        //same for suits
        if (suit.equals("H")){suit = "Hearts";}
        else if (suit.equals("D")){suit = "Diamonds";}
        else if (suit.equals("C")){suit = "Clubs";}
        else if (suit.equals("S")){suit = "Spades";}
       //retunrs the card
        return number + " of " + suit;
    }
    //checks for illegal cards
    public boolean isLegal()
    {
        if (number.equals("2") || number.equals("3") || number.equals("4") || number.equals("5") || number.equals("6") || number.equals("7") || number.equals("8") || number.equals("9") || number.equals("10") || number.equals("Jack") || number.equals("Queen") || number.equals("King") || number.equals("Ace"))
        {
            if (suit.equals("Hearts") || suit.equals("Diamonds") || suit.equals("Clubs") || suit.equals("Spades"))
            {
                return true;
            }
            //same checks but with lowercase names
            else if (number.equals("jack") || number.equals("queen") || number.equals("king") || number.equals("ace"))
            {
                return true;
            }
            
            else if (suit.equals("h") || suit.equals("d") || suit.equals("c") || suit.equals("s"))
            {
                return true;
            }
        }
        return false;
    }    
}
