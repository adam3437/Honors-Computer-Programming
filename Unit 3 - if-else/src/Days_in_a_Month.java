import javax.swing.JOptionPane;

public class Days_in_a_Month
{
	public static void main(String[] args) 
	{
		String input = JOptionPane.showInputDialog("What month is it?");
		int daysInmonth = 0;
		
		if(input == null) 
		{
			JOptionPane.showMessageDialog(null, "You're a real wiseguy");
			return;
		}
		
		int month = Integer.parseInt(input);
		
		if(month <= 0 || month > 12)
		{
			JOptionPane.showMessageDialog(null, "You think you're funny?");
		}
		
		switch(month) 
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			daysInmonth = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			daysInmonth = 20;
			break;
		case 2:
			daysInmonth = 28;
			break;
		}
		
		System.out.println("This month has " + daysInmonth + " days");
		
		
	} 
}
