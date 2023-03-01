/**
 * Test for the primeFactor class. Uses JOptionPane to get user input for a number and outputs factors for said number
 * @author Spy-Gaming-TF2
 * 3/01/23
 */
import javax.swing.JOptionPane;
public class primeFactorTest
{
    public static void main(String[] args)
    {
        int number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number: "));
        primeFactorization primeFactorization1 = new primeFactorization(number);
        JOptionPane.showMessageDialog(null, primeFactorization1.toString());
    }
}
