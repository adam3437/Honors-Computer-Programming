import javax.swing.JOptionPane;

public class Temperature
{
	public static void main(String[] args)
	{
		String input1 = JOptionPane.showInputDialog("What is today's high?");
		String input2 = JOptionPane.showInputDialog("What is today's low?");
		
		String heatWarning = " ";
		String coldWarning = " ";
		String tempSwing = " ";
		if(input1 == null || input2 == null)
		{
			JOptionPane.showMessageDialog(null, "You think you're real funny don't you?");
			return;
		}
		
		double high = Double.parseDouble(input1);
		double low = Double.parseDouble(input2);
		
		if(low > high) 
		{
			JOptionPane.showMessageDialog(null, "Are you high?");
			return;
		}
		
		if(low == high) 
		{
			JOptionPane.showMessageDialog(null, "Why?");
			return;
		}
		
		if(high >= 90)
		{
			heatWarning = "Heat Warning";
		}
		else if (high < 90) 
		{
			heatWarning = "You'll be fine";
		}
		if(low <= 32) 
		{
			coldWarning = "Cold warning";
		}
		else if(low > 32)
		{
			coldWarning = "No cold warning";
		}
		
		if(high - low == 40) 
		{
			tempSwing = "High Temp Swing Today";
		}
		else if(high - low != 40) 
		{
			tempSwing = "Not much temperature swing today";
		}
		
		JOptionPane.showMessageDialog(null, heatWarning);
		JOptionPane.showMessageDialog(null, coldWarning);
		JOptionPane.showMessageDialog(null, tempSwing);
	}
}
