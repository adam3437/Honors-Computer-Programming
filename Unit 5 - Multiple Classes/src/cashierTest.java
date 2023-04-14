/**
 * This class tests the cashier class. It takes user input via scanner and then prints the change due.
 * @author Spy-Gaming-TF2
 * 2/27/23
 */
import java.util.Scanner;
public class cashierTest
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the amount due: ");
        double amountDue = scan.nextDouble();
        System.out.print("Enter the amount received: ");
        double amountReceived = scan.nextDouble();
        cashier cashier1 = new cashier(amountDue, amountReceived);
        //check that amountReceived is greater than amountDue
        if (amountReceived == amountDue)
        {
            System.out.println("No Change Due");
        }
        else if(amountReceived < amountDue)
        {
            System.out.println("You Need More Money to Purchase This Item");
        }
        else
        {
            System.out.println(cashier1.toString());
        }
        scan.close();
    }
}