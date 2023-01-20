/**
 * This class is a piggy bank that holds coins and bills
 * @author Spy_Gaming_TF2 
 * 1/19/2022
 */

public class piggyBank 
{
    //instance variables for coins and bills
    private int pennies;
    private int nickels;
    private int dimes;
    private int quarters;
    //constructor to initialize instance variables
    public piggyBank(int thePennies, int theNickels, int theDimes, int theQuarters)
    {
        pennies = thePennies;
        nickels = theNickels;
        dimes = theDimes;
        quarters = theQuarters;
    }
    //define methods to get info about the object
    public int getPennies()
    {
        return pennies;
    }
    public int getNickels()
    {
        return nickels;
    }
    public int getDimes()
    {
        return dimes;
    }
    public int getQuarters()
    {
        return quarters;
    }
    //allows for values to be changed by user input
    public void setPennies(int thePennies)
    {
        pennies = thePennies;
    }
    public void setNickels(int theNickels)
    {
        nickels = theNickels;
    }
    public void setDimes(int theDimes)
    {
        dimes = theDimes;
    }
    public void setQuarters(int theQuarters)
    {
        quarters = theQuarters;
    }
    //toString method to print out the contents of the piggy bank 
    public String contents()
    {
        return "Pennies: " + pennies + "\nNickels: " + nickels + "\nDimes: " + dimes + "\nQuarters: " + quarters + "\n# of coins: " + coinCount() + "\nTotal Value: $" + totalValue() + "\n";
    }
    public double coinCount()
    {
        return pennies + nickels + dimes + quarters;
    }
    public double totalValue()
    {
        return pennies * 0.01 + nickels * 0.05 + dimes * 0.10 + quarters * 0.25;
    }
}