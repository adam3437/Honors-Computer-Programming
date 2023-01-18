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
    public void setOnes(int theOnes)
    {
        ones = theOnes;
    }
    public void setFives(int theFives)
    {
        fives = theFives;
    }
    public void setTens(int theTens)
    {
        tens = theTens;
    }
    public void setTwenties(int theTwenties)
    {
        twenties = theTwenties;
    }
    public void setFifties(int theFifties)
    {
        fifties = theFifties;
    }
    public void setHundreds(int theHundreds)
    {
        hundreds = theHundreds;
    }
    //toString method to print out the contents of the piggy bank 
    public String contents()
    {
        return "Pennies: " + pennies + "\tNickels: " + nickels + "\tDimes: " + dimes + "\tQuarters: " + quarters + "\tOnes: " + ones + "\tFives: " + fives + "\tTens: " + tens + "\tTwenties: " + twenties + "\tFifties: " + fifties + "\tHundreds: " + hundreds + "\tTotal Value: $" + totalValue() + "\n";
    }
    public double totalValue()
    {
        return pennies * 0.01 + nickels * 0.05 + dimes * 0.10 + quarters * 0.25 + ones * 1.00 + fives * 5.00 + tens * 10.00 + twenties * 20.00 + fifties * 50.00 + hundreds * 100.00;
    }
}