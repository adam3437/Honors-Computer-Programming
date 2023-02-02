import javax.swing.*;

public class bankAccountTest
{
    public static void main(String[] ags)
    {
        bankAccount test = new bankAccount("John", 0, 1111);
        int access = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your pin"));
        if(access != test.getPin())
        {
        	JOptionPane.showMessageDialog(null, "Wrong pin");
        	return;
        }
        boolean useAccount = true;
        while (useAccount) 
        {
        	//asks the user what they want to do
        	int action = JOptionPane.showConfirmDialog(null, "Do you want to deposit or withdraw?" + "\n" + "Yes for Deposit and No for withdraw");
        	if(action == 2) 
        	{
        		return;
        	}
        	else if(action == 0) 
        	{
        		double dep = Double.parseDouble(JOptionPane.showInputDialog(null, "How much money do you want to deposit?"));
        		test.deposit(dep);
        	}
        	else if(action == 1) 
        	{
        		double wit = Double.parseDouble(JOptionPane.showInputDialog(null, "How much money do you want to withdraw?"));
        		test.withdraw(wit);
        	}
        	//Adds interest if account balance is above 0
        	if(test.getBalance() > 0) 
        	{
        		test.addInterest(bankAccount.INTEREST_RATE);
        	}
        	if(test.getBalance() < 0)
        	{
        		JOptionPane.showMessageDialog(null, "You have overdrafted. A fee has been applied");
        		test.withdraw(bankAccount.OVERDRAFT_FEE);
        	}
        	int stop = JOptionPane.showConfirmDialog(null, "Want to stop accessing account?");
        	if(stop == 0 || stop == 2) 
        	{
        		useAccount = false;
        		break;
        	}
        	JOptionPane.showMessageDialog(null, test.toString());
        }
        JOptionPane.showMessageDialog(null, test.toString());
    }
}