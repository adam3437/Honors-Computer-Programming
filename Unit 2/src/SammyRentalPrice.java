import javax.swing.JOptionPane;

public class SammyRentalPrice
{
	public static void main(String[] args)
	{
		final int miniute = 60;
		final int hour = 40;
		
		String time = JOptionPane.showInputDialog("How long do you wish to use the Kayak?");
		int Calc = Integer.parseInt(time);
		int hourCalc = (Calc/miniute);
		int minCalc = (Calc % 60);
		double total = (hourCalc*40 + minCalc);
		
		JOptionPane.showMessageDialog(null, total);
	}
}
