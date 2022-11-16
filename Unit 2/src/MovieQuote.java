import javax.swing.JOptionPane;

public class MovieQuote
{
	public static void main(String[] args)
	{
		String firstname = "";
		firstname = JOptionPane.showInputDialog("What is your first name?");
		String lastname = "";
		lastname = JOptionPane.showInputDialog("What is your last name?");
		String quote = "\"Open the pod bay doors, HAL\" -2001: A Space Odyssey";
		JOptionPane.showMessageDialog(null ,quote);
		JOptionPane.showMessageDialog(null, "Your name is: " + firstname + " " + lastname);
	}
}
