import java.util.Scanner;
/**
 * Built off of the card blueprint. Allows us to put in 2 letters and return the right card
 * @author Spy_Gaming_TF2
 * 2/13/2023
 */
public class cardTest
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Card Notation: ");
        String card = input.next();
        int length = card.length();
        if(length == 2)
        {
            String name = card.substring(0,1);
            String suit = card.substring(1);
            card card1 = new card(name, suit);
            System.out.println(card1.getDescription());
            input.close();
        }
        else if(length == 3)
        {
            String name = card.substring(0,2);
            String suit = card.substring(2);
            card card1 = new card(name, suit);
            System.out.println(card1.getDescription());
            input.close();
        }
        else
        {
        	System.out.println("Input Error: Too Many Characters");
        }
    }
}