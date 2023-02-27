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
        cashier register = new cashier(0, 0);
        System.out.println("Enter the amount due: ");
        double amountDue = Double.parseDouble(scan.next());
        System.out.println("Enter the amount received: ");
        double amountReceived = Double.parseDouble(scan.next());
        System.out.println("Change Due: " + register.toString());
        scan.close();
    }
}
