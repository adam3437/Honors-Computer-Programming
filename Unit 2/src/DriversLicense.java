import javax.swing.JOptionPane;

public class DriversLicense
{
	public static void main(String[] args)
	{
		int input = JOptionPane.showConfirmDialog(null, "Are you 16?");
		
		if(input==0)
		{
			JOptionPane.showMessageDialog(null, "Congrats, You can drive!");
		}
		else if(input==1)
		{
			JOptionPane.showMessageDialog(null, "You can't legally drive... But-");
		}
 	}
}
