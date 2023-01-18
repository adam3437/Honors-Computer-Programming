import javax.swing.JOptionPane;
/** 
 * This class creates a piggyBank object and uses the piggyBank class to
 * @author Spy_Gaming_TF2
 * 1/12/2022
 */
public class myBank
{
    public static void main(String[] args)
    {
        piggyBank myBank = new piggyBank(0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        //gets user input for each coin and bill
        myBank.setPennies(Integer.parseInt(JOptionPane.showInputDialog("How many pennies do you have?")));
        myBank.setNickels(Integer.parseInt(JOptionPane.showInputDialog("How many nickels do you have?")));
        myBank.setDimes(Integer.parseInt(JOptionPane.showInputDialog("How many dimes do you have?")));
        myBank.setQuarters(Integer.parseInt(JOptionPane.showInputDialog("How many quarters do you have?")));
        myBank.setOnes(Integer.parseInt(JOptionPane.showInputDialog("How many ones do you have?")));
        myBank.setFives(Integer.parseInt(JOptionPane.showInputDialog("How many fives do you have?")));
        myBank.setTens(Integer.parseInt(JOptionPane.showInputDialog("How many tens do you have?")));
        myBank.setTwenties(Integer.parseInt(JOptionPane.showInputDialog("How many twenties do you have?")));
        myBank.setFifties(Integer.parseInt(JOptionPane.showInputDialog("How many fifties do you have?")));
        myBank.setHundreds(Integer.parseInt(JOptionPane.showInputDialog("How many hundreds do you have?")));        
        System.out.println(myBank.toString());
    }
}