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
        card card1 = new card(input.next(), input.next());
        System.out.println(card1.getDescription());
        if (card1.isLegal())
        {
            System.out.println("This is a legal card");
        }
        else
        {
            System.out.println("This is an illegal card");
        }
        input.close();
    }
}