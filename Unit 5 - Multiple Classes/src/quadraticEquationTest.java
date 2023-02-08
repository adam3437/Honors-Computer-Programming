import java.util.*;
/**
 * Solves a quadratic equation using the quadraticEquation class. Coefficients are entered by the user.
 * @author  Spy_Gaming_TF2
 * @version 2/08/2023
 */
public class quadraticEquationTest
{
    public static void main(String[] args)
    {
        // creates a Scanner object
        Scanner input = new Scanner(System.in);
        quadraticEquation eq1 = new quadraticEquation(0, 0, 0);
        // prompts the user to enter the coefficients
        System.out.println("Enter the coefficient for A: ");
        eq1.setA(input.nextDouble());
        System.out.println("Enter the coefficient for B: ");
        eq1.setB(input.nextDouble());
        System.out.println("Enter the coefficient for C: ");
        eq1.setC(input.nextDouble());
        System.out.println("The discriminant is: " + eq1.getDiscriminant());
        // if the discriminant is greater than 0, the equation has two real roots
        if (eq1.getDiscriminant() > 0)
        {
            System.out.println("The roots are: " + eq1.getRoot1() + " and " + eq1.getRoot2());
        }
        else if (eq1.getDiscriminant() == 0)
        {
            System.out.println("The roots are: " + eq1.getRoot1() + " " + eq1.getRoot2());
        }
        else
        {
            System.out.println("The equation has no real roots.");
        }
        // closes the Scanner object
        input.close();
    }    
}
