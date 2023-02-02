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
    
    public bankAccount(String name, double balance)
    {
        this.name = name;
        this.balance = balance;
    }

    //Getters
    public void deposit(double deposit)
    {
        this.deposit = deposit;
        balance = balance + deposit;
    }
    public void withdraw(double withdraw)
    {
        this.withdraw = withdraw;
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
