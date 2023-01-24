/**
 * Class to build vending machine in another file
 * @author Spy_Gaming_TF2
 * 1/24/2023
 */   
public class vendingMachine
{
    private int cans;
    private int tokens;

    public vendingMachine(int theCans, int theTokens)
    {
        cans = theCans;
        tokens = theTokens;
    }
    //create accessor methods to get the number of tokens and cans in the machine
    public int getTokens()
    {
        return tokens;
    }
    public int getCans()
    {
        return cans;
    }
    public void fillUp(int theCans)
    {
        cans = cans + theCans;
    }
    //tracks the amount of tokens and cans in the machine
    public void insertToken(int i)
    {
        tokens = tokens + 1;
        cans = cans--;
    }
    //toString method to print out the contents of the vending machine
    public String contents()
    {
        return "Cans: " + cans + "\nTokens: " + tokens;
    }
}