import javax.swing.JOptionPane;

public class Guessing_Game
{
	public static void main(String[] args) 
	{
		int number = (int)(Math.random() * 100);
		int guess = -1;
		int tries = 0;
		while (guess != number)
		{
			String response = JOptionPane.showInputDialog(null, "Guess a number between 0 and 100");
			guess = Integer.parseInt(response);
			if (guess == number)
				JOptionPane.showMessageDialog(null, "Yes, the number is " + number);
			else if (guess > number)
			{
				JOptionPane.showMessageDialog(null, "Your guess is too high");
				tries = tries +1;
			}
			else 
			{
				JOptionPane.showMessageDialog(null, "Your guess is too low");
				tries = tries +1;
			}
		}
		JOptionPane.showMessageDialog(null, "You have guessed " + guess + " with " + tries + " tries");
	}
	
}