/**
 * Program has two inputs for the amount to be paid and for the amount received from the customer
 * @author Spy-Gaming-TF2
 * 2/27/23
 */
public class cashier
{
    private final double amountDue;
    private final double amountReceived;
    private double pennies;
    private double nickels;
    private double dimes;
    private double quarters;
    private double dollars;

    //constants
    private static final double DOLLAR_VALUE = 1.0;
    private static final double QUARTER_VALUE = 0.25;
    private static final double DIME_VALUE = 0.1;
    private static final double NICKEL_VALUE = 0.05;
    private static final double PENNY_VALUE = 0.01;

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
    //calculate the change due and use modulus to get the remainder
    public double getDollars()
    {
        dollars = (int) ((amountReceived - amountDue) * DOLLAR_VALUE);
        dollars = Math.round(dollars);
        return dollars;
    }
    public double getQuarters()
    {
        quarters = ((amountReceived - amountDue) * DOLLAR_VALUE) % DOLLAR_VALUE / QUARTER_VALUE;
        quarters = Math.round(quarters);
        return quarters;
    }
    public double getDimes()
    {
        dimes = ((amountReceived - amountDue) * DOLLAR_VALUE) % DOLLAR_VALUE % QUARTER_VALUE / DIME_VALUE;
        dimes = Math.round(dimes);
        return dimes;
    }
    public double getNickels()
    {
        nickels = ((amountReceived - amountDue) * DOLLAR_VALUE) % DOLLAR_VALUE % QUARTER_VALUE % DIME_VALUE / NICKEL_VALUE;
        nickels = Math.round(nickels);
        return nickels;
    }
    public double getPennies()
    {
        pennies = ((amountReceived - amountDue) * DOLLAR_VALUE) % DOLLAR_VALUE % QUARTER_VALUE % DIME_VALUE % NICKEL_VALUE / PENNY_VALUE;
        pennies = Math.round(pennies);
        return pennies;
    }
    //toString method
    public String toString()
    {
        return "Amount Due: " + amountDue + "\n" + "Dollars Due: " + getDollars() + "\nQuarters Due: " + getQuarters() + "\nDimes Due: " + getDimes() + "\nNickels Due: " + getNickels() + "\nPennies Due: " + getPennies();
    }
}
