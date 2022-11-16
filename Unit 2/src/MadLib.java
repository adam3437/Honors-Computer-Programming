import javax.swing.JOptionPane;

public class MadLib
{
	public static void main(String[] args)
	{
		String userInputX = "";
		String userInputY = "";
		String userInputZ = "";
		
		userInputX = JOptionPane.showInputDialog("Enter a noun");
		userInputY = JOptionPane.showInputDialog("Enter a verb");
		userInputZ = JOptionPane.showInputDialog("Enter an adjective");
		
		JOptionPane.showMessageDialog(null,userInputX + " is " + userInputY + " with a " + userInputZ + " cat.");
	}
}