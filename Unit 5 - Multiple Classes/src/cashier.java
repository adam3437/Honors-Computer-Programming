/**
 * Program has two inputs for the amount to be paid and for the amount received from the customer
 * @author Spy-Gaming-TF2
 * 2/27/23
 */
public class cashier
{
    private double amountDue;
    private double amountReceived;
    private double pennies;
    private double nickels;
    private double dimes;
    private double quarters;

    //constants
    final double DOLLAR_VALUE = 1.00;
    final double QUARTER_VALUE = 0.25;
    final double DIME_VALUE = 0.10;
    final double NICKEL_VALUE = 0.05;
    final double PENNY_VALUE = 0.01;

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
    //calculates the number of quarters
    public double getQuarters()
    {
        return getChangeDue() / QUARTER_VALUE;
    }
    //calculates the number of dimes
    public double getDimes()
    {
        return getChangeDue() / DIME_VALUE;
    }
    //calculates the number of nickels
    public double getNickels()
    {
        return getChangeDue() / NICKEL_VALUE;
    }
    //calculates the number of pennies
    public double getPennies()
    {
        return getChangeDue() / PENNY_VALUE;
    }
    //toString method
    public String toString()
    {
        return "Amount Due: " + amountDue + "\n" + "Quarters Due" + getQuarters() + "\n" + "Dimes Due" + getDimes() + "\n" + "Nickels Due" + getNickels() + "\n" + "Pennies Due" + getPennies();
    }
}
