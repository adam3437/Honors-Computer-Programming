/**
 * Program has two inputs for the amount to be paid and for the amount received from the customer
 * @author Spy-Gaming-TF2
 * 2/27/23
 */
public class cashier
{
    private final double amountDue;
    private final double amountReceived;
    double pennies;
    double nickels;
    double dimes;
    double quarters;
    double dollars;

    //constants
    final double DOLLAR_VALUE = 1.00;
    final double QUARTER_VALUE = 0.25;
    final double DIME_VALUE = 0.10;
    final double NICKEL_VALUE = 0.05;
    final double PENNY_VALUE = 0.01;

    /**
     * Constructor for objects of class cashier
     * @param amountDue //the amount due
     * @param amountReceived //the amount received from the customer
     */
    public cashier(double amountDue, double amountReceived)
    {
        this.amountDue = amountDue;
        this.amountReceived = amountReceived;
    }
    //calculates the change due
    public double getChangeDue()
    {
        return amountReceived - amountDue;
    }
    //use modulus to get the amount of coins & dollars returned
    public double getDollars()
    {
        dollars = getChangeDue() / DOLLAR_VALUE;
        dollars = (int) dollars;
        return dollars;
    }
    public double getQuarters()
    {
        quarters = getChangeDue() % DOLLAR_VALUE;
        quarters = quarters / QUARTER_VALUE;
        quarters = (int) quarters;
        return quarters;
    }
    public double getDimes()
    {
        dimes = getChangeDue() % DOLLAR_VALUE;
        dimes = dimes % QUARTER_VALUE;
        dimes = dimes / DIME_VALUE;
        dimes = (int) dimes;
        return dimes;
    }
    public double getNickels()
    {
        nickels = getChangeDue() % DOLLAR_VALUE;
        nickels = nickels % QUARTER_VALUE;
        nickels = nickels % DIME_VALUE;
        nickels = nickels / NICKEL_VALUE;
        nickels = (int) nickels;
        return nickels;
    }
    public double getPennies()
    {
        pennies = getChangeDue() % DOLLAR_VALUE;
        pennies = pennies % QUARTER_VALUE;
        pennies = pennies % DIME_VALUE;
        pennies = pennies % NICKEL_VALUE;
        pennies = pennies / PENNY_VALUE;
        pennies = (int) pennies;
        return pennies;
    }
    //toString method
    public String toString()
    {
        return "Amount Due: " + amountDue + "\n" + "Dollars Due: " + getDollars() + "\nQuarters Due: " + getQuarters() + "\nDimes Due: " + getDimes() + "\nNickels Due: " + getNickels() + "\nPennies Due: " + getPennies();
    }
}
