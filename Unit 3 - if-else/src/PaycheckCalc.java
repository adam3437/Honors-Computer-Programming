import javax.swing.JOptionPane;
public class PaycheckCalc
{
	public static void main(String[] args)
	{
		final double HOURLY_RATE = 12.80;
		double hoursWorked = Double.parseDouble(JOptionPane.showInputDialog("How many hours did you work?"));
		
		double finalPay = hoursWorked * HOURLY_RATE;
	
		if(hoursWorked < 0)
			JOptionPane.showMessageDialog(null, "You're Fired!");
		else if (hoursWorked >= 40)
		{
			double pay = ((HOURLY_RATE * 40) + ((hoursWorked - 40) * (1.5 * HOURLY_RATE)));
		}
		else
		{
			double pay = HOURLY_RATE * hoursWorked;
			System.out.printf("Your weekly pay is $" + finalPay);
		}
		
		System.out.printf("Your weekly pay is $" + finalPay);
	}
}