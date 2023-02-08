import javax.swing.JOptionPane;
public class PaycheckCalc
{
	public static void main(String[] args)
	{
		final double HOURLY_RATE = 12.80;
		double hoursWorked = Double.parseDouble(JOptionPane.showInputDialog("How many hours did you work?"));
		
		double finalPay = hoursWorked * HOURLY_RATE;
		
		System.out.printf("Your weekly pay is $" + finalPay);
	}
}