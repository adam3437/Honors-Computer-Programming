/**
 * Blueprint for a bank account
 * @author Spy_Gaming_TF2
 * 2/01/2023
 */
public class bankAccount 
{
    //instance variables
    private String name;
    private double balance;
    private int accountPin;
    public static final double OVERDRAFT_FEE = 35.00;
    public static final double INTEREST_RATE = 0.0025;
    
    public bankAccount(String name, double balance, int accountPin)
    {
        this.name = name;
        this.balance = balance;
        this.accountPin = accountPin;
    }

    //Getters
    public void deposit(double deposit)
    {
        balance = balance + deposit;
    }
    public void withdraw(double withdraw)
    {
        balance = balance - withdraw;
    }
    public void addInterest(double interest)
    {
        balance = balance + (balance * interest);
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
    public int getPin()
    {
        return accountPin;
    }
    //toString
    public String toString()
    {
        return "Name: " + name + "\n" + "Balance: " + balance;
    }
}
