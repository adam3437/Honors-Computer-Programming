import javax.swing.JOptionPane;

public class Calculator
{
	public static void main(String[] args)
	{
		String input = "";
		double num1 = 0;
		double num2 = 0;
		
		input = JOptionPane.showInputDialog("Enter a number");
		num1 = Integer.parseInt(input);
		input = JOptionPane.showInputDialog("Enter a second number");
		num2 = Double.parseDouble(input);
		
		JOptionPane.showMessageDialog(null, num1 + num2 + " = " + (num1 + num2));	
		JOptionPane.showMessageDialog(null, num1 + " - " + num2 + " = " + (num1 - num2));
		JOptionPane.showMessageDialog(null, num1 + " * " + num2 + " = " + (num1 * num2));
		JOptionPane.showMessageDialog(null, num1 + " / " + num2 + " = "  + (num1 / num2));
				
	}
}
