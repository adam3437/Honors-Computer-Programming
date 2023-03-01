/**
 * A program that prompts the user for an integer (using JOptionPane) and then prints out its prime factorization. For example, when the user enters 150, the program should print "Prime factorization of 150: 2 3 5 5".
 * @author Spy-Gaming-TF2
 * 3/01/23
 */
public class primeFactorization
{
    private double number;

    /**
     * Constructor for objects of class primeFactorization. Allows for it to be used in other files
     * @param number //the number to be factored. Set via JOptionPane in tester class
     */
    public primeFactorization(double number)
    {
        this.number = number;
    }
    //calculate all prime factors using modulus
    public String getFactors()
    {
        StringBuilder factors = new StringBuilder();
        for (int i = 2; i <= number; i++)
        {
            while (number % i == 0)
            {
                factors.append(i).append(" ");
                number /= i;
            }
        }
        return factors.toString();
    }
    //toString method
    public String toString()
    {
        return "Prime Factorization of: " + number + " is: " + getFactors();
    }
}
