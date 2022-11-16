import javax.swing.JOptionPane;
public class even_or_odd
{
	public static void main(String[] args)
	{
		double input = Double.parseDouble(JOptionPane.showInputDialog("Enter a Number"));
		String check = " ";
		if ((input % 2) == 0) {
			   check = "even";
			} else {
			   check = "odd";
			}
		
		JOptionPane.showMessageDialog(null, "Your number is " + check);
	}
}
