/**
 * Blueprint for a bank account
 * @author Spy_Gaming_TF2
 * 2/01/2023
 */
public class bankAccount 
{
    //instance variables
    private String name;
    private double deposit;
    private double withdraw;
    private double balance;
    
    public bankAccount(String theName, double theBalance)
    {
        theName = name;
        theBalance = balance;
    }

    //Getters
    public void deposit(double theDeposit)
    {
        theDeposit = deposit;
        balance = balance + deposit;
    }
    public void withdraw(double theWithdraw)
    {
        theWithdraw = withdraw;
        balance = balance - withdraw;
    }
    //Setters
    public double getBalance()
    {
        return balance;
    }
    public String getName()
    {
        return name;
    }
    public String toString()
    {
        return "Name: " + name + "\n" + "Balance: " + balance;
    }
}
