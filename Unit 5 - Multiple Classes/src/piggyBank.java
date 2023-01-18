/**
 * This class is a piggy bank that holds coins and bills
 * @author Spy_Gaming_TF2 
 * 1/12/2022
 */

public class piggyBank 
{
    //instance variables for coins and bills
    private int pennies;
    private int nickels;
    private int dimes;
    private int quarters;
    private int ones;
    private int fives;
    private int tens;
    private int twenties;
    private int fifties;
    private int hundreds;
    //constructor to initialize instance variables
    public piggyBank(int thePennies, int theNickels, int theDimes, int theQuarters, int theOnes, int theFives, int theTens, int theTwenties, int theFifties, int theHundreds)
    {
        pennies = thePennies;
        nickels = theNickels;
        dimes = theDimes;
        quarters = theQuarters;
        ones = theOnes;
        fives = theFives;
        tens = theTens;
        twenties = theTwenties;
        fifties = theFifties;
        hundreds = theHundreds;
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
    public int getOnes()
    {
        return ones;
    }
    public int getFives()
    {
        return fives;
    }
    public int getTens()
    {
        return tens;
    }
    public int getTwenties()
    {
        return twenties;
    }
    public int getFifties()
    {
        return fifties;
    }
    public int getHundreds()
    {
        return hundreds;
    }  
}