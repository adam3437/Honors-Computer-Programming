import javax.swing.*;
/**
 * This class tests the vendingMachine class.
 * @author Spy_Gaming_TF2
 * 1/24/2023
 */
public class vendingMachineTest 
{
    public static void main(String[] args)
    {
        vendingMachine machine1 = new vendingMachine(0, 0);
        String cans = JOptionPane.showInputDialog("How many cans do you want to input?");
        if(cans == null) System.exit(0);
        machine1.fillUp(Integer.parseInt(cans));
        boolean useMachine = true;
        while(useMachine) 
        {
        	//checks that there are cans in the machine
        	if(machine1.getCans() == 0) 
        	{
        		JOptionPane.showMessageDialog(null, "No More Cans!");
        		break;
        	}
        	machine1.insertToken(0);
        	JOptionPane.showMessageDialog(null, machine1.contents());
        	//determines if the while loop will continue
        	int continu = JOptionPane.showConfirmDialog(null, "Continue?");
        	if(continu == 0) 
        	{
        		useMachine = true;
        	}
        	else if (continu == 1 || continu == 2)
        	{
        		useMachine = false;
        	}
        }
        System.out.println(machine1.contents());
        int refill = JOptionPane.showConfirmDialog(null, "Do you want to refill the machine?");
        if (refill == JOptionPane.YES_OPTION)
        {
        	machine1.fillUp(Integer.parseInt(cans));
        }
    }
}