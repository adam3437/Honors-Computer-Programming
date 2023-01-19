import javax.swing.JOptionPane;
/** 
 * This class creates a piggyBank object and uses the piggyBank class to get the total amount of money and coin count
 * @author Spy_Gaming_TF2
 * 1/19/2022
 */
public class myBank
{
    public static void main(String[] args)
    {
    	//Initializes the piggy bank
        piggyBank myBank = new piggyBank(0, 0, 0, 0);
        String numPennies = JOptionPane.showInputDialog("How many pennies do you have?");
        if (numPennies == null) System.exit(0);
        String numNickels = JOptionPane.showInputDialog("How many nickels do you have?");
        if (numNickels == null) System.exit(0);
        String numDimes = JOptionPane.showInputDialog("How many dimes do you have?");
        if (numDimes == null) System.exit(0);
        String numQuarters = JOptionPane.showInputDialog("How many quarters do you have?");
        if (numQuarters == null) System.exit(0);
        //gets user input for each coin and bill
        myBank.setPennies(Integer.parseInt(numPennies));
        myBank.setNickels(Integer.parseInt(numNickels));
        myBank.setDimes(Integer.parseInt(numDimes));
        myBank.setQuarters(Integer.parseInt(numQuarters));
        //prints out the total amount of money and coin count of the piggy bank    
        System.out.println(myBank.contents());
    }
}