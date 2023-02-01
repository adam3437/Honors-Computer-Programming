import javax.swing.*;

public class bankAccountTest
{
    public static void main(String[] ags)
    {
        bankAccount test = new bankAccount("John", 0);
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
        JOptionPane.showMessageDialog(null, test.toString());
    }
}