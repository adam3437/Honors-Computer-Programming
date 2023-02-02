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
    
<<<<<<< HEAD
    public bankAccount(String name, double balance, int accountPin)
    {
        this.name = name;
        this.balance = balance;
        this.accountPin = accountPin;
=======
    public bankAccount(String name, double balance)
    {
        this.name = name;
        this.balance = balance;
>>>>>>> f4613ebc6ee2e9d2d357d0af5c95104ff6281561
    }

    //Getters
    public void deposit(double deposit)
    {
<<<<<<< HEAD
=======
        this.deposit = deposit;
>>>>>>> f4613ebc6ee2e9d2d357d0af5c95104ff6281561
        balance = balance + deposit;
    }
    public void withdraw(double withdraw)
    {
<<<<<<< HEAD
=======
        this.withdraw = withdraw;
>>>>>>> f4613ebc6ee2e9d2d357d0af5c95104ff6281561
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
