import javax.swing.JOptionPane;

public class FeetToMiles
{
	public static void main(String[] args)
	{
		int miles = 5280;
		
		int input = Integer.parseInt(JOptionPane.showInputDialog(("Enter distance in feet")));
	    
	    
	    int last = (input / miles);
		JOptionPane.showMessageDialog(null, last);
	}
}
